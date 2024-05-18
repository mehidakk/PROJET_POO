package app;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomTableCellRenderer extends DefaultTableCellRenderer {
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Customize cell appearance here
        // For example, set background color based on cell value
        if (value instanceof Integer && ((Integer) value) < 30) {
            cellComponent.setBackground(Color.white);
        } else {
            cellComponent.setBackground(Color.WHITE);
        }

        return cellComponent;
    }
}
