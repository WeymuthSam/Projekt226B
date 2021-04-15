package GUI;

import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.awt.image.BufferedImage;

import javax.swing.JTextField;

public class EditData extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private JLabel lbAbbrechen;
	private JLabel lbPriceTitel;
	private JLabel lbBestätigen;
	private JLabel lbArtikelnameTitel;
	private JLabel lbImageTitel;
	private JLabel lbShowImage;
	
	private SpinnerModel sm;
	private JTextField tfPrice;
	
	private Checkoutlogic LogicLayer;
	private int ID;
	private int ArtikelPosition;
	private JTextField tfName;
	private JLabel lbPriceTitel_1;

	public EditData(Main main, Checkoutlogic LogicLayer, int ArticleID) {
		this.LogicLayer = LogicLayer;
		this.ID = ArticleID;
		
		setBounds(400, 350, 427, 340);
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
		lbAbbrechen.setBounds(226, 254, 82, 34);
		getContentPane().add(lbAbbrechen);
		
		lbPriceTitel = new JLabel("Preis:");
		lbPriceTitel.setLocation(new Point(3, 0));
		lbPriceTitel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPriceTitel.setBounds(11, 196, 107, 44);
		getContentPane().add(lbPriceTitel);
		
		lbBestätigen = new JLabel("Best\u00E4tigen");
		lbBestätigen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Icon i = lbShowImage.getIcon();
			    BufferedImage image = new BufferedImage(i.getIconWidth(), i.getIconHeight(), BufferedImage.TYPE_INT_RGB);
			    i.paintIcon(new JPanel(), image.getGraphics(), 0, 0);
			    
				LogicLayer.getArticles().get(ArtikelPosition).setPrice(Float.parseFloat(tfPrice.getText()));
				LogicLayer.getArticles().get(ArtikelPosition).setName(tfName.getText());
				LogicLayer.getArticles().get(ArtikelPosition).setImage(new ImageIcon(image));
				
				main.DatenBearbeitenClick();
				dispose();
			}
		});
		lbBestätigen.setOpaque(true);
		lbBestätigen.setHorizontalTextPosition(SwingConstants.CENTER);
		lbBestätigen.setHorizontalAlignment(SwingConstants.CENTER);
		lbBestätigen.setForeground(Color.WHITE);
		lbBestätigen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbBestätigen.setBackground(new Color(128, 0, 128));
		lbBestätigen.setBounds(318, 254, 82, 34);
		getContentPane().add(lbBestätigen);
		
		tfPrice = new JTextField();
		tfPrice.setBounds(128, 197, 272, 46);
		contentPane.add(tfPrice);
		tfPrice.setColumns(10);
		
		lbArtikelnameTitel = new JLabel("Name:");
		lbArtikelnameTitel.setLocation(new Point(3, 0));
		lbArtikelnameTitel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbArtikelnameTitel.setBounds(11, 141, 107, 44);
		contentPane.add(lbArtikelnameTitel);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(128, 140, 272, 46);
		contentPane.add(tfName);
		
		lbImageTitel = new JLabel("Bild:");
		lbImageTitel.setLocation(new Point(3, 0));
		lbImageTitel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbImageTitel.setBounds(10, 11, 107, 44);
		contentPane.add(lbImageTitel);
		
		lbShowImage = new JLabel("");
		lbShowImage.setBackground(Color.WHITE);
		lbShowImage.setOpaque(true);
		lbShowImage.setBounds(128, 11, 272, 118);
		contentPane.add(lbShowImage);
		
		setVisible(true);
		
		LogicLayer.connectToDragAndDrop(lbShowImage);
		
		lbPriceTitel_1 = new JLabel("?");
		lbPriceTitel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Um das Bild zu ändern, ziehen Sie ein neues Bild auf das Alte.");
			}
		});
		lbPriceTitel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbPriceTitel_1.setLocation(new Point(3, 0));
		lbPriceTitel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPriceTitel_1.setBounds(11, 254, 27, 44);
		contentPane.add(lbPriceTitel_1);
		
		AddData();

	}
	
	private void AddData() {
		for(int i = 0; i < LogicLayer.getArticles().size(); i++) {
			if (LogicLayer.getArticles().get(i).getId() == this.ID) {
				tfName.setText(LogicLayer.getArticles().get(i).getName());
				tfPrice.setText(LogicLayer.getArticles().get(i).getPrice().toString());
				lbShowImage.setIcon(LogicLayer.getArticles().get(i).getImage());
				ArtikelPosition = i;
			}
		}	
	}
}
