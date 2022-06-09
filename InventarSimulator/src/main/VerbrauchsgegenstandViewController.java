package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Verbrauchsgegenstand;
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

public class VerbrauchsgegenstandViewController implements Initializable{
	
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
	private boolean wertZaehler = true;

	@FXML
	private Button btBuffs;
	private boolean buffsZaehler = true;

	@FXML
	private TextField tfSuche;
	
	@FXML
	private Button btSuchen;
	
	@FXML
	private TableView<Verbrauchsgegenstand> tvVerbrauchsgegenstaende;
	
	@FXML
	private TableColumn<Verbrauchsgegenstand, String> tcName;
	
	@FXML
	private TableColumn<Verbrauchsgegenstand, String> tcVerbrauchsgegenstandsArt;
	
	@FXML
	private TableColumn<Verbrauchsgegenstand, String> tcSeltenheit;
	
	@FXML
	private TableColumn<Verbrauchsgegenstand, Integer> tcWert;

	@FXML
	private TableColumn<Verbrauchsgegenstand, Integer> tcBuffs;
	
	private ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tcVerbrauchsgegenstandsArt.setCellValueFactory(new PropertyValueFactory<>("VerbrauchsgegenstandsArt"));
		tcSeltenheit.setCellValueFactory(new PropertyValueFactory<>("Seltenheit"));
		tcWert.setCellValueFactory(new PropertyValueFactory<>("Wert"));
		tcBuffs.setCellValueFactory(new PropertyValueFactory<>("Buffs"));
	}
	
	@FXML
	private void handleButtonDbNameSortierAction(ActionEvent event) {
		if (nameZaehler) {
			// sortierung aufsteigend
			SelectionSort.selectionSortV(VerbrauchsgegenstandsListe, nameZaehler);
			nameZaehler = false;
		} else if (!nameZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortV(VerbrauchsgegenstandsListe, nameZaehler);
			nameZaehler = true;
		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}

	@FXML
	private void handleButtonDbArtSortierAction(ActionEvent event) {
		if (artZaehler) {
			// sortierung aufsteigend
			
			artZaehler = false;
		} else if (!artZaehler) {
			// sortierung absteigend
			
			artZaehler = true;
		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}

	@FXML
	private void handleButtonDbSeltenheitSortierAction(ActionEvent event) {
		if (seltenheitZaehler) {
			// sortierung aufsteigend
			
			seltenheitZaehler = false;
		} else if (!seltenheitZaehler) {
			// sortierung absteigend
			
			seltenheitZaehler = true;
		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}

	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler) {
			// sortierung aufsteigend
			RadixSort.radixSortVW(VerbrauchsgegenstandsListe, wertZaehler);
			wertZaehler = false;
		} else if (!wertZaehler) {
			// sortierung absteigend
			RadixSort.radixSortVW(VerbrauchsgegenstandsListe, wertZaehler);
			wertZaehler = true;
		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}

	@FXML
	private void handleButtonDbBuffsSortierAction(ActionEvent event) {
		if (buffsZaehler) {
			// sortierung aufsteigend
			
			buffsZaehler = false;
		} else if (!buffsZaehler) {
			// sortierung absteigend
			
			buffsZaehler = true;
		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}
	
	@FXML
	private void handleButtonDbSuchenAction(ActionEvent event) {
		// Itemsuche
		
	}
	
	@FXML
	public void tvVerbrauchsgegenstaendeUpdate() {
		
		VerbrauchsgegenstandsListe.clear();
		// Daten aus DB holen
		VerbrauchsgegenstandsListe = DataExchange.getConsumablesFromDb();
//		for(Verbrauchsgegenstand verbrauchsgegenstand: VerbrauchsgegenstandsListe) {
//			System.out.println(verbrauchsgegenstand.toString());
//		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}
}
