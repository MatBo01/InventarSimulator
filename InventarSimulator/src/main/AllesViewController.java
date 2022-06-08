package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Item;
import Sortieralgorithmen.SelectionSort;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AllesViewController implements Initializable {

	@FXML
	private Button btName;
	private boolean nameZaehler;

	@FXML
	private Button btArt;
	private int artZaehler = 1;

	@FXML
	private Button btSeltenheit;
	private byte seltenheitZaehler = 1;

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
		if (nameZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSort(ItemListe, nameZaehler);

			nameZaehler = false;
		} else if (!nameZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSort(ItemListe, nameZaehler);
			nameZaehler = true;
		}
		tvItems.setItems(ItemListe);
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
		tvItems.setItems(ItemListe);
	}

	@FXML
	private void handleButtonDbSeltenheitSortierAction(ActionEvent event) {
		if (seltenheitZaehler == 1) {
			// sortierung aufsteigend
			SelectionSort.selectionSort(ItemListe, seltenheitZaehler);
			seltenheitZaehler++;
		} else if (seltenheitZaehler == 2) {
			// sortierung absteigend

			seltenheitZaehler--;
		}
		tvItems.setItems(ItemListe);
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
		tvItems.setItems(ItemListe);
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
