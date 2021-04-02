package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.ComponentOrientation;

public class Articles extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Articles() {
		setLayout(null);
		
		JPanel pnArtikel = new JPanel();
		pnArtikel.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		pnArtikel.setForeground(Color.BLACK);
		pnArtikel.setBackground(Color.WHITE);
		pnArtikel.setBounds(0, 0, 698, 600);
		add(pnArtikel);
		pnArtikel.setLayout(null);
		
		JPanel pnArtikel1 = new JPanel();
		pnArtikel1.setBounds(37, 124, 161, 109);
		pnArtikel.add(pnArtikel1);
		pnArtikel1.setLayout(null);
		
		JLabel lbArtikel1 = new JLabel("");
		lbArtikel1.setLocation(new Point(3, 0));
		lbArtikel1.setBounds(0, 0, 161, 20);
		pnArtikel1.add(lbArtikel1);
		
		JSeparator sp1pnArtikel1 = new JSeparator();
		sp1pnArtikel1.setBounds(0, 18, 161, 2);
		pnArtikel1.add(sp1pnArtikel1);
		
		JSeparator sp2pnArtikel1 = new JSeparator();
		sp2pnArtikel1.setBounds(0, 84, 161, 2);
		pnArtikel1.add(sp2pnArtikel1);
		
		JPanel pnArtikel2 = new JPanel();
		pnArtikel2.setLayout(null);
		pnArtikel2.setBounds(268, 124, 161, 109);
		pnArtikel.add(pnArtikel2);
		
		JLabel lbArtikel2 = new JLabel("");
		lbArtikel2.setLocation(new Point(3, 0));
		lbArtikel2.setBounds(0, 0, 161, 20);
		pnArtikel2.add(lbArtikel2);
		
		JSeparator sp1pnArtikel2 = new JSeparator();
		sp1pnArtikel2.setBounds(0, 18, 161, 2);
		pnArtikel2.add(sp1pnArtikel2);
		
		JSeparator sp2pnArtikel2 = new JSeparator();
		sp2pnArtikel2.setBounds(0, 84, 161, 2);
		pnArtikel2.add(sp2pnArtikel2);
		
		JPanel pnArtikel3 = new JPanel();
		pnArtikel3.setLayout(null);
		pnArtikel3.setBounds(494, 124, 161, 109);
		pnArtikel.add(pnArtikel3);
		
		JLabel lbArtikel3 = new JLabel("");
		lbArtikel3.setLocation(new Point(3, 0));
		lbArtikel3.setBounds(0, 0, 161, 20);
		pnArtikel3.add(lbArtikel3);
		
		JSeparator sp1pnProdukt3 = new JSeparator();
		sp1pnProdukt3.setBounds(0, 18, 161, 2);
		pnArtikel3.add(sp1pnProdukt3);
		
		JSeparator sp2pnProdukt3 = new JSeparator();
		sp2pnProdukt3.setBounds(0, 84, 161, 2);
		pnArtikel3.add(sp2pnProdukt3);
		
		JPanel pnArtikel4 = new JPanel();
		pnArtikel4.setLayout(null);
		pnArtikel4.setBounds(37, 285, 161, 109);
		pnArtikel.add(pnArtikel4);
		
		JLabel lbArtikel4 = new JLabel("");
		lbArtikel4.setLocation(new Point(3, 0));
		lbArtikel4.setBounds(0, 0, 161, 20);
		pnArtikel4.add(lbArtikel4);
		
		JSeparator sp1pnProdukt4 = new JSeparator();
		sp1pnProdukt4.setBounds(0, 18, 161, 2);
		pnArtikel4.add(sp1pnProdukt4);
		
		JSeparator sp2pnProdukt4 = new JSeparator();
		sp2pnProdukt4.setBounds(0, 84, 161, 2);
		pnArtikel4.add(sp2pnProdukt4);
		
		JPanel pnArtikel5 = new JPanel();
		pnArtikel5.setLayout(null);
		pnArtikel5.setBounds(268, 285, 161, 109);
		pnArtikel.add(pnArtikel5);
		
		JLabel lbArtikel5 = new JLabel("");
		lbArtikel5.setLocation(new Point(3, 0));
		lbArtikel5.setBounds(0, 0, 161, 20);
		pnArtikel5.add(lbArtikel5);
		
		JSeparator sp1pnProdukt5 = new JSeparator();
		sp1pnProdukt5.setBounds(0, 18, 161, 2);
		pnArtikel5.add(sp1pnProdukt5);
		
		JSeparator sp2pnProdukt5 = new JSeparator();
		sp2pnProdukt5.setBounds(0, 84, 161, 2);
		pnArtikel5.add(sp2pnProdukt5);
		
		JPanel pnArtikel6 = new JPanel();
		pnArtikel6.setLayout(null);
		pnArtikel6.setBounds(494, 285, 161, 109);
		pnArtikel.add(pnArtikel6);
		
		JLabel lbArtikel6 = new JLabel("");
		lbArtikel6.setLocation(new Point(3, 0));
		lbArtikel6.setBounds(0, 0, 161, 20);
		pnArtikel6.add(lbArtikel6);
		
		JSeparator sp1pnProdukt6 = new JSeparator();
		sp1pnProdukt6.setBounds(0, 18, 161, 2);
		pnArtikel6.add(sp1pnProdukt6);
		
		JSeparator sp2pnProdukt6 = new JSeparator();
		sp2pnProdukt6.setBounds(0, 84, 161, 2);
		pnArtikel6.add(sp2pnProdukt6);
		
		JPanel pnArtikel7 = new JPanel();
		pnArtikel7.setLayout(null);
		pnArtikel7.setBounds(37, 452, 161, 109);
		pnArtikel.add(pnArtikel7);
		
		JLabel lbArtikel7 = new JLabel("");
		lbArtikel7.setLocation(new Point(3, 0));
		lbArtikel7.setBounds(0, 0, 161, 20);
		pnArtikel7.add(lbArtikel7);
		
		JSeparator sp1pnProdukt7 = new JSeparator();
		sp1pnProdukt7.setBounds(0, 18, 161, 2);
		pnArtikel7.add(sp1pnProdukt7);
		
		JSeparator sp2pnProdukt7 = new JSeparator();
		sp2pnProdukt7.setBounds(0, 84, 161, 2);
		pnArtikel7.add(sp2pnProdukt7);
		
		JPanel pnArtikel8 = new JPanel();
		pnArtikel8.setLayout(null);
		pnArtikel8.setBounds(268, 452, 161, 109);
		pnArtikel.add(pnArtikel8);
		
		JLabel lbArtikel8 = new JLabel("");
		lbArtikel8.setLocation(new Point(3, 0));
		lbArtikel8.setBounds(0, 0, 161, 20);
		pnArtikel8.add(lbArtikel8);
		
		JSeparator sp1pnProdukt8 = new JSeparator();
		sp1pnProdukt8.setBounds(0, 18, 161, 2);
		pnArtikel8.add(sp1pnProdukt8);
		
		JSeparator sp2pnProdukt8 = new JSeparator();
		sp2pnProdukt8.setBounds(0, 84, 161, 2);
		pnArtikel8.add(sp2pnProdukt8);
		
		JPanel pnArtikel9 = new JPanel();
		pnArtikel9.setLayout(null);
		pnArtikel9.setBounds(494, 452, 161, 109);
		pnArtikel.add(pnArtikel9);
		
		JLabel lbArtikel9 = new JLabel("");
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

	}
}
