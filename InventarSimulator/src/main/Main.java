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
			// Lädt die Szene Hauptmenü.fxml
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("Hauptmenue.fxml"));
			
			// Id-Verbindung für Methode in application.css
			root.setId("Hauptmenue");
			
			// Speichert Szene mit angegebener Größe
			Scene scene = new Scene(root,1600,900);
			
			// Lädt das application.css in die Szene
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// Icon-Image wird geladen und eingesetzt
			Image icon = new Image("file:img/icon/icon.png");
			primaryStage.getIcons().add(icon);
			
			// Setzt Szene in die Stage
			primaryStage.setScene(scene);
			
			// Setzt Titel in die Szene
			primaryStage.setTitle("Inventarsimulator");
			
			// Zeigt das Fenster an
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}