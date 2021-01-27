package KeystrokeDisplayer;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyPanelMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Testing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new KeyPanel());
		frame.setSize(200, 200);
		// frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
