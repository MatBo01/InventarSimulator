package main;

import POJO.Ruestung;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ItemAnsichtRuestungController {

	@FXML
	private Text tName;

	@FXML
	private Text tAusruestungsArt;
	
	@FXML
	private Text tRuestungsArt;
	
	@FXML
	private Text tSeltenheit;
	
	@FXML
	private Text tWert;
	
	@FXML
	private Text tVerteidigung;
	
	@FXML
	private Text tGewicht;
	
	@FXML
	private Text tResistenz;
	
	@FXML
	private Button btZurueck;
	
	@FXML
	InventarAnsichtController inventarAnsichtController;
	
	public void setInformation(Ruestung r) {
		tName.setText(r.getName());
		tAusruestungsArt.setText(r.getItemArt());
		tRuestungsArt.setText(r.getRuestungsArt());
		tSeltenheit.setText(r.getSeltenheit());
		tWert.setText(""+ r.getWert());
		tVerteidigung.setText(""+ r.getStaerke());
		tGewicht.setText(""+ r.getGewicht());
		tResistenz.setText(r.getElement());
	}

	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Fenster wird geschlossen\n");

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
}
