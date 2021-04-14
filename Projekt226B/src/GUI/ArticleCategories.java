package GUI;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Point;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ArticleCategories extends JPanel {

	private static final long serialVersionUID = 1L;
	private Main main;
	
	private JLabel lbTitel;
	private JLabel lbMeeresfruechte;
	private JLabel lbBackwaren;
	private JLabel lbMilchprodukte;
	private JLabel lbFr�chte;
	private JLabel lbGem�se;
	private JLabel lbFleisch;
	private JLabel lbS�ssigkeiten;
	private JLabel lbFertiggerichte;
	private JLabel lbGetr�nke;
	
	private JLabel lbMeeresfr�chteImage;
	private JLabel lbBackwarenImage;
	private JLabel lbMilchprodukteImage;
	private JLabel lbFr�chteImage;
	private JLabel lbGem�seImage;
	private JLabel lbFleischImage;
	private JLabel lbS�ssigkeitenImage;
	private JLabel lbFertiggerichteImage;
	private JLabel lbGetr�nkeImage;
	
	private JPanel pnKategorien;
	
	private JPanel pnProdukt1;
	private JPanel pnProdukt2;
	private JPanel pnProdukt3;
	private JPanel pnProdukt4;
	private JPanel pnProdukt5;
	private JPanel pnProdukt6;
	private JPanel pnProdukt7;
	private JPanel pnProdukt8;
	private JPanel pnProdukt9;
	
	private JSeparator sp1pnProdukt1;
	private JSeparator sp1pnProdukt2;
	private JSeparator sp1pnProdukt3;
	private JSeparator sp1pnProdukt4;
	private JSeparator sp1pnProdukt5;
	private JSeparator sp1pnProdukt6;
	private JSeparator sp1pnProdukt7;
	private JSeparator sp1pnProdukt8;
	private JSeparator sp1pnProdukt9;


	public ArticleCategories(Main Main, Boolean Edit) {
		setLayout(null);

		this.main = Main;
		
		pnKategorien = new JPanel();
		pnKategorien.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		pnKategorien.setForeground(Color.BLACK);
		pnKategorien.setBackground(Color.WHITE);			
		pnKategorien.setBounds(0, 0, 700, 600);
		add(pnKategorien);
		pnKategorien.setLayout(null);
		
		pnProdukt1 = new JPanel();
		pnProdukt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(0, Edit);
			}
		});
		pnProdukt1.setBounds(37, 124, 161, 109);
		pnKategorien.add(pnProdukt1);
		pnProdukt1.setLayout(null);
		
		lbMeeresfruechte = new JLabel("Meeresfr\u00FCchte");
		lbMeeresfruechte.setLocation(new Point(3, 0));
		lbMeeresfruechte.setBounds(0, 0, 161, 20);
		pnProdukt1.add(lbMeeresfruechte);
		
		sp1pnProdukt1 = new JSeparator();
		sp1pnProdukt1.setBounds(0, 18, 161, 2);
		pnProdukt1.add(sp1pnProdukt1);
		
		lbMeeresfr�chteImage = new JLabel("");
		lbMeeresfr�chteImage.setBounds(0, 18, 161, 91);
		lbMeeresfr�chteImage.setIcon(new ImageIcon(getClass().getResource("/Images/Meeresfr�chte.jpg")));
		pnProdukt1.add(lbMeeresfr�chteImage);
		
		pnProdukt2 = new JPanel();
		pnProdukt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(1, Edit);
			}
		});
		pnProdukt2.setLayout(null);
		pnProdukt2.setBounds(268, 124, 161, 109);
		pnKategorien.add(pnProdukt2);
		
		lbBackwaren = new JLabel("Backwaren");
		lbBackwaren.setLocation(new Point(3, 0));
		lbBackwaren.setBounds(0, 0, 161, 20);
		pnProdukt2.add(lbBackwaren);
		
		sp1pnProdukt2 = new JSeparator();
		sp1pnProdukt2.setBounds(0, 18, 161, 2);
		pnProdukt2.add(sp1pnProdukt2);
		
		lbBackwarenImage = new JLabel("");
		lbBackwarenImage.setBounds(0, 18, 161, 91);
		lbBackwarenImage.setIcon(new ImageIcon(getClass().getResource("/Images/Backwaren.jpg")));
		pnProdukt2.add(lbBackwarenImage);
		
		pnProdukt3 = new JPanel();
		pnProdukt3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(2, Edit);
			}
		});
		pnProdukt3.setLayout(null);
		pnProdukt3.setBounds(494, 124, 161, 109);
		pnKategorien.add(pnProdukt3);
		
		lbMilchprodukte = new JLabel("Milchprodukte");
		lbMilchprodukte.setLocation(new Point(3, 0));
		lbMilchprodukte.setBounds(0, 0, 161, 20);
		pnProdukt3.add(lbMilchprodukte);
		
		sp1pnProdukt3 = new JSeparator();
		sp1pnProdukt3.setBounds(0, 18, 161, 2);
		pnProdukt3.add(sp1pnProdukt3);
		
		lbMilchprodukteImage = new JLabel("");
		lbMilchprodukteImage.setBounds(0, 18, 161, 91);
		lbMilchprodukteImage.setIcon(new ImageIcon(getClass().getResource("/Images/Milchprodukte.jpg")));
		pnProdukt3.add(lbMilchprodukteImage);
		
		pnProdukt4 = new JPanel();
		pnProdukt4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(3, Edit);
			}
		});
		pnProdukt4.setLayout(null);
		pnProdukt4.setBounds(37, 285, 161, 109);
		pnKategorien.add(pnProdukt4);
		
		lbFr�chte = new JLabel("Fr\u00FCchte");
		lbFr�chte.setLocation(new Point(3, 0));
		lbFr�chte.setBounds(0, 0, 161, 20);
		pnProdukt4.add(lbFr�chte);
		
		sp1pnProdukt4 = new JSeparator();
		sp1pnProdukt4.setBounds(0, 18, 161, 2);
		pnProdukt4.add(sp1pnProdukt4);
		
		lbFr�chteImage = new JLabel("");
		lbFr�chteImage.setBounds(0, 18, 161, 91);
		lbFr�chteImage.setIcon(new ImageIcon(getClass().getResource("/Images/Fr�chte.jpg")));
		pnProdukt4.add(lbFr�chteImage);
		
		pnProdukt5 = new JPanel();
		pnProdukt5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(4, Edit);
			}
		});
		pnProdukt5.setLayout(null);
		pnProdukt5.setBounds(268, 285, 161, 109);
		pnKategorien.add(pnProdukt5);
		
		lbGem�se = new JLabel("Gem\u00FCse");
		lbGem�se.setLocation(new Point(3, 0));
		lbGem�se.setBounds(0, 0, 161, 20);
		pnProdukt5.add(lbGem�se);
		
		sp1pnProdukt5 = new JSeparator();
		sp1pnProdukt5.setBounds(0, 18, 161, 2);
		pnProdukt5.add(sp1pnProdukt5);
		
		lbGem�seImage = new JLabel("");
		lbGem�seImage.setBounds(0, 18, 161, 91);
		lbGem�seImage.setIcon(new ImageIcon(getClass().getResource("/Images/Gem�se.jpg")));
		pnProdukt5.add(lbGem�seImage);
		
		pnProdukt6 = new JPanel();
		pnProdukt6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(5, Edit);
			}
		});
		pnProdukt6.setLayout(null);
		pnProdukt6.setBounds(494, 285, 161, 109);
		pnKategorien.add(pnProdukt6);
		
		lbFleisch = new JLabel("Fleisch");
		lbFleisch.setLocation(new Point(3, 0));
		lbFleisch.setBounds(0, 0, 161, 20);
		pnProdukt6.add(lbFleisch);
		
		sp1pnProdukt6 = new JSeparator();
		sp1pnProdukt6.setBounds(0, 18, 161, 2);
		pnProdukt6.add(sp1pnProdukt6);
		
		lbFleischImage = new JLabel("");
		lbFleischImage.setBounds(0, 18, 161, 91);
		lbFleischImage.setIcon(new ImageIcon(getClass().getResource("/Images/Fleisch.jpg")));
		pnProdukt6.add(lbFleischImage);
		
		pnProdukt7 = new JPanel();
		pnProdukt7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(6, Edit);
			}
		});
		pnProdukt7.setLayout(null);
		pnProdukt7.setBounds(37, 452, 161, 109);
		pnKategorien.add(pnProdukt7);
		
		lbS�ssigkeiten = new JLabel("S\u00FCssigkeiten");
		lbS�ssigkeiten.setLocation(new Point(3, 0));
		lbS�ssigkeiten.setBounds(0, 0, 161, 20);
		pnProdukt7.add(lbS�ssigkeiten);
		
		sp1pnProdukt7 = new JSeparator();
		sp1pnProdukt7.setBounds(0, 18, 161, 2);
		pnProdukt7.add(sp1pnProdukt7);
		
		lbS�ssigkeitenImage = new JLabel("");
		lbS�ssigkeitenImage.setBounds(0, 18, 161, 91);
		lbS�ssigkeitenImage.setIcon(new ImageIcon(getClass().getResource("/Images/S�ssigkeiten.jpg")));
		pnProdukt7.add(lbS�ssigkeitenImage);
		
		pnProdukt8 = new JPanel();
		pnProdukt8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(7, Edit);
			}
		});
		pnProdukt8.setLayout(null);
		pnProdukt8.setBounds(268, 452, 161, 109);
		pnKategorien.add(pnProdukt8);
		
		lbFertiggerichte = new JLabel("Fertiggerichte");
		lbFertiggerichte.setLocation(new Point(3, 0));
		lbFertiggerichte.setBounds(0, 0, 161, 20);
		pnProdukt8.add(lbFertiggerichte);
		
		sp1pnProdukt8 = new JSeparator();
		sp1pnProdukt8.setBounds(0, 18, 161, 2);
		pnProdukt8.add(sp1pnProdukt8);
		
		lbFertiggerichteImage = new JLabel("");
		lbFertiggerichteImage.setBounds(0, 18, 161, 91);
		lbFertiggerichteImage.setIcon(new ImageIcon(getClass().getResource("/Images/Fertiggerichte.jpg")));
		pnProdukt8.add(lbFertiggerichteImage);
		
		pnProdukt9 = new JPanel();
		pnProdukt9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(8, Edit);
			}
		});
		pnProdukt9.setLayout(null);
		pnProdukt9.setBounds(494, 452, 161, 109);
		pnKategorien.add(pnProdukt9);
		
		lbGetr�nke = new JLabel("Getr\u00E4nke");
		lbGetr�nke.setLocation(new Point(3, 0));
		lbGetr�nke.setBounds(0, 0, 161, 20);
		pnProdukt9.add(lbGetr�nke);
		
		sp1pnProdukt9 = new JSeparator();
		sp1pnProdukt9.setBounds(0, 18, 161, 2);
		pnProdukt9.add(sp1pnProdukt9);
		
		lbGetr�nkeImage = new JLabel("");
		lbGetr�nkeImage.setBounds(0, 18, 161, 91);
		lbGetr�nkeImage.setIcon(new ImageIcon(getClass().getResource("/Images/Getr�nke.jpg")));
		pnProdukt9.add(lbGetr�nkeImage);
		
		if(Edit) {
			lbTitel = new JLabel("Bearbeiten");
			lbTitel.setBounds(300, 45, 250, 25);
		} else {
			lbTitel = new JLabel("Artikel Kategorien");
			lbTitel.setBounds(281, 45, 250, 25);
		}
		
		lbTitel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTitel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pnKategorien.add(lbTitel);
	}
}



