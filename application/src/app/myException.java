package app;

import javax.swing.JOptionPane;

public class myException extends Exception{
public myException(String msg) {
	
	JOptionPane.showMessageDialog(null, "Une erreur est survenus :\n"+msg, "ERREUR", JOptionPane.ERROR_MESSAGE);
}
}
