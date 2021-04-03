package Data;

import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Datarequest {
	private String[][] articles = new String[81][4];
	private ImageIcon[] images = new ImageIcon[81];
	
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
		/* 
		 * articles[x][0] -> Name des Produkts
		 * articles[x][1] -> ID des Produkts
		 * articles[x][2] -> Preis
		 * articles[x][3] -> ID der Artikelkategorie
		 * */
		
		//------------------------------------------------------------
		//							Meeresfrüchte
		//------------------------------------------------------------
		articles[0][0] = "Garnelen";
		articles[0][1] = "0";
		articles[0][2] = "15";
		articles[0][3] = "0";
		
		articles[1][0] = "Kalmare";
		articles[1][1] = "1";
		articles[1][2] = "25";
		articles[1][3] = "0";
		
		articles[2][0] = "Austern";
		articles[2][1] = "2";
		articles[2][2] = "19";
		articles[2][3] = "0";
		
		articles[3][0] = "Hummer";
		articles[3][1] = "3";
		articles[3][2] = "79";
		articles[3][3] = "0";
		
		articles[4][0] = "Krabben";
		articles[4][1] = "4";
		articles[4][2] = "19";
		articles[4][3] = "0";
		
		articles[5][0] = "Wasserschnecken";
		articles[5][1] = "5";
		articles[5][2] = "12";
		articles[5][3] = "0";
		
		articles[6][0] = "Langusten";
		articles[6][1] = "6";
		articles[6][2] = "59";
		articles[6][3] = "0";
		
		articles[7][0] = "Seeigel";
		articles[7][1] = "7";
		articles[7][2] = "25";
		articles[7][3] = "0";
		
		articles[8][0] = "Krake";
		articles[8][1] = "8";
		articles[8][2] = "30";
		articles[8][3] = "0";
		
		//------------------------------------------------------------
		//							Backwaren
		//------------------------------------------------------------
		articles[9][0] = "Keks";
		articles[9][1] = "9";
		articles[9][2] = "3.5";
		articles[9][3] = "1";
		
		articles[10][0] = "Torte";
		articles[10][1] = "10";
		articles[10][2] = "19.5";
		articles[10][3] = "1";
		
		articles[11][0] = "Brot";
		articles[11][1] = "11";
		articles[11][2] = "4";
		articles[11][3] = "1";
		
		articles[12][0] = "Brötchen";
		articles[12][1] = "12";
		articles[12][2] = "0.8";
		articles[12][3] = "1";
		
		articles[13][0] = "Zimtschnecke";
		articles[13][1] = "13";
		articles[13][2] = "2.5";
		articles[13][3] = "1";
		
		articles[14][0] = "Baguette";
		articles[14][1] = "14";
		articles[14][2] = "2.1";
		articles[14][3] = "1";
		
		articles[15][0] = "Brezel";
		articles[15][1] = "15";
		articles[15][2] = "1.5";
		articles[15][3] = "1";
		
		articles[16][0] = "Apfelstrudel";
		articles[16][1] = "16";
		articles[16][2] = "4.5";
		articles[16][3] = "1";
		
		articles[17][0] = "Käsekuchen";
		articles[17][1] = "17";
		articles[17][2] = "6.5";
		articles[17][3] = "1";
		
		//------------------------------------------------------------
		//							Milchprodukte
		//------------------------------------------------------------
		articles[18][0] = "Milch";
		articles[18][1] = "18";
		articles[18][2] = "1.2";
		articles[18][3] = "2";
		
		articles[19][0] = "Käse";
		articles[19][1] = "19";
		articles[19][2] = "3.9";
		articles[19][3] = "2";
		
		articles[20][0] = "Joghurt";
		articles[20][1] = "20";
		articles[20][2] = "1.9";
		articles[20][3] = "2";

		articles[21][0] = "Butter";
		articles[21][1] = "21";
		articles[21][2] = "2.9";
		articles[21][3] = "2";
		
		articles[22][0] = "Ricotta";
		articles[22][1] = "22";
		articles[22][2] = "2.5";
		articles[22][3] = "2";
		
		articles[23][0] = "Weichkäse";
		articles[23][1] = "23";
		articles[23][2] = "4";
		articles[23][3] = "2";
		
		articles[24][0] = "Sauermilch";
		articles[24][1] = "24";
		articles[24][2] = "1.4";
		articles[24][3] = "2";
		
		articles[25][0] = "Rahm";
		articles[25][1] = "25";
		articles[25][2] = "2.9";
		articles[25][3] = "2";
		
		articles[26][0] = "Milchdrink";
		articles[26][1] = "26";
		articles[26][2] = "2.5";
		articles[26][3] = "2";
		
		//------------------------------------------------------------
		//							Früchte
		//------------------------------------------------------------
		articles[27][0] = "Apfel";
		articles[27][1] = "27";
		articles[27][2] = "1";
		articles[27][3] = "3";
		
		articles[28][0] = "Aprikose";
		articles[28][1] = "28";
		articles[28][2] = "0.8";
		articles[28][3] = "3";
		
		articles[29][0] = "Birne";
		articles[29][1] = "29";
		articles[29][2] = "1.2";
		articles[29][3] = "3";
		
		articles[30][0] = "Brombeeren";
		articles[30][1] = "30";
		articles[30][2] = "2.9";
		articles[30][3] = "3";
		
		articles[31][0] = "Erdbeeren";
		articles[31][1] = "31";
		articles[31][2] = "3.5";
		articles[31][3] = "3";
		
		articles[32][0] = "Heidelbeeren";
		articles[32][1] = "32";
		articles[32][2] = "2.9";
		articles[32][3] = "3";
		
		articles[33][0] = "Zwetschge";
		articles[33][1] = "33";
		articles[33][2] = "1.4";
		articles[33][3] = "3";
		
		articles[34][0] = "Mirabellen";
		articles[34][1] = "34";
		articles[34][2] = "2.6";
		articles[34][3] = "3";
		
		articles[35][0] = "Kirschen";
		articles[35][1] = "35";
		articles[35][2] = "3.5";
		articles[35][3] = "3";
		
		//------------------------------------------------------------
		//							Gemüse
		//------------------------------------------------------------
		articles[36][0] = "Artischocke";
		articles[36][1] = "36";
		articles[36][2] = "2";
		articles[36][3] = "4";
		
		articles[37][0] = "Aubergine";
		articles[37][1] = "37";
		articles[37][2] = "2.4";
		articles[37][3] = "4";
		
		articles[38][0] = "Blumenkohl";
		articles[38][1] = "38";
		articles[38][2] = "2.5";
		articles[38][3] = "4";
		
		articles[39][0] = "Bohnen";
		articles[39][1] = "39";
		articles[39][2] = "1.9";
		articles[39][3] = "4";
		
		articles[40][0] = "Chicorée";
		articles[40][1] = "40";
		articles[40][2] = "2.9";
		articles[40][3] = "4";
		
		articles[41][0] = "Eisbergsalat";
		articles[41][1] = "41";
		articles[41][2] = "2.1";
		articles[41][3] = "4";
		
		articles[42][0] = "Erbsen";
		articles[42][1] = "42";
		articles[42][2] = "2.2";
		articles[42][3] = "4";
		
		articles[43][0] = "Gurke";
		articles[43][1] = "43";
		articles[43][2] = "1.7";
		articles[43][3] = "4";
		
		articles[44][0] = "Karotte";
		articles[44][1] = "44";
		articles[44][2] = "0.6";
		articles[44][3] = "4";
		
		//------------------------------------------------------------
		//							Fleisch
		//------------------------------------------------------------
		articles[45][0] = "Rindfleisch";
		articles[45][1] = "45";
		articles[45][2] = "19.9";
		articles[45][3] = "5";
		
		articles[46][0] = "Kalbfleisch";
		articles[46][1] = "46";
		articles[46][2] = "14.9";
		articles[46][3] = "5";
		
		articles[47][0] = "Lammfleisch";
		articles[47][1] = "47";
		articles[47][2] = "17.9";
		articles[47][3] = "5";
		
		articles[48][0] = "Schweinefleisch";
		articles[48][1] = "48";
		articles[48][2] = "11.9";
		articles[48][3] = "5";
		
		articles[49][0] = "Pouletfleisch";
		articles[49][1] = "49";
		articles[49][2] = "8.9";
		articles[49][3] = "5";
		
		articles[50][0] = "Bratwurst";
		articles[50][1] = "50";
		articles[50][2] = "1.9";
		articles[50][3] = "5";

		articles[51][0] = "Rindsspiess";
		articles[51][1] = "51";
		articles[51][2] = "5.9";
		articles[51][3] = "5";
		
		articles[52][0] = "Rippchen";
		articles[52][1] = "52";
		articles[52][2] = "11.9";
		articles[52][3] = "5";
		
		articles[53][0] = "Fleischbällchen";
		articles[53][1] = "53";
		articles[53][2] = "5.9";
		articles[53][3] = "5";
		
		//------------------------------------------------------------
		//							Süssigkeiten
		//------------------------------------------------------------
		articles[54][0] = "Twix";
		articles[54][1] = "54";
		articles[54][2] = "1.2";
		articles[54][3] = "6";
		
		articles[55][0] = "Gummibärchen";
		articles[55][1] = "55";
		articles[55][2] = "1.9";
		articles[55][3] = "6";
		
		articles[56][0] = "Toblerone";
		articles[56][1] = "56";
		articles[56][2] = "2.9";
		articles[56][3] = "6";
		
		articles[57][0] = "M&M";
		articles[57][1] = "57";
		articles[57][2] = "3.5";
		articles[57][3] = "6";
		
		articles[58][0] = "Mars";
		articles[58][1] = "58";
		articles[58][2] = "1.2";
		articles[58][3] = "6";
		
		articles[59][0] = "Skittles";
		articles[59][1] = "59";
		articles[59][2] = "1.4";
		articles[59][3] = "6";
		
		articles[60][0] = "Toffifee";
		articles[60][1] = "60";
		articles[60][2] = "2.5";
		articles[60][3] = "6";
		
		articles[61][0] = "Ragusa";
		articles[61][1] = "61";
		articles[61][2] = "1.4";
		articles[61][3] = "6";
		
		articles[62][0] = "Maxi King";
		articles[62][1] = "62";
		articles[62][2] = "0.9";
		articles[62][3] = "6";
		
		//------------------------------------------------------------
		//							Fertiggerichte
		//------------------------------------------------------------
		articles[63][0] = "Ravioli";
		articles[63][1] = "63";
		articles[63][2] = "2.8";
		articles[63][3] = "7";
		
		articles[64][0] = "Gulaschsuppe";
		articles[64][1] = "64";
		articles[64][2] = "2.1";
		articles[64][3] = "7";
		
		articles[65][0] = "Chili con Carne";
		articles[65][1] = "65";
		articles[65][2] = "3.9";
		articles[65][3] = "7";
		
		articles[66][0] = "Erbsen-Eintopf";
		articles[66][1] = "66";
		articles[66][2] = "3.1";
		articles[66][3] = "7";
		
		articles[67][0] = "Rahmsuppe";
		articles[67][1] = "67";
		articles[67][2] = "2.4";
		articles[67][3] = "7";
		
		articles[68][0] = "Tomaten-Mozzarella Penne";
		articles[68][1] = "68";
		articles[68][2] = "3.6";
		articles[68][3] = "7";
		
		articles[69][0] = "Lauchsuppe";
		articles[69][1] = "69";
		articles[69][2] = "1.4";
		articles[69][3] = "7";
		
		articles[70][0] = "Spätzle-Topf";
		articles[70][1] = "70";
		articles[70][2] = "3.8";
		articles[70][3] = "7";
		
		articles[71][0] = "Tomatensuppe";
		articles[71][1] = "71";
		articles[71][2] = "1.5";
		articles[71][3] = "7";
		
		//------------------------------------------------------------
		//							Getränke
		//------------------------------------------------------------
		
		articles[72][0] = "Cola";
		articles[72][1] = "72";
		articles[72][2] = "1.5";
		articles[72][3] = "8";
		
		articles[73][0] = "Wasser";
		articles[73][1] = "73";
		articles[73][2] = "0.6";
		articles[73][3] = "8";
		
		articles[74][0] = "Fanta";
		articles[74][1] = "74";
		articles[74][2] = "1.6";
		articles[74][3] = "8";
		
		articles[75][0] = "Apfelsaft";
		articles[75][1] = "75";
		articles[75][2] = "2.1";
		articles[75][3] = "8";
		
		articles[76][0] = "Tonic-Water";
		articles[76][1] = "76";
		articles[76][2] = "2.3";
		articles[76][3] = "8";
		
		articles[77][0] = "Orangensaft";
		articles[77][1] = "77";
		articles[77][2] = "2.5";
		articles[77][3] = "8";
		
		articles[78][0] = "Flauder";
		articles[78][1] = "78";
		articles[78][2] = "2.1";
		articles[78][3] = "8";
		
		articles[79][0] = "Eistee";
		articles[79][1] = "79";
		articles[79][2] = "1.3";
		articles[79][3] = "8";
		
		articles[80][0] = "Rivella";
		articles[80][1] = "80";
		articles[80][2] = "1.9";
		articles[80][3] = "8";
		
		
		

		
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
