package Logic;

import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Data.Datarequest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Checkoutlogic {
	//Objects
	private Datarequest DataLayer;
	
	public List<article> getArticles() {
		return DataLayer.getArticles();
	}

	public List<article> getBag() {
		return DataLayer.getBag();
	}

	public Checkoutlogic(Datarequest Data) {
		DataLayer = Data;
	}
	
	public void LoadData() {
		DataLayer.getArticles().clear();
		String[][] theArticles = DataLayer.getArticlesRaw();
		ImageIcon[] theImages = DataLayer.getImages();
		
		for(int i = 0; i < theArticles.length; i++) {
			switch(Integer.parseInt(theArticles[i][3])) {
			  case 0:
				  DataLayer.getArticles().add(new Meeresfrucht(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
			    break;
			  case 1:
				  DataLayer.getArticles().add(new Backware(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
			    break;
			  case 2:
				  DataLayer.getArticles().add(new Milchprodukt(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
				  break;
			  case 3:
				  DataLayer.getArticles().add(new Frucht(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
				  break;
			  case 4:
				  DataLayer.getArticles().add(new Gemüse(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
				  break;
			  case 5:
				  DataLayer.getArticles().add(new Fleisch(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
				  break;
			  case 6:
				  DataLayer.getArticles().add(new Süssigkeit(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
				  break;
			  case 7:
				  DataLayer.getArticles().add(new Fertiggericht(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
				  break;
			  case 8:
				  DataLayer.getArticles().add(new Getränk(theArticles[i][0], Integer.parseInt(theArticles[i][1]), Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
				  break;
			  default:
			}
		}	
		
	}
	
	public void SavePersonalData(String Firmenname, String StrasseFirma, String HausnummerFirma, String PLZFirma, String OrtFirma, String VornameUser, String NachnameUser, String StrasseUser,
								 String HausnummerUser, String PLZUser, String OrtUser) {
		DataLayer.setFirmenname(Firmenname);
		DataLayer.setStrasseFirma(StrasseFirma);
		DataLayer.setHausnummerFirma(HausnummerFirma);
		DataLayer.setPLZFirma(PLZFirma);
		DataLayer.setOrtFirma(OrtFirma);
		DataLayer.setVornameUser(VornameUser);
		DataLayer.setNachnameUser(NachnameUser);
		DataLayer.setStrasseUser(StrasseUser);
		DataLayer.setHausnummerUser(HausnummerUser);
		DataLayer.setPLZUser(PLZUser);
		DataLayer.setOrtUser(OrtUser);
	}
	
	public List<String> GetPersonalData() {
		List<String> Data = new ArrayList<String>();
		Data.add(DataLayer.getFirmenname());
		Data.add(DataLayer.getStrasseFirma());
		Data.add(DataLayer.getHausnummerFirma());
		Data.add(DataLayer.getPLZFirma());
		Data.add(DataLayer.getOrtFirma());
		Data.add(DataLayer.getVornameUser());
		Data.add(DataLayer.getNachnameUser());
		Data.add(DataLayer.getStrasseUser());
		Data.add(DataLayer.getHausnummerUser());
		Data.add(DataLayer.getPLZUser());
		Data.add(DataLayer.getOrtUser());
		
		return Data;
	}
	
	public void RemoveArticleFromBag(int id) {
		for(int i = 0; i == DataLayer.getBag().size(); i++) {
			if (DataLayer.getBag().get(i).getId() == id) {
				DataLayer.getBag().remove(i);
				DataLayer.getBagAmount().remove(i);
			}
		}	
	}
	
	public void AddArticleToBag(int id, int Amount) {
		for(int i = 0; i < DataLayer.getArticles().size(); i++) {
			if (DataLayer.getArticles().get(i).getId() == id) {
				DataLayer.getBag().add(DataLayer.getArticles().get(i));
				DataLayer.getBagAmount().add(Amount);
			}
		}	
	}
	
	public List<Integer> getBagAmount() {
		return DataLayer.getBagAmount();
	}

	public boolean checkTextField(List<JTextField> list) {
		boolean result = true;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getText().trim().length() == 0) {
				result = false;
			}
		}
		return result;
	}
	
	public String getDate(String Format) {
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern(Format);  
	    LocalDateTime now = LocalDateTime.now(); 
	    return dtf.format(now);
	}
}
