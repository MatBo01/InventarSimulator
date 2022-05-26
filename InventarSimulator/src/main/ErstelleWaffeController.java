package main;

import java.io.IOException;

import POJO.Waffe;
import POJO.Ausruestung;
import POJO.Ausruestung.Element;
import POJO.Item;
import POJO.Item.ItemArt;
import POJO.Item.Seltenheit;
import POJO.Waffe.WaffenArt;
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
	private TextField tfStaerke;

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

	@FXML
	private boolean erstelleWaffe() {

		boolean keineErrors = true;

		WaffenListe.clear();
		ItemListe.clear();

		WaffenListe = DataExchange.getWeaponsFromDb();
		ItemListe = DataExchange.getItemsFromDb();

		Waffe w = new Waffe();
		Item item = new Item();

		w.setItemArt(Item.ItemArt.W);
		item.setItemArt(Item.ItemArt.W);

		// Name-------------------------

		if (tfName.getText().equals("")) {
			System.out.println(tfName.getText());
			tError1.setText("Bitte einen Namen eingeben!");
			keineErrors = false;
		} else {
			w.setName(tfName.getText());
			item.setName(tfName.getText());
			tError1.setText("");
		}

		// Art---------------------------

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
		}else if (tgArt.getSelectedToggle().equals(rbSpeer)) {
			w.setWaffenArt(Waffe.WaffenArt.SP);
		}

		// Seltenheit--------------------

		if (tgSeltenheit.getSelectedToggle().equals(rbNormal)) {
			w.setSeltenheit(Item.Seltenheit.N);
			item.setSeltenheit(Item.Seltenheit.N);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbUngewoehnlich)) {
			w.setSeltenheit(Item.Seltenheit.U);
			item.setSeltenheit(Item.Seltenheit.U);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbSelten)) {
			w.setSeltenheit(Item.Seltenheit.S);
			item.setSeltenheit(Item.Seltenheit.S);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbEpisch)) {
			w.setSeltenheit(Item.Seltenheit.E);
			item.setSeltenheit(Item.Seltenheit.E);
		} else if (tgSeltenheit.getSelectedToggle().equals(rbLegendaer)) {
			w.setSeltenheit(Item.Seltenheit.L);
			item.setSeltenheit(Item.Seltenheit.L);
		}

		// Wert-------------------------

		if (tfWert.getText().equals("")) {
			tError2.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfWert.getText());
				w.setWert(i);
				item.setWert(i);
				tError2.setText("");
			} catch (NumberFormatException e) {
				tError2.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}

		// Stärke-----------------------

		if (tfStaerke.getText().equals("")) {
			tError3.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfStaerke.getText());
				w.setStaerke(i);
				tError3.setText("");
			} catch (NumberFormatException e) {
				tError3.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}

		// Gewicht----------------------

		if (tfGewicht.getText().equals("")) {
			tError4.setText("Bitte nur ganze Zahlen eingeben!");
			keineErrors = false;
		} else {
			try {
				int i = Integer.parseInt(tfGewicht.getText());
				w.setGewicht(i);
				tError4.setText("");
			} catch (NumberFormatException e) {
				tError4.setText("Bitte nur ganze Zahlen eingeben!");
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
				w.setSchnelligkeit(i);
				tError5.setText("");
			} catch (NumberFormatException e) {
				tError5.setText("Bitte nur ganze Zahlen eingeben!");
				keineErrors = false;
			}
		}
		
		// Art---------------------------

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
				}else if (tgElement.getSelectedToggle().equals(rbDunkelheit)) {
					w.setElement(Waffe.Element.D);
				}else if (tgElement.getSelectedToggle().equals(rbHeilig)) {
					w.setElement(Waffe.Element.H);
				}
	
		if(keineErrors) {
			WaffenListe.add(w);	
			ItemListe.add(item);
		}		

		return keineErrors;
	}

	@FXML
	private void handleButtonErstellenAction(ActionEvent event) {
		if (erstelleWaffe()) {
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
		
		for(Waffe waffen: WaffenListe) {
			System.out.println(waffen.toString());
		}
		
		System.out.println();
		
		for(Item items: ItemListe) {
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
