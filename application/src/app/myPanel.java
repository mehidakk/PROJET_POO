package app;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.Border;

public class myPanel extends JPanel{

	
	public myPanel(int x,int y, int w,int h,Color color,Border border) {
		
		super();
		this.setBounds(x,y,w,h);
		this.setBackground(color);
		this.setBorder(border);
		
	}
public myPanel(Color color) {
		
		super();
		this.setBackground(color);		
	}
	
}
