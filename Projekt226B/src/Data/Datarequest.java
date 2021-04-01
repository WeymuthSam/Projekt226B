package Data;

import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Datarequest {
	private String[][] articles = new String[9][4];
	private ImageIcon[] images = new ImageIcon[9];
	
	private String VornameUser = "";
	private String NachnameUser = "";
	private String StrasseUser = "";
	private String HausnummerUser = "";
	private String PLZUser = "";
	private String OrtUser = "";
	private String Firmenname = "";
	private String StrasseFirma = "";
	private String HausnummerFirma = "";
	private String PLZFirma = "";
	private String OrtFirma = "";
	
	public Datarequest() {
		articles[0][0] = "Apfel";
		articles[0][1] = "Früchte";
		articles[0][2] = "0.6";
		articles[0][3] = "0";
		articles[1][0] = "Fisch";
		articles[1][1] = "Meeresfrüchte";
		articles[1][2] = "10.5";
		articles[1][3] = "1";
		articles[2][0] = "Steak";
		articles[2][1] = "Fleisch";
		articles[2][2] = "20.5";
		articles[2][3] = "2";
		articles[3][0] = "Deo";
		articles[3][1] = "Pflege";
		articles[3][2] = "3.5";
		articles[3][3] = "3";
		articles[4][0] = "T-Shirt";
		articles[4][1] = "Kleidung";
		articles[4][2] = "12.9";
		articles[4][3] = "4";
		articles[5][0] = "Brot";
		articles[5][1] = "Backwaren";
		articles[5][2] = "3.9";
		articles[5][3] = "5";
		articles[6][0] = "Milch";
		articles[6][1] = "Milchprodukte";
		articles[6][2] = "1.3";
		articles[6][3] = "6";
		articles[7][0] = "Cookies";
		articles[7][1] = "Süssigkeiten";
		articles[7][2] = "2.9";
		articles[7][3] = "7";
		articles[8][0] = "Pizza";
		articles[8][1] = "tiefkühlessen";
		articles[8][2] = "7.9";
		articles[8][3] = "8";
		
		/*Images befüllen*/
	}
	
	public String[][] getArticles() {
		return articles;
	}
	
	public ImageIcon[] getImages() {
		return images;
	}

	public String getVornameUser() {
		return VornameUser;
	}

	public void setVornameUser(String vornameUser) {
		VornameUser = vornameUser;
	}

	public String getNachnameUser() {
		return NachnameUser;
	}

	public void setNachnameUser(String nachnameUser) {
		NachnameUser = nachnameUser;
	}

	public String getStrasseUser() {
		return StrasseUser;
	}

	public void setStrasseUser(String strasseUser) {
		StrasseUser = strasseUser;
	}

	public String getHausnummerUser() {
		return HausnummerUser;
	}

	public void setHausnummerUser(String hausnummerUser) {
		HausnummerUser = hausnummerUser;
	}

	public String getPLZUser() {
		return PLZUser;
	}

	public void setPLZUser(String pLZUser) {
		PLZUser = pLZUser;
	}

	public String getOrtUser() {
		return OrtUser;
	}

	public void setOrtUser(String ortUser) {
		OrtUser = ortUser;
	}

	public String getFirmenname() {
		return Firmenname;
	}

	public void setFirmenname(String firmenname) {
		Firmenname = firmenname;
	}

	public String getStrasseFirma() {
		return StrasseFirma;
	}

	public void setStrasseFirma(String strasseFirma) {
		StrasseFirma = strasseFirma;
	}

	public String getHausnummerFirma() {
		return HausnummerFirma;
	}

	public void setHausnummerFirma(String hausnummerFirma) {
		HausnummerFirma = hausnummerFirma;
	}

	public String getPLZFirma() {
		return PLZFirma;
	}

	public void setPLZFirma(String pLZFirma) {
		PLZFirma = pLZFirma;
	}

	public String getOrtFirma() {
		return OrtFirma;
	}

	public void setOrtFirma(String ortFirma) {
		OrtFirma = ortFirma;
	}

}
