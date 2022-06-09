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
	private int artZaehler = 1;

	@FXML
	private Button btSeltenheit;
	private int seltenheitZaehler = 1;

	@FXML
	private Button btWert;
	private boolean wertZaehler = true;

	@FXML
	private Button btBuffs;
	private int buffsZaehler = 1;

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
		if (artZaehler == 1) {
			// sortierung aufsteigend

			artZaehler++;
		} else if (artZaehler == 2) {
			// sortierung absteigend

			artZaehler--;
		}
		tvVerbrauchsgegenstaendeUpdate();
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
		tvVerbrauchsgegenstaendeUpdate();
	}

	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler) {
			RadixSort.radixSortVW(VerbrauchsgegenstandsListe, wertZaehler);

			wertZaehler= false;
		} else if (!wertZaehler) {
			// sortierung absteigend
			RadixSort.radixSortVW(VerbrauchsgegenstandsListe, wertZaehler);
			wertZaehler= true;
		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}

	@FXML
	private void handleButtonDbBuffsSortierAction(ActionEvent event) {
		if (buffsZaehler == 1) {
			// sortierung aufsteigend

			buffsZaehler++;
		} else if (buffsZaehler == 2) {
			// sortierung absteigend

			buffsZaehler--;
		}
		tvVerbrauchsgegenstaendeUpdate();
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
