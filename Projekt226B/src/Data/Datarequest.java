package Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Logic.article;

public class Datarequest {
	private String[][] articlesRaw = new String[81][4];
	private ImageIcon[] images = new ImageIcon[81];
	
	private List<article> articles = new ArrayList<article>();
	private List<article> Bag = new ArrayList<article>();
	private List<Integer> BagAmount = new ArrayList<Integer>();
	
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
		articlesRaw[0][0] = "Garnelen";
		articlesRaw[0][1] = "0";
		articlesRaw[0][2] = "15";
		articlesRaw[0][3] = "0";
		
		articlesRaw[1][0] = "Kalmare";
		articlesRaw[1][1] = "1";
		articlesRaw[1][2] = "25";
		articlesRaw[1][3] = "0";
		
		articlesRaw[2][0] = "Austern";
		articlesRaw[2][1] = "2";
		articlesRaw[2][2] = "19";
		articlesRaw[2][3] = "0";
		
		articlesRaw[3][0] = "Hummer";
		articlesRaw[3][1] = "3";
		articlesRaw[3][2] = "79";
		articlesRaw[3][3] = "0";
		
		articlesRaw[4][0] = "Krabben";
		articlesRaw[4][1] = "4";
		articlesRaw[4][2] = "19";
		articlesRaw[4][3] = "0";
		
		articlesRaw[5][0] = "Wasserschnecken";
		articlesRaw[5][1] = "5";
		articlesRaw[5][2] = "12";
		articlesRaw[5][3] = "0";
		
		articlesRaw[6][0] = "Langusten";
		articlesRaw[6][1] = "6";
		articlesRaw[6][2] = "59";
		articlesRaw[6][3] = "0";
		
		articlesRaw[7][0] = "Seeigel";
		articlesRaw[7][1] = "7";
		articlesRaw[7][2] = "25";
		articlesRaw[7][3] = "0";
		
		articlesRaw[8][0] = "Krake";
		articlesRaw[8][1] = "8";
		articlesRaw[8][2] = "30";
		articlesRaw[8][3] = "0";
		
		//------------------------------------------------------------
		//							Backwaren
		//------------------------------------------------------------
		articlesRaw[9][0] = "Keks";
		articlesRaw[9][1] = "9";
		articlesRaw[9][2] = "3.5";
		articlesRaw[9][3] = "1";
		
		articlesRaw[10][0] = "Torte";
		articlesRaw[10][1] = "10";
		articlesRaw[10][2] = "19.5";
		articlesRaw[10][3] = "1";
		
		articlesRaw[11][0] = "Brot";
		articlesRaw[11][1] = "11";
		articlesRaw[11][2] = "4";
		articlesRaw[11][3] = "1";
		
		articlesRaw[12][0] = "Brötchen";
		articlesRaw[12][1] = "12";
		articlesRaw[12][2] = "0.8";
		articlesRaw[12][3] = "1";
		
		articlesRaw[13][0] = "Zimtschnecke";
		articlesRaw[13][1] = "13";
		articlesRaw[13][2] = "2.5";
		articlesRaw[13][3] = "1";
		
		articlesRaw[14][0] = "Baguette";
		articlesRaw[14][1] = "14";
		articlesRaw[14][2] = "2.1";
		articlesRaw[14][3] = "1";
		
		articlesRaw[15][0] = "Brezel";
		articlesRaw[15][1] = "15";
		articlesRaw[15][2] = "1.5";
		articlesRaw[15][3] = "1";
		
		articlesRaw[16][0] = "Apfelstrudel";
		articlesRaw[16][1] = "16";
		articlesRaw[16][2] = "4.5";
		articlesRaw[16][3] = "1";
		
		articlesRaw[17][0] = "Käsekuchen";
		articlesRaw[17][1] = "17";
		articlesRaw[17][2] = "6.5";
		articlesRaw[17][3] = "1";
		
		//------------------------------------------------------------
		//							Milchprodukte
		//------------------------------------------------------------
		articlesRaw[18][0] = "Milch";
		articlesRaw[18][1] = "18";
		articlesRaw[18][2] = "1.2";
		articlesRaw[18][3] = "2";
		
		articlesRaw[19][0] = "Käse";
		articlesRaw[19][1] = "19";
		articlesRaw[19][2] = "3.9";
		articlesRaw[19][3] = "2";
		
