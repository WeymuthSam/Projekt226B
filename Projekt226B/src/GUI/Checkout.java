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

public class Checkout extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Checkout() {
		setLayout(null);
		
		JPanel pnWarenkorb = new JPanel();
		pnWarenkorb.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		pnWarenkorb.setForeground(Color.BLACK);
		pnWarenkorb.setBackground(Color.WHITE);
		pnWarenkorb.setBounds(0, 0, 700, 700);
		add(pnWarenkorb);
		pnWarenkorb.setLayout(null);
		
		JPanel pnProdukt1 = new JPanel();
		pnProdukt1.setBounds(37, 43, 161, 109);
		pnWarenkorb.add(pnProdukt1);
		pnProdukt1.setLayout(null);
		
		JLabel lbNameProdukt1 = new JLabel("Name");
		lbNameProdukt1.setLocation(new Point(3, 0));
		lbNameProdukt1.setBounds(0, 0, 45, 20);
		pnProdukt1.add(lbNameProdukt1);
		
		JSeparator sp1pnProdukt1 = new JSeparator();
		sp1pnProdukt1.setBounds(0, 18, 161, 2);
		pnProdukt1.add(sp1pnProdukt1);
		
		JSeparator sp2pnProdukt1 = new JSeparator();
		sp2pnProdukt1.setBounds(0, 84, 161, 2);
		pnProdukt1.add(sp2pnProdukt1);
		
		JPanel pnProdukt2 = new JPanel();
		pnProdukt2.setLayout(null);
		pnProdukt2.setBounds(246, 43, 161, 109);
		pnWarenkorb.add(pnProdukt2);
		
		JLabel lbNameProdukt2 = new JLabel("Name");
		lbNameProdukt2.setLocation(new Point(3, 0));
		lbNameProdukt2.setBounds(0, 0, 45, 20);
		pnProdukt2.add(lbNameProdukt2);
		
		JSeparator sp1pnProdukt2 = new JSeparator();
		sp1pnProdukt2.setBounds(0, 18, 161, 2);
		pnProdukt2.add(sp1pnProdukt2);
		
		JSeparator sp2pnProdukt2 = new JSeparator();
		sp2pnProdukt2.setBounds(0, 84, 161, 2);
		pnProdukt2.add(sp2pnProdukt2);
		
		JPanel pnProdukt3 = new JPanel();
		pnProdukt3.setLayout(null);
		pnProdukt3.setBounds(468, 43, 161, 109);
		pnWarenkorb.add(pnProdukt3);
		
		JLabel lbNameProdukt3 = new JLabel("Name");
		lbNameProdukt3.setLocation(new Point(3, 0));
		lbNameProdukt3.setBounds(0, 0, 45, 20);
		pnProdukt3.add(lbNameProdukt3);
		
		JSeparator sp1pnProdukt3 = new JSeparator();
		sp1pnProdukt3.setBounds(0, 18, 161, 2);
		pnProdukt3.add(sp1pnProdukt3);
		
		JSeparator sp2pnProdukt3 = new JSeparator();
		sp2pnProdukt3.setBounds(0, 84, 161, 2);
		pnProdukt3.add(sp2pnProdukt3);
		
		JPanel pnProdukt4 = new JPanel();
		pnProdukt4.setLayout(null);
		pnProdukt4.setBounds(37, 205, 161, 109);
		pnWarenkorb.add(pnProdukt4);
		
		JLabel lbNameProdukt4 = new JLabel("Name");
		lbNameProdukt4.setLocation(new Point(3, 0));
		lbNameProdukt4.setBounds(0, 0, 45, 20);
		pnProdukt4.add(lbNameProdukt4);
		
		JSeparator sp1pnProdukt4 = new JSeparator();
		sp1pnProdukt4.setBounds(0, 18, 161, 2);
		pnProdukt4.add(sp1pnProdukt4);
		
		JSeparator sp2pnProdukt4 = new JSeparator();
		sp2pnProdukt4.setBounds(0, 84, 161, 2);
		pnProdukt4.add(sp2pnProdukt4);
		
		JPanel pnProdukt5 = new JPanel();
		pnProdukt5.setLayout(null);
		pnProdukt5.setBounds(246, 205, 161, 109);
		pnWarenkorb.add(pnProdukt5);
		
