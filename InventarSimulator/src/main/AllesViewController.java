package main;
import java.net.URL;
import java.util.ResourceBundle;

import POJO.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AllesViewController implements Initializable {

	@FXML
	private MenuButton mbSortierung;
	
	@FXML
	private MenuItem miName;
	
	@FXML
	private TableView<Item> tvItems;
	
	@FXML
	private TableColumn<Item, String> tcName;
	
	@FXML
	private TableColumn<Item, String> tcItemArt;
	
	@FXML
	private TableColumn<Item, String> tcSeltenheit;
	
	@FXML
	private TableColumn<Item, Integer> tcWert;
	
	private ObservableList<Item> ItemListe = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tcItemArt.setCellValueFactory(new PropertyValueFactory<>("ItemArt"));
		tcSeltenheit.setCellValueFactory(new PropertyValueFactory<>("Seltenheit"));
		tcWert.setCellValueFactory(new PropertyValueFactory<>("Wert"));
	}
	
	@FXML
	private Button btTest;
	
	@FXML
	private void handleButtonDbAuslesenAction(ActionEvent event) {
		tvItemsUpdate();
	}
	
	@FXML
	public void tvItemsUpdate() {
		
		ItemListe.clear();
		// Daten aus DB holen
		ItemListe = DataExchange.getItemsFromDb();
		for(Item item: ItemListe) {
			System.out.println(item.toString());
		}
		tvItems.setItems(ItemListe);
	}
}
