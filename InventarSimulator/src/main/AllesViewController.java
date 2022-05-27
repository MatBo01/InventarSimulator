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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class AllesViewController implements Initializable {

	@FXML
	private Button btName;
	private int nameZaehler = 1;

	@FXML
	private Button btArt;
	private int artZaehler = 1;

	@FXML
	private Button btSeltenheit;
	private int seltenheitZaehler = 1;

	@FXML
	private Button btWert;
	private int wertZaehler = 1;
	
	@FXML
	private TextField tfSuche;
	
	@FXML
	private Button btSuchen;
	
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
	private void handleButtonDbNameSortierAction(ActionEvent event) {
		if (nameZaehler == 1) {
			// sortierung aufsteigend
			
			nameZaehler++;
		} else if (nameZaehler == 2) {
			// sortierung absteigend
			
			nameZaehler--;
		}
		tvItemsUpdate();
	}

	@FXML
	private void handleButtonDbArtSortierAction(ActionEvent event) {
		if (artZaehler == 1) {
			// sortierung aufsteigend

			artZaehler++;
		} else if (artZaehler == 2) {
			// sortierung absteigend

			artZaehler--;
		}
		tvItemsUpdate();
	}

	@FXML
	private void handleButtonDbSeltenheitSortierAction(ActionEvent event) {
		if (seltenheitZaehler == 1) {
			// sortierung aufsteigend

			seltenheitZaehler++;
		} else if (seltenheitZaehler == 2) {
			// sortierung absteigend

			seltenheitZaehler--;
		}
		tvItemsUpdate();
	}

	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler == 1) {
			// sortierung aufsteigend

			wertZaehler++;
		} else if (wertZaehler == 2) {
			// sortierung absteigend

			wertZaehler--;
		}
		tvItemsUpdate();
	}
	
	@FXML
	private void handleButtonDbSuchenAction(ActionEvent event) {
		// Itemsuche
		
	}
	
	@FXML
	public void tvItemsUpdate() {
		
		ItemListe.clear();
		// Daten aus DB holen
		ItemListe = DataExchange.getItemsFromDb();
//		for(Item item: ItemListe) {
//			System.out.println(item.toString());
//		}
		tvItems.setItems(ItemListe);
	}
}
