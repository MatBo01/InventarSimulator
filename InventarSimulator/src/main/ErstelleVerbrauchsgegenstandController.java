package main;

import java.io.IOException;

import POJO.Item;
import POJO.Verbrauchsgegenstand;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ErstelleVerbrauchsgegenstandController {

	// Name----------------------

	@FXML
	private TextField tfName;

	@FXML
	private Text tError1;

	// Art-----------------------

	@FXML
	private RadioButton rbTrank;

	@FXML
	private RadioButton rbEssen;

	@FXML
	private ToggleGroup tgArt;

	// Seltenheit----------------

	@FXML
	private RadioButton rbNormal;

	@FXML
	private RadioButton rbUngewoehnlich;

	@FXML
	private RadioButton rbSelten;

	@FXML
	private RadioButton rbEpisch;

	@FXML
	private RadioButton rbLegendaer;

	@FXML
	private ToggleGroup tgSeltenheit;

	// Wert----------------------

	@FXML
	private TextField tfWert;

	@FXML
	private Text tError2;

	// Buffs-------------------

	@FXML
	private RadioButton rbHeilung;

	@FXML
	private RadioButton rbAusdauer;

	@FXML
	private RadioButton rbAngriff;

	@FXML
	private RadioButton rbVerteidigung;

	@FXML
	private RadioButton rbGeschwindigkeit;

	@FXML
	private ToggleGroup tgBuffs;

	// Buttons-------------------

	@FXML
	private Button btErstellen;

	@FXML
	private Button btAbbrechen;

	private ObservableList<Verbrauchsgegenstand> VerbrauchsListe = FXCollections.observableArrayList();
	private ObservableList<Item> ItemListe = FXCollections.observableArrayList();

	@FXML
	private boolean erstelleVerbrauchsgegenstand() throws IOException {

		boolean keineErrors = true;

		VerbrauchsListe.clear();
		ItemListe.clear();

		VerbrauchsListe = DataExchange.getConsumablesFromDb();
		ItemListe = DataExchange.getItemsFromDb();

		Verbrauchsgegenstand v = new Verbrauchsgegenstand();
		Item item = new Item();

		v.setItemArt(Verbrauchsgegenstand.ItemArt.V);
		item.setItemArt(Item.ItemArt.V);

		// Name-------------------------

		if (tfName.getText().equals("")) {
			tError1.setText("Bitte einen Namen eingeben!");
			keineErrors = false;
		} else if (tfName.getText().contains(",")) {
			tError1.setText("Bitte kein ',' benutzen!");
			keineErrors = false;
		} else {
			v.setName(tfName.getText());
			item.setName(tfName.getText());
			tError1.setText("");
		}

		// Art---------------------------

		if (tgArt.getSelectedToggle().equals(rbTrank)) {
			v.setVerbrauchsgegenstandsArt(Verbrauchsgegenstand.VerbrauchsgegenstandsArt.T);
		} else if (tgArt.getSelectedToggle().equals(rbEssen)) {
			v.setVerbrauchsgegenstandsArt(Verbrauchsgegenstand.VerbrauchsgegenstandsArt.E);
		}

		// Seltenheit--------------------

		if (tgSeltenheit.getSelectedToggle().equals(rbNormal)) {
			v.setSeltenheit(Verbrauchsgegenstand.Seltenheit.N);
			item.setSeltenheit(Item.Seltenheit.N);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbUngewoehnlich)) {
			v.setSeltenheit(Verbrauchsgegenstand.Seltenheit.U);
			item.setSeltenheit(Item.Seltenheit.U);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbSelten)) {
			v.setSeltenheit(Verbrauchsgegenstand.Seltenheit.S);
			item.setSeltenheit(Item.Seltenheit.S);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbEpisch)) {
			v.setSeltenheit(Verbrauchsgegenstand.Seltenheit.E);
			item.setSeltenheit(Item.Seltenheit.E);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbLegendaer)) {
			v.setSeltenheit(Verbrauchsgegenstand.Seltenheit.L);
			item.setSeltenheit(Item.Seltenheit.L);
		}

		// Wert-------------------------

		if (tfWert.getText().equals("")) {
			tError2.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfWert.getText());
				if (i < 0) {
					tError2.setText("Bitte keine negativen Zahlen eingeben!");
					keineErrors = false;
				} else {
					v.setWert(i);
					item.setWert(i);
					tError2.setText("");
				}
			} catch (NumberFormatException e) {
				tError2.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}

		// Buffs-------------------------

		if (tgBuffs.getSelectedToggle().equals(rbHeilung)) {
			v.setBuffs(Verbrauchsgegenstand.Buffs.HE);
		} else if (tgBuffs.getSelectedToggle().equals(rbAusdauer)) {
			v.setBuffs(Verbrauchsgegenstand.Buffs.AU);
		} else if (tgBuffs.getSelectedToggle().equals(rbAngriff)) {
			v.setBuffs(Verbrauchsgegenstand.Buffs.AN);
		} else if (tgBuffs.getSelectedToggle().equals(rbVerteidigung)) {
			v.setBuffs(Verbrauchsgegenstand.Buffs.VE);
		} else if (tgBuffs.getSelectedToggle().equals(rbGeschwindigkeit)) {
			v.setBuffs(Verbrauchsgegenstand.Buffs.GE);
		}

		if (keineErrors) {
			VerbrauchsListe.add(v);
			ItemListe.add(item);
			DataExchange.safeConsumablesToDB(v);

		}

		return keineErrors;
	}

	@FXML
	private void handleButtonErstellenAction(ActionEvent event) throws IOException {
		if (erstelleVerbrauchsgegenstand()) {
			try {
				Node source = (Node) event.getSource();
				Stage stage = (Stage) source.getScene().getWindow();
				GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("ItemBearbeiten.fxml"));
				Scene scene = new Scene(root, 1600, 900);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);

			} catch (IOException iOException) {
				System.out.println(iOException.getMessage());
			}
		}

		System.out.println("\n\n\n");

		for (Verbrauchsgegenstand verbrauchsgegenstaende : VerbrauchsListe) {
			System.out.println(verbrauchsgegenstaende.toString());
		}

		System.out.println();

		for (Item items : ItemListe) {
			System.out.println(items.toString());
		}
	}

	@FXML
	private void handleButtonAbbrechenAction(ActionEvent event) {
		System.out.println("Item bearbeiten wird geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("ItemBearbeiten.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
}
