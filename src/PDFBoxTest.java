import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.Loader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class PDFBoxTest {
    public static void main(String[] args) {
        PDDocument document = new PDDocument();
        File file = new File("pdf_files/example.pdf");
        PDDocument doc1 = Loader.loadPDF(file);


//        PDDocument document = PDDocument.load(Paths.get("example.pdf"));
//        System.out.println("Number of pages: " + document.getNumberOfPages());
//        document.close();
    }
}