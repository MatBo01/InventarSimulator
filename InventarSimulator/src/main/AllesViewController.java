package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Item;
import Sortieralgorithmen.RadixSort;
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

/**
 * Tabellen-Anzeige für alle Items in der Datenbank, inklusive Sortierbuttons und Suchfeld
 */
public class AllesViewController implements Initializable {

	@FXML
	private Button btName;
	private boolean nameZaehler = true;

	@FXML
	private Button btArt;
	private boolean artZaehler = true;

	@FXML
	private Button btSeltenheit;
	private boolean seltenheitZaehler = true;

	@FXML
	private Button btWert;
	private boolean wertZaehler = true;

	@FXML
	private TextField tfSuche;

	@FXML
	private Button btSuchen;
	
	@FXML
	private Button btReset;

	@FXML
	private TableView<Item> tvItems;

	public TableView<Item> getTvItems() {
		return tvItems;
	}

	@FXML
	private TableColumn<Item, String> tcName;

	@FXML
	private TableColumn<Item, String> tcItemArt;

	@FXML
	private TableColumn<Item, String> tcSeltenheit;

	@FXML
	private TableColumn<Item, Integer> tcWert;

	private ObservableList<Item> ItemListe = FXCollections.observableArrayList();
	
	/**
	 * Setzt Daten von jedem Item aus der ObservableList: ItemListe in die TableView ein 
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tcItemArt.setCellValueFactory(new PropertyValueFactory<>("ItemArt"));
		tcSeltenheit.setCellValueFactory(new PropertyValueFactory<>("Seltenheit"));
		tcWert.setCellValueFactory(new PropertyValueFactory<>("Wert"));
	}

	/**
	 * Sortierbutton: Name
	 * 
	 * @param event - sotiert Tabelle nach den Namen
	 */
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
		// aktualisiert die Tabelle
		tvItems.setItems(ItemListe);
	}

	/**
	 * Sortierbutton: (Item)Art
	 * 
	 * @param event - sotiert Tabelle nach der ItemArt
	 */
	@FXML
	private void handleButtonDbArtSortierAction(ActionEvent event) {
		if (artZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortArt(ItemListe, artZaehler);
			artZaehler = false;
		} else if (!artZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortArt(ItemListe, artZaehler);
			artZaehler = true;
		}
		// aktualisiert die Tabelle
		tvItems.setItems(ItemListe);
	}

	/**
	 * Sortierbutton: Seltenheit
	 * 
	 * @param event - sotiert Tabelle nach der Seltenheit
	 */
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
		// aktualisiert die Tabelle
		tvItems.setItems(ItemListe);
	}

	/**
	 * Sortierbutton: Wert
	 * 
	 * @param event - sotiert Tabelle nach dem Wert
	 */
	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler) {
			// sortierung aufsteigend
			RadixSort.radixSortIW(ItemListe, wertZaehler);
			wertZaehler = false;
		} else if (!wertZaehler) {
			// sortierung absteigend
			RadixSort.radixSortIW(ItemListe, wertZaehler);
			wertZaehler = true;
		}
		// aktualisiert die Tabelle
		tvItems.setItems(ItemListe);
	}

	/**
	 * Suchbutton Event
	 * 
	 * @param event - durchsucht Tabelle nach der Sucheingabe (tfSuche)
	 */
	@FXML
	private void handleButtonDbSuchenAction(ActionEvent event) {
		// Itemsuche

	}
	
	/**
	 * Ließt die ItemListe wieder neu aus der Datenbank aus
	 * 
	 * @param event - setzt Tabelle auf Anfangszustand zurück
	 */
	@FXML
	private void handleButtonResetAction(ActionEvent event) {
		tvItemsUpdate();
	}

	
	/**
	 * Lädt die Items aus der Datenbank und setzt sie in die Tabelle ein
	 */
	@FXML
	public void tvItemsUpdate() {
		ItemListe.clear();
		// Daten aus DB holen
		ItemListe = DataExchange.getItemsFromDb();
		tvItems.setItems(ItemListe);
	}
}
