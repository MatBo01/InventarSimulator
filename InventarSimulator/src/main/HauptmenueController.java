package main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HauptmenueController {
	
	@FXML
	private Button btInventaransicht;
	
	@FXML
	private Button btItemBearbeiten;
	
	@FXML
	private Button btSpeichernUndBeenden;
	
	@FXML
	private void handleButtonInventaransichtAction(ActionEvent event) {
		System.out.println("Jetzt wird die Inventaransicht ge�ffnet");
	}
	
	@FXML
	private void handleButtonItemBearbeitenAction(ActionEvent event) {
		System.out.println("Jetzt wird die Item bearbeiten ge�ffnet");
		
		try {
			System.out.println("Jetzt wird die Item bearbeiten ge�ffnet");
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("ItemBearbeiten.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			System.out.println("Hallo");
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
	
	@FXML
	private void handleButtonSpeichernUndBeendenAction(ActionEvent event) {
		System.out.println("Jetzt wird gespeichert und das Programm beendet");
	}
	
}
