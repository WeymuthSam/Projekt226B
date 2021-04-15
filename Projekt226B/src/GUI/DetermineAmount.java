package GUI;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Logic.Checkoutlogic;

import java.awt.Point;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DetermineAmount extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private JLabel lbAbbrechen;
	private JLabel lbAnzahl;
	private JLabel lbHinzufügen;
	
	private SpinnerModel sm;
	private JSpinner spnAnzahl;

	public DetermineAmount(Main main, Checkoutlogic LogicLayer, int ArticleID) {
		setBounds(main.getLocation().x + 200, main.getLocation().y + 200, 427, 150);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		lbAbbrechen = new JLabel("Abbrechen");
		lbAbbrechen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lbAbbrechen.setOpaque(true);
		lbAbbrechen.setHorizontalTextPosition(SwingConstants.CENTER);
		lbAbbrechen.setHorizontalAlignment(SwingConstants.CENTER);
		lbAbbrechen.setForeground(Color.WHITE);
		lbAbbrechen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbAbbrechen.setBackground(new Color(128, 0, 128));
		lbAbbrechen.setBounds(225, 68, 82, 34);
		getContentPane().add(lbAbbrechen);
		
		lbAnzahl = new JLabel("Anzahl:");
		lbAnzahl.setLocation(new Point(3, 0));
		lbAnzahl.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbAnzahl.setBounds(10, 11, 107, 44);
		getContentPane().add(lbAnzahl);
		
		sm = new SpinnerNumberModel(1, 1, 10, 1);
		spnAnzahl = new JSpinner(sm);
		spnAnzahl.setEditor(new JSpinner.DefaultEditor(spnAnzahl));
		spnAnzahl.setFont(new Font("Tahoma", Font.PLAIN, 26));
		spnAnzahl.setBounds(127, 13, 272, 44);
		getContentPane().add(spnAnzahl);
		
		lbHinzufügen = new JLabel("Hinzuf\u00FCgen");
		lbHinzufügen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LogicLayer.AddArticleToBag(ArticleID, (Integer) spnAnzahl.getValue());
				main.UpdateBill();
				main.KasseClick();
				dispose();
			}
		});
		lbHinzufügen.setOpaque(true);
		lbHinzufügen.setHorizontalTextPosition(SwingConstants.CENTER);
		lbHinzufügen.setHorizontalAlignment(SwingConstants.CENTER);
		lbHinzufügen.setForeground(Color.WHITE);
		lbHinzufügen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbHinzufügen.setBackground(new Color(128, 0, 128));
		lbHinzufügen.setBounds(317, 68, 82, 34);
		getContentPane().add(lbHinzufügen);
		
		setVisible(true);

	}
}
