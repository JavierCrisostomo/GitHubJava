package com.java.orion;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;
public class TestUI {

	public static void main(String[] args) throws MalformedURLException
	  {
	    String backupDir = "/Users/al/backups";
	    final ImageIcon icon = new ImageIcon(new URL("http://www.gravatar.com/avatar/a1ab0af4997654345d7a949877f8037e?s=128&d=identicon&r=PG"));
	    
	    // create a jframe
	    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
	    frame.setVisible(true);
	    frame.setSize(400, 250);
	    
	    JButton btnNew = new JButton();
	    btnNew.setText("Nuevo Cliente");
	    frame.add(btnNew);
	    
	    JButton btnBuscar = new JButton();
	    btnBuscar.setText("Buscar");
	    //frame.add(btnBuscar);   
	    
	    // show a joptionpane dialog using showMessageDialog
	    JOptionPane.showMessageDialog(null,
	    		"Promises and more Promises'.",
	    		"Estudiando Java2",
	    		JOptionPane.QUESTION_MESSAGE, icon);
	    
	    JOptionPane.showMessageDialog(null,
	    		"Promises and more Promises'.",
	    		"Estudiando Java2",
	    		JOptionPane.INFORMATION_MESSAGE, icon);
	    
	    JOptionPane.showMessageDialog(null,
	    		"Promises and more Promises'.",
	    		"Estudiando Java2",
	    		JOptionPane.ERROR_MESSAGE, icon);
	    
	    JOptionPane.showMessageDialog(null,
		        "Promises and more Promises'.",
		        "Estudiando Java2",
		        JOptionPane.WARNING_MESSAGE, icon);
	    
	    JOptionPane.showMessageDialog(null,
		        "Promises and more Promises'.",
		        "Estudiando Java2",
		        JOptionPane.PLAIN_MESSAGE, icon);
	   
	    System.exit(0);
	  }
}
