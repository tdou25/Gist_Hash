import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File;
import java.io.IOException;
import javax.swing.*;


public class PDFWindow{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, World!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);

        frame.add(label);

        frame.setSize(1200, 800);

        frame.setVisible(true);
    }
}