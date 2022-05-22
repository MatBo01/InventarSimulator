package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Ruestung;
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

public class RuestungViewController implements Initializable {

	@FXML
	private MenuButton mbSortierung;
	
	@FXML
	private MenuItem miName;
	
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
	private TableColumn<Ruestung, Integer> tcGewicht;
	
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
	private Button btTest;
	
	@FXML
	private void handleButtonDbAuslesenAction(ActionEvent event) {
		tvRuestungsUpdate();
	}
	
	@FXML
	public void tvRuestungsUpdate() {
		
		RuestungsListe.clear();
		// Daten aus DB holen
		RuestungsListe = DataExchange.getArmorFromDb();
		for(Ruestung ruestung: RuestungsListe) {
			System.out.println(ruestung.toString());
		}
		tvRuestung.setItems(RuestungsListe);
	}
}
