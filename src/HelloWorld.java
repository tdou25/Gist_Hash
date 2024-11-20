import javax.swing.*;
import java.io.File;

public class HelloWorld {
    public static void main(String[] args) {
//        JFrame frame = new JFrame("Hello, World!");
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
//
//        frame.add(label);
//
//        frame.setSize(300, 200);
//
//        frame.setVisible(true);
        File file = new File("pdf_files/example.pdf");
        file.setReadable(true);
        System.out.println(file.getAbsolutePath());


    }
}