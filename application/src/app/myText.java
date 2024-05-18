package app;



import java.awt.*;
import javax.swing.border.Border;
import javax.swing.*;

public class myText extends JTextField{
	public JPanel panel=new JPanel();
   public myText(String titre){
	   
	   JLabel label=new JLabel(titre);
	  
	   panel.setLayout(new GridLayout(1,2,0,5));
	   label.setFont(new Font("Arial Rounded", Font.BOLD, 13));
	   label.setForeground(new Color(14,32,54));
	   panel.add(label);
	   this.setBackground(new Color(255, 255, 255));
	   panel.setBackground(Color.white);
	   panel.setPreferredSize(new Dimension(210,40));
	   
	   this.setPreferredSize(new Dimension(0,0));
	   Border blackBorder=BorderFactory.createLineBorder(new Color(14,32,54));
	   
	   this.setFont(new Font("Arial Rounded", Font.PLAIN, 15));
	   this.setPreferredSize(new Dimension(100,25));
	   this.setBorder(blackBorder);
	   this.setToolTipText("Entre "+titre);
	   
	   panel.add(this);
	   
	 
	   
   }
   
   public myText(int x,int y, int w,int h,String titre){
	  
		   JLabel label=new JLabel(titre);
		   Border blackBorder=BorderFactory.createLineBorder(new Color(14,32,54));
		   panel.setLayout(new GridLayout(1,2,0,5));
		   label.setFont(new Font("Arial Rounded", Font.BOLD, 13));
		   label.setForeground(new Color(14,32,54));
		   panel.add(label);
		   this.setBackground(new Color(255, 255, 255));
		   panel.setBackground(Color.white);
		   
		   panel.setBounds(x, y, w, h);
		   this.setFont(new Font("Arial Rounded", Font.PLAIN, 15));
		   this.setBorder(blackBorder);
		   this.setToolTipText("Entre "+titre);
		   panel.add(this);
		   
	   
	   
   }
   
   public JPanel getPanel() {
	   return panel;
   }
	
}
