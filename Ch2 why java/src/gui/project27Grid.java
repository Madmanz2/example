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
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.white);
		
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.black);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.white);
		
		
		
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.black);
		
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.white);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.black);
		
		
		
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(3, 3));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panel4);
		pane.add(panel5);
		pane.add(panel6);
		pane.add(panel7);
		pane.add(panel8);
		pane.add(panel9);

		//test
		
		
		
		
		
		
		theGUI.setVisible(true);
		
		
		
		

	}

}
