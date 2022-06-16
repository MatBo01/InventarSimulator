package hauptmenue;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Hauptmenü - Szene des Programms
 */
public class HauptmenueController {

	@FXML
	private Button btInventaransicht;

	@FXML
	private Button btBeenden;

	/**
	 * Lädt die Szene "InventarAnsicht" in die Stage
	 * 
	 * @param event - öffnet InventarAnsicht
	 */
	@FXML
	private void handleButtonInventaransichtAction(ActionEvent event) {
		System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

		try {
			// lädt die aktuelle Stage in eine Variable
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			
			// Für erklärung, Siehe: Main.java -> start
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("/inventarAnsicht/InventarAnsicht.fxml"));
			root.setId("InventarAnsicht");
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
			iOException.printStackTrace();
		}
	}

	/**
	 * Schließt die Stage und damit das Programm
	 * 
	 * @param event - beendet das Programm
	 */
	@FXML
	private void handleButtonBeendenAction(ActionEvent event) {
		System.out.println("Jetzt wird das Programm beendet\n");

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
}
