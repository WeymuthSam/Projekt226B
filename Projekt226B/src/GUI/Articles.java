package GUI;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JSeparator;
import javax.swing.UIManager;

import Logic.Checkoutlogic;

import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Articles extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel pnArtikel;
	
	private JPanel pnArtikel1;
	private JPanel pnArtikel2;
	private JPanel pnArtikel3;
	private JPanel pnArtikel4;
	private JPanel pnArtikel5;
	private JPanel pnArtikel6;
	private JPanel pnArtikel7;
	private JPanel pnArtikel8;
	private JPanel pnArtikel9;
	
	private JLabel lbArtikel;
	private JLabel lbArtikel1;
	private JLabel lbArtikel2;
	private JLabel lbArtikel3;
	private JLabel lbArtikel4;
	private JLabel lbArtikel5;
	private JLabel lbArtikel6;
	private JLabel lbArtikel7;
	private JLabel lbArtikel8;
	private JLabel lbArtikel9;
	
	private JLabel lbArtikel1Image;
	private JLabel lbArtikel2Image;
	private JLabel lbArtikel3Image;
	private JLabel lbArtikel4Image;
	private JLabel lbArtikel5Image;
	private JLabel lbArtikel6Image;
	private JLabel lbArtikel7Image;
	private JLabel lbArtikel8Image;
	private JLabel lbArtikel9Image;
	
	private JLabel lbArtikel1Preis;
	private JLabel lbArtikel2Preis;
	private JLabel lbArtikel3Preis;
	private JLabel lbArtikel4Preis;
	private JLabel lbArtikel5Preis;
	private JLabel lbArtikel6Preis;
	private JLabel lbArtikel7Preis;
	private JLabel lbArtikel8Preis;
	private JLabel lbArtikel9Preis;
	
	
	private JSeparator sp1pnArtikel1;
	private JSeparator sp1pnArtikel2;
	
	private JSeparator sp2pnArtikel1;
	private JSeparator sp2pnArtikel2;
	
	private JSeparator sp1pnProdukt1;
	private JSeparator sp1pnProdukt2;
	private JSeparator sp1pnProdukt3;
	private JSeparator sp1pnProdukt4;
	private JSeparator sp1pnProdukt5;
	private JSeparator sp1pnProdukt6;
	private JSeparator sp1pnProdukt7;
	private JSeparator sp1pnProdukt8;
	private JSeparator sp1pnProdukt9;
	
	private JSeparator sp2pnProdukt1;
	private JSeparator sp2pnProdukt2;
	private JSeparator sp2pnProdukt3;
	private JSeparator sp2pnProdukt4;
	private JSeparator sp2pnProdukt5;
	private JSeparator sp2pnProdukt6;
	private JSeparator sp2pnProdukt7;
	private JSeparator sp2pnProdukt8;
	private JSeparator sp2pnProdukt9;
	
	//List with all panels
	private List<JLabel> labelsforname = new ArrayList<JLabel>();
	private List<JLabel> labelsforprice = new ArrayList<JLabel>();
	private List<JLabel> labelsforimage = new ArrayList<JLabel>();

	
	private Main Main;
	private Boolean Edit;
	private Checkoutlogic LogicLayer;
	private int CategorieID;

	
	
	public Articles(Main Main, Checkoutlogic LogicLayer, int id, Boolean Edit) {
		setLayout(null);
		
		this.Main = Main;
		this.Edit = Edit;
		this.LogicLayer = LogicLayer;
		this.CategorieID = id;
		
		pnArtikel = new JPanel();
		pnArtikel.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		pnArtikel.setForeground(Color.BLACK);
		pnArtikel.setBackground(Color.WHITE);
		pnArtikel.setBounds(0, 0, 698, 600);
		add(pnArtikel);
		pnArtikel.setLayout(null);
		
		pnArtikel1 = new JPanel();
		pnArtikel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(1);
			}
		});
		pnArtikel1.setBounds(37, 124, 161, 109);
		pnArtikel.add(pnArtikel1);
		pnArtikel1.setLayout(null);
		
		lbArtikel1 = new JLabel("");
		lbArtikel1.setLocation(new Point(3, 0));
		lbArtikel1.setBounds(0, 0, 161, 20);
		pnArtikel1.add(lbArtikel1);
		
		sp1pnArtikel1 = new JSeparator();
		sp1pnArtikel1.setBounds(0, 18, 161, 2);
		pnArtikel1.add(sp1pnArtikel1);
		
		sp2pnArtikel1 = new JSeparator();
		sp2pnArtikel1.setBounds(0, 89, 161, 2);
		pnArtikel1.add(sp2pnArtikel1);
		
		pnArtikel2 = new JPanel();
		pnArtikel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(2);
			}
		});
		pnArtikel2.setLayout(null);
		pnArtikel2.setBounds(268, 124, 161, 109);
		pnArtikel.add(pnArtikel2);
		
		lbArtikel2 = new JLabel("");
		lbArtikel2.setLocation(new Point(3, 0));
		lbArtikel2.setBounds(0, 0, 161, 20);
		pnArtikel2.add(lbArtikel2);
		
		sp1pnArtikel2 = new JSeparator();
		sp1pnArtikel2.setBounds(0, 18, 161, 2);
		pnArtikel2.add(sp1pnArtikel2);
		
		sp2pnArtikel2 = new JSeparator();
		sp2pnArtikel2.setBounds(0, 89, 161, 2);
		pnArtikel2.add(sp2pnArtikel2);
		
		pnArtikel3 = new JPanel();
		pnArtikel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(3);
			}
		});
		pnArtikel3.setLayout(null);
		pnArtikel3.setBounds(494, 124, 161, 109);
		pnArtikel.add(pnArtikel3);
		
		lbArtikel3 = new JLabel("");
		lbArtikel3.setLocation(new Point(3, 0));
		lbArtikel3.setBounds(0, 0, 161, 20);
		pnArtikel3.add(lbArtikel3);
		
		sp1pnProdukt3 = new JSeparator();
		sp1pnProdukt3.setBounds(0, 18, 161, 2);
		pnArtikel3.add(sp1pnProdukt3);
		
		sp2pnProdukt3 = new JSeparator();
		sp2pnProdukt3.setBounds(0, 89, 161, 2);
		pnArtikel3.add(sp2pnProdukt3);
		
		pnArtikel4 = new JPanel();
		pnArtikel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(4);
			}
		});
		pnArtikel4.setLayout(null);
		pnArtikel4.setBounds(37, 285, 161, 109);
		pnArtikel.add(pnArtikel4);
		
		lbArtikel4 = new JLabel("");
		lbArtikel4.setLocation(new Point(3, 0));
		lbArtikel4.setBounds(0, 0, 161, 20);
		pnArtikel4.add(lbArtikel4);
		
		sp1pnProdukt4 = new JSeparator();
		sp1pnProdukt4.setBounds(0, 18, 161, 2);
		pnArtikel4.add(sp1pnProdukt4);
		
		sp2pnProdukt4 = new JSeparator();
		sp2pnProdukt4.setBounds(0, 89, 161, 2);
		pnArtikel4.add(sp2pnProdukt4);
		
		pnArtikel5 = new JPanel();
		pnArtikel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(5);
			}
		});
		pnArtikel5.setLayout(null);
		pnArtikel5.setBounds(268, 285, 161, 109);
		pnArtikel.add(pnArtikel5);
		
		lbArtikel5 = new JLabel("");
		lbArtikel5.setLocation(new Point(3, 0));
		lbArtikel5.setBounds(0, 0, 161, 20);
		pnArtikel5.add(lbArtikel5);
		
		sp1pnProdukt5 = new JSeparator();
		sp1pnProdukt5.setBounds(0, 18, 161, 2);
		pnArtikel5.add(sp1pnProdukt5);
		
		sp2pnProdukt5 = new JSeparator();
		sp2pnProdukt5.setBounds(0, 89, 161, 2);
		pnArtikel5.add(sp2pnProdukt5);
		
		pnArtikel6 = new JPanel();
		pnArtikel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(6);
			}
		});
		pnArtikel6.setLayout(null);
		pnArtikel6.setBounds(494, 285, 161, 109);
		pnArtikel.add(pnArtikel6);
		
		lbArtikel6 = new JLabel("");
		lbArtikel6.setLocation(new Point(3, 0));
		lbArtikel6.setBounds(0, 0, 161, 20);
		pnArtikel6.add(lbArtikel6);
		
		sp1pnProdukt6 = new JSeparator();
		sp1pnProdukt6.setBounds(0, 18, 161, 2);
		pnArtikel6.add(sp1pnProdukt6);
		
		sp2pnProdukt6 = new JSeparator();
		sp2pnProdukt6.setBounds(0, 89, 161, 2);
		pnArtikel6.add(sp2pnProdukt6);
		
		pnArtikel7 = new JPanel();
		pnArtikel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(7);
			}
		});
		pnArtikel7.setLayout(null);
		pnArtikel7.setBounds(37, 452, 161, 109);
		pnArtikel.add(pnArtikel7);
		
		lbArtikel7 = new JLabel("");
		lbArtikel7.setLocation(new Point(3, 0));
		lbArtikel7.setBounds(0, 0, 161, 20);
		pnArtikel7.add(lbArtikel7);
		
		sp1pnProdukt7 = new JSeparator();
		sp1pnProdukt7.setBounds(0, 18, 161, 2);
		pnArtikel7.add(sp1pnProdukt7);
		
		sp2pnProdukt7 = new JSeparator();
		sp2pnProdukt7.setBounds(0, 89, 161, 2);
		pnArtikel7.add(sp2pnProdukt7);
		
		pnArtikel8 = new JPanel();
		pnArtikel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(8);
			}
		});
		pnArtikel8.setLayout(null);
		pnArtikel8.setBounds(268, 452, 161, 109);
		pnArtikel.add(pnArtikel8);
		
		lbArtikel8 = new JLabel("");
		lbArtikel8.setLocation(new Point(3, 0));
		lbArtikel8.setBounds(0, 0, 161, 20);
		pnArtikel8.add(lbArtikel8);
		
		sp1pnProdukt8 = new JSeparator();
		sp1pnProdukt8.setBounds(0, 18, 161, 2);
		pnArtikel8.add(sp1pnProdukt8);
		
		sp2pnProdukt8 = new JSeparator();
		sp2pnProdukt8.setBounds(0, 89, 161, 2);
		pnArtikel8.add(sp2pnProdukt8);
		
		pnArtikel9 = new JPanel();
		pnArtikel9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OnClick(9);
			}
		});
		pnArtikel9.setLayout(null);
		pnArtikel9.setBounds(494, 452, 161, 109);
		pnArtikel.add(pnArtikel9);
		
		lbArtikel9 = new JLabel("");
		lbArtikel9.setLocation(new Point(3, 0));
		lbArtikel9.setBounds(0, 0, 161, 20);
		pnArtikel9.add(lbArtikel9);
		
		sp1pnProdukt9 = new JSeparator();
		sp1pnProdukt9.setBounds(0, 18, 161, 2);
		pnArtikel9.add(sp1pnProdukt9);
		
		sp2pnProdukt9 = new JSeparator();
		sp2pnProdukt9.setBounds(0, 89, 161, 2);
		pnArtikel9.add(sp2pnProdukt9);
		
		if(Edit) {
			lbArtikel = new JLabel("Artikel Bearbeiten");
			lbArtikel.setBounds(280, 45, 153, 25);
		} else {
			lbArtikel = new JLabel("Artikel");
			lbArtikel.setBounds(315, 45, 153, 25);
		}
		lbArtikel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lbArtikel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pnArtikel.add(lbArtikel);
		
		labelsforname.add(lbArtikel1);
		
		lbArtikel1Preis = new JLabel("");
		lbArtikel1Preis.setLocation(new Point(3, 0));
		lbArtikel1Preis.setBounds(0, 89, 161, 20);
		pnArtikel1.add(lbArtikel1Preis);
		labelsforname.add(lbArtikel2);
		labelsforprice.add(lbArtikel1Preis);
		
		lbArtikel1Image = new JLabel("");
		lbArtikel1Image.setBounds(0, 18, 161, 73);
		pnArtikel1.add(lbArtikel1Image);
		labelsforimage.add(lbArtikel1Image);
		
		lbArtikel2Preis = new JLabel("");
		lbArtikel2Preis.setLocation(new Point(3, 0));
		lbArtikel2Preis.setBounds(0, 89, 161, 20);
		pnArtikel2.add(lbArtikel2Preis);
		labelsforname.add(lbArtikel3);
		labelsforprice.add(lbArtikel2Preis);
		
		lbArtikel2Image = new JLabel("");
		lbArtikel2Image.setBounds(0, 18, 161, 73);
		pnArtikel2.add(lbArtikel2Image);
		labelsforimage.add(lbArtikel2Image);
		
		lbArtikel3Preis = new JLabel("");
		lbArtikel3Preis.setLocation(new Point(3, 0));
		lbArtikel3Preis.setBounds(0, 89, 161, 20);
		pnArtikel3.add(lbArtikel3Preis);
		labelsforname.add(lbArtikel4);
		labelsforprice.add(lbArtikel3Preis);
		
		lbArtikel3Image = new JLabel("");
		lbArtikel3Image.setBounds(0, 18, 161, 73);
		pnArtikel3.add(lbArtikel3Image);
		labelsforimage.add(lbArtikel3Image);
		
		lbArtikel4Preis = new JLabel("");
		lbArtikel4Preis.setLocation(new Point(3, 0));
		lbArtikel4Preis.setBounds(0, 89, 161, 20);
		pnArtikel4.add(lbArtikel4Preis);
		labelsforname.add(lbArtikel5);
		labelsforprice.add(lbArtikel4Preis);
		
		lbArtikel4Image = new JLabel("");
		lbArtikel4Image.setBounds(0, 18, 161, 73);
		pnArtikel4.add(lbArtikel4Image);
		labelsforimage.add(lbArtikel4Image);
		
		lbArtikel5Preis = new JLabel("");
		lbArtikel5Preis.setLocation(new Point(3, 0));
		lbArtikel5Preis.setBounds(0, 89, 161, 20);
		pnArtikel5.add(lbArtikel5Preis);
		labelsforname.add(lbArtikel6);
		labelsforprice.add(lbArtikel5Preis);
		
		lbArtikel5Image = new JLabel("");
		lbArtikel5Image.setBounds(0, 18, 161, 73);
		pnArtikel5.add(lbArtikel5Image);
		labelsforimage.add(lbArtikel5Image);
		
		lbArtikel6Preis = new JLabel("");
		lbArtikel6Preis.setLocation(new Point(3, 0));
		lbArtikel6Preis.setBounds(0, 89, 161, 20);
		pnArtikel6.add(lbArtikel6Preis);
		labelsforname.add(lbArtikel7);
		labelsforprice.add(lbArtikel6Preis);
		
		lbArtikel6Image = new JLabel("");
		lbArtikel6Image.setBounds(0, 18, 161, 73);
		pnArtikel6.add(lbArtikel6Image);
		labelsforimage.add(lbArtikel6Image);
		
		lbArtikel7Preis = new JLabel("");
		lbArtikel7Preis.setLocation(new Point(3, 0));
		lbArtikel7Preis.setBounds(0, 89, 161, 20);
		pnArtikel7.add(lbArtikel7Preis);
		labelsforname.add(lbArtikel8);
		labelsforprice.add(lbArtikel7Preis);
		
		lbArtikel7Image = new JLabel("");
		lbArtikel7Image.setBounds(0, 18, 161, 73);
		pnArtikel7.add(lbArtikel7Image);
		labelsforimage.add(lbArtikel7Image);
		
		lbArtikel8Preis = new JLabel("");
		lbArtikel8Preis.setLocation(new Point(3, 0));
		lbArtikel8Preis.setBounds(0, 89, 161, 20);
		pnArtikel8.add(lbArtikel8Preis);
		labelsforname.add(lbArtikel9);
		labelsforprice.add(lbArtikel8Preis);
		
		lbArtikel8Image = new JLabel("");
		lbArtikel8Image.setBounds(0, 18, 161, 73);
		pnArtikel8.add(lbArtikel8Image);
		labelsforimage.add(lbArtikel8Image);
		
		lbArtikel9Preis = new JLabel("");
		lbArtikel9Preis.setLocation(new Point(3, 0));
		lbArtikel9Preis.setBounds(0, 89, 161, 20);
		pnArtikel9.add(lbArtikel9Preis);
		labelsforprice.add(lbArtikel9Preis);
		
		lbArtikel9Image = new JLabel("");
		lbArtikel9Image.setBounds(0, 18, 161, 73);
		pnArtikel9.add(lbArtikel9Image);
		labelsforimage.add(lbArtikel9Image);
		
		showArticles();

	}
	
	public void OnClick(int Pos) {
		int index = 1;
		LogicLayer.LoadData();
		for(int i = 0; i < LogicLayer.getArticles().size(); i++) {
			if(LogicLayer.getArticles().get(i).getCategorieID() == CategorieID) {
				if(index == Pos) {
					if(Edit) {
						new EditPrice(LogicLayer, LogicLayer.getArticles().get(i).getId());
					}else {
						new DetermineAmount(Main, LogicLayer, LogicLayer.getArticles().get(i).getId());
					}
				}
				index++;
			}
		}
	}
	
	public void showArticles() {
		int index = 0;
		LogicLayer.LoadData();
		for(int i = 0; i < LogicLayer.getArticles().size(); i++) {
			if(LogicLayer.getArticles().get(i).getCategorieID() == CategorieID) {
				labelsforname.get(index).setText(LogicLayer.getArticles().get(i).getName());
				labelsforimage.get(index).setIcon(LogicLayer.getArticles().get(i).getImage());
				labelsforprice.get(index).setText(String.valueOf(LogicLayer.getArticles().get(i).getPrice()) + " CHF");

				index++;
			}
		}
	}
	
}
