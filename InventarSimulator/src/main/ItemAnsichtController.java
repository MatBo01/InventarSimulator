package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ItemAnsichtController {
	@FXML
	private Button btItemLoeschen;
	@FXML
	private Button btZurueck;
	@FXML
	private Pane pnTabelle;

	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Fenster wird geschlossen\n");

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
}
