package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class project27Grid {

	public static void main(String[] args) {
		
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Grid ");
		theGUI.setSize(500, 500);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panels
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.black);
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.black);
		
		JPanel panel21 = new JPanel();
		panel1.setBackground(Color.white);
		
		
		JPanel panel22 = new JPanel();
		panel2.setBackground(Color.black);
		
		JPanel panel23 = new JPanel();
		panel3.setBackground(Color.white);
		
		
		
		JPanel panel31 = new JPanel();
		panel1.setBackground(Color.black);
		
		
		JPanel panel32 = new JPanel();
		panel2.setBackground(Color.white);
		
		JPanel panel33 = new JPanel();
		panel3.setBackground(Color.black);
		
		
		
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(3, 3));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panel21);
		pane.add(panel22);
		pane.add(panel23);
		pane.add(panel31);
		pane.add(panel32);
		pane.add(panel33);
	
		
		
		
		
		
		
		theGUI.setVisible(true);
		
		
		
		

	}

}
