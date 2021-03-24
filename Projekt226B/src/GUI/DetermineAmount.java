package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.JTextField;

public class DetermineAmount extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public DetermineAmount() {
		setLayout(null);
		
		JLabel lbSpeichern = new JLabel("Speichern");
		lbSpeichern.setOpaque(true);
		lbSpeichern.setHorizontalTextPosition(SwingConstants.CENTER);
		lbSpeichern.setHorizontalAlignment(SwingConstants.CENTER);
		lbSpeichern.setForeground(Color.WHITE);
		lbSpeichern.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbSpeichern.setBackground(new Color(128, 0, 128));
		lbSpeichern.setBounds(345, 112, 129, 38);
		add(lbSpeichern);
		
		JLabel lbSpeichern_1 = new JLabel("Speichern");
		lbSpeichern_1.setOpaque(true);
		lbSpeichern_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lbSpeichern_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbSpeichern_1.setForeground(Color.WHITE);
		lbSpeichern_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbSpeichern_1.setBackground(new Color(128, 0, 128));
		lbSpeichern_1.setBounds(206, 112, 129, 38);
		add(lbSpeichern_1);
		
		JLabel lbVornameUser = new JLabel("Vorname:");
		lbVornameUser.setLocation(new Point(3, 0));
		lbVornameUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbVornameUser.setBounds(10, 11, 107, 44);
		add(lbVornameUser);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(127, 11, 250, 44);
		add(textField);

	}

}
