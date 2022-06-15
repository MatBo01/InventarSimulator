package main;

import java.io.IOException;

import POJO.Waffe;
import POJO.Item;
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

/**
 * "Formular" zum Erstellen einer Waffe
 */
public class ErstelleWaffeController {

	// Name----------------------

	@FXML
	private TextField tfName;

	@FXML
	private Text tError1;

	// Art-----------------------

	@FXML
	private RadioButton rbAxt;

	@FXML
	private RadioButton rbBogen;

	@FXML
	private RadioButton rbDolch;

	@FXML
	private RadioButton rbGrossschwert;

	@FXML
	private RadioButton rbSchwert;

	@FXML
	private RadioButton rbSpeer;

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
	private TextField tfAngriff;

	@FXML
	private Text tError3;

	// Gewicht-------------------

	@FXML
	private TextField tfGewicht;

	@FXML
	private Text tError4;

	// Schnelligkeit-------------

	@FXML
	private TextField tfSchnelligkeit;

	@FXML
	private Text tError5;

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
	private ToggleGroup tgElement;

	// Buttons-------------------

	@FXML
	private Button btErstellen;

	@FXML
	private Button btAbbrechen;

	private ObservableList<Waffe> WaffenListe = FXCollections.observableArrayList();
	private ObservableList<Item> ItemListe = FXCollections.observableArrayList();

