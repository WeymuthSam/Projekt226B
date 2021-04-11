package Logic;

import javax.swing.ImageIcon;

public abstract class article {
	private String name;
	private int categorieID;
	private Float price;
	private ImageIcon image;
	private int id;
	
	
	public article(String theName, int theID, Float thePrice, ImageIcon theImage, int theCategorieID) {
		setName(theName);
		setCategorieID(theCategorieID);
		setPrice(thePrice);
		setImage(theImage);
		setId(theID);
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


	public int getCategorieID() {
		return categorieID;
	}


	public void setCategorieID(int categorieID) {
		this.categorieID = categorieID;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}
}
