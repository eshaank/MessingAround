package KeystrokeDisplayer;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class KeyPanel extends JPanel {
	public static final LineBorder LINE_BORDER = new LineBorder(Color.RED);
	public static final EmptyBorder EMPTY_BORDER = new EmptyBorder(1, 1, 1, 1);

	private JLabel up;
	private JLabel down;
	private JLabel left;
	private JLabel right;
	private JLabel spacebar;
	
	public KeyPanel() {
		setLayout(new GridBagLayout());
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

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
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
        gbc.gridx++;
        gbc.gridy = 2;
        add(spacebar, gbc);
	}
}
