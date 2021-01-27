package KeystrokeDisplayer;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class KeystrokesDisplayer implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel up;
	JLabel down;
	JLabel left;
	JLabel right;
	JLabel spacebar;
	JLabel shift;

	public static final LineBorder LINE_BORDER = new LineBorder(Color.MAGENTA);
	public static final EmptyBorder EMPTY_BORDER = new EmptyBorder(1, 1, 1, 1);

	public static void main(String[] args) {
		KeystrokesDisplayer test = new KeystrokesDisplayer();
		test.setup();
	}

	void setup() {
		frame = new JFrame();
		panel = new JPanel();

		frame.add(panel);
		panel.setLayout(new GridBagLayout());
		up = new JLabel("W");
		up.setBorder(EMPTY_BORDER);

		down = new JLabel("S");
		down.setBorder(EMPTY_BORDER);

		left = new JLabel("A");
		left.setBorder(EMPTY_BORDER);

		right = new JLabel("D");
		right.setBorder(EMPTY_BORDER);

		spacebar = new JLabel("Space");
		spacebar.setBorder(EMPTY_BORDER);

		shift = new JLabel("Shift");
		shift.setBorder(EMPTY_BORDER);

		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagConstraints gbc2 = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 1;
		panel.add(left, gbc);
		gbc.gridx++;
		gbc.gridy = 0;
		panel.add(up, gbc);
		gbc.gridy = 1;
		panel.add(down, gbc);
		gbc.gridx++;
		gbc.gridy = 1;
		panel.add(right, gbc);
		// gbc.gridx++;

		gbc2.gridx = 0;
		gbc2.gridy = 3;
		panel.add(shift, gbc2);
		gbc2.gridx = 2;
		gbc2.gridy = 3;
		panel.add(spacebar, gbc2);

		frame.addKeyListener(this);
		frame.setSize(200, 200);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_W) {
			up.setBorder(LINE_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			shift.setBorder(LINE_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			left.setBorder(LINE_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			down.setBorder(LINE_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			right.setBorder(LINE_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			spacebar.setBorder(LINE_BORDER);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_W) {
			up.setBorder(EMPTY_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			shift.setBorder(EMPTY_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			left.setBorder(EMPTY_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			down.setBorder(EMPTY_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			right.setBorder(EMPTY_BORDER);
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			spacebar.setBorder(EMPTY_BORDER);
		}
	}
}
