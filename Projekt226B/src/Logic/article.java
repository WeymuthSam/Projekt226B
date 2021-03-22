package Logic;

import javax.swing.ImageIcon;

public class article {
	private String name;
	private String categorie;
	private Float price;
	private ImageIcon image;
	private int id;
	
	
	public article(String theName, String theCategorie, Float thePrice, ImageIcon theImage, int theId) {
		setName(theName);
		setCategorie(theCategorie);
		setPrice(thePrice);
		setImage(theImage);
		setId(theId);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ImageIcon getImage() {
		return image;
	}


	public void setImage(ImageIcon image) {
		this.image = image;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}
}
