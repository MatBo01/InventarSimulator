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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class InventarAnsichtPlatzhalterController {

	@FXML
	private Button btItemAnsicht;

	@FXML
	private Button btItemsHinzufuegen;

	@FXML
	private Button btHauptmenue;

	@FXML
	private void handleButtonItemAnsichtAction(ActionEvent event) {
		System.out.println("Hauptmen� wird ge�ffnet\n");

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ItemAnsicht.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Itemansicht");
			stage.setScene(new Scene(root, 900, 450));
			stage.show();

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	@FXML
	private void handleButtonItemsHinzufuegenAction(ActionEvent event) {
		System.out.println("Hauptmen� wird ge�ffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			Pane root = (Pane) FXMLLoader.load(getClass().getResource("ItemsHinzufuegen.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	@FXML
	private void handleButtonHauptmenueAction(ActionEvent event) {
		System.out.println("Hauptmen� wird ge�ffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("Hauptmenue.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
}
