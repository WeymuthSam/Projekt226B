package GUI;

import javax.swing.JPanel;
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


	public ArticleCategories(Main Main) {
		setLayout(null);
		
		this.main = Main;
		
		JPanel pnWarenkorb = new JPanel();
		pnWarenkorb.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		pnWarenkorb.setForeground(Color.BLACK);
		pnWarenkorb.setBackground(Color.WHITE);
		pnWarenkorb.setBounds(0, 0, 700, 600);
		add(pnWarenkorb);
		pnWarenkorb.setLayout(null);
		
		JPanel pnProdukt1 = new JPanel();
		pnProdukt1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(0);
			}
		});
		pnProdukt1.setBounds(37, 124, 161, 109);
		pnWarenkorb.add(pnProdukt1);
		pnProdukt1.setLayout(null);
		
		JLabel lbMeeresfrüchte = new JLabel("Meeresfr\u00FCchte");
		lbMeeresfrüchte.setLocation(new Point(3, 0));
		lbMeeresfrüchte.setBounds(0, 0, 161, 20);
		pnProdukt1.add(lbMeeresfrüchte);
		
		JSeparator sp1pnProdukt1 = new JSeparator();
		sp1pnProdukt1.setBounds(0, 18, 161, 2);
		pnProdukt1.add(sp1pnProdukt1);
		
		JSeparator sp2pnProdukt1 = new JSeparator();
		sp2pnProdukt1.setBounds(0, 84, 161, 2);
		pnProdukt1.add(sp2pnProdukt1);
		
		JPanel pnProdukt2 = new JPanel();
		pnProdukt2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(1);
			}
		});
		pnProdukt2.setLayout(null);
		pnProdukt2.setBounds(268, 124, 161, 109);
		pnWarenkorb.add(pnProdukt2);
		
		JLabel lbBackwaren = new JLabel("Backwaren");
		lbBackwaren.setLocation(new Point(3, 0));
		lbBackwaren.setBounds(0, 0, 161, 20);
		pnProdukt2.add(lbBackwaren);
		
		JSeparator sp1pnProdukt2 = new JSeparator();
		sp1pnProdukt2.setBounds(0, 18, 161, 2);
		pnProdukt2.add(sp1pnProdukt2);
		
		JSeparator sp2pnProdukt2 = new JSeparator();
		sp2pnProdukt2.setBounds(0, 84, 161, 2);
		pnProdukt2.add(sp2pnProdukt2);
		
		JPanel pnProdukt3 = new JPanel();
		pnProdukt3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(2);
			}
		});
		pnProdukt3.setLayout(null);
		pnProdukt3.setBounds(494, 124, 161, 109);
		pnWarenkorb.add(pnProdukt3);
		
		JLabel lbMilchprodukte = new JLabel("Milchprodukte");
		lbMilchprodukte.setLocation(new Point(3, 0));
		lbMilchprodukte.setBounds(0, 0, 161, 20);
		pnProdukt3.add(lbMilchprodukte);
		
		JSeparator sp1pnProdukt3 = new JSeparator();
		sp1pnProdukt3.setBounds(0, 18, 161, 2);
		pnProdukt3.add(sp1pnProdukt3);
		
		JSeparator sp2pnProdukt3 = new JSeparator();
		sp2pnProdukt3.setBounds(0, 84, 161, 2);
		pnProdukt3.add(sp2pnProdukt3);
		
		JPanel pnProdukt4 = new JPanel();
		pnProdukt4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(3);
			}
		});
		pnProdukt4.setLayout(null);
		pnProdukt4.setBounds(37, 285, 161, 109);
		pnWarenkorb.add(pnProdukt4);
		
		JLabel lbFrüchte = new JLabel("Fr\u00FCchte");
		lbFrüchte.setLocation(new Point(3, 0));
		lbFrüchte.setBounds(0, 0, 161, 20);
		pnProdukt4.add(lbFrüchte);
		
		JSeparator sp1pnProdukt4 = new JSeparator();
		sp1pnProdukt4.setBounds(0, 18, 161, 2);
		pnProdukt4.add(sp1pnProdukt4);
		
		JSeparator sp2pnProdukt4 = new JSeparator();
		sp2pnProdukt4.setBounds(0, 84, 161, 2);
		pnProdukt4.add(sp2pnProdukt4);
		
		JPanel pnProdukt5 = new JPanel();
		pnProdukt5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(4);
			}
		});
		pnProdukt5.setLayout(null);
		pnProdukt5.setBounds(268, 285, 161, 109);
		pnWarenkorb.add(pnProdukt5);
		
		JLabel lbGemüse = new JLabel("Gem\u00FCse");
		lbGemüse.setLocation(new Point(3, 0));
		lbGemüse.setBounds(0, 0, 161, 20);
		pnProdukt5.add(lbGemüse);
		
		JSeparator sp1pnProdukt5 = new JSeparator();
		sp1pnProdukt5.setBounds(0, 18, 161, 2);
		pnProdukt5.add(sp1pnProdukt5);
		
		JSeparator sp2pnProdukt5 = new JSeparator();
		sp2pnProdukt5.setBounds(0, 84, 161, 2);
		pnProdukt5.add(sp2pnProdukt5);
		
		JPanel pnProdukt6 = new JPanel();
		pnProdukt6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(5);
			}
		});
		pnProdukt6.setLayout(null);
		pnProdukt6.setBounds(494, 285, 161, 109);
		pnWarenkorb.add(pnProdukt6);
		
		JLabel lbFleisch = new JLabel("Fleisch");
		lbFleisch.setLocation(new Point(3, 0));
		lbFleisch.setBounds(0, 0, 161, 20);
		pnProdukt6.add(lbFleisch);
		
		JSeparator sp1pnProdukt6 = new JSeparator();
		sp1pnProdukt6.setBounds(0, 18, 161, 2);
		pnProdukt6.add(sp1pnProdukt6);
		
		JSeparator sp2pnProdukt6 = new JSeparator();
		sp2pnProdukt6.setBounds(0, 84, 161, 2);
		pnProdukt6.add(sp2pnProdukt6);
		
		JPanel pnProdukt7 = new JPanel();
		pnProdukt7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(6);
			}
		});
		pnProdukt7.setLayout(null);
		pnProdukt7.setBounds(37, 452, 161, 109);
		pnWarenkorb.add(pnProdukt7);
		
		JLabel lbSüssigkeiten = new JLabel("S\u00FCssigkeiten");
		lbSüssigkeiten.setLocation(new Point(3, 0));
		lbSüssigkeiten.setBounds(0, 0, 161, 20);
		pnProdukt7.add(lbSüssigkeiten);
		
		JSeparator sp1pnProdukt7 = new JSeparator();
		sp1pnProdukt7.setBounds(0, 18, 161, 2);
		pnProdukt7.add(sp1pnProdukt7);
		
		JSeparator sp2pnProdukt7 = new JSeparator();
		sp2pnProdukt7.setBounds(0, 84, 161, 2);
		pnProdukt7.add(sp2pnProdukt7);
		
		JPanel pnProdukt8 = new JPanel();
		pnProdukt8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(7);
			}
		});
		pnProdukt8.setLayout(null);
		pnProdukt8.setBounds(268, 452, 161, 109);
		pnWarenkorb.add(pnProdukt8);
		
		JLabel lbFertiggerichte = new JLabel("Fertiggerichte");
		lbFertiggerichte.setLocation(new Point(3, 0));
		lbFertiggerichte.setBounds(0, 0, 161, 20);
		pnProdukt8.add(lbFertiggerichte);
		
		JSeparator sp1pnProdukt8 = new JSeparator();
		sp1pnProdukt8.setBounds(0, 18, 161, 2);
		pnProdukt8.add(sp1pnProdukt8);
		
		JSeparator sp2pnProdukt8 = new JSeparator();
		sp2pnProdukt8.setBounds(0, 84, 161, 2);
		pnProdukt8.add(sp2pnProdukt8);
		
		JPanel pnProdukt9 = new JPanel();
		pnProdukt9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.ArticleCategoriesClicked(8);
			}
		});
		pnProdukt9.setLayout(null);
		pnProdukt9.setBounds(494, 452, 161, 109);
		pnWarenkorb.add(pnProdukt9);
		
		JLabel lbGetränke = new JLabel("Getr\u00E4nke");
		lbGetränke.setLocation(new Point(3, 0));
		lbGetränke.setBounds(0, 0, 161, 20);
		pnProdukt9.add(lbGetränke);
		
		JSeparator sp1pnProdukt9 = new JSeparator();
		sp1pnProdukt9.setBounds(0, 18, 161, 2);
		pnProdukt9.add(sp1pnProdukt9);
		
		JSeparator sp2pnProdukt69 = new JSeparator();
		sp2pnProdukt69.setBounds(0, 84, 161, 2);
		pnProdukt9.add(sp2pnProdukt69);
		
		JLabel lblArtikelKategorier = new JLabel("Artikel Kategorien");
		lblArtikelKategorier.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblArtikelKategorier.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblArtikelKategorier.setBounds(282, 45, 132, 25);
		pnWarenkorb.add(lblArtikelKategorier);

	}
}



