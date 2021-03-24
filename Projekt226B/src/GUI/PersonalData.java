package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PersonalData extends JPanel {
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Create the panel.
	 */
	public PersonalData() {
		setLayout(null);
		
		JPanel pnmain = new JPanel();
		pnmain.setBounds(10, 11, 823, 482);
		add(pnmain);
		pnmain.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel pnUserDaten = new JPanel();
		pnUserDaten.setLayout(null);
		pnmain.add(pnUserDaten);
		
		JLabel lblUserDaten = new JLabel("User Daten\r\n");
		lblUserDaten.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserDaten.setBounds(10, 11, 173, 44);
		pnUserDaten.add(lblUserDaten);
		
		JLabel lbVornameUser = new JLabel("Vorname:");
		lbVornameUser.setLocation(new Point(3, 0));
		lbVornameUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbVornameUser.setBounds(10, 66, 107, 44);
		pnUserDaten.add(lbVornameUser);
		
		JLabel lbNachname = new JLabel("Nachname:");
		lbNachname.setLocation(new Point(3, 0));
		lbNachname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNachname.setBounds(10, 121, 107, 44);
		pnUserDaten.add(lbNachname);
		
		JLabel lbStrasseUser = new JLabel("Strasse:");
		lbStrasseUser.setLocation(new Point(3, 0));
		lbStrasseUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbStrasseUser.setBounds(10, 176, 107, 44);
		pnUserDaten.add(lbStrasseUser);
		
		JLabel lbHausnummerUser = new JLabel("Hausnummer:");
		lbHausnummerUser.setLocation(new Point(3, 0));
		lbHausnummerUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHausnummerUser.setBounds(10, 231, 107, 44);
		pnUserDaten.add(lbHausnummerUser);
		
		JLabel lbPlzUser = new JLabel("PLZ:");
		lbPlzUser.setLocation(new Point(3, 0));
		lbPlzUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPlzUser.setBounds(10, 286, 107, 44);
		pnUserDaten.add(lbPlzUser);
		
		JLabel lbOrtUser = new JLabel("Ort:");
		lbOrtUser.setLocation(new Point(3, 0));
		lbOrtUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbOrtUser.setBounds(10, 341, 107, 44);
		pnUserDaten.add(lbOrtUser);
		
		textField = new JTextField();
		textField.setBounds(127, 66, 250, 44);
		pnUserDaten.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 121, 250, 44);
		pnUserDaten.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 176, 250, 44);
		pnUserDaten.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(127, 231, 250, 44);
		pnUserDaten.add(textField_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(127, 286, 250, 44);
		pnUserDaten.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(127, 341, 250, 44);
		pnUserDaten.add(textField_9);
		
		JPanel pnFirmenDaten = new JPanel();
		pnFirmenDaten.setLayout(null);
		pnmain.add(pnFirmenDaten);
		
		JLabel lblFirmenDaten = new JLabel("Firmen Daten");
		lblFirmenDaten.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirmenDaten.setBounds(10, 11, 173, 44);
		pnFirmenDaten.add(lblFirmenDaten);
		
		JLabel lbFirmenname = new JLabel("Firmenname:");
		lbFirmenname.setLocation(new Point(3, 0));
		lbFirmenname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFirmenname.setBounds(10, 66, 107, 44);
		pnFirmenDaten.add(lbFirmenname);
		
		JLabel lbStrasseFirma = new JLabel("Strasse:");
		lbStrasseFirma.setLocation(new Point(3, 0));
		lbStrasseFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbStrasseFirma.setBounds(10, 121, 107, 44);
		pnFirmenDaten.add(lbStrasseFirma);
		
		JLabel lbHausnummer = new JLabel("Hausnummer:");
		lbHausnummer.setLocation(new Point(3, 0));
		lbHausnummer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHausnummer.setBounds(10, 176, 107, 44);
		pnFirmenDaten.add(lbHausnummer);
		
		JLabel lbPLZFirma = new JLabel("PLZ:");
		lbPLZFirma.setLocation(new Point(3, 0));
		lbPLZFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPLZFirma.setBounds(10, 231, 107, 44);
		pnFirmenDaten.add(lbPLZFirma);
		
		JLabel lbOrtFirma = new JLabel("Ort:");
		lbOrtFirma.setLocation(new Point(3, 0));
		lbOrtFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbOrtFirma.setBounds(10, 286, 107, 44);
		pnFirmenDaten.add(lbOrtFirma);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(127, 66, 250, 44);
		pnFirmenDaten.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(127, 121, 250, 44);
		pnFirmenDaten.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(127, 176, 250, 44);
		pnFirmenDaten.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(127, 245, 250, 44);
		pnFirmenDaten.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(127, 300, 250, 44);
		pnFirmenDaten.add(textField_14);
		setLayout(null);
		
		JLabel lbSpeichern = new JLabel("Speichern");
		lbSpeichern.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbSpeichern.setHorizontalAlignment(SwingConstants.CENTER);
		lbSpeichern.setHorizontalTextPosition(SwingConstants.CENTER);
		lbSpeichern.setForeground(Color.WHITE);
		lbSpeichern.setBackground(new Color(128, 0, 128));
		lbSpeichern.setOpaque(true);
		lbSpeichern.setBounds(703, 511, 129, 38);
		add(lbSpeichern);
	
		

	

	}
}
