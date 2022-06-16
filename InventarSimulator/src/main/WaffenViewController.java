package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Waffe;
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
	private int angriffZaehler = 1;

	@FXML
	private Button btGewicht;
	private boolean gewichtZaehler = true;

	@FXML
	private Button btElement;
	private boolean elementZaehler = true;

	@FXML
	private Button btSchnelligkeit;
	private int schnelligkeitZaehler = 1;

	@FXML
	private TextField tfSuche;

	@FXML
	private Button btSuchen;

	@FXML
	private TableView<Waffe> tvWaffen;

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
		tvWaffen.setItems(WaffenListe);
	}

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
		tvWaffen.setItems(WaffenListe);
	}

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
		tvWaffen.setItems(WaffenListe);
	}

	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler) {
			RadixSort.radixSort(WaffenListe, wertZaehler);

			wertZaehler = false;
		} else if (!wertZaehler) {
			// sortierung absteigend
			System.out.println("Wsasagasgas");
			RadixSort.radixSort(WaffenListe, wertZaehler);
			wertZaehler = true;
		}
		tvWaffen.setItems(WaffenListe);
	}

	@FXML
	private void handleButtonDbAngriffSortierAction(ActionEvent event) {
		if (angriffZaehler == 1) {
			// sortierung aufsteigend

			angriffZaehler++;
		} else if (angriffZaehler == 2) {
			// sortierung absteigend

			angriffZaehler--;
		}
		tvWaffenUpdate();
	}

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
		tvWaffen.setItems(WaffenListe);
	}

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
		tvWaffen.setItems(WaffenListe);
	}

	@FXML
	private void handleButtonDbSchnelligkeitSortierAction(ActionEvent event) {
		if (schnelligkeitZaehler == 1) {
			// sortierung aufsteigend

			schnelligkeitZaehler++;
		} else if (schnelligkeitZaehler == 2) {
			// sortierung absteigend

			schnelligkeitZaehler--;
		}
		tvWaffen.setItems(WaffenListe);
	}

	@FXML
	private void handleButtonDbSuchenAction(ActionEvent event) {
		// Itemsuche
	}

	@FXML
	public void tvWaffenUpdate() {

		WaffenListe.clear();
		// Daten aus DB holen
		WaffenListe = DataExchange.getWeaponsFromDb();
//		for (Waffe waffen : WaffenListe) {
//			System.out.println(waffen.toString());
//		}
		tvWaffen.setItems(WaffenListe);
	}
}
