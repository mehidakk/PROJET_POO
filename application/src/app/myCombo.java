package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class myCombo extends JComboBox{
   myCombo(String[] text){
	   super(text);
	this.setBackground(Color.white);
	this.setFocusable(false);
	this.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
	this.setSize(200, 50);
	this.setFont(new Font("Arial Rounded", Font.BOLD, 13));
	
   }
}
