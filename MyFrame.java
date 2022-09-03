import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
	    this.setTitle("Alarm grouper");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
	    this.setSize(420,420);
	    this.setVisible(true);
	    
	    this.getContentPane().setBackground(new Color(0, 0, 0));
	}
}