		articlesRaw[20][0] = "Joghurt";
		articlesRaw[20][1] = "20";
		articlesRaw[20][2] = "1.9";
		articlesRaw[20][3] = "2";

		articlesRaw[21][0] = "Butter";
		articlesRaw[21][1] = "21";
		articlesRaw[21][2] = "2.9";
		articlesRaw[21][3] = "2";
		
		articlesRaw[22][0] = "Ricotta";
		articlesRaw[22][1] = "22";
		articlesRaw[22][2] = "2.5";
		articlesRaw[22][3] = "2";
		
		articlesRaw[23][0] = "Weichkäse";
		articlesRaw[23][1] = "23";
		articlesRaw[23][2] = "4";
		articlesRaw[23][3] = "2";
		
		articlesRaw[24][0] = "Sauermilch";
		articlesRaw[24][1] = "24";
		articlesRaw[24][2] = "1.4";
		articlesRaw[24][3] = "2";
		
		articlesRaw[25][0] = "Rahm";
		articlesRaw[25][1] = "25";
		articlesRaw[25][2] = "2.9";
		articlesRaw[25][3] = "2";
		
		articlesRaw[26][0] = "Milchdrink";
		articlesRaw[26][1] = "26";
		articlesRaw[26][2] = "2.5";
		articlesRaw[26][3] = "2";
		
		//------------------------------------------------------------
		//							Früchte
		//------------------------------------------------------------
		articlesRaw[27][0] = "Apfel";
		articlesRaw[27][1] = "27";
		articlesRaw[27][2] = "1";
		articlesRaw[27][3] = "3";
		
		articlesRaw[28][0] = "Aprikose";
		articlesRaw[28][1] = "28";
		articlesRaw[28][2] = "0.8";
		articlesRaw[28][3] = "3";
		
		articlesRaw[29][0] = "Birne";
		articlesRaw[29][1] = "29";
		articlesRaw[29][2] = "1.2";
		articlesRaw[29][3] = "3";
		
		articlesRaw[30][0] = "Brombeeren";
		articlesRaw[30][1] = "30";
		articlesRaw[30][2] = "2.9";
		articlesRaw[30][3] = "3";
		
		articlesRaw[31][0] = "Erdbeeren";
		articlesRaw[31][1] = "31";
		articlesRaw[31][2] = "3.5";
		articlesRaw[31][3] = "3";
		
		articlesRaw[32][0] = "Heidelbeeren";
		articlesRaw[32][1] = "32";
		articlesRaw[32][2] = "2.9";
		articlesRaw[32][3] = "3";
		
		articlesRaw[33][0] = "Zwetschge";
		articlesRaw[33][1] = "33";
		articlesRaw[33][2] = "1.4";
		articlesRaw[33][3] = "3";
		
		articlesRaw[34][0] = "Mirabellen";
		articlesRaw[34][1] = "34";
		articlesRaw[34][2] = "2.6";
		articlesRaw[34][3] = "3";
		
		articlesRaw[35][0] = "Kirschen";
		articlesRaw[35][1] = "35";
		articlesRaw[35][2] = "3.5";
		articlesRaw[35][3] = "3";
		
		//------------------------------------------------------------
		//							Gemüse
		//------------------------------------------------------------
		articlesRaw[36][0] = "Artischocke";
		articlesRaw[36][1] = "36";
		articlesRaw[36][2] = "2";
		articlesRaw[36][3] = "4";
		
		articlesRaw[37][0] = "Aubergine";
		articlesRaw[37][1] = "37";
		articlesRaw[37][2] = "2.4";
		articlesRaw[37][3] = "4";
		
		articlesRaw[38][0] = "Blumenkohl";
		articlesRaw[38][1] = "38";
		articlesRaw[38][2] = "2.5";
		articlesRaw[38][3] = "4";
		
		articlesRaw[39][0] = "Bohnen";
		articlesRaw[39][1] = "39";
		articlesRaw[39][2] = "1.9";
		articlesRaw[39][3] = "4";
		
		articlesRaw[40][0] = "Chicorée";
		articlesRaw[40][1] = "40";
		articlesRaw[40][2] = "2.9";
		articlesRaw[40][3] = "4";
		
		articlesRaw[41][0] = "Eisbergsalat";
		articlesRaw[41][1] = "41";
		articlesRaw[41][2] = "2.1";
		articlesRaw[41][3] = "4";
		
