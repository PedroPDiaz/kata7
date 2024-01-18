package software.ulpgc.kata7.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        setTitle("Kata 7");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);

        TextPanel textPanel = new TextPanel();
        getContentPane().add(textPanel);
    }
}
