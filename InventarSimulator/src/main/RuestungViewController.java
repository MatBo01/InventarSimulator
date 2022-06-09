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

public class RuestungViewController implements Initializable {

	@FXML
	private Button btName;
	private boolean nameZaehler = true;

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
	private Button btVerteidigung;
	private boolean verteidigungZaehler = true;

	@FXML
	private Button btGewicht;
	private boolean gewichtZaehler = true;

	@FXML
	private Button btResistenz;
	private int resistenzZaehler = 1;

	@FXML
	private TextField tfSuche;
	
	@FXML
	private Button btSuchen;
	
	@FXML
	private TableView<Ruestung> tvRuestung;
	
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
			SelectionSort.selectionSortR(RuestungsListe, nameZaehler);
			nameZaehler = false;
		} else if (!nameZaehler) {
			// sortierung absteigend
			SelectionSort.selectionSortR(RuestungsListe, nameZaehler);
			nameZaehler = true;
		}
		tvRuestung.setItems(RuestungsListe);
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
		tvRuestungsUpdate();
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
		tvRuestungsUpdate();
	}

	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler) {
			RadixSort.radixSortRW(RuestungsListe, wertZaehler);

			wertZaehler= false;
		} else if (!wertZaehler) {
			// sortierung absteigend
			RadixSort.radixSortRW(RuestungsListe, wertZaehler);
			wertZaehler= true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbVerteidigungSortierAction(ActionEvent event) {
		if (verteidigungZaehler) {
			RadixSort.radixSortRV(RuestungsListe, verteidigungZaehler);

			verteidigungZaehler= false;
		} else if (!verteidigungZaehler) {
			// sortierung absteigend
			RadixSort.radixSortRV(RuestungsListe, verteidigungZaehler);
			verteidigungZaehler= true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbGewichtSortierAction(ActionEvent event) {
		if (gewichtZaehler) {
			RadixSort.radixSortRG(RuestungsListe, gewichtZaehler);

			gewichtZaehler= false;
		} else if (!gewichtZaehler) {
			// sortierung absteigend
			RadixSort.radixSortRG(RuestungsListe, gewichtZaehler);
			gewichtZaehler= true;
		}
		tvRuestung.setItems(RuestungsListe);
	}

	@FXML
	private void handleButtonDbResistenzSortierAction(ActionEvent event) {
		if (resistenzZaehler == 1) {
			// sortierung aufsteigend

			resistenzZaehler++;
		} else if (resistenzZaehler == 2) {
			// sortierung absteigend

			resistenzZaehler--;
		}
		tvRuestungsUpdate();
	}
	
	@FXML
	private void handleButtonDbSuchenAction(ActionEvent event) {
		// Itemsuche
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
