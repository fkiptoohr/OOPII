package gui;

import javax.swing.*;
import java.awt.*;

public class FontPanel extends JPanel {
    FontPanel() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        // Create a custom font
        Font customFont = new Font("Serif", Font.BOLD, 12);
        graphics.setFont(customFont);
        graphics.setColor(Color.BLACK);

        // Draw a string using the custom font
        graphics.drawString("Serif 12 point bold", 20, 50);
    }

    public static class Fonts extends JFrame {
        Fonts() {
            setTitle("ShowFonts");
            setSize(500, 400);
            setLocation(200, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container contentPane = getContentPane();
            contentPane.add(new FontPanel());
        }
    }

    public static void main(String[] args) {
//      Using SwingUtilities.invokeLater to ensure that Swing components are created on the Event Dispatch Thread (EDT).
        SwingUtilities.invokeLater(() -> {
            JFrame jf = new Fonts();
            jf.setVisible(true);
        });
    }
}