	/**
	 * Liest eingaben zum Erstellen einer Waffe ein und speichert diese in die Item-/WaffenListe
	 * 
	 * @return keineErrors - boolean ob es bei den Eingaben einen Fehler gab
	 * @throws IOException
	 */
	@FXML
	private boolean erstelleWaffe() throws IOException {

		boolean keineErrors = true;

		WaffenListe.clear();
		ItemListe.clear();

		// Daten aus DB auslesen
		WaffenListe = DataExchange.getWeaponsFromDb();
		ItemListe = DataExchange.getItemsFromDb();

		Waffe w = new Waffe();
		Item item = new Item();

		// ItemArt wird gespeichert
		w.setItemArt(Waffe.ItemArt.W);
		item.setItemArt(Item.ItemArt.W);

		// Name-------------------------

		for (Item i : ItemListe) {
			if (tfName.getText().equals("")) { // prüft ob das TextFeld leer ist
				tError1.setText("Bitte einen Namen eingeben!");
				keineErrors = false;
			} else if (tfName.getText().contains(",")) { // prüft ob das TextFeld ein Komma enthält
				tError1.setText("Bitte kein ',' benutzen!");
				keineErrors = false;
			} else if (i.getName().equals(tfName.getText())) { // prüft ob der Name schon vorhanden ist
				tError1.setText("Name schon vorhanden!");
				keineErrors = false;
				break;
			} else {
				// Name wird gespeichert
				w.setName(tfName.getText());
				item.setName(tfName.getText());
				tError1.setText("");
			}
		}

		// Art---------------------------

		// prüft, welche Waffenart gewählt wurde, und speicheret sie
		if (tgArt.getSelectedToggle().equals(rbAxt)) {
			w.setWaffenArt(Waffe.WaffenArt.AX);
		} else if (tgArt.getSelectedToggle().equals(rbBogen)) {
			w.setWaffenArt(Waffe.WaffenArt.BO);
		} else if (tgArt.getSelectedToggle().equals(rbDolch)) {
			w.setWaffenArt(Waffe.WaffenArt.DO);
		} else if (tgArt.getSelectedToggle().equals(rbGrossschwert)) {
			w.setWaffenArt(Waffe.WaffenArt.GR);
		} else if (tgArt.getSelectedToggle().equals(rbSchwert)) {
			w.setWaffenArt(Waffe.WaffenArt.SC);
		} else if (tgArt.getSelectedToggle().equals(rbSpeer)) {
			w.setWaffenArt(Waffe.WaffenArt.SP);
		}

		// Seltenheit--------------------

		// prüft, welche Seltenheit gewählt wurde, und speicheret sie
		if (tgSeltenheit.getSelectedToggle().equals(rbNormal)) {
			w.setSeltenheit(Waffe.Seltenheit.N);
			item.setSeltenheit(Item.Seltenheit.N);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbUngewoehnlich)) {
			w.setSeltenheit(Waffe.Seltenheit.U);
			item.setSeltenheit(Item.Seltenheit.U);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbSelten)) {
			w.setSeltenheit(Waffe.Seltenheit.S);
			item.setSeltenheit(Item.Seltenheit.S);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbEpisch)) {
			w.setSeltenheit(Waffe.Seltenheit.E);
			item.setSeltenheit(Item.Seltenheit.E);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbLegendaer)) {
			w.setSeltenheit(Waffe.Seltenheit.L);
			item.setSeltenheit(Item.Seltenheit.L);
		}

		// Wert-------------------------

		if (tfWert.getText().equals("")) { // prüft ob das TextFeld leer ist
			tError2.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfWert.getText()); // prüft ob das TextFeld nur Zahlen enthält
				if (i < 0) { // prüft ob das TextFeld ein negative Zahl enthält
					tError2.setText("Bitte keine negativen Zahlen eingeben!");
					keineErrors = false;
				} else {
					// Wert wird gespeichert
					w.setWert(i);
					item.setWert(i);
					tError2.setText("");
				}
			} catch (NumberFormatException e) {
				tError2.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}

		// Stärke-----------------------

		if (tfAngriff.getText().equals("")) {
			tError3.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfAngriff.getText());
				if (i < 0) {
					tError3.setText("Bitte keine negativen Zahlen eingeben!");
					keineErrors = false;
				} else {
					w.setStaerke(i);
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
					w.setGewicht(i);
					tError4.setText("");
				}
			} catch (NumberFormatException e) {
				tError4.setText("Bitte nur natürliche Zahlen eingeben! (Für Kommazahlen '.' benutzten!)");
				keineErrors = false;
			}
		}

		// Schnelligkeit----------------

		if (tfSchnelligkeit.getText().equals("")) {
			tError5.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfSchnelligkeit.getText());
				if (i < 0) {
					tError5.setText("Bitte keine negativen Zahlen eingeben!");
					keineErrors = false;
				} else {
					w.setSchnelligkeit(i);
					tError5.setText("");
				}
			} catch (NumberFormatException e) {
				tError5.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}

		// Element-----------------------

		// prüft, welches Element gewählt wurde, und speicheret sie
		if (tgElement.getSelectedToggle().equals(rbKeins)) {
			w.setElement(Waffe.Element.K);
		} else if (tgElement.getSelectedToggle().equals(rbFeuer)) {
			w.setElement(Waffe.Element.F);
		} else if (tgElement.getSelectedToggle().equals(rbWasser)) {
			w.setElement(Waffe.Element.W);
		} else if (tgElement.getSelectedToggle().equals(rbErde)) {
			w.setElement(Waffe.Element.E);
		} else if (tgElement.getSelectedToggle().equals(rbLuft)) {
			w.setElement(Waffe.Element.L);
		} else if (tgElement.getSelectedToggle().equals(rbDunkelheit)) {
			w.setElement(Waffe.Element.D);
		} else if (tgElement.getSelectedToggle().equals(rbHeilig)) {
			w.setElement(Waffe.Element.H);
		}

		if (keineErrors) {
			WaffenListe.add(w);
			ItemListe.add(item);
			DataExchange.safeWeaponToDB(w);
		}

		return keineErrors;
	}

	@FXML
	private void handleButtonErstellenAction(ActionEvent event) throws IOException {
		if (erstelleWaffe()) {
			System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

			try {
				Node source = (Node) event.getSource();
				Stage stage = (Stage) source.getScene().getWindow();
				HBox root = (HBox) FXMLLoader.load(getClass().getResource("InventarAnsicht.fxml"));
				root.setId("InventarAnsicht");
				Scene scene = new Scene(root, 1600, 900);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				stage.setScene(scene);

			} catch (IOException iOException) {
				System.out.println(iOException.getMessage());
			}
		}
	}

	@FXML
	private void handleButtonAbbrechenAction(ActionEvent event) {
		System.out.println("Jetzt wird die Inventaransicht geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("InventarAnsicht.fxml"));
			root.setId("InventarAnsicht");
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
}
