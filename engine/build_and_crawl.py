import torch
from sentence_transformers import SentenceTransformer
from pypdf import PdfReader


def build_corpus(pdf_name, glue_level = 3):
    reader = PdfReader("pdf_files/"+pdf_name)
    #destination = open("corpus.txt", "w")
    num_pages = len(reader.pages)

    text = ""
    contents = list()
    for page_num in range(num_pages):
        page = reader.pages[page_num]

        text = page.extract_text()

        sentences = text.split(".")

        temp_string = ""
        curr_page_contents = list()
        for i in range(len(sentences)):
            sentences[i].replace("\n", " ")
            temp_string += sentences[i] + "."
            i += 1
            if(i % glue_level == 0 or page_num == len(sentences)):
                curr_page_contents.append(temp_string)
                temp_string = ""


        contents += curr_page_contents
    
    return contents

if __name__ == "__main__":
    embedder = SentenceTransformer("multi-qa-distilbert-cos-v1")

    corpus = build_corpus("example.pdf")

    corpus_embeddings = embedder.encode(corpus, convert_to_tensor=True)

    # Query sentences:
    queries = [
        "The worker generates some amount of money, but brings home less than he generated, the remainder going to the boss",
        "boss makes a dollar, I make a time, so I shit on company time",
        "what the sigma"
    ]

    # Find the closest 5 sentences of the corpus for each query sentence based on cosine similarity
    top_k = min(5, len(corpus))
    for query in queries:
        query_embedding = embedder.encode(query, convert_to_tensor=True)

        #print(query_embedding)

        # We use cosine-similarity and torch.topk to find the highest 5 scores
        similarity_scores = embedder.similarity(query_embedding, corpus_embeddings)[0]
        scores, indices = torch.topk(similarity_scores, k=top_k)

        print("\nQuery:", query)
        print("Top 5 most similar sentences in corpus:")

        for score, idx in zip(scores, indices):
            print(corpus[idx], f"(Score: {score:.4f})")

        """
        # Alternatively, we can also use util.semantic_search to perform cosine similarty + topk
        hits = util.semantic_search(query_embedding, corpus_embeddings, top_k=5)
        hits = hits[0]      #Get the hits for the first query
        for hit in hits:
            print(corpus[hit['corpus_id']], "(Score: {:.4f})".format(hit['score']))
        """