package main;

import POJO.Waffe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ItemAnsichtWaffeController {

	@FXML
	private Text tName;

	@FXML
	private Text tAusruestungsArt;
	
	@FXML
	private Text tWaffenArt;
	
	@FXML
	private Text tSeltenheit;
	
	@FXML
	private Text tWert;
	
	@FXML
	private Text tAngriff;
	
	@FXML
	private Text tGewicht;
	
	@FXML
	private Text tElement;
	
	@FXML
	private Text tSchnelligkeit;
	
	@FXML
	private Button btZurueck;
	
	@FXML
	InventarAnsichtController inventarAnsichtController;
	
	public void setInformation(Waffe w) {
		tName.setText(w.getName());
		tAusruestungsArt.setText(w.getItemArt());
		tWaffenArt.setText(w.getWaffenArt());
		tSeltenheit.setText(w.getSeltenheit());
		tWert.setText(""+ w.getWert());
		tAngriff.setText(""+ w.getStaerke());
		tGewicht.setText(""+ w.getGewicht());
		tElement.setText(w.getElement());
		tSchnelligkeit.setText(""+ w.getWert());
	}

	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Fenster wird geschlossen\n");

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
}
