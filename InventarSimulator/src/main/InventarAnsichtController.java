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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class InventarAnsichtController {
	
	@FXML
	private Button btItemAnsicht;

	@FXML
	private Button btItemErstellen;
	
	@FXML
	private Button btItemLoeschen;

	@FXML
	private Button btHauptmenue;
	
	@FXML
	AllesViewController allesViewController;
	
	@FXML
	WaffenViewController waffenViewController;
	
	@FXML
	RuestungViewController ruestungViewController;
	
	@FXML
	VerbrauchsgegenstandViewController verbrauchsgegenstandViewController;
	
	public void initialize() {
		allesViewController.tvItemsUpdate();
		waffenViewController.tvWaffenUpdate();
		ruestungViewController.tvRuestungsUpdate();
		verbrauchsgegenstandViewController.tvVerbrauchsgegenstaendeUpdate();
	}
	
	public void UpdateTable(){
		allesViewController.tvItemsUpdate();
		waffenViewController.tvWaffenUpdate();
		ruestungViewController.tvRuestungsUpdate();
		verbrauchsgegenstandViewController.tvVerbrauchsgegenstaendeUpdate();
	}

	@FXML
	private void handleButtonItemAnsichtAction(ActionEvent event) {
		System.out.println("Hauptmenü wird geöffnet\n");

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
	private void handleButtonItemErstellenAction(ActionEvent event) {
		System.out.println("Item erstellen wird geöffnet\n");
		
		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("ItemErstellen.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
	
	@FXML
	private void handleButtonItemLoeschenAction(ActionEvent event) {
		System.out.println("Item löschen wird geöffnet\n");
		
		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			HBox root = (HBox)FXMLLoader.load(getClass().getResource("ItemsLoeschen.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	@FXML
	private void handleButtonHauptmenueAction(ActionEvent event) {
		System.out.println("Hauptmenü wird geöffnet\n");

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

