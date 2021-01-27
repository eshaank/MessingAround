package KeystrokeDisplayer;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class KeyPanel extends JPanel implements KeyListener{
	public static final LineBorder LINE_BORDER = new LineBorder(Color.RED);
	public static final EmptyBorder EMPTY_BORDER = new EmptyBorder(1, 1, 1, 1);

	private JLabel up;
	private JLabel down;
	private JLabel left;
	private JLabel right;
	private JLabel spacebar;
	private JLabel shift;
	
	public KeyPanel() {
		
		setLayout(new GridBagLayout());
        up = new JLabel("W");
        up.setBorder(LINE_BORDER);

        down = new JLabel("S");
        down.setBorder(LINE_BORDER);

        left = new JLabel("A");
        left.setBorder(LINE_BORDER);

        right = new JLabel("D");
        right.setBorder(LINE_BORDER);
        
        spacebar = new JLabel("Space");
        spacebar.setBorder(LINE_BORDER);
        
        shift = new JLabel("Shift");
        shift.setBorder(LINE_BORDER);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagConstraints gbc2 = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(left, gbc);
        gbc.gridx++;
        gbc.gridy = 0;
        add(up, gbc);
        gbc.gridy = 1;
        add(down, gbc);
        gbc.gridx++;
        gbc.gridy = 1;
        add(right, gbc);
       // gbc.gridx++;
        
        gbc2.gridx = 0;
        gbc2.gridy = 3;
        add(shift, gbc2);
        gbc2.gridx = 2;
        gbc2.gridy = 3;
        add(spacebar, gbc2);
        
        addKeyListener(this);
       
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
