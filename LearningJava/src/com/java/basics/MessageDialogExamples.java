package com.java.basics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

public class MessageDialogExamples {

	public static void main(String[] args) throws MalformedURLException
	  {
	    //Creating a JFrame
	    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
	    frame.setVisible(true);
	    frame.setSize(400, 250);
	    
	    JButton btnNew = new JButton();
	    btnNew.setText("Nuevo Cliente");
	    frame.add(btnNew);
	    
	    JButton btnBuscar = new JButton();
	    btnBuscar.setText("Buscar");
	    //frame.add(btnBuscar);   
	    
	    //Show a showMessagedialog with different icon
	    JOptionPane.showMessageDialog(null,
	    		"Promises and more Promises'.",
	    		"Estudiando Java2",
	    		JOptionPane.QUESTION_MESSAGE);
	    
	    JOptionPane.showMessageDialog(null,
	    		"Promises and more Promises'.",
	    		"Estudiando Java2",
	    		JOptionPane.INFORMATION_MESSAGE);
	    
	    JOptionPane.showMessageDialog(null,
	    		"Promises and more Promises'.",
	    		"Estudiando Java2",
	    		JOptionPane.ERROR_MESSAGE);
	    
	    JOptionPane.showMessageDialog(null,
		        "Promises and more Promises'.",
		        "Estudiando Java2",
		        JOptionPane.WARNING_MESSAGE);
	    
	    JOptionPane.showMessageDialog(null,
		        "Promises and more Promises'.",
		        "Estudiando Java2",
		        JOptionPane.PLAIN_MESSAGE);

	    final ImageIcon icon = new ImageIcon(new URL("http://www.gravatar.com/avatar/a1ab0af4997654345d7a949877f8037e?s=128&d=identicon&r=PG"));
	    Image img = icon.getImage();
	    Image newImg = img.getScaledInstance(35, 40,  java.awt.Image.SCALE_SMOOTH);
	    ImageIcon newIcon = new ImageIcon(newImg);

	    //Using an icon  
	    JOptionPane.showMessageDialog(null,
		        "Promises and more Promises'.",
		        "Estudiando Java2",
		        JOptionPane.PLAIN_MESSAGE, icon);
	    
	    //Now using a resized icon
	    JOptionPane.showMessageDialog(null,
		        "Promises and more Promises'.",
		        "Estudiando Java2",
		        JOptionPane.PLAIN_MESSAGE, newIcon);

	    
	    System.exit(0);
	  }
}
