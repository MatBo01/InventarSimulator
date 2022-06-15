package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Ruestung;
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
 * Tabellen-Anzeige für alle Rüstungen in der Datenbank, inklusive Sortierbuttons und Suchfeld
 */
public class RuestungViewController implements Initializable {

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
	private Button btVerteidigung;
	private boolean verteidigungZaehler = true;

	@FXML
	private Button btGewicht;
	private boolean gewichtZaehler = true;

	@FXML
	private Button btResistenz;
	private boolean resistenzZaehler = true;

	@FXML
	private TextField tfSuche;
	
	@FXML
	private Button btSuchen;
	
	@FXML
	private Button btReset;
	
	@FXML
	private TableView<Ruestung> tvRuestung;
	
	public TableView<Ruestung> getTvRuestung() {
		return tvRuestung;
	}

	@FXML
	private TableColumn<Ruestung, String> tcName;
	
	@FXML
	private TableColumn<Ruestung, String> tcRuestungsArt;
	
	@FXML
	private TableColumn<Ruestung, String> tcSeltenheit;
	
	@FXML
	private TableColumn<Ruestung, Integer> tcWert;

	@FXML
	private TableColumn<Ruestung, Integer> tcStaerke;
	
	@FXML
	private TableColumn<Ruestung, Double> tcGewicht;
	
	@FXML
	private TableColumn<Ruestung, String> tcElement;
	
	private ObservableList<Ruestung> RuestungsListe = FXCollections.observableArrayList();

	public ObservableList<Ruestung> getRuestungsListe() {
		return RuestungsListe;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tcRuestungsArt.setCellValueFactory(new PropertyValueFactory<>("RuestungsArt"));
		tcSeltenheit.setCellValueFactory(new PropertyValueFactory<>("Seltenheit"));
		tcWert.setCellValueFactory(new PropertyValueFactory<>("Wert"));
		tcStaerke.setCellValueFactory(new PropertyValueFactory<>("Staerke"));
		tcGewicht.setCellValueFactory(new PropertyValueFactory<>("Gewicht"));
		tcElement.setCellValueFactory(new PropertyValueFactory<>("Element"));
	}
	
	@FXML
	private void handleButtonDbNameSortierAction(ActionEvent event) {
		if (nameZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortRuestung(RuestungsListe, nameZaehler);
			nameZaehler = false;
		} else if (!nameZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortRuestung(RuestungsListe, nameZaehler);
			nameZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbArtSortierAction(ActionEvent event) {
		if (artZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortArtRuestung(RuestungsListe, artZaehler);
			artZaehler = false;
		} else if (!artZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortArtRuestung(RuestungsListe, artZaehler);
			artZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbSeltenheitSortierAction(ActionEvent event) {
		if (seltenheitZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortRuestungSeltenheit(RuestungsListe, seltenheitZaehler);
			seltenheitZaehler = false;
		} else if (!seltenheitZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortRuestungSeltenheit(RuestungsListe, seltenheitZaehler);
			seltenheitZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler) {
			// sortierung aufsteigend
			RadixSort.radixSortRW(RuestungsListe, wertZaehler);
			wertZaehler = false;
		} else if (!wertZaehler) {
			// sortierung absteigend
			RadixSort.radixSortRW(RuestungsListe, wertZaehler);
			wertZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbVerteidigungSortierAction(ActionEvent event) {
		if (verteidigungZaehler) {
			// sortierung aufsteigend
			RadixSort.radixSortRV(RuestungsListe, verteidigungZaehler);
			verteidigungZaehler = false;
		} else if (!verteidigungZaehler) {
			// sortierung absteigend
			RadixSort.radixSortRV(RuestungsListe, verteidigungZaehler);
			verteidigungZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbGewichtSortierAction(ActionEvent event) {
		if (gewichtZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortRuestungGewicht(RuestungsListe, gewichtZaehler);
			gewichtZaehler = false;
		} else if (!gewichtZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortRuestungGewicht(RuestungsListe, gewichtZaehler);
			gewichtZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbResistenzSortierAction(ActionEvent event) {
		if (resistenzZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortRuestungResistenz(RuestungsListe, resistenzZaehler);
			resistenzZaehler = false;
		} else if (!resistenzZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortRuestungResistenz(RuestungsListe, resistenzZaehler);
			resistenzZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
	}
	
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
		tvRuestungsUpdate();
	}
	
	@FXML
	public void tvRuestungsUpdate() {
		
		RuestungsListe.clear();
		// Daten aus DB holen
		RuestungsListe = DataExchange.getArmorFromDb();
//		for(Ruestung ruestung: RuestungsListe) {
//			System.out.println(ruestung.toString());
//		}
		tvRuestung.setItems(RuestungsListe);
	}
}
