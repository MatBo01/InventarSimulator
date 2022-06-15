package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import POJO.Verbrauchsgegenstand;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ItemAnsichtVerbrauchsgegenstandController {

	@FXML
	private Text tName;

	@FXML
	private Text tAusruestungsArt;
	
	@FXML
	private Text tVerbrauchsgegenstandsArt;
	
	@FXML
	private Text tSeltenheit;
	
	@FXML
	private Text tWert;
	
	@FXML
	private Text tBuffs;
	
	@FXML
	private Button btZurueck;
	
	@FXML
	private ImageView ivBild;
	
	@FXML
	InventarAnsichtController inventarAnsichtController;
	
	public void setInformation(Verbrauchsgegenstand v) throws FileNotFoundException {
		tName.setText(v.getName());
		tAusruestungsArt.setText(v.getItemArt());
		tVerbrauchsgegenstandsArt.setText(v.getVerbrauchsgegenstandsArt());
		tSeltenheit.setText(v.getSeltenheit());
		tWert.setText(""+ v.getWert());
		tBuffs.setText(""+ v.getBuffs());
		
		InputStream essen = new FileInputStream("img/verbrauchsgegenstaende/essen.png");
		InputStream trank = new FileInputStream("img/verbrauchsgegenstaende/trank.png");

		Image image = null;
		switch(v.getVerbrauchsgegenstandsArt()) {
		case "Essen":
			System.out.println("1");
			image = new Image(essen);
			break;
		case "Trank":
			System.out.println("2");
			image = new Image(trank);
			break;
		}
		ivBild.setImage(image);
	}

	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Fenster wird geschlossen\n");

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
}
