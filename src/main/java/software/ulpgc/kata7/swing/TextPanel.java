package software.ulpgc.kata7.swing;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    public TextPanel() {
        JLabel jLabel = new JLabel("Hello World! This is a JLabel");
        Font font = new Font("Arial", Font.PLAIN, 20);
        jLabel.setFont(font);
        add(jLabel);
    }
}
