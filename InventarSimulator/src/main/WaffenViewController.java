package main;

import java.net.URL;
import java.util.ResourceBundle;

import POJO.Waffe;
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

public class WaffenViewController implements Initializable {

	@FXML
	private MenuButton mbSortierung;
	
	@FXML
	private MenuItem miName;
	
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
	private TableColumn<Waffe, Integer> tcGewicht;
	
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
	private Button btTest;
	
	@FXML
	private void handleButtonDbAuslesenAction(ActionEvent event) {
		tvWaffenUpdate();
	}
	
	@FXML
	public void tvWaffenUpdate() {
		
		WaffenListe.clear();
		// Daten aus DB holen
		WaffenListe = DataExchange.getWeaponsFromDb();
		for(Waffe waffen: WaffenListe) {
			System.out.println(waffen.toString());
		}
		tvWaffen.setItems(WaffenListe);
	}
}