		articlesRaw[42][0] = "Erbsen";
		articlesRaw[42][1] = "42";
		articlesRaw[42][2] = "2.2";
		articlesRaw[42][3] = "4";
		
		articlesRaw[43][0] = "Gurke";
		articlesRaw[43][1] = "43";
		articlesRaw[43][2] = "1.7";
		articlesRaw[43][3] = "4";
		
		articlesRaw[44][0] = "Karotte";
		articlesRaw[44][1] = "44";
		articlesRaw[44][2] = "0.6";
		articlesRaw[44][3] = "4";
		
		//------------------------------------------------------------
		//							Fleisch
		//------------------------------------------------------------
		articlesRaw[45][0] = "Rindfleisch";
		articlesRaw[45][1] = "45";
		articlesRaw[45][2] = "19.9";
		articlesRaw[45][3] = "5";
		
		articlesRaw[46][0] = "Kalbfleisch";
		articlesRaw[46][1] = "46";
		articlesRaw[46][2] = "14.9";
		articlesRaw[46][3] = "5";
		
		articlesRaw[47][0] = "Lammfleisch";
		articlesRaw[47][1] = "47";
		articlesRaw[47][2] = "17.9";
		articlesRaw[47][3] = "5";
		
		articlesRaw[48][0] = "Schweinefleisch";
		articlesRaw[48][1] = "48";
		articlesRaw[48][2] = "11.9";
		articlesRaw[48][3] = "5";
		
		articlesRaw[49][0] = "Pouletfleisch";
		articlesRaw[49][1] = "49";
		articlesRaw[49][2] = "8.9";
		articlesRaw[49][3] = "5";
		
		articlesRaw[50][0] = "Bratwurst";
		articlesRaw[50][1] = "50";
		articlesRaw[50][2] = "1.9";
		articlesRaw[50][3] = "5";

		articlesRaw[51][0] = "Rindsspiess";
		articlesRaw[51][1] = "51";
		articlesRaw[51][2] = "5.9";
		articlesRaw[51][3] = "5";
		
		articlesRaw[52][0] = "Rippchen";
		articlesRaw[52][1] = "52";
		articlesRaw[52][2] = "11.9";
		articlesRaw[52][3] = "5";
		
		articlesRaw[53][0] = "Fleischbällchen";
		articlesRaw[53][1] = "53";
		articlesRaw[53][2] = "5.9";
		articlesRaw[53][3] = "5";
		
		//------------------------------------------------------------
		//							Süssigkeiten
		//------------------------------------------------------------
		articlesRaw[54][0] = "Twix";
		articlesRaw[54][1] = "54";
		articlesRaw[54][2] = "1.2";
		articlesRaw[54][3] = "6";
		
		articlesRaw[55][0] = "Gummibärchen";
		articlesRaw[55][1] = "55";
		articlesRaw[55][2] = "1.9";
		articlesRaw[55][3] = "6";
		
		articlesRaw[56][0] = "Toblerone";
		articlesRaw[56][1] = "56";
		articlesRaw[56][2] = "2.9";
		articlesRaw[56][3] = "6";
		
		articlesRaw[57][0] = "M&M";
		articlesRaw[57][1] = "57";
		articlesRaw[57][2] = "3.5";
		articlesRaw[57][3] = "6";
		
		articlesRaw[58][0] = "Mars";
		articlesRaw[58][1] = "58";
		articlesRaw[58][2] = "1.2";
		articlesRaw[58][3] = "6";
		
		articlesRaw[59][0] = "Skittles";
		articlesRaw[59][1] = "59";
		articlesRaw[59][2] = "1.4";
		articlesRaw[59][3] = "6";
		
		articlesRaw[60][0] = "Toffifee";
		articlesRaw[60][1] = "60";
		articlesRaw[60][2] = "2.5";
		articlesRaw[60][3] = "6";
		
		articlesRaw[61][0] = "Ragusa";
		articlesRaw[61][1] = "61";
		articlesRaw[61][2] = "1.4";
		articlesRaw[61][3] = "6";
		
		articlesRaw[62][0] = "Maxi King";
		articlesRaw[62][1] = "62";
		articlesRaw[62][2] = "0.9";
		articlesRaw[62][3] = "6";
		
