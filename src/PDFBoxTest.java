import org.apache.pdfbox.pdmodel.PDDocument;

import java.nio.file.Paths;

public class PDFBoxTest {
    public static void main(String[] args) {
        try {

            PDDocument document = PDDocument.load(Paths.get("example.pdf"));
            System.out.println("Number of pages: " + document.getNumberOfPages());
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}