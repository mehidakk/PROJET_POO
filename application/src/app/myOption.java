package app;

import javax.swing.JOptionPane;

public class myOption extends JOptionPane{
 
myOption(Exception e ){
	super();
	this.showMessageDialog(null, "Une erreur est survenus :\n"+e.getMessage(), "ERREUR", JOptionPane.ERROR_MESSAGE);
}	
}
