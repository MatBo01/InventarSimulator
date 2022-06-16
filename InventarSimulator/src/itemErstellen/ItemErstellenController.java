package itemErstellen;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Auswahlmenü für die Erstellung eines Items
 */
public class ItemErstellenController {

	@FXML
	private Button btWaffe;
	
	@FXML
	private Button btRuestung;
	
	@FXML
	private Button btVerbrauchsgegenstand;
	
	@FXML
	private Button btZurueck;
	
	/**
	 * Lädt die Szene "ErstelleWaffe" in die Stage
	 * 
	 * @param event - öffnet Waffe erstellen
	 */
	@FXML
	private void handleButtonErstelleWaffeAction(ActionEvent event) {
		System.out.println("Waffe erstellen wird geöffnet\n");
		
		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("/itemErstellen/ErstelleWaffe.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
	
	/**
	 * Lädt die Szene "ErstelleRuestung" in die Stage
	 * 
	 * @param event - öffnet Ruestung erstellen
	 */
	@FXML
	private void handleButtonErstelleRuestungAction(ActionEvent event) {
		System.out.println("Rüstung erstellen wird geöffnet\n");
		
		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("/itemErstellen/ErstelleRuestung.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
	
	/**
	 * Lädt die Szene "ErstelleVerbrauchsgegenstand" in die Stage
	 * 
	 * @param event - öffnet Verbrauchsgegenstand erstellen
	 */
	@FXML
	private void handleButtonErstelleVerbrauchsgegenstandAction(ActionEvent event) {
		System.out.println("Verbrauchsgegenstand erstellen wird geöffnet\n");
		
		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("/itemErstellen/ErstelleVerbrauchsgegenstand.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
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
