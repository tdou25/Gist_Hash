import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File;
import java.io.IOException;

public class PDFBoxTest {
    public static void main(String[] args) {
        File file = new File("pdf_files/example2.pdf");
        try {
            PDDocument doc1 = PDDocument.load(file);
            doc1.close();
        }catch (IOException e){
            System.err.println("An error occurred while loading the PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }
}