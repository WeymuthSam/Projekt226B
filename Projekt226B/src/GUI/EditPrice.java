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
import javax.swing.JTextField;

public class EditPrice extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private JLabel lbAbbrechen;
	private JLabel lbPrice;
	private JLabel lbBestätigen;
	private JLabel lbArtikelname;
	private JLabel lbArtikelnameTitel;
	
	private SpinnerModel sm;
	private JTextField tfPrice;
	
	private Checkoutlogic LogicLayer;
	private int ID;
	private int ArtikelPosition;

	public EditPrice(Checkoutlogic LogicLayer, int ArticleID) {
		this.LogicLayer = LogicLayer;
		this.ID = ArticleID;
		
		setBounds(400, 350, 427, 183);
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
		lbAbbrechen.setBounds(226, 109, 82, 34);
		getContentPane().add(lbAbbrechen);
		
		lbPrice = new JLabel("Preis:");
		lbPrice.setLocation(new Point(3, 0));
		lbPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPrice.setBounds(11, 51, 107, 44);
		getContentPane().add(lbPrice);
		
		lbBestätigen = new JLabel("Best\u00E4tigen");
		lbBestätigen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LogicLayer.getArticles().get(ArtikelPosition).setPrice(Float.parseFloat(tfPrice.getText()));
			}
		});
		lbBestätigen.setOpaque(true);
		lbBestätigen.setHorizontalTextPosition(SwingConstants.CENTER);
		lbBestätigen.setHorizontalAlignment(SwingConstants.CENTER);
		lbBestätigen.setForeground(Color.WHITE);
		lbBestätigen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbBestätigen.setBackground(new Color(128, 0, 128));
		lbBestätigen.setBounds(318, 109, 82, 34);
		getContentPane().add(lbBestätigen);
		
		tfPrice = new JTextField();
		tfPrice.setBounds(128, 52, 272, 46);
		contentPane.add(tfPrice);
		tfPrice.setColumns(10);
		
		lbArtikelnameTitel = new JLabel("Name:");
		lbArtikelnameTitel.setLocation(new Point(3, 0));
		lbArtikelnameTitel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbArtikelnameTitel.setBounds(11, 0, 107, 44);
		contentPane.add(lbArtikelnameTitel);
		
		lbArtikelname = new JLabel("Artikelname");
		lbArtikelname.setLocation(new Point(3, 0));
		lbArtikelname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbArtikelname.setBounds(128, 0, 272, 44);
		contentPane.add(lbArtikelname);
		
		setVisible(true);
		
		AddData();

	}
	
	private void AddData() {
		for(int i = 0; i < LogicLayer.getArticles().size(); i++) {
			if (LogicLayer.getArticles().get(i).getId() == this.ID) {
				lbArtikelname.setText(LogicLayer.getArticles().get(i).getName());
				tfPrice.setText(LogicLayer.getArticles().get(i).getPrice().toString());
				ArtikelPosition = i;
			}
		}	
	}
}
