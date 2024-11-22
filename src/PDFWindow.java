import java.io.File;
import java.io.IOException;
import javax.swing.*;


public class PDFWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello, World!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
            frame.add(label);
            frame.setSize(1200, 800);
            frame.setLocationRelativeTo(null); // Center the window
            frame.pack();
            frame.setVisible(true);
        });
    }
}