package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Data.Datarequest;
import Logic.Checkoutlogic;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private Checkoutlogic LogicLayer;
	private JPanel contentPane;
	private ArticleCategories pnArticleCategories;
	private PersonalData pnPersonalData;
	private Datarequest DataLayer;
	
	//Components
	private JPanel pnMain;
	private JLabel btKasse;
	private JLabel btDaten;
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
		pnArticleCategories = new ArticleCategories();
		
		pnMain = new JPanel();
		Border pnMainborder = new LineBorder(Color.BLACK, 1, true);
		pnMain.setBorder(pnMainborder);
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
		
		pnBill = new JPanel();
		Border pnBillborder = new LineBorder(Color.BLACK, 1, true);
		pnBill.setBorder(pnBillborder);
		pnBill.setBackground(Color.WHITE);
		pnBill.setBounds(699, 39, 482, 596);
		contentPane.add(pnBill);
		
		setVisible(true);
	}
	
	public void KasseClick() {
		btKasse.setForeground(new Color(128, 0, 128));
		btDaten.setForeground(Color.BLACK);
		pnPersonalData.setVisible(false);
		pnMain.remove(pnPersonalData);
		pnMain.add(pnArticleCategories, BorderLayout.CENTER);
		pnArticleCategories.setVisible(true);
	}
	
	public void DatenClick() {
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
	}
}

