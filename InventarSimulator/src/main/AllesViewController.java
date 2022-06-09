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
	private boolean artZaehler = true;

	@FXML
	private Button btSeltenheit;
	private boolean seltenheitZaehler = true;

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
		if (artZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortArt(ItemListe, artZaehler);
			artZaehler=false;
		} else if (!artZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortArt(ItemListe, artZaehler);
			artZaehler=true;
		}
		tvItems.setItems(ItemListe);
	}

	@FXML
	private void handleButtonDbSeltenheitSortierAction(ActionEvent event) {
		if (seltenheitZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortSeltenheit(ItemListe, seltenheitZaehler);
			seltenheitZaehler = false;
		} else if (!seltenheitZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortSeltenheit(ItemListe, seltenheitZaehler);
			seltenheitZaehler = true;
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
