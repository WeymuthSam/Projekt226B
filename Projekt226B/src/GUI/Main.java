package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Data.Datarequest;
import Data.IDataRequest;
import Logic.Checkoutlogic;
import Logic.article;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	private Checkoutlogic LogicLayer;
	private JPanel contentPane;
	private ArticleCategories pnArticleCategories;
	private ArticleCategories pnArticleCategoriesEdit;
	private PersonalData pnPersonalData;
	private IDataRequest DataLayer;
	private Articles pnArticles;
	private Articles pnArticlesEdit;
	
	private Boolean DatenBearbeiten = false;
	
	//Components
	private JPanel pnMain;
	private JPanel pnBill;
	private JPanel pnBag;
	private JPanel pnRight;
	private JPanel pnBagItem;
	
	private JLabel btKasse;
	private JLabel btDaten;
	private JLabel lblRechnung;
	private JLabel lbNachname;
	private JLabel lbVorname;
	private JLabel lbOrt;
	private JLabel lbStrasse;
	private JLabel lbPLZ;
	private JLabel lbHausnummer;
	private JLabel lbKaufen;
	private JLabel lbArtikelname;
	private JLabel lbAnzahl;
	private JLabel lbPreis;
	private JLabel lbTrenner;
	private JLabel lbGesamt;
	private JLabel lbGesamtpreis;
	private JLabel lbItemName;
	private JLabel lbItemPrice;
	private JLabel btRemoveItem;
	private JLabel lbArtikelname2;
	private JLabel lbAnzahl2;
	private JLabel btDatenBearbeiten;

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
		pnArticleCategories = new ArticleCategories(this, false);
		pnArticleCategoriesEdit = new ArticleCategories(this, true);
		
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
		
		pnBag = new JPanel();
		pnBag.setBackground(Color.WHITE);
		pnBag.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		pnBag.setBounds(0, 22, 482, 210);
		pnRight.add(pnBag);
		pnBag.setLayout(null);        
		
		pnBill = new JPanel();
		pnBill.setBorder(new MatteBorder(0, 1, 1, 0, (Color) new Color(0, 0, 0)));
		pnBill.setBackground(Color.WHITE);
		pnBill.setBounds(0, 232, 482, 309);
		pnRight.add(pnBill);
		pnBill.setLayout(null);
		
		lbKaufen = new JLabel("Kaufen");
		lbKaufen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(LogicLayer.getBag().size() > 0) {
					try {
						CreateBillFile();
						JOptionPane.showMessageDialog(null, "Kauf erfolgreich abgeschlossen!");
						dispose();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		lbKaufen.setOpaque(true);
		lbKaufen.setHorizontalTextPosition(SwingConstants.CENTER);
		lbKaufen.setHorizontalAlignment(SwingConstants.CENTER);
		lbKaufen.setForeground(Color.WHITE);
		lbKaufen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbKaufen.setBackground(new Color(128, 0, 128));
		lbKaufen.setBounds(390, 552, 82, 34);
		pnRight.add(lbKaufen);
		
		lbArtikelname2 = new JLabel("Artikelname");
		lbArtikelname2.setBounds(10, 6, 82, 14);
		pnRight.add(lbArtikelname2);
		
		lbAnzahl2 = new JLabel("Anzahl");
		lbAnzahl2.setBounds(193, 6, 46, 14);
		pnRight.add(lbAnzahl2);
		
		btDatenBearbeiten = new JLabel("Daten bearbeiten");
		btDatenBearbeiten.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DatenBearbeitenClick();
			}
		});
		btDatenBearbeiten.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btDatenBearbeiten.setBounds(191, 11, 147, 25);
		contentPane.add(btDatenBearbeiten);
		
		setVisible(true);
	}
	
	public void KasseClick() {
		if(pnArticles != null) {
			pnArticles.setVisible(false);
			pnMain.remove(pnArticles);
		}
		DatenBearbeiten = false;
		btKasse.setForeground(new Color(128, 0, 128));
		btDaten.setForeground(Color.BLACK);
		btDatenBearbeiten.setForeground(Color.black);
		
		pnPersonalData.setVisible(false);
		pnArticleCategoriesEdit.setVisible(false);
		
		pnMain.remove(pnArticleCategoriesEdit);
		pnMain.remove(pnPersonalData);
		pnMain.add(pnArticleCategories, BorderLayout.CENTER);
		
		pnArticleCategories.setVisible(true);
		UpdateBill();
	}
	
	public void DatenBearbeitenClick() {
		if(pnArticles != null) {
			pnArticles.setVisible(false);
			pnMain.remove(pnArticles);
		}
		DatenBearbeiten = true;
		
		btDatenBearbeiten.setForeground(new Color(128, 0, 128));
		btKasse.setForeground(Color.black);
		btDaten.setForeground(Color.BLACK);
		
		pnPersonalData.setVisible(false);
		pnArticleCategories.setVisible(false);
		
		pnMain.remove(pnPersonalData);
		pnMain.remove(pnArticleCategories);
		pnMain.add(pnArticleCategoriesEdit, BorderLayout.CENTER);
		
		pnArticleCategoriesEdit.setVisible(true);
		UpdateBill();
	}
	
	public void DatenClick() {
		if(pnArticles != null) {
			pnArticles.setVisible(false);
			pnMain.remove(pnArticles);
		}
		DatenBearbeiten = false;
		
		btKasse.setForeground(Color.BLACK);
		btDatenBearbeiten.setForeground(Color.black);
		btDaten.setForeground(new Color(128, 0, 128));
		
		pnArticleCategoriesEdit.setVisible(false);
		pnArticleCategories.setVisible(false);
		pnMain.remove(pnArticleCategoriesEdit);
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
	
	public void ArticleCategoriesClicked(int id, Boolean Edit) {
		pnArticles = new Articles(this, LogicLayer, id, Edit);
		pnArticleCategories.setVisible(false);
		pnArticleCategoriesEdit.setVisible(false);
		pnMain.remove(pnArticleCategoriesEdit);
		pnMain.remove(pnArticleCategories);
		pnMain.add(pnArticles, BorderLayout.CENTER);
		pnArticles.setVisible(true);
	}
	
	public void UpdateBill() {
		int top = 120;
		float Gesamtpreis = 0;
		float Preis = 0;
		
		//Format for the Price
		DecimalFormat f = new DecimalFormat("##.00");
		
		List<String> Data = LogicLayer.GetPersonalData();
		List<article> Bag = LogicLayer.getBag();
		List<Integer> BagAmount = LogicLayer.getBagAmount();
		
		if(Bag.size() == 0) {
			pnBill.removeAll();
			pnBag.removeAll();
			pnBill.repaint();
			pnBag.repaint();
			return;
		}
		
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
			lbArtikelname = new JLabel();
			lbArtikelname.setText(Bag.get(i).getName());
			lbArtikelname.setBounds(10, top, 100, 14);
			lbArtikelname.setVisible(true);
			pnBill.add(lbArtikelname);
			
			lbAnzahl = new JLabel();
			lbAnzahl.setText(BagAmount.get(i) + " Stück");
			lbAnzahl.setBounds(210, top, 100, 14);
			lbAnzahl.setVisible(true);
			pnBill.add(lbAnzahl);
			
			Preis = Bag.get(i).getPrice() * BagAmount.get(i);
			
			lbPreis = new JLabel("",SwingConstants.RIGHT);
			lbPreis.setText(f.format(Preis) + " CHF");
			lbPreis.setBounds(360, top, 100, 14);
			lbPreis.setVisible(true);
			pnBill.add(lbPreis);
			
			Gesamtpreis = Gesamtpreis + Preis;
			
			top = top + 20;
		}
		
		lbTrenner = new JLabel();
		lbTrenner.setText("________________________________________________________________");
		lbTrenner.setBounds(10, top, 462, 14);
		lbTrenner.setVisible(true);
		pnBill.add(lbTrenner);
		
		lbGesamt = new JLabel();
		lbGesamt.setText("Gesamtpreis: ");
		lbGesamt.setBounds(10, top + 20, 100, 14);
		lbGesamt.setVisible(true);
		pnBill.add(lbGesamt);
		
		lbGesamtpreis = new JLabel("",SwingConstants.RIGHT);
		lbGesamtpreis.setText(f.format(Gesamtpreis) + " CHF");
		lbGesamtpreis.setBounds(360, top + 20, 100, 14);
		lbGesamtpreis.setVisible(true);
		pnBill.add(lbGesamtpreis);
		
		pnBill.repaint();
		UpdateBag();
	}
	
	private void UpdateBag() {
		int top = 1;
		
		pnBag.removeAll();
		
		List<article> Bag = LogicLayer.getBag();
		List<Integer> BagAmount = LogicLayer.getBagAmount();
		
		for(int i = 0; i < Bag.size(); i++) {
			pnBagItem = new JPanel();
			pnBagItem.setOpaque(true);
			pnBagItem.setBounds(1, top, 482, 30);
			pnBagItem.setLayout(null);
			if ( i % 2 != 0 ) {
				pnBagItem.setBackground(Color.WHITE);
			}
			pnBag.add(pnBagItem);
			
			lbItemName = new JLabel();
			lbItemName.setText(Bag.get(i).getName());
			lbItemName.setBounds(10, 5, 80, 20);
			lbItemName.setVisible(true);
			pnBagItem.add(lbItemName);
			
			lbItemPrice = new JLabel();
			lbItemPrice.setText(String.valueOf(BagAmount.get(i)));
			lbItemPrice.setBounds(200, 5, 80, 20);
			lbItemPrice.setVisible(true);
			pnBagItem.add(lbItemPrice);
			
			btRemoveItem = new JLabel("Entfernen");
			btRemoveItem.setName(String.valueOf(i));
			btRemoveItem.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					LogicLayer.RemoveArticleFromBag(Integer.parseInt(e.getComponent().getName()));
					UpdateBill();
				}
			});
			btRemoveItem.setBounds(395, 5, 80, 20);
			btRemoveItem.setOpaque(true);
			btRemoveItem.setHorizontalTextPosition(SwingConstants.CENTER);
			btRemoveItem.setHorizontalAlignment(SwingConstants.CENTER);
			btRemoveItem.setForeground(Color.WHITE);
			btRemoveItem.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btRemoveItem.setBackground(new Color(128, 0, 128));
			btRemoveItem.setVisible(true);
			pnBagItem.add(btRemoveItem);
			
			top = top + 30;
		}
		pnBag.repaint();
	}
	
	private void CreateBillFile() throws Exception {
		//Format for the Price
		DecimalFormat f = new DecimalFormat("##.00");
		
		float Gesamtpreis = 0;
		float Preis = 0;
		
		List<article> Bag = LogicLayer.getBag();
		List<String> Data = LogicLayer.GetPersonalData();
		List<Integer> BagAmount = LogicLayer.getBagAmount();
		
		StringBuffer bill = new StringBuffer();
		StringBuffer starLine = new StringBuffer();
		
		for(int i = 0; i < 80; i++) {
			starLine.append("_");
		}
		
		bill.append(starLine);
		bill.append("\n");
		bill.append(starLine);
		
		bill.append("\n");
		bill.append(String.format("|%34s", ""));
		bill.append(String.format("%11.11s", "Rechnung"));
		bill.append(String.format("%33s|", ""));
		
		bill.append("\n");
		bill.append(starLine);
		
		bill.append("\n");
		bill.append(String.format("|%-39.39s|",  "Firmendaten"));
		bill.append(String.format("%-38.38s|",  "Userdaten"));
		
		bill.append("\n");
		bill.append(starLine);
		
		//Namen
		bill.append("\n");
		bill.append(String.format("|%-39.39s|",  Data.get(0)));
		bill.append(String.format("%-38.38s|",  Data.get(6) + " " + Data.get(5)));
		
		//Strasse + Hausnummer
		bill.append("\n");
		bill.append(String.format("|%-39.39s|",  Data.get(1) + " " + Data.get(2)));
		bill.append(String.format("%-38.38s|",  Data.get(7) + " " + Data.get(8)));
		
		//Ortschaft + PLZ
		bill.append("\n");
		bill.append(String.format("|%-39.39s|",  Data.get(4) + " " + Data.get(3)));
		bill.append(String.format("%-38.38s|",  Data.get(10) + " " + Data.get(9)));
		
		bill.append("\n");
		bill.append(starLine);
		
		bill.append("\n");
		bill.append(String.format("|%-27.27s|",  "Nummer : " + LogicLayer.getDate("yyyyMMddHHmmss")));
		bill.append(String.format("%-24.24s|",  "Datum : " + LogicLayer.getDate("dd.MM.yyyy")));
		bill.append(String.format("%-25.25s|",  "Verkäufer - v11"));
		
		bill.append("\n");
		bill.append(starLine);
		
		//Table Header
		bill.append("\n");
		bill.append(String.format("|%-18.18s|",  "Artikel Name"));
		bill.append(String.format("%-19.19s|",  "Preis"));
		bill.append(String.format("%-19.19s|",  "Anzahl"));
		bill.append(String.format("%-19.19s|",  "Gesamt"));
		
		bill.append("\n");
		bill.append(starLine);
		
		for(int i = 0; i < Bag.size(); i++) {
			
			Preis = Bag.get(i).getPrice() * BagAmount.get(i);
			
			bill.append("\n");
			bill.append(String.format("|%-18.18s|",  Bag.get(i).getName()));
			bill.append(String.format("%-19.19s|",  Bag.get(i).getPrice()));
			bill.append(String.format("%-19.19s|",  BagAmount.get(i)));
			bill.append(String.format("%-19.19s|",  f.format(Preis) + " CHF"));
			
			Gesamtpreis = Gesamtpreis + Preis;
			
			bill.append("\n");
			bill.append(starLine);
		}
		
		bill.append("\n");
		bill.append(String.format("|%-18.18s|",  ""));
		bill.append(String.format("%-19.19s|",  ""));
		bill.append(String.format("%-19.19s|",  ""));
		bill.append(String.format("%-19.19s|",  f.format(Gesamtpreis) + " CHF"));
		
		bill.append("\n");
		bill.append(starLine);
		
		bill.append("\n");
		bill.append(starLine);
		
		PrintWriter out = new PrintWriter("bill.txt");
		out.println(bill);
		out.close();
	}
}

