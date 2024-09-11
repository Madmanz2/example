package comicProject;



import java.awt.*;
import javax.swing.*;

public class comicMain {

	public static void main(String[] args) {
		//comment
		JFrame maddox = new JFrame();
		maddox.setTitle("Comic Project");
		//Screen Size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int height = screenSize.height;
		int width = screenSize.width;
		
		maddox.setPreferredSize(new Dimension(width,height));
		maddox.pack();
		maddox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel1 p1 = new Panel1(Color.green);
		Panel2 p2 = new Panel2(Color.cyan);
		Panel3 p3= new Panel3(Color.green);
		Panel4 p4 = new Panel4(Color.cyan);
		Panel5 p5 = new Panel5(Color.green);
		Panel6 p6 = new Panel6(Color.green);
		
		Container pane = maddox.getContentPane();
		pane.setLayout(new GridLayout(3,2, 25, 25));
		
		//row 1
		pane.add(p1); pane.add(p2);
		
		//row 2
		
		pane.add(p3); pane.add(p4);
		
		//row 3
		pane.add(p5); pane.add(p6);
		
		
		maddox.setVisible(true);
		
	}

}
