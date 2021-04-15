package Logic;

import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DragListener implements DropTargetListener{

	//Label, in welchem Das Bild angezeiqgt wird
	JLabel imageLabel = new JLabel();
	
	public DragListener(JLabel image) {
		imageLabel = image;
	}

	@Override
	public void drop(DropTargetDropEvent ev) {
		ev.acceptDrop(DnDConstants.ACTION_COPY);
		Transferable t = ev.getTransferable();
		DataFlavor[] df = t.getTransferDataFlavors();
		
		//Daten werden ausgelesen, um an den Filepath zu gelangen
		for(DataFlavor f: df) {
			try {
				if(f.isFlavorJavaFileListType()) {
					List<File> files = (List<File>) t.getTransferData(f);
					for(File file : files) {
						//Filepath wird mitgegeben, um das Bild zu zeigen
						displayImage(file.getPath());
					}
				}
			}catch(Exception ex){
				JOptionPane.showMessageDialog(null, ex);
			}
		}
	}
	
	private void displayImage(String path) {
		//Bild wird anhand des paths in die Variabel img geladen
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(path));
		}catch(Exception e) {
			
		}
		
		double d = 0;
		double x = 1;
		double y = 1;
		int ScaleNum;
		
		if(img.getWidth() > img.getHeight()) {
			if(img.getWidth() > 161 || img.getHeight() > 73) {
				//Verhältnis aus Breite und Höhe wird ausgerechnet
				d = (double)img.getWidth() / (double)img.getHeight();
				//Verhältnis wird gerundet
				d = Math.round(d * 100.0) / 100.0;
				//Solange das Verhältnis von Anzeige-Label Breite und y nicht gleich Verhältnis von Bild Breite und Bild Höhe ist
				while((Math.round((161 / y) * 100.0) / 100.0) != d) {
					//y besagt, wie gross die Höhe sein muss, damit sie das Verhältnis passt
					y = y + 0.01;
				}
				ScaleNum = 1;				
			} else {
				ScaleNum = 0;
			}
		} else {
			if(img.getWidth() > 161 || img.getHeight() > 73) {
				//Verhältnis aus Höhe und Breite wird ausgerechnet
				d = (double)img.getHeight() / (double)img.getWidth();
				//Verhältnis wird gerundet
				d = Math.round(d * 100.0) / 100.0;
				//Solange das Verhältnis von Anzeige-Label Höhe und x nicht gleich Verhältnis von Bild Breite und Bild Höhe ist
				while((Math.round((73 / x) * 100.0) / 100.0) != d) {
					//x besagt, wie gross die Breite sein muss, damit sie das Verhältnis passt
					x = x + 0.01;
				}
				ScaleNum = 2;
			} else {
				ScaleNum = 0;
			}
		}
		
		//BufferedImage wird zu ImageIcon umgewandelt 
		ImageIcon icon = new ImageIcon(img);
		//aus dem Icon wird das Bild extrahiert und als Image gespeichert
		Image i = icon.getImage();
		Image Scaled;
		
		switch(ScaleNum) {
		  case 0:
			//Wenn keine Seite Grösser ist, als die des Anzeige-Labels wird die Originalgrösse verwendet.
		  	Scaled = i.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
		    break;
		  case 1:
			//Die Breite ist grösser als die Höhe und als die Anzeige-Label Breite 
			//Die Breite des Anzeige-Labels wird verwendet und die Höhe im Verhältnis dazu
			Scaled = i.getScaledInstance(161, (int)y, Image.SCALE_SMOOTH);
		    break;
		  case 2:
			//Die Höhe ist grösser als die Breite und als die Anzeige-Label Höhe
			//Die Höhe des Anzeige-Labels wird verwendet und die Breite im Verhältnis dazu
			Scaled = i.getScaledInstance((int)x, 73, Image.SCALE_SMOOTH);
		    break;
		  default:
			Scaled = i.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
		}
		
		//Das Bild wird in ein ImageIcon umgewandelt 
		ImageIcon ScaledIcon = new ImageIcon(Scaled);
		//ImageIcon wird im Label gesetzt
		imageLabel.setIcon(ScaledIcon);
		imageLabel.setText("");
	}
	
	@Override
	public void dragEnter(DropTargetDragEvent dtde) {	
	}

	@Override
	public void dragOver(DropTargetDragEvent dtde) {
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {
	}

	@Override
	public void dragExit(DropTargetEvent dte) {
	}

}

