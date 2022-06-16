package itemView;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Waffe;
import dataExchange.DataExchange;
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
import sortieralgorithmen.RadixSort;
import sortieralgorithmen.SelectionSort;
import suchalgorithmen.LinearSearch;

/**
 * Tabellen-Anzeige für alle Waffen in der Datenbank, inklusive Sortierbuttons und Suchfeld
 */
public class WaffenViewController implements Initializable {

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
	private Button btAngriff;
	private boolean angriffZaehler = true;

	@FXML
	private Button btGewicht;
	private boolean gewichtZaehler = true;

	@FXML
	private Button btElement;
	private boolean elementZaehler = true;

	@FXML
	private Button btSchnelligkeit;
	private boolean schnelligkeitZaehler = true;

	@FXML
	private TextField tfSuche;

	@FXML
	private Button btSuchen;

	@FXML
	private Button btReset;

	@FXML
	private TableView<Waffe> tvWaffen;

	public TableView<Waffe> getTvWaffen() {
		return tvWaffen;
	}

	@FXML
	private TableColumn<Waffe, String> tcName;

	@FXML
	private TableColumn<Waffe, String> tcWaffenArt;

	@FXML
	private TableColumn<Waffe, String> tcSeltenheit;

	@FXML
	private TableColumn<Waffe, Integer> tcWert;

	@FXML
	private TableColumn<Waffe, Integer> tcStaerke;

	@FXML
	private TableColumn<Waffe, Double> tcGewicht;

	@FXML
	private TableColumn<Waffe, String> tcElement;

	@FXML
	private TableColumn<Waffe, Integer> tcSchnelligkeit;

	private ObservableList<Waffe> WaffenListe = FXCollections.observableArrayList();

	public ObservableList<Waffe> getWaffenListe() {
		return WaffenListe;
	}

	/**
	 * Setzt Daten von jeder Waffe aus der ObservableList: WaffenListe in die TableView ein
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tcWaffenArt.setCellValueFactory(new PropertyValueFactory<>("WaffenArt"));
		tcSeltenheit.setCellValueFactory(new PropertyValueFactory<>("Seltenheit"));
		tcWert.setCellValueFactory(new PropertyValueFactory<>("Wert"));
		tcStaerke.setCellValueFactory(new PropertyValueFactory<>("Staerke"));
		tcGewicht.setCellValueFactory(new PropertyValueFactory<>("Gewicht"));
		tcElement.setCellValueFactory(new PropertyValueFactory<>("Element"));
		tcSchnelligkeit.setCellValueFactory(new PropertyValueFactory<>("Schnelligkeit"));
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
			SelectionSort.selectionSortWaffe(WaffenListe, nameZaehler);
			nameZaehler = false;
		} else if (!nameZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortWaffe(WaffenListe, nameZaehler);
			nameZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
	}

	/**
	 * Sortierbutton: (Waffen)Art
	 * 
	 * @param event - sotiert Tabelle nach der WaffenArt
	 */
	@FXML
	private void handleButtonDbArtSortierAction(ActionEvent event) {
		if (artZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortArtWaffe(WaffenListe, artZaehler);
			artZaehler = false;
		} else if (!artZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortArtWaffe(WaffenListe, artZaehler);
			artZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
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
			SelectionSort.selectionSortWaffeSeltenheit(WaffenListe, seltenheitZaehler);
			seltenheitZaehler = false;
		} else if (!seltenheitZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortWaffeSeltenheit(WaffenListe, seltenheitZaehler);
			seltenheitZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
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
			RadixSort.radixSortWW(WaffenListe, wertZaehler);
			wertZaehler = false;
		} else if (!wertZaehler) {
			// sortierung absteigend
			RadixSort.radixSortWW(WaffenListe, wertZaehler);
			wertZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
	}

	/**
	 * Sortierbutton: Angriff
	 * 
	 * @param event - sotiert Tabelle nach dem Angriff
	 */
	@FXML
	private void handleButtonDbAngriffSortierAction(ActionEvent event) {
		if (angriffZaehler) {
			// sortierung aufsteigend
			RadixSort.radixSortWA(WaffenListe, angriffZaehler);
			angriffZaehler = false;
		} else if (!angriffZaehler) {
			// sortierung absteigend
			RadixSort.radixSortWA(WaffenListe, angriffZaehler);
			angriffZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
	}

	/**
	 * Sortierbutton: Gewicht
	 * 
	 * @param event - sotiert Tabelle nach dem Gewicht
	 */
	@FXML
	private void handleButtonDbGewichtSortierAction(ActionEvent event) {
		if (gewichtZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortWaffeGewicht(WaffenListe, gewichtZaehler);
			gewichtZaehler = false;
		} else if (!gewichtZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortWaffeGewicht(WaffenListe, gewichtZaehler);
			gewichtZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
	}

	/**
	 * Sortierbutton: Element
	 * 
	 * @param event - sotiert Tabelle nach dem Element
	 */
	@FXML
	private void handleButtonDbElementSortierAction(ActionEvent event) {
		if (elementZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortWaffeElement(WaffenListe, elementZaehler);
			elementZaehler = false;
		} else if (!elementZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortWaffeElement(WaffenListe, elementZaehler);
			elementZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
	}

	/**
	 * Sortierbutton: Schnelligkeit
	 * 
	 * @param event - sotiert Tabelle nach dem Schnelligkeit
	 */
	@FXML
	private void handleButtonDbSchnelligkeitSortierAction(ActionEvent event) {
		if (schnelligkeitZaehler) {
			// sortierung aufsteigend
			RadixSort.radixSortWS(WaffenListe, schnelligkeitZaehler);
			schnelligkeitZaehler = false;
		} else if (!schnelligkeitZaehler) {
			// sortierung absteigend
			RadixSort.radixSortWS(WaffenListe, schnelligkeitZaehler);
			schnelligkeitZaehler = true;
		}
		// aktualisiert die Tabelle
		tvWaffen.setItems(WaffenListe);
	}

	/**
	 * Suchbutton Event
	 * 
	 * @param event - durchsucht Tabelle nach der Sucheingabe (tfSuche)
	 */
	@FXML
	private void handleButtonDbSuchenAction(ActionEvent event) {
		// Itemsuche
		tvWaffenUpdate();
		tvWaffen.setItems(LinearSearch.waffe(WaffenListe, tfSuche.getText()));
		if(WaffenListe.size() == 0) {
			tfSuche.setText("Kein Ergebnis");
		}
	}

	/**
	 * Ließt die ItemListe wieder neu aus der Datenbank aus
	 * 
	 * @param event - setzt Tabelle auf Anfangszustand zurück
	 */
	@FXML
	private void handleButtonResetAction(ActionEvent event) {
		tvWaffenUpdate();
		tfSuche.setText("");
	}

	/**
	 * Lädt die Waffen aus der Datenbank und setzt sie in die Tabelle ein
	 */
	@FXML
	public void tvWaffenUpdate() {
		WaffenListe.clear();
		// Daten aus DB holen
		WaffenListe = DataExchange.getWeaponsFromDb();
		tvWaffen.setItems(WaffenListe);
	}
}
