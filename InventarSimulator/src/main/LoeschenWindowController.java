package main;

import java.util.jar.Attributes.Name;
import Item.Item;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LoeschenWindowController {
	
	@FXML
	private Button btDauerhaftLoeschen;
	
	@FXML
	private Button btHauptmenü;
	
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
	
}
