package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Data.Datarequest;
import Logic.Checkoutlogic;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class PersonalData extends JPanel {
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
	
	private JPanel pnmain;
	private JPanel pnUserDaten;
	private JPanel pnFirmenDaten;
	
	private JLabel lbUserDaten;
	private JLabel lbVornameUser;
	private JLabel lbNachname;
	private JLabel lbStrasseUser;
	private JLabel lbHausnummerUser;
	private JLabel lbPlzUser;
	private JLabel lbOrtUser;
	private JLabel lbFirmenDaten;
	private JLabel lbFirmenname;
	private JLabel lbStrasseFirma;
	private JLabel lbHausnummer;
	private JLabel lbPLZFirma;
	private JLabel lbOrtFirma;
	private JLabel btSpeichern;
	
	//Layer
	private Checkoutlogic LogicLayer;
	
	//Main
	private Main main;
	
	//List with all JTextFields
	private List<JTextField> components;

	/**
	 * Create the panel.
	 */
	public PersonalData(Checkoutlogic Logic, Main main) {
		setBackground(Color.WHITE);
		setLayout(null);
		
		//Logic Layer
		LogicLayer = Logic;
		
		this.main = main;
		
		components = new ArrayList<JTextField>();
		
		pnmain = new JPanel();
		pnmain.setBackground(Color.WHITE);
		pnmain.setBounds(0, 0, 700, 478);
		add(pnmain);
		pnmain.setLayout(new GridLayout(1, 2, 0, 0));
		
		pnUserDaten = new JPanel();
		pnUserDaten.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnUserDaten.setBackground(Color.WHITE);
		pnUserDaten.setLayout(null);
		pnmain.add(pnUserDaten);
		
		lbUserDaten = new JLabel("User Daten\r\n");
		lbUserDaten.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbUserDaten.setBounds(10, 11, 173, 44);
		pnUserDaten.add(lbUserDaten);
		
		lbVornameUser = new JLabel("Vorname:");
		lbVornameUser.setLocation(new Point(3, 0));
		lbVornameUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbVornameUser.setBounds(10, 66, 107, 44);
		pnUserDaten.add(lbVornameUser);
		
		lbNachname = new JLabel("Nachname:");
		lbNachname.setLocation(new Point(3, 0));
		lbNachname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbNachname.setBounds(10, 123, 107, 44);
		pnUserDaten.add(lbNachname);
		
		lbStrasseUser = new JLabel("Strasse:");
		lbStrasseUser.setLocation(new Point(3, 0));
		lbStrasseUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbStrasseUser.setBounds(10, 178, 107, 44);
		pnUserDaten.add(lbStrasseUser);
		
		lbHausnummerUser = new JLabel("Hausnummer:");
		lbHausnummerUser.setLocation(new Point(3, 0));
		lbHausnummerUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHausnummerUser.setBounds(10, 233, 107, 44);
		pnUserDaten.add(lbHausnummerUser);
		
		lbPlzUser = new JLabel("PLZ:");
		lbPlzUser.setLocation(new Point(3, 0));
		lbPlzUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPlzUser.setBounds(10, 288, 107, 44);
		pnUserDaten.add(lbPlzUser);
		
		lbOrtUser = new JLabel("Ort:");
		lbOrtUser.setLocation(new Point(3, 0));
		lbOrtUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbOrtUser.setBounds(10, 339, 107, 44);
		pnUserDaten.add(lbOrtUser);
		
		tfVornameUser = new JTextField();
		tfVornameUser.setBounds(125, 66, 173, 44);
		pnUserDaten.add(tfVornameUser);
		tfVornameUser.setColumns(10);
		
		tfNachnameUser = new JTextField();
		tfNachnameUser.setColumns(10);
		tfNachnameUser.setBounds(125, 123, 173, 44);
		pnUserDaten.add(tfNachnameUser);
		
		tfStrasseUser = new JTextField();
		tfStrasseUser.setColumns(10);
		tfStrasseUser.setBounds(125, 178, 173, 44);
		pnUserDaten.add(tfStrasseUser);
		
		tfHausnummerUser = new JTextField();
		tfHausnummerUser.setColumns(10);
		tfHausnummerUser.setBounds(125, 233, 173, 44);
		pnUserDaten.add(tfHausnummerUser);
		
		tfPLZUser = new JTextField();
		tfPLZUser.setColumns(10);
		tfPLZUser.setBounds(125, 288, 173, 44);
		pnUserDaten.add(tfPLZUser);
		
		tfOrtUser = new JTextField();
		tfOrtUser.setColumns(10);
		tfOrtUser.setBounds(125, 341, 173, 44);
		pnUserDaten.add(tfOrtUser);
		
		pnFirmenDaten = new JPanel();
		pnFirmenDaten.setBorder(new MatteBorder(0, 1, 1, 0, (Color) new Color(0, 0, 0)));
		pnFirmenDaten.setBackground(Color.WHITE);
		pnFirmenDaten.setLayout(null);
		pnmain.add(pnFirmenDaten);
		
		lbFirmenDaten = new JLabel("Firmen Daten");
		lbFirmenDaten.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbFirmenDaten.setBounds(10, 11, 173, 44);
		pnFirmenDaten.add(lbFirmenDaten);
		
		lbFirmenname = new JLabel("Firmenname:");
		lbFirmenname.setLocation(new Point(3, 0));
		lbFirmenname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbFirmenname.setBounds(10, 66, 107, 44);
		pnFirmenDaten.add(lbFirmenname);
		
		lbStrasseFirma = new JLabel("Strasse:");
		lbStrasseFirma.setLocation(new Point(3, 0));
		lbStrasseFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbStrasseFirma.setBounds(10, 119, 107, 44);
		pnFirmenDaten.add(lbStrasseFirma);
		
		lbHausnummer = new JLabel("Hausnummer:");
		lbHausnummer.setLocation(new Point(3, 0));
		lbHausnummer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbHausnummer.setBounds(10, 174, 107, 44);
		pnFirmenDaten.add(lbHausnummer);
		
		lbPLZFirma = new JLabel("PLZ:");
		lbPLZFirma.setLocation(new Point(3, 0));
		lbPLZFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPLZFirma.setBounds(10, 231, 107, 44);
		pnFirmenDaten.add(lbPLZFirma);
		
		lbOrtFirma = new JLabel("Ort:");
		lbOrtFirma.setLocation(new Point(3, 0));
		lbOrtFirma.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbOrtFirma.setBounds(10, 284, 107, 44);
		pnFirmenDaten.add(lbOrtFirma);
		
		tfFirmenname = new JTextField();
		tfFirmenname.setColumns(10);
		tfFirmenname.setBounds(125, 68, 173, 44);
		pnFirmenDaten.add(tfFirmenname);
		
		tfStrasseFirma = new JTextField();
		tfStrasseFirma.setColumns(10);
		tfStrasseFirma.setBounds(125, 123, 173, 44);
		pnFirmenDaten.add(tfStrasseFirma);
		
		tfHausnummerFirma = new JTextField();
		tfHausnummerFirma.setColumns(10);
		tfHausnummerFirma.setBounds(125, 176, 173, 44);
		pnFirmenDaten.add(tfHausnummerFirma);
		
		tfPLZFirma = new JTextField();
		tfPLZFirma.setColumns(10);
		tfPLZFirma.setBounds(125, 231, 173, 44);
		pnFirmenDaten.add(tfPLZFirma);
		
		tfOrtFirma = new JTextField();
		tfOrtFirma.setColumns(10);
		tfOrtFirma.setBounds(125, 286, 173, 44);
		pnFirmenDaten.add(tfOrtFirma);
		setLayout(null);
		
		btSpeichern = new JLabel("Speichern");
		btSpeichern.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReloadComponentsList();
				if(LogicLayer.checkTextField(components)) {
					LogicLayer.SavePersonalData(tfFirmenname.getText(), tfStrasseFirma.getText(), tfHausnummerFirma.getText(), tfPLZFirma.getText(), tfOrtFirma.getText(), tfVornameUser.getText(), 
												tfNachnameUser.getText(), tfStrasseUser.getText(), tfHausnummerUser.getText(), tfPLZUser.getText(), tfOrtUser.getText());
					main.KasseClick();
				} else {
					 JOptionPane.showMessageDialog(null,"Bitte füllen Sie alle Felder aus.");  
				}
			}
		});
		btSpeichern.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btSpeichern.setHorizontalAlignment(SwingConstants.CENTER);
		btSpeichern.setHorizontalTextPosition(SwingConstants.CENTER);
		btSpeichern.setForeground(Color.WHITE);
		btSpeichern.setBackground(new Color(128, 0, 128));
		btSpeichern.setOpaque(true);
		btSpeichern.setBounds(561, 521, 129, 38);
		add(btSpeichern);
	}
	
	public void FillInData() {
		List<String> Data = LogicLayer.GetPersonalData();
		for(int i = 0; i < Data.size(); i++) {
			components.get(i).setText(Data.get(i));
		}
	}
	
	public void ClearTextField() {
		ReloadComponentsList();
		for(int i = 0; i < components.size(); i++) {
			components.get(i).setText("");;
		}
	}
	
	public void ReloadComponentsList() {
		components.clear();
		components.add(tfFirmenname);
		components.add(tfStrasseFirma);
		components.add(tfHausnummerFirma);
		components.add(tfPLZFirma);
		components.add(tfOrtFirma);
		components.add(tfVornameUser);
		components.add(tfNachnameUser);
		components.add(tfStrasseUser);
		components.add(tfHausnummerUser);
		components.add(tfPLZUser);
		components.add(tfOrtUser);
	}
}