package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Verbrauchsgegenstaende;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VerbrauchsgegenstandViewController implements Initializable{
	@FXML
	private MenuButton mbSortierung;
	
	@FXML
	private MenuItem miName;
	
	@FXML
	private TableView<Verbrauchsgegenstaende> tvVerbrauchsgegenstaende;
	
	@FXML
	private TableColumn<Verbrauchsgegenstaende, String> tcName;
	
	@FXML
	private TableColumn<Verbrauchsgegenstaende, String> tcVerbrauchsgegenstandsArt;
	
	@FXML
	private TableColumn<Verbrauchsgegenstaende, String> tcSeltenheit;
	
	@FXML
	private TableColumn<Verbrauchsgegenstaende, Integer> tcWert;

	@FXML
	private TableColumn<Verbrauchsgegenstaende, Integer> tcBuffs;
	
	private ObservableList<Verbrauchsgegenstaende> VerbrauchsgegenstandsListe = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tcVerbrauchsgegenstandsArt.setCellValueFactory(new PropertyValueFactory<>("VerbrauchsgegenstandsArt"));
		tcSeltenheit.setCellValueFactory(new PropertyValueFactory<>("Seltenheit"));
		tcWert.setCellValueFactory(new PropertyValueFactory<>("Wert"));
		tcBuffs.setCellValueFactory(new PropertyValueFactory<>("Buffs"));
	}
	
	@FXML
	private Button btTest;
	
	@FXML
	private void handleButtonDbAuslesenAction(ActionEvent event) {
		tvVerbrauchsgegenstaendeUpdate();
	}
	
	@FXML
	public void tvVerbrauchsgegenstaendeUpdate() {
		
		VerbrauchsgegenstandsListe.clear();
		// Daten aus DB holen
		VerbrauchsgegenstandsListe = DataExchange.getConsumablesFromDb();
		for(Verbrauchsgegenstaende verbrauchsgegenstand: VerbrauchsgegenstandsListe) {
			System.out.println(verbrauchsgegenstand.toString());
		}
		tvVerbrauchsgegenstaende.setItems(VerbrauchsgegenstandsListe);
	}
}
