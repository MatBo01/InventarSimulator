package itemLoeschen;

import java.io.FileNotFoundException;
import java.io.IOException;

import POJO.Item;
import dataExchange.DataExchange;
import itemView.AllesViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Auswahlfenster zum Löschen eines Items
 */
public class ItemsLoeschenController {

	@FXML
	private Button btDauerhaftLoeschen;
	
	@FXML
	private Text tError;

	@FXML
	private Button btZurueck2;

	@FXML
	AllesViewController allesViewController;

	/**
	 * Lädt Items in die Tabelle, sobald die Szene initialisiert wird wird
	 */
	public void initialize() {
		allesViewController.tvItemsUpdate();
	}

	/**
	 * Löscht ausgewähltes Item aus der Datenbank
	 * 
	 * @param event - führt Methode itemLoeschen für ausgewähltes Item aus
	 * @throws FileNotFoundException - Exception wenn eine Datei nicht gefunden werden kann
	 * @throws IOException
	 */
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

	/**
	 * Lädt die Szene "InventarAnsicht" in die Stage
	 * 
	 * @param event - öffnet Inventaransicht
	 */
	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("/inventarAnsicht/InventarAnsicht.fxml"));
			root.setId("InventarAnsicht");
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
}
