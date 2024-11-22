import javax.swing.*;
import java.awt.*;


public class MainWindow{
    private JFrame window;

    public MainWindow(){
        window = new JFrame();
        window.setTitle("Gist Hash");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1200, 700);
        window.setLocationRelativeTo(null);

        JPanel queryPanel = new JPanel();
        queryPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        queryPanel.setBackground(Color.decode("#78909C"));
        queryPanel.setPreferredSize(new Dimension(400, 250));
        window.add(queryPanel, BorderLayout.WEST);
    }

    public void show(){
        window.setVisible(true);
    }

}