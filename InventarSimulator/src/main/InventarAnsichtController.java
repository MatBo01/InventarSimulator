package main;

import java.io.IOException;

import POJO.Item;
import POJO.Ruestung;
import POJO.Verbrauchsgegenstand;
import POJO.Waffe;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class InventarAnsichtController {

	@FXML
	private Tab tbAlles;
	
	@FXML
	private Tab tbWaffen;
	
	@FXML
	private Tab tbRuestungen;
	
	@FXML
	private Tab tbVerbrauchsgegenstaende;
	
	@FXML
	private Button btItemAnsicht;

	@FXML
	private Button btItemErstellen;

	@FXML
	private Button btItemLoeschen;

	@FXML
	private Button btHauptmenue;

	@FXML
	AllesViewController allesViewController;

	@FXML
	WaffenViewController waffenViewController;

	@FXML
	RuestungViewController ruestungViewController;

	@FXML
	VerbrauchsgegenstandViewController verbrauchsgegenstandViewController;

	@FXML
	ItemAnsichtWaffeController itemAnsichtWaffeController;
	
	@FXML
	ItemAnsichtRuestungController itemAnsichtRuestungController;
	
	@FXML
	ItemAnsichtVerbrauchsgegenstandController itemAnsichtVerbrauchsgegenstandController;
	
	@FXML
	InventarAnsichtController inventarAnsichtController;

	public void initialize() {
		allesViewController.tvItemsUpdate();
		waffenViewController.tvWaffenUpdate();
		ruestungViewController.tvRuestungsUpdate();
		verbrauchsgegenstandViewController.tvVerbrauchsgegenstaendeUpdate();
	}

	public void UpdateTable() {
		allesViewController.tvItemsUpdate();
		waffenViewController.tvWaffenUpdate();
		ruestungViewController.tvRuestungsUpdate();
		verbrauchsgegenstandViewController.tvVerbrauchsgegenstaendeUpdate();
	}
	
	@FXML
	private void handleButtonItemAnsichtAction(ActionEvent event) {

			if(!allesViewController.getTvItems().getSelectionModel().isEmpty() && tbAlles.isSelected()) {
				Item i = allesViewController.getTvItems().getSelectionModel().getSelectedItem();
				if(i.getItemArt().equals("Waffe")) {
					ObservableList<Waffe> WaffenListe = waffenViewController.getWaffenListe();
					Waffe w = null;
					for(int x = 0; x < WaffenListe.size(); x++) {
						if (WaffenListe.get(x).getName().equals(i.getName())) {
							w = WaffenListe.get(x);
						}
					}
					waffenViewController.getTvWaffen().getSelectionModel().select(w);
					itemAnsichtWaffe();
				}else if(i.getItemArt().equals("Rüstung")) {
					ObservableList<Ruestung> RuestungsListe = ruestungViewController.getRuestungsListe();
					Ruestung r = null;
					for(int x = 0; x < RuestungsListe.size(); x++) {
						if (RuestungsListe.get(x).getName().equals(i.getName())) {
							r = RuestungsListe.get(x);
						}
					}
					ruestungViewController.getTvRuestung().getSelectionModel().select(r);
					itemAnsichtRuestung();
				}else if(i.getItemArt().equals("Verbrauchsgegenstand")) {
					ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandListe = verbrauchsgegenstandViewController.getVerbrauchsgegenstandsListe();
					Verbrauchsgegenstand v = null;
					for(int x = 0; x < VerbrauchsgegenstandListe.size(); x++) {
						if (VerbrauchsgegenstandListe.get(x).getName().equals(i.getName())) {
							v = VerbrauchsgegenstandListe.get(x);
						}
					}
					verbrauchsgegenstandViewController.getTvVerbrauchsgegenstaende().getSelectionModel().select(v);
					itemAnsichtVerbrauchsgegenstand();
				}
			}else if(!waffenViewController.getTvWaffen().getSelectionModel().isEmpty() && tbWaffen.isSelected()){
				itemAnsichtWaffe();
			}else if(!ruestungViewController.getTvRuestung().getSelectionModel().isEmpty() && tbRuestungen.isSelected()) {
				itemAnsichtRuestung();
			}else if(!verbrauchsgegenstandViewController.getTvVerbrauchsgegenstaende().getSelectionModel().isEmpty() && tbVerbrauchsgegenstaende.isSelected()) {
				itemAnsichtVerbrauchsgegenstand();
				verbrauchsgegenstandViewController.getTvVerbrauchsgegenstaende().getSelectionModel().clearSelection();
			}else {
				System.out.println("Kein Item gewählt!");
			}	
			
	}


	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
	private void itemAnsichtWaffe() {
		Waffe w = waffenViewController.getTvWaffen().getSelectionModel().getSelectedItem();
		System.out.println("ItemAnsichtWaffe wird geöffnet!\n");

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ItemAnsichtWaffe.fxml"));
			root = loader.load();
			
			itemAnsichtWaffeController = loader.getController();
			itemAnsichtWaffeController.setInformation(w);
			
			stage = new Stage();
			stage.setTitle("Itemansicht");
			scene = new Scene(root, 900, 450);
			stage.setScene(scene);
			stage.getScene().getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.show();

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
	
	@FXML
	private void itemAnsichtRuestung() {
		Ruestung r = ruestungViewController.getTvRuestung().getSelectionModel().getSelectedItem();
		System.out.println("ItemAnsichtRuestung wird geöffnet!\n");

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ItemAnsichtRuestung.fxml"));
			root = loader.load();
			
			itemAnsichtRuestungController = loader.getController();
			itemAnsichtRuestungController.setInformation(r);
			
			stage = new Stage();
			stage.setTitle("Itemansicht");
			scene = new Scene(root, 900, 450);
			stage.setScene(scene);
			stage.getScene().getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.show();

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}
	
	@FXML
	private void itemAnsichtVerbrauchsgegenstand() {
		Verbrauchsgegenstand v = verbrauchsgegenstandViewController.getTvVerbrauchsgegenstaende().getSelectionModel().getSelectedItem();
		System.out.println("ItemAnsichtVerbrauchsgegenstand wird geöffnet!\n");

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ItemAnsichtVerbrauchsgegenstand.fxml"));
			root = loader.load();
			
			itemAnsichtVerbrauchsgegenstandController = loader.getController();
			itemAnsichtVerbrauchsgegenstandController.setInformation(v);
			
			stage = new Stage();
			stage.setTitle("Itemansicht");
			scene = new Scene(root, 900, 450);
			stage.setScene(scene);
			stage.getScene().getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.show();

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	@FXML
	private void handleButtonItemErstellenAction(ActionEvent event) {
		System.out.println("Item erstellen wird geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("ItemErstellen.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	@FXML
	private void handleButtonItemLoeschenAction(ActionEvent event) {
		System.out.println("Item löschen wird geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("ItemsLoeschen.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	@FXML
	private void handleButtonHauptmenueAction(ActionEvent event) {
		System.out.println("Hauptmenü wird geöffnet\n");

		try {
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("Hauptmenue.fxml"));
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

}
