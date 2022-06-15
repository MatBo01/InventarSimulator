package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;

/**
 * Initialisiert das Programm
 */
public class Main extends Application {
	/**
	 * Erstellt das Hauptfenster und lädt die Szene: "Hauptmenü"
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("Hauptmenue.fxml")); // Lädt die Szene Hauptmenü.fxml
			root.setId("Hauptmenue"); // Id-Verbindung für Methode in application.css
			
			Scene scene = new Scene(root, 1600, 900); // Speichert Szene mit angegebener Größe
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // Lädt das application.css in die Szene

			// Icon-Image wird geladen und eingesetzt
			Image icon = new Image("file:img/icon/icon.png");
			primaryStage.getIcons().add(icon);

			primaryStage.setScene(scene); // Setzt Szene in die Stage
			primaryStage.setTitle("Inventarsimulator"); // Setzt Titel in die Szene
			primaryStage.show(); // Zeigt das Fenster an

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}