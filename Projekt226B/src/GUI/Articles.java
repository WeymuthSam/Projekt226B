package GUI;

import javax.swing.JPanel;
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
	
	private JPanel pnArtikel1;
	private JPanel pnArtikel2;
	private JPanel pnArtikel3;
	private JPanel pnArtikel4;
	private JPanel pnArtikel5;
	private JPanel pnArtikel6;
	private JPanel pnArtikel7;
	private JPanel pnArtikel8;
	private JPanel pnArtikel9;
	
	private JLabel lbArtikel1;
	private JLabel lbArtikel2;
	private JLabel lbArtikel3;
	private JLabel lbArtikel4;
	private JLabel lbArtikel5;
	private JLabel lbArtikel6;
	private JLabel lbArtikel7;
	private JLabel lbArtikel8;
	private JLabel lbArtikel9;
	
	//List with all panels
	private List<JPanel> panels = new ArrayList<JPanel>();
	private List<JLabel> labels = new ArrayList<JLabel>();
	
	private Main Main;
	private Checkoutlogic LogicLayer;
	private int CategorieID;
	
	
	public Articles(Main Main, Checkoutlogic LogicLayer, int id) {
		setLayout(null);
		
		this.Main = Main;
		this.LogicLayer = LogicLayer;
		this.CategorieID = id;
		
		JPanel pnArtikel = new JPanel();
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
				ShowAmountView(1);
			}
		});
		pnArtikel1.setBounds(37, 124, 161, 109);
		pnArtikel.add(pnArtikel1);
		pnArtikel1.setLayout(null);
		
		lbArtikel1 = new JLabel("");
		lbArtikel1.setLocation(new Point(3, 0));
		lbArtikel1.setBounds(0, 0, 161, 20);
		pnArtikel1.add(lbArtikel1);
		
		JSeparator sp1pnArtikel1 = new JSeparator();
		sp1pnArtikel1.setBounds(0, 18, 161, 2);
		pnArtikel1.add(sp1pnArtikel1);
		
		JSeparator sp2pnArtikel1 = new JSeparator();
		sp2pnArtikel1.setBounds(0, 84, 161, 2);
		pnArtikel1.add(sp2pnArtikel1);
		
		pnArtikel2 = new JPanel();
		pnArtikel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(2);
			}
		});
		pnArtikel2.setLayout(null);
		pnArtikel2.setBounds(268, 124, 161, 109);
		pnArtikel.add(pnArtikel2);
		
		lbArtikel2 = new JLabel("");
		lbArtikel2.setLocation(new Point(3, 0));
		lbArtikel2.setBounds(0, 0, 161, 20);
		pnArtikel2.add(lbArtikel2);
		
		JSeparator sp1pnArtikel2 = new JSeparator();
		sp1pnArtikel2.setBounds(0, 18, 161, 2);
		pnArtikel2.add(sp1pnArtikel2);
		
		JSeparator sp2pnArtikel2 = new JSeparator();
		sp2pnArtikel2.setBounds(0, 84, 161, 2);
		pnArtikel2.add(sp2pnArtikel2);
		
		pnArtikel3 = new JPanel();
		pnArtikel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(3);
			}
		});
		pnArtikel3.setLayout(null);
		pnArtikel3.setBounds(494, 124, 161, 109);
		pnArtikel.add(pnArtikel3);
		
		lbArtikel3 = new JLabel("");
		lbArtikel3.setLocation(new Point(3, 0));
		lbArtikel3.setBounds(0, 0, 161, 20);
		pnArtikel3.add(lbArtikel3);
		
		JSeparator sp1pnProdukt3 = new JSeparator();
		sp1pnProdukt3.setBounds(0, 18, 161, 2);
		pnArtikel3.add(sp1pnProdukt3);
		
		JSeparator sp2pnProdukt3 = new JSeparator();
		sp2pnProdukt3.setBounds(0, 84, 161, 2);
		pnArtikel3.add(sp2pnProdukt3);
		
		pnArtikel4 = new JPanel();
		pnArtikel4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(4);
			}
		});
		pnArtikel4.setLayout(null);
		pnArtikel4.setBounds(37, 285, 161, 109);
		pnArtikel.add(pnArtikel4);
		
		lbArtikel4 = new JLabel("");
		lbArtikel4.setLocation(new Point(3, 0));
		lbArtikel4.setBounds(0, 0, 161, 20);
		pnArtikel4.add(lbArtikel4);
		
		JSeparator sp1pnProdukt4 = new JSeparator();
		sp1pnProdukt4.setBounds(0, 18, 161, 2);
		pnArtikel4.add(sp1pnProdukt4);
		
		JSeparator sp2pnProdukt4 = new JSeparator();
		sp2pnProdukt4.setBounds(0, 84, 161, 2);
		pnArtikel4.add(sp2pnProdukt4);
		
		pnArtikel5 = new JPanel();
		pnArtikel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(5);
			}
		});
		pnArtikel5.setLayout(null);
		pnArtikel5.setBounds(268, 285, 161, 109);
		pnArtikel.add(pnArtikel5);
		
		lbArtikel5 = new JLabel("");
		lbArtikel5.setLocation(new Point(3, 0));
		lbArtikel5.setBounds(0, 0, 161, 20);
		pnArtikel5.add(lbArtikel5);
		
		JSeparator sp1pnProdukt5 = new JSeparator();
		sp1pnProdukt5.setBounds(0, 18, 161, 2);
		pnArtikel5.add(sp1pnProdukt5);
		
		JSeparator sp2pnProdukt5 = new JSeparator();
		sp2pnProdukt5.setBounds(0, 84, 161, 2);
		pnArtikel5.add(sp2pnProdukt5);
		
		pnArtikel6 = new JPanel();
		pnArtikel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(6);
			}
		});
		pnArtikel6.setLayout(null);
		pnArtikel6.setBounds(494, 285, 161, 109);
		pnArtikel.add(pnArtikel6);
		
		lbArtikel6 = new JLabel("");
		lbArtikel6.setLocation(new Point(3, 0));
		lbArtikel6.setBounds(0, 0, 161, 20);
		pnArtikel6.add(lbArtikel6);
		
		JSeparator sp1pnProdukt6 = new JSeparator();
		sp1pnProdukt6.setBounds(0, 18, 161, 2);
		pnArtikel6.add(sp1pnProdukt6);
		
		JSeparator sp2pnProdukt6 = new JSeparator();
		sp2pnProdukt6.setBounds(0, 84, 161, 2);
		pnArtikel6.add(sp2pnProdukt6);
		
		pnArtikel7 = new JPanel();
		pnArtikel7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(7);
			}
		});
		pnArtikel7.setLayout(null);
		pnArtikel7.setBounds(37, 452, 161, 109);
		pnArtikel.add(pnArtikel7);
		
		lbArtikel7 = new JLabel("");
		lbArtikel7.setLocation(new Point(3, 0));
		lbArtikel7.setBounds(0, 0, 161, 20);
		pnArtikel7.add(lbArtikel7);
		
		JSeparator sp1pnProdukt7 = new JSeparator();
		sp1pnProdukt7.setBounds(0, 18, 161, 2);
		pnArtikel7.add(sp1pnProdukt7);
		
		JSeparator sp2pnProdukt7 = new JSeparator();
		sp2pnProdukt7.setBounds(0, 84, 161, 2);
		pnArtikel7.add(sp2pnProdukt7);
		
		pnArtikel8 = new JPanel();
		pnArtikel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(8);
			}
		});
		pnArtikel8.setLayout(null);
		pnArtikel8.setBounds(268, 452, 161, 109);
		pnArtikel.add(pnArtikel8);
		
		lbArtikel8 = new JLabel("");
		lbArtikel8.setLocation(new Point(3, 0));
		lbArtikel8.setBounds(0, 0, 161, 20);
		pnArtikel8.add(lbArtikel8);
		
		JSeparator sp1pnProdukt8 = new JSeparator();
		sp1pnProdukt8.setBounds(0, 18, 161, 2);
		pnArtikel8.add(sp1pnProdukt8);
		
		JSeparator sp2pnProdukt8 = new JSeparator();
		sp2pnProdukt8.setBounds(0, 84, 161, 2);
		pnArtikel8.add(sp2pnProdukt8);
		
		pnArtikel9 = new JPanel();
		pnArtikel9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowAmountView(9);
			}
		});
		pnArtikel9.setLayout(null);
		pnArtikel9.setBounds(494, 452, 161, 109);
		pnArtikel.add(pnArtikel9);
		
		lbArtikel9 = new JLabel("");
		lbArtikel9.setLocation(new Point(3, 0));
		lbArtikel9.setBounds(0, 0, 161, 20);
		pnArtikel9.add(lbArtikel9);
		
		JSeparator sp1pnProdukt9 = new JSeparator();
		sp1pnProdukt9.setBounds(0, 18, 161, 2);
		pnArtikel9.add(sp1pnProdukt9);
		
		JSeparator sp2pnProdukt69 = new JSeparator();
		sp2pnProdukt69.setBounds(0, 84, 161, 2);
		pnArtikel9.add(sp2pnProdukt69);
		
		JLabel lbArtikel = new JLabel("Artikel");
		lbArtikel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lbArtikel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbArtikel.setBounds(322, 65, 57, 25);
		pnArtikel.add(lbArtikel);
		
		panels.add(pnArtikel1);
		panels.add(pnArtikel2);
		panels.add(pnArtikel3);
		panels.add(pnArtikel4);
		panels.add(pnArtikel5);
		panels.add(pnArtikel6);
		panels.add(pnArtikel7);
		panels.add(pnArtikel8);
		panels.add(pnArtikel9);
		
		labels.add(lbArtikel1);
		labels.add(lbArtikel2);
		labels.add(lbArtikel3);
		labels.add(lbArtikel4);
		labels.add(lbArtikel5);
		labels.add(lbArtikel6);
		labels.add(lbArtikel7);
		labels.add(lbArtikel8);
		labels.add(lbArtikel9);
		
		showArticles();

	}
	
	public void showArticles() {
		int index = 0;
		LogicLayer.LoadData();
		for(int i = 0; i < LogicLayer.articles.size(); i++) {
			if(LogicLayer.articles.get(i).getCategorieID() == CategorieID) {
				labels.get(index).setText(LogicLayer.articles.get(i).getName());
				//panels.get(index).set   Bild setzen 
				//Preis setzen
				index++;
			}
		}
	}
	
	public void ShowAmountView(int ItemPosition) {
		int index = 1;
		LogicLayer.LoadData();
		for(int i = 0; i < LogicLayer.articles.size(); i++) {
			if(LogicLayer.articles.get(i).getCategorieID() == CategorieID) {
				if(index == ItemPosition) {
					new DetermineAmount(LogicLayer, LogicLayer.articles.get(i).getId());
				}
				index++;
			}
		}
	}
}
