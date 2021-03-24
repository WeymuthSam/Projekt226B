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
	private JTextField tfVornameUser;
	private JTextField tfNachnameUser;
	private JTextField tfStrasseUser;
	private JTextField tfHausnummerUser;
	private JTextField tfPLZUser;
	private JTextField tfOrtUser;
	private JTextField tfFirmenname;
	private JTextField tfStrasseFirma;
	private JTextField tfHausnummerFirma;
	private JTextField tfPLZFirma;
	private JTextField tfOrtFirma;

	/**
	 * Create the panel.
	 */
	public PersonalData() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel pnmain = new JPanel();
		pnmain.setBackground(Color.WHITE);
		pnmain.setBounds(10, 11, 680, 478);
		add(pnmain);
		pnmain.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel pnUserDaten = new JPanel();
		pnUserDaten.setBackground(Color.WHITE);
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
		lbNachname.setBounds(10, 123, 107, 44);
		pnUserDaten.add(lbNachname);
		
		JLabel lbStrasseUser = new JLabel("Strasse:");
		lbStrasseUser.setLocation(new Point(3, 0));
		lbStrasseUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbStrasseUser.setBounds(10, 178, 107, 44);
		pnUserDaten.add(lbStrasseUser);
		
		JLabel lbHausnummerUser = new JLabel("Hausnummer:");
		lbHausnummerUser.setLocation(new Point(3, 0));
		lbHausnummerUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHausnummerUser.setBounds(10, 233, 107, 44);
		pnUserDaten.add(lbHausnummerUser);
		
		JLabel lbPlzUser = new JLabel("PLZ:");
		lbPlzUser.setLocation(new Point(3, 0));
		lbPlzUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPlzUser.setBounds(10, 288, 107, 44);
		pnUserDaten.add(lbPlzUser);
		
		JLabel lbOrtUser = new JLabel("Ort:");
		lbOrtUser.setLocation(new Point(3, 0));
		lbOrtUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbOrtUser.setBounds(10, 339, 107, 44);
		pnUserDaten.add(lbOrtUser);
		
		tfVornameUser = new JTextField();
		tfVornameUser.setBounds(117, 66, 173, 44);
		pnUserDaten.add(tfVornameUser);
		tfVornameUser.setColumns(10);
		
		tfNachnameUser = new JTextField();
		tfNachnameUser.setColumns(10);
		tfNachnameUser.setBounds(117, 123, 173, 44);
		pnUserDaten.add(tfNachnameUser);
		
		tfStrasseUser = new JTextField();
		tfStrasseUser.setColumns(10);
		tfStrasseUser.setBounds(117, 178, 173, 44);
		pnUserDaten.add(tfStrasseUser);
		
		tfHausnummerUser = new JTextField();
		tfHausnummerUser.setColumns(10);
		tfHausnummerUser.setBounds(117, 233, 173, 44);
		pnUserDaten.add(tfHausnummerUser);
		
		tfPLZUser = new JTextField();
		tfPLZUser.setColumns(10);
		tfPLZUser.setBounds(117, 288, 173, 44);
		pnUserDaten.add(tfPLZUser);
		
		tfOrtUser = new JTextField();
		tfOrtUser.setColumns(10);
		tfOrtUser.setBounds(117, 341, 173, 44);
		pnUserDaten.add(tfOrtUser);
		
		JPanel pnFirmenDaten = new JPanel();
		pnFirmenDaten.setBackground(Color.WHITE);
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
		lbStrasseFirma.setBounds(10, 119, 107, 44);
		pnFirmenDaten.add(lbStrasseFirma);
		
		JLabel lbHausnummer = new JLabel("Hausnummer:");
		lbHausnummer.setLocation(new Point(3, 0));
		lbHausnummer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHausnummer.setBounds(10, 174, 107, 44);
		pnFirmenDaten.add(lbHausnummer);
		
		JLabel lbPLZFirma = new JLabel("PLZ:");
		lbPLZFirma.setLocation(new Point(3, 0));
		lbPLZFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPLZFirma.setBounds(10, 231, 107, 44);
		pnFirmenDaten.add(lbPLZFirma);
		
		JLabel lbOrtFirma = new JLabel("Ort:");
		lbOrtFirma.setLocation(new Point(3, 0));
		lbOrtFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbOrtFirma.setBounds(10, 284, 107, 44);
		pnFirmenDaten.add(lbOrtFirma);
		
		tfFirmenname = new JTextField();
		tfFirmenname.setColumns(10);
		tfFirmenname.setBounds(117, 68, 173, 44);
		pnFirmenDaten.add(tfFirmenname);
		
		tfStrasseFirma = new JTextField();
		tfStrasseFirma.setColumns(10);
		tfStrasseFirma.setBounds(117, 123, 173, 44);
		pnFirmenDaten.add(tfStrasseFirma);
		
		tfHausnummerFirma = new JTextField();
		tfHausnummerFirma.setColumns(10);
		tfHausnummerFirma.setBounds(117, 176, 173, 44);
		pnFirmenDaten.add(tfHausnummerFirma);
		
		tfPLZFirma = new JTextField();
		tfPLZFirma.setColumns(10);
		tfPLZFirma.setBounds(117, 231, 173, 44);
		pnFirmenDaten.add(tfPLZFirma);
		
		tfOrtFirma = new JTextField();
		tfOrtFirma.setColumns(10);
		tfOrtFirma.setBounds(117, 286, 173, 44);
		pnFirmenDaten.add(tfOrtFirma);
		setLayout(null);
		
		JLabel lbSpeichern = new JLabel("Speichern");
		lbSpeichern.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbSpeichern.setHorizontalAlignment(SwingConstants.CENTER);
		lbSpeichern.setHorizontalTextPosition(SwingConstants.CENTER);
		lbSpeichern.setForeground(Color.WHITE);
		lbSpeichern.setBackground(new Color(128, 0, 128));
		lbSpeichern.setOpaque(true);
		lbSpeichern.setBounds(561, 521, 129, 38);
		add(lbSpeichern);
	
		

	

	}
}
