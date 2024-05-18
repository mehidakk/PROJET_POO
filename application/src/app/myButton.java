package app;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;

public class myButton extends JButton {
    private Color foregroundColor;
    private Color backgroundColor;

    public myButton(String text, Color foreground, Color background) {
        super(text);
        this.foregroundColor = foreground;
        this.backgroundColor = background;
        this.setFocusable(false);
        this.setBorder(null);
        this.setBackground(background);
        this.setForeground(foreground);
    }

   
}

