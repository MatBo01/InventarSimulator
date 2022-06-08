package main;

import java.io.IOException;

import POJO.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoeschenWindowController {
	
	@FXML
	private Button btDauerhaftLoeschen;
	
	@FXML
	private Button btZurueck;
	
	@FXML
	private TableView<Item> tvPerson;
	
	@FXML
	private TableColumn<Item, String> tcName;
	
	@FXML
	private TableColumn<Item, String> tcArt;
	
	@FXML
	private TableColumn<Item, Integer> tcSeltenheit;
	
	@FXML
	private TableColumn<Item, Integer> tcWert;
	
	@FXML
	private TableColumn<Item, Integer> tcStaerke;
	
	@FXML
	private TableColumn<Item, Integer> tcSchwerLeicht;
	
	@FXML
	private TableColumn<Item, Integer> tcSchnelligkeit;
	
	@FXML
	private TableColumn<Item, String> tcElement;
	
	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("InventarAnsicht.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
}
