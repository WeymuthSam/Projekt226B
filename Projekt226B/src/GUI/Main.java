package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private Checkout pnCheckout = new Checkout();
	private PersonalData pnPersonalData = new PersonalData();

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
		
		JPanel pnMain = new JPanel();
		pnMain.setBounds(0, 39, 700, 600);
		pnMain.setLayout(new BorderLayout(0, 0));
		contentPane.add(pnMain);
		
		JLabel btKasse = new JLabel("Kasse");
		btKasse.setForeground(new Color(128, 0, 128));
		JLabel btDaten = new JLabel("Daten");
		
		
		btKasse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btKasse.setForeground(new Color(128, 0, 128));
				btDaten.setForeground(Color.BLACK);
				pnPersonalData.setVisible(false);
				pnMain.remove(pnPersonalData);
				pnMain.add(pnCheckout, BorderLayout.CENTER);
				pnCheckout.setVisible(true);
			}
		});
		btKasse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btKasse.setBounds(30, 11, 57, 25);
		contentPane.add(btKasse);
		
		btDaten.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btKasse.setForeground(Color.BLACK);
				btDaten.setForeground(new Color(128, 0, 128));
				pnCheckout.setVisible(false);
				pnMain.remove(pnCheckout);
				pnMain.add(pnPersonalData, BorderLayout.CENTER);
				pnPersonalData.setVisible(true);
			}
		});
		btDaten.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btDaten.setBounds(113, 11, 57, 25);
		contentPane.add(btDaten);
		
		pnCheckout.setVisible(true);
		pnMain.add(pnCheckout, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(699, 39, 482, 596);
		contentPane.add(panel);
		
		setVisible(true);
	}
}
