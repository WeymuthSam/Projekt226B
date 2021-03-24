package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.JSpinner;

public class DetermineAmount extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		lbSpeichern.setBounds(317, 68, 82, 34);
		add(lbSpeichern);
		
		JLabel lbAbbrechen = new JLabel("Abbrechen");
		lbAbbrechen.setOpaque(true);
		lbAbbrechen.setHorizontalTextPosition(SwingConstants.CENTER);
		lbAbbrechen.setHorizontalAlignment(SwingConstants.CENTER);
		lbAbbrechen.setForeground(Color.WHITE);
		lbAbbrechen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbAbbrechen.setBackground(new Color(128, 0, 128));
		lbAbbrechen.setBounds(235, 68, 74, 34);
		add(lbAbbrechen);
		
		JLabel lbAnzahl = new JLabel("Anzahl:");
		lbAnzahl.setLocation(new Point(3, 0));
		lbAnzahl.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbAnzahl.setBounds(10, 11, 107, 44);
		add(lbAnzahl);
		
		JSpinner spnAnzahl = new JSpinner();
		spnAnzahl.setFont(new Font("Tahoma", Font.PLAIN, 26));
		spnAnzahl.setBounds(127, 13, 272, 44);
		add(spnAnzahl);

	}
}