		//------------------------------------------------------------
		//							Fertiggerichte
		//------------------------------------------------------------
		articlesRaw[63][0] = "Ravioli";
		articlesRaw[63][1] = "63";
		articlesRaw[63][2] = "2.8";
		articlesRaw[63][3] = "7";
		
		articlesRaw[64][0] = "Gulaschsuppe";
		articlesRaw[64][1] = "64";
		articlesRaw[64][2] = "2.1";
		articlesRaw[64][3] = "7";
		
		articlesRaw[65][0] = "Chili con Carne";
		articlesRaw[65][1] = "65";
		articlesRaw[65][2] = "3.9";
		articlesRaw[65][3] = "7";
		
		articlesRaw[66][0] = "Erbsen-Eintopf";
		articlesRaw[66][1] = "66";
		articlesRaw[66][2] = "3.1";
		articlesRaw[66][3] = "7";
		
		articlesRaw[67][0] = "Rahmsuppe";
		articlesRaw[67][1] = "67";
		articlesRaw[67][2] = "2.4";
		articlesRaw[67][3] = "7";
		
		articlesRaw[68][0] = "Tomaten-Mozzarella Penne";
		articlesRaw[68][1] = "68";
		articlesRaw[68][2] = "3.6";
		articlesRaw[68][3] = "7";
		
		articlesRaw[69][0] = "Lauchsuppe";
		articlesRaw[69][1] = "69";
		articlesRaw[69][2] = "1.4";
		articlesRaw[69][3] = "7";
		
		articlesRaw[70][0] = "Spätzle-Topf";
		articlesRaw[70][1] = "70";
		articlesRaw[70][2] = "3.8";
		articlesRaw[70][3] = "7";
		
		articlesRaw[71][0] = "Tomatensuppe";
		articlesRaw[71][1] = "71";
		articlesRaw[71][2] = "1.5";
		articlesRaw[71][3] = "7";
		
		//------------------------------------------------------------
		//							Getränke
		//------------------------------------------------------------
		
		articlesRaw[72][0] = "Cola";
		articlesRaw[72][1] = "72";
		articlesRaw[72][2] = "1.5";
		articlesRaw[72][3] = "8";
		
		articlesRaw[73][0] = "Wasser";
		articlesRaw[73][1] = "73";
		articlesRaw[73][2] = "0.6";
		articlesRaw[73][3] = "8";
		
		articlesRaw[74][0] = "Fanta";
		articlesRaw[74][1] = "74";
		articlesRaw[74][2] = "1.6";
		articlesRaw[74][3] = "8";
		
		articlesRaw[75][0] = "Apfelsaft";
		articlesRaw[75][1] = "75";
		articlesRaw[75][2] = "2.1";
		articlesRaw[75][3] = "8";
		
		articlesRaw[76][0] = "Tonic-Water";
		articlesRaw[76][1] = "76";
		articlesRaw[76][2] = "2.3";
		articlesRaw[76][3] = "8";
		
		articlesRaw[77][0] = "Orangensaft";
		articlesRaw[77][1] = "77";
		articlesRaw[77][2] = "2.5";
		articlesRaw[77][3] = "8";
		
		articlesRaw[78][0] = "Flauder";
		articlesRaw[78][1] = "78";
		articlesRaw[78][2] = "2.1";
		articlesRaw[78][3] = "8";
		
		articlesRaw[79][0] = "Eistee";
		articlesRaw[79][1] = "79";
		articlesRaw[79][2] = "1.3";
		articlesRaw[79][3] = "8";
		
		articlesRaw[80][0] = "Rivella";
		articlesRaw[80][1] = "80";
		articlesRaw[80][2] = "1.9";
		articlesRaw[80][3] = "8";
		
		
		

		
		/*Images befüllen*/
	}
	
	public String[][] getArticlesRaw() {
		return articlesRaw;
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
	
	public List<article> getArticles() {
		return articles;
	}

	public void setArticles(List<article> articleObjects) {
		this.articles = articleObjects;
	}

	public List<article> getBag() {
		return Bag;
	}

	public void setBag(List<article> bag) {
		Bag = bag;
	}

	public List<Integer> getBagAmount() {
		return BagAmount;
	}

	public void setBagAmount(List<Integer> bagAmount) {
		BagAmount = bagAmount;
	}

}