		JLabel lbNameProdukt5 = new JLabel("Name");
		lbNameProdukt5.setLocation(new Point(3, 0));
		lbNameProdukt5.setBounds(0, 0, 45, 20);
		pnProdukt5.add(lbNameProdukt5);
		
		JSeparator sp1pnProdukt5 = new JSeparator();
		sp1pnProdukt5.setBounds(0, 18, 161, 2);
		pnProdukt5.add(sp1pnProdukt5);
		
		JSeparator sp2pnProdukt5 = new JSeparator();
		sp2pnProdukt5.setBounds(0, 84, 161, 2);
		pnProdukt5.add(sp2pnProdukt5);
		
		JPanel pnProdukt6 = new JPanel();
		pnProdukt6.setLayout(null);
		pnProdukt6.setBounds(468, 205, 161, 109);
		pnWarenkorb.add(pnProdukt6);
		
		JLabel lbNameProdukt6 = new JLabel("Name");
		lbNameProdukt6.setLocation(new Point(3, 0));
		lbNameProdukt6.setBounds(0, 0, 45, 20);
		pnProdukt6.add(lbNameProdukt6);
		
		JSeparator sp1pnProdukt6 = new JSeparator();
		sp1pnProdukt6.setBounds(0, 18, 161, 2);
		pnProdukt6.add(sp1pnProdukt6);
		
		JSeparator sp2pnProdukt6 = new JSeparator();
		sp2pnProdukt6.setBounds(0, 84, 161, 2);
		pnProdukt6.add(sp2pnProdukt6);
		
		JPanel pnProdukt7 = new JPanel();
		pnProdukt7.setLayout(null);
		pnProdukt7.setBounds(37, 379, 161, 109);
		pnWarenkorb.add(pnProdukt7);
		
		JLabel lbNameProdukt7 = new JLabel("Name");
		lbNameProdukt7.setLocation(new Point(3, 0));
		lbNameProdukt7.setBounds(0, 0, 45, 20);
		pnProdukt7.add(lbNameProdukt7);
		
		JSeparator sp1pnProdukt7 = new JSeparator();
		sp1pnProdukt7.setBounds(0, 18, 161, 2);
		pnProdukt7.add(sp1pnProdukt7);
		
		JSeparator sp2pnProdukt7 = new JSeparator();
		sp2pnProdukt7.setBounds(0, 84, 161, 2);
		pnProdukt7.add(sp2pnProdukt7);
		
		JPanel pnProdukt8 = new JPanel();
		pnProdukt8.setLayout(null);
		pnProdukt8.setBounds(246, 379, 161, 109);
		pnWarenkorb.add(pnProdukt8);
		
		JLabel lbNameProdukt8 = new JLabel("Name");
		lbNameProdukt8.setLocation(new Point(3, 0));
		lbNameProdukt8.setBounds(0, 0, 45, 20);
		pnProdukt8.add(lbNameProdukt8);
		
		JSeparator sp1pnProdukt8 = new JSeparator();
		sp1pnProdukt8.setBounds(0, 18, 161, 2);
		pnProdukt8.add(sp1pnProdukt8);
		
		JSeparator sp2pnProdukt8 = new JSeparator();
		sp2pnProdukt8.setBounds(0, 84, 161, 2);
		pnProdukt8.add(sp2pnProdukt8);
		
		JPanel pnProdukt9 = new JPanel();
		pnProdukt9.setLayout(null);
		pnProdukt9.setBounds(468, 379, 161, 109);
		pnWarenkorb.add(pnProdukt9);
		
		JLabel lbNameProdukt9 = new JLabel("Name");
		lbNameProdukt9.setLocation(new Point(3, 0));
		lbNameProdukt9.setBounds(0, 0, 45, 20);
		pnProdukt9.add(lbNameProdukt9);
		
		JSeparator sp1pnProdukt9 = new JSeparator();
		sp1pnProdukt9.setBounds(0, 18, 161, 2);
		pnProdukt9.add(sp1pnProdukt9);
		
		JSeparator sp2pnProdukt69 = new JSeparator();
		sp2pnProdukt69.setBounds(0, 84, 161, 2);
		pnProdukt9.add(sp2pnProdukt69);

	}
}
