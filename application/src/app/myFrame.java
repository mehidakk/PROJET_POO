package app;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame{
	
	
	public myFrame() {
		ImageIcon icon=new ImageIcon("USTHB.jpg");
		this.setIconImage(icon.getImage());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(854,480 );
		this.setVisible(true);
		//this.setResizable(false);
		
	}

}