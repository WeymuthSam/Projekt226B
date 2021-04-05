package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Data.Datarequest;
import Logic.Checkoutlogic;
import Logic.article;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	private Checkoutlogic LogicLayer;
	private JPanel contentPane;
	private ArticleCategories pnArticleCategories;
	private PersonalData pnPersonalData;
	private Datarequest DataLayer;
	private Articles pnArticles;
	
	//Components
	private JPanel pnMain;
	private JLabel btKasse;
	private JLabel btDaten;
	private JPanel pnRight;
	private JLabel lblRechnung;
	private JLabel lbNachname;
	private JLabel lbVorname;
	private JLabel lbOrt;
	private JLabel lbStrasse;
	private JLabel lbPLZ;
	private JLabel lbHausnummer;
	private JPanel pnBill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 674);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Create Data Layer
		DataLayer = new Datarequest();
		
		//create Logic Layer
		LogicLayer  = new Checkoutlogic(DataLayer);
		
		//Create Panels
		pnPersonalData = new PersonalData(LogicLayer, this);
		pnArticleCategories = new ArticleCategories(this);
		
		pnMain = new JPanel();
		pnMain.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
		pnMain.setBounds(0, 39, 700, 596);
		pnMain.setLayout(new BorderLayout(0, 0));
		contentPane.add(pnMain);
		
		btKasse = new JLabel("Kasse");
		btDaten = new JLabel("Daten");
		
		btKasse.setForeground(new Color(128, 0, 128));
		btKasse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				KasseClick();
			}
		});
		btKasse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btKasse.setBounds(30, 11, 57, 25);
		contentPane.add(btKasse);
		
		btDaten.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatenClick();
			}
		});
		btDaten.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btDaten.setBounds(113, 11, 57, 25);
		contentPane.add(btDaten);
		
		pnArticleCategories.setVisible(true);
		pnMain.add(pnArticleCategories, BorderLayout.CENTER);
		
		pnRight = new JPanel();
		pnRight.setBorder(new MatteBorder(1, 1, 0, 0, (Color) new Color(0, 0, 0)));
		pnRight.setBackground(Color.WHITE);
		pnRight.setBounds(699, 39, 482, 596);
		contentPane.add(pnRight);
		pnRight.setLayout(null);
		
		JPanel pnBag = new JPanel();
		pnBag.setBackground(Color.WHITE);
		pnBag.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnBag.setBounds(0, 1, 482, 231);
		pnRight.add(pnBag);
		pnBag.setLayout(null);        
		
		pnBill = new JPanel();
		pnBill.setBounds(0, 232, 482, 364);
		pnRight.add(pnBill);
		pnBill.setLayout(null);
		
		setVisible(true);
	}
	
	public void KasseClick() {
		if(pnArticles != null) {
			pnArticles.setVisible(false);
			pnMain.remove(pnArticles);
		}
		btKasse.setForeground(new Color(128, 0, 128));
		btDaten.setForeground(Color.BLACK);
		pnPersonalData.setVisible(false);
		pnMain.remove(pnPersonalData);
		pnMain.add(pnArticleCategories, BorderLayout.CENTER);
		pnArticleCategories.setVisible(true);
		UpdateBill();
	}
	
	public void DatenClick() {
		if(pnArticles != null) {
			pnArticles.setVisible(false);
			pnMain.remove(pnArticles);
		}
		btKasse.setForeground(Color.BLACK);
		btDaten.setForeground(new Color(128, 0, 128));
		pnArticleCategories.setVisible(false);
		pnMain.remove(pnArticleCategories);
		pnMain.add(pnPersonalData, BorderLayout.CENTER);
		pnPersonalData.setVisible(true);
		
		if(DataLayer.getFirmenname().length() > 0) {
			pnPersonalData.FillInData();
		} else {
			pnPersonalData.ClearTextField();
		}
		UpdateBill();
	}
	
	public void ArticleCategoriesClicked(int id) {
		pnArticles = new Articles(this, LogicLayer, id);
		pnArticleCategories.setVisible(false);
		pnMain.remove(pnArticleCategories);
		pnMain.add(pnArticles, BorderLayout.CENTER);
		pnArticles.setVisible(true);
	}
	
	public void UpdateBill() {
		int top = 110;
		float Gesamtpreis = 0;
		
		List<String> Data = LogicLayer.GetPersonalData();
		List<article> Bag = LogicLayer.getBag();
		List<Integer> BagAmount = LogicLayer.getBagAmount();
		
		pnBill.removeAll();
		
		lblRechnung = new JLabel("Rechnung");
		lblRechnung.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRechnung.setBounds(10, 11, 89, 25);
		pnBill.add(lblRechnung);
		
		lbNachname = new JLabel("");
		lbNachname.setBounds(10, 45, 103, 14);
		pnBill.add(lbNachname);
		
		lbVorname = new JLabel("");
		lbVorname.setBounds(123, 45, 109, 14);
		pnBill.add(lbVorname);
		
		lbStrasse = new JLabel("");
		lbStrasse.setBounds(10, 64, 103, 14);
		pnBill.add(lbStrasse);
		
		lbHausnummer = new JLabel("");
		lbHausnummer.setBounds(123, 64, 109, 14);
		pnBill.add(lbHausnummer);
		
		lbOrt = new JLabel("");
		lbOrt.setBounds(10, 84, 103, 14);
		pnBill.add(lbOrt);
		
		lbPLZ = new JLabel("");
		lbPLZ.setBounds(123, 84, 109, 14);
		pnBill.add(lbPLZ);
		
		lbVorname.setText(Data.get(5));
		lbNachname.setText(Data.get(6));
		lbStrasse.setText(Data.get(7));
		lbHausnummer.setText(Data.get(8));
		lbPLZ.setText(Data.get(9));
		lbOrt.setText(Data.get(10));
		
		for(int i = 0; i < Bag.size(); i++) {
			JLabel lbArtikelname = new JLabel();
			lbArtikelname.setText(Bag.get(i).getName());
			lbArtikelname.setBounds(10, top, 100, 14);
			lbArtikelname.setVisible(true);
			pnBill.add(lbArtikelname);
			
			JLabel lbAnzahl = new JLabel();
			lbAnzahl.setText(BagAmount.get(i) + " Stück");
			lbAnzahl.setBounds(210, top, 100, 14);
			lbAnzahl.setVisible(true);
			pnBill.add(lbAnzahl);
			
			JLabel lbPreis = new JLabel();
			lbPreis.setText((Bag.get(i).getPrice() * BagAmount.get(i)) + " CHF");
			lbPreis.setBounds(410, top, 100, 14);
			lbPreis.setVisible(true);
			pnBill.add(lbPreis);
			
			Gesamtpreis = Gesamtpreis + (Bag.get(i).getPrice() * BagAmount.get(i));
			
			top = top + 20;
		}
		
		JLabel lbGesamtpreis = new JLabel();
		lbGesamtpreis.setText(Gesamtpreis + " CHF");
		lbGesamtpreis.setBounds(410, top, 100, 14);
		lbGesamtpreis.setVisible(true);
		pnBill.add(lbGesamtpreis);
		
		pnBill.repaint();
	}
}

