package app;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class ModernScrollBarUI extends BasicScrollBarUI {

    private final Color THUMB_COLOR = new Color(0,0,0); // RGB color (23, 90, 113)
    private final Color TRACK_COLOR = new Color(230, 230, 230);

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return createEmptyButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return createEmptyButton();
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(THUMB_COLOR);
        g2.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
        g2.dispose();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        g.setColor(TRACK_COLOR);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    protected void setThumbBounds(int x, int y, int width, int height) {
        super.setThumbBounds(x, y, width, height);
        scrollbar.repaint();
    }

    private JButton createEmptyButton() {
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(0, 0));
        button.setMinimumSize(new Dimension(0, 0));
        button.setMaximumSize(new Dimension(0, 0));
        return button;
    }
}
