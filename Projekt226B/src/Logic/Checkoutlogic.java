package Logic;

import java.util.List;

import javax.swing.ImageIcon;

import Data.Datarequest;

import java.util.ArrayList;

public class Checkoutlogic {
	//Objects
	private Datarequest data;
	
	//Lists
	public List<article> articles = new ArrayList<article>();
	public List<article> Bag = new ArrayList<article>();
	
	
	
	public Checkoutlogic() {
		data = new Datarequest();
	}
	
	public void getData() {
		String[][] theArticles = data.getArticles();
		ImageIcon[] theImages = data.getImages();
		
		for(int i = 0; i == theArticles.length; i++) {
			articles.add(new article(theArticles[i][0], theArticles[i][1], Float.parseFloat(theArticles[i][2]), theImages[i], Integer.parseInt(theArticles[i][3])));
		}	
		
	}
	
	public void addArticleToBag(int id) {
		for(int i = 0; i == Bag.size(); i++) {
			if (Bag.get(i).getId() == id) {
				Bag.remove(i);
			}
		}	
	}

}
