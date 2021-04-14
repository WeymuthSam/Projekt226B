package Data;

import java.util.List;

import javax.swing.ImageIcon;

import Logic.article;

public interface IDataRequest {

	String[][] getArticlesRaw();

	ImageIcon[] getImages();

	String getVornameUser();

	void setVornameUser(String vornameUser);

	String getNachnameUser();

	void setNachnameUser(String nachnameUser);

	String getStrasseUser();

	void setStrasseUser(String strasseUser);

	String getHausnummerUser();

	void setHausnummerUser(String hausnummerUser);

	String getPLZUser();

	void setPLZUser(String pLZUser);

	String getOrtUser();

	void setOrtUser(String ortUser);

	String getFirmenname();

	void setFirmenname(String firmenname);

	String getStrasseFirma();

	void setStrasseFirma(String strasseFirma);

	String getHausnummerFirma();

	void setHausnummerFirma(String hausnummerFirma);

	String getPLZFirma();

	void setPLZFirma(String pLZFirma);

	String getOrtFirma();

	void setOrtFirma(String ortFirma);

	List<article> getArticles();

	void setArticles(List<article> articleObjects);

	List<article> getBag();

	void setBag(List<article> bag);

	List<Integer> getBagAmount();

	void setBagAmount(List<Integer> bagAmount);

}