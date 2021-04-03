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

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
		
		pnBill = new JPanel();
		pnBill.setBorder(new MatteBorder(1, 1, 0, 0, (Color) new Color(0, 0, 0)));
		pnBill.setBackground(Color.WHITE);
		pnBill.setBounds(699, 39, 482, 596);
		contentPane.add(pnBill);
		pnBill.setLayout(null);
		
		JPanel pnBag = new JPanel();
		pnBag.setBackground(Color.WHITE);
		pnBag.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnBag.setBounds(0, 1, 496, 231);
		pnBill.add(pnBag);
		pnBag.setLayout(null);        
		
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
	}
	
	public void ArticleCategoriesClicked(int id) {
		pnArticles = new Articles(this, LogicLayer, id);
		

		pnArticleCategories.setVisible(false);
		pnMain.remove(pnArticleCategories);
		pnMain.add(pnArticles, BorderLayout.CENTER);
		pnArticles.setVisible(true);
	}
}

