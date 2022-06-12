package main;

import POJO.Verbrauchsgegenstand;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
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
	InventarAnsichtController inventarAnsichtController;
	
	public void setInformation(Verbrauchsgegenstand v) {
		tName.setText(v.getName());
		tAusruestungsArt.setText(v.getItemArt());
		tVerbrauchsgegenstandsArt.setText(v.getVerbrauchsgegenstandsArt());
		tSeltenheit.setText(v.getSeltenheit());
		tWert.setText(""+ v.getWert());
		tBuffs.setText(""+ v.getBuffs());
	}

	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Fenster wird geschlossen\n");

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
}
