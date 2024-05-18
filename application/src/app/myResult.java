package app;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.util.Objects;


public class myResult extends JPanel {

    public myResult() {
        this.setBackground(Color.WHITE);
        
      
    }

    public void setTable(Object[][] data,String[] columnNames) {
    	  SwingUtilities.invokeLater(() -> {
              

              //String[] columnNames = {"ID", "Localisation","Prix","Proprieter","Type"};

              DefaultTableModel model = new DefaultTableModel(data, columnNames);
              JTable table = new JTable(model);
              table.setFocusable(false);
              
              table.setBackground(Color.WHITE);
              table.setRowHeight(30);
              table.getColumnModel().getColumn(0).setPreferredWidth(100);
              table.setDefaultRenderer(Object.class, new CustomTableCellRenderer());
              
              JScrollPane scrollPane = new JScrollPane(table);

              scrollPane.getVerticalScrollBar().setUI(new ModernScrollBarUI());
              

              Dimension preferredSize = new Dimension(300, 200);
              scrollPane.setPreferredSize(preferredSize);
              removeAll();
              
              setLayout(new BorderLayout());

              add(scrollPane, BorderLayout.CENTER);
          });
    }

}
