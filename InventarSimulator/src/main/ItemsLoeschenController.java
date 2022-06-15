package main;

import java.io.FileNotFoundException;
import java.io.IOException;

import POJO.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ItemsLoeschenController {

	@FXML
	private Button btDauerhaftLoeschen;
	
	@FXML
	private Text tError;

	@FXML
	private Button btZurueck2;

	@FXML
	AllesViewController allesViewController;

	public void initialize() {
		allesViewController.tvItemsUpdate();
	}

	@FXML
	private void handleButtonDauerhaftLoeschenAction(ActionEvent event) throws FileNotFoundException, IOException {
		try {
			Item loeschen = allesViewController.getTvItems().getSelectionModel().getSelectedItem();
			System.out.println(loeschen.toString() + "\n");
			tError.setText(" ");
			DataExchange.itemLoeschen(loeschen);
		} catch (NullPointerException e) {
			tError.setText("Bitte etwas auswählen!");
		}

		allesViewController.tvItemsUpdate();
	}

	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("InventarAnsicht.fxml"));
			root.setId("InventarAnsicht");
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
}
