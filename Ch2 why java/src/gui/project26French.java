package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class project26French {

	public static void main(String[] args) {
		
		//french
		JFrame theGUI = new JFrame();
		theGUI.setTitle("French Flag");
		theGUI.setSize(300, 200);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panels
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.blue);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.red);
		
		Container pane = theGUI.getContentPane();
		pane.setLayout(new GridLayout(1, 2));
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		
		
		theGUI.setVisible(true);
		
		
		//mauritius
		JFrame mauritiusGUI = new JFrame();
		mauritiusGUI.setTitle("Mauritius Flag");
		mauritiusGUI.setSize(300, 200);
		mauritiusGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel21 = new JPanel();
		panel21.setBackground(Color.red);
		
		JPanel panel22 = new JPanel();
		panel22.setBackground(Color.blue);
		
		JPanel panel23 = new JPanel();
		panel23.setBackground(Color.yellow);
		
		JPanel panel24 = new JPanel();
		panel24.setBackground(Color.green);
		
		Container pane2 = mauritiusGUI.getContentPane();
		pane2.setLayout(new GridLayout(4, 1));
		pane2.add(panel21);
		pane2.add(panel22);
		pane2.add(panel23);
		pane2.add(panel24);
		
		mauritiusGUI.setVisible(true);
		
		
		//bulgaria
		JFrame bulgariaGUI = new JFrame();
		bulgariaGUI.setTitle("Bulgaria Flag");
		bulgariaGUI.setSize(300, 200);
		bulgariaGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel31 = new JPanel();
		panel31.setBackground(Color.white);
		
		JPanel panel32 = new JPanel();
		panel32.setBackground(new Color(0,150,110));
		
		JPanel panel33 = new JPanel();
		panel33.setBackground(Color.red);
		
		
		Container pane3 = bulgariaGUI.getContentPane();
		pane3.setLayout(new GridLayout(3, 1));
		pane3.add(panel31);
		pane3.add(panel32);
		pane3.add(panel33);
		
		
		bulgariaGUI.setVisible(true);
		
		

	}

}
