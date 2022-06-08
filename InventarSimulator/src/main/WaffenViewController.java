package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Waffe;
import Sortier_Algorithmen.RadixSort;
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
	private int nameZaehler = 1;

	@FXML
	private Button btArt;
	private int artZaehler = 1;

	@FXML
	private Button btSeltenheit;
	private int seltenheitZaehler = 1;

	@FXML
	private Button btWert;
	private boolean wertZaehler;

	@FXML
	private Button btAngriff;
	private int angriffZaehler = 1;

	@FXML
	private Button btGewicht;
	private int gewichtZaehler = 1;

	@FXML
	private Button btElement;
	private int elementZaehler = 1;

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
		if (nameZaehler == 1) {
			// sortierung aufsteigend

			nameZaehler++;
		} else if (nameZaehler == 2) {
			// sortierung absteigend

			nameZaehler--;
		}
		tvWaffenUpdate();
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
		tvWaffenUpdate();
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
		tvWaffenUpdate();
	}

	@FXML
	private void handleButtonDbWertSortierAction(ActionEvent event) {
		if (wertZaehler) {
			RadixSort.radixSort(WaffenListe, wertZaehler);

			wertZaehler = false;
		} else if (!wertZaehler) {
			RadixSort.radixSort(WaffenListe, wertZaehler);

			wertZaehler = true;
		}
		tvWaffen.setItems(WaffenListe);
	}

	@FXML
	private void handleButtonDbAngriffSortierAction(ActionEvent event) {
		if (angriffZaehler == 1) {

			angriffZaehler++;
		} else if (angriffZaehler == 2) {

			angriffZaehler--;
		}
		tvWaffen.setItems(WaffenListe);
	}

	@FXML
	private void handleButtonDbGewichtSortierAction(ActionEvent event) {
		if (gewichtZaehler == 1) {
			// sortierung aufsteigend

			gewichtZaehler++;
		} else if (gewichtZaehler == 2) {
			// sortierung absteigend

			gewichtZaehler--;
		}
		tvWaffenUpdate();
	}

	@FXML
	private void handleButtonDbElementSortierAction(ActionEvent event) {
		if (elementZaehler == 1) {
			// sortierung aufsteigend

			elementZaehler++;
		} else if (elementZaehler == 2) {
			// sortierung absteigend

			elementZaehler--;
		}
		tvWaffenUpdate();
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
		tvWaffenUpdate();
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
