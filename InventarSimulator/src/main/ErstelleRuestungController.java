package main;

import java.io.IOException;

import POJO.Item;
import POJO.Ruestung;
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
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ErstelleRuestungController {

	// Name----------------------

	@FXML
	private TextField tfName;

	@FXML
	private Text tError1;

	// Art-----------------------

	@FXML
	private RadioButton rbStoffruestung;

	@FXML
	private RadioButton rbLederruestung;

	@FXML
	private RadioButton rbStahlruestung;

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

	// Stärke--------------------

	@FXML
	private TextField tfVerteidigung;

	@FXML
	private Text tError3;

	// Gewicht-------------------

	@FXML
	private TextField tfGewicht;

	@FXML
	private Text tError4;

	// Element-------------------

	@FXML
	private RadioButton rbKeins;

	@FXML
	private RadioButton rbFeuer;

	@FXML
	private RadioButton rbWasser;

	@FXML
	private RadioButton rbErde;

	@FXML
	private RadioButton rbLuft;

	@FXML
	private RadioButton rbDunkelheit;

	@FXML
	private RadioButton rbHeilig;

	@FXML
	private ToggleGroup tgResistenz;

	// Buttons-------------------

	@FXML
	private Button btErstellen;

	@FXML
	private Button btAbbrechen;

	private ObservableList<Ruestung> RuestungsListe = FXCollections.observableArrayList();
	private ObservableList<Item> ItemListe = FXCollections.observableArrayList();

	@FXML
	private boolean erstelleRuestung() throws IOException {

		boolean keineErrors = true;

		RuestungsListe.clear();
		ItemListe.clear();

		RuestungsListe = DataExchange.getArmorFromDb();
		ItemListe = DataExchange.getItemsFromDb();

		Ruestung r = new Ruestung();
		Item item = new Item();

		r.setItemArt(Ruestung.ItemArt.R);
		item.setItemArt(Item.ItemArt.R);

		// Name-------------------------

		if (tfName.getText().equals("")) {
			tError1.setText("Bitte einen Namen eingeben!");
			keineErrors = false;
		} else if (tfName.getText().contains(",")) {
			tError1.setText("Bitte kein ',' benutzen!");
			keineErrors = false;
		} else {
			r.setName(tfName.getText());
			item.setName(tfName.getText());
			tError1.setText("");
		}

		// Art---------------------------

		if (tgArt.getSelectedToggle().equals(rbStoffruestung)) {
			r.setRuestungsArt(Ruestung.RuestungsArt.STO);
		} else if (tgArt.getSelectedToggle().equals(rbLederruestung)) {
			r.setRuestungsArt(Ruestung.RuestungsArt.LED);
		} else if (tgArt.getSelectedToggle().equals(rbStahlruestung)) {
			r.setRuestungsArt(Ruestung.RuestungsArt.STA);
		}

		// Seltenheit--------------------

		if (tgSeltenheit.getSelectedToggle().equals(rbNormal)) {
			r.setSeltenheit(Ruestung.Seltenheit.N);
			item.setSeltenheit(Item.Seltenheit.N);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbUngewoehnlich)) {
			r.setSeltenheit(Ruestung.Seltenheit.U);
			item.setSeltenheit(Item.Seltenheit.U);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbSelten)) {
			r.setSeltenheit(Ruestung.Seltenheit.S);
			item.setSeltenheit(Item.Seltenheit.S);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbEpisch)) {
			r.setSeltenheit(Ruestung.Seltenheit.E);
			item.setSeltenheit(Item.Seltenheit.E);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbLegendaer)) {
			r.setSeltenheit(Ruestung.Seltenheit.L);
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
					r.setWert(i);
					item.setWert(i);
					tError2.setText("");
				}
			} catch (NumberFormatException e) {
				tError2.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}

		// Stärke-----------------------

		if (tfVerteidigung.getText().equals("")) {
			tError3.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfVerteidigung.getText());
				if (i < 0) {
					tError3.setText("Bitte keine negativen Zahlen eingeben!");
					keineErrors = false;
				} else {
					r.setStaerke(i);
					tError3.setText("");
				}
			} catch (NumberFormatException e) {
				tError3.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}

		// Gewicht----------------------

		if (tfGewicht.getText().equals("")) {
			tError4.setText("Bitte nur natürliche Zahlen eingeben! (Für Kommazahlen '.' benutzten!)");
			keineErrors = false;
		} else {
			try {
				double i = Double.parseDouble(tfGewicht.getText());
				if (i < 0) {
					tError4.setText("Bitte keine negativen Zahlen eingeben!");
					keineErrors = false;
				} else {
					r.setGewicht(i);
					tError4.setText("");
				}
			} catch (NumberFormatException e) {
				tError4.setText("Bitte nur natürliche Zahlen eingeben! (Für Kommazahlen '.' benutzten!)");
				keineErrors = false;
			}
		}

		// Element-----------------------

		if (tgResistenz.getSelectedToggle().equals(rbKeins)) {
			r.setElement(Ruestung.Element.K);
		} else if (tgResistenz.getSelectedToggle().equals(rbFeuer)) {
			r.setElement(Ruestung.Element.F);
		} else if (tgResistenz.getSelectedToggle().equals(rbWasser)) {
			r.setElement(Ruestung.Element.W);
		} else if (tgResistenz.getSelectedToggle().equals(rbErde)) {
			r.setElement(Ruestung.Element.E);
		} else if (tgResistenz.getSelectedToggle().equals(rbLuft)) {
			r.setElement(Ruestung.Element.L);
		} else if (tgResistenz.getSelectedToggle().equals(rbDunkelheit)) {
			r.setElement(Ruestung.Element.D);
		} else if (tgResistenz.getSelectedToggle().equals(rbHeilig)) {
			r.setElement(Ruestung.Element.H);
		}

		if (keineErrors) {
			RuestungsListe.add(r);
			ItemListe.add(item);
			DataExchange.safeArmorToDB(r);
		}

		return keineErrors;
	}

	@FXML
	private void handleButtonErstellenAction(ActionEvent event) throws IOException {
		if (erstelleRuestung()) {
			System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

			try {
				Node source = (Node) event.getSource();
				Stage stage = (Stage) source.getScene().getWindow();
				HBox root = (HBox) FXMLLoader.load(getClass().getResource("InventarAnsicht.fxml"));
				Scene scene = new Scene(root, 1600, 900);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);
				
			} catch (IOException iOException) {
				System.out.println(iOException.getMessage());
			}
		}

		System.out.println("\n\n\n");

		for (Ruestung ruestungen : RuestungsListe) {
			System.out.println(ruestungen.toString());
		}

		System.out.println();

		for (Item items : ItemListe) {
			System.out.println(items.toString());
		}
	}

	@FXML
	private void handleButtonAbbrechenAction(ActionEvent event) {
		System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("InventarAnsicht.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			
		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
}
