package Logic;

import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Data.Datarequest;

import java.util.ArrayList;

public class Checkoutlogic {
	//Objects
	private Datarequest DataLayer;
	
	//Lists
	public List<article> articles = new ArrayList<article>();
	public List<article> Bag = new ArrayList<article>();
	
	
	
	public Checkoutlogic(Datarequest Data) {
		DataLayer = Data;
	}
	
	public void LoadData() {
		String[][] theArticles = DataLayer.getArticles();
		ImageIcon[] theImages = DataLayer.getImages();
		
		for(int i = 0; i == theArticles.length; i++) {
			articles.add(new article(theArticles[i][0], theArticles[i][1], Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
		}	
		
	}
	
	public void RemoveArticleFromBag(int id) {
		for(int i = 0; i == Bag.size(); i++) {
			if (Bag.get(i).getId() == id) {
				Bag.remove(i);
			}
		}	
	}
	
	public void AddArticleToBag(int id) {
		for(int i = 0; i == articles.size(); i++) {
			if (articles.get(i).getId() == id) {
				Bag.add(articles.get(i));
			}
		}	
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

}
