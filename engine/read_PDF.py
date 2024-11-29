from pypdf import PdfReader



if __name__ == "__main__":
    # file = open("pdf_files/example.pdf")

    # for line in file.readlines():
    #     print(line)
    reader = PdfReader("pdf_files/example.pdf")
    destination = open("corpus.txt", "w")
    num_pages = len(reader.pages)

    text = ""
    for page_num in range(num_pages):
        page = reader.pages[page_num]
        text += page.extract_text()

        curr_contents = text.split(".")
        curr_contents = [sentence.replace("\n", " ") for sentence in curr_contents]
        [destination.write(sentence.strip() + "\n") for sentence in curr_contents]
        

    #print(text)
