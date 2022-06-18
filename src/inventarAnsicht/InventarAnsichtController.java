package inventarAnsicht;

import java.io.IOException;

import POJO.Item;
import POJO.Ruestung;
import POJO.Verbrauchsgegenstand;
import POJO.Waffe;
import itemAnsicht.ItemAnsichtRuestungController;
import itemAnsicht.ItemAnsichtVerbrauchsgegenstandController;
import itemAnsicht.ItemAnsichtWaffeController;
import itemView.AllesViewController;
import itemView.RuestungViewController;
import itemView.VerbrauchsgegenstandViewController;
import itemView.WaffenViewController;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Die InventarAnicht ist Hauptszene des Programms
 */
public class InventarAnsichtController {

	@FXML
	private TabPane tpItemArten;

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
	private Text tError;

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

	/**
	 * Updated alle Tabellen sobald die Szene geladen wird
	 */
	public void initialize() {
		allesViewController.tvItemsUpdate();
		waffenViewController.tvWaffenUpdate();
		ruestungViewController.tvRuestungsUpdate();
		verbrauchsgegenstandViewController.tvVerbrauchsgegenstaendeUpdate();
	}

	/**
	 * Öffnet das jeweilige ItemAnsicht-Fenster, je nachdem, welche ItemArt ausgewaehlt ist
	 * 
	 * @param event - öffnet die Deteilansicht
	 */
	@FXML
	private void handleButtonItemAnsichtAction(ActionEvent event) {

		// Setzt die Errornachricht zurück, falls Sie aktiv ist
		if (!tError.getText().equals(" ")) {
			tError.setText(" ");
		}

		// Prüft, ob ein Objekt in der "AllesView" ausgewaehlt ist und der Tab "Alles" ausgewaehlt ist
		if (!allesViewController.getTvItems().getSelectionModel().isEmpty() && tbAlles.isSelected()) {

			// Speichert das ausgewahlte Item in einer Variable i
			Item i = allesViewController.getTvItems().getSelectionModel().getSelectedItem();

			// Prüft, ob die "ItemArt" des Items: "Waffe" ist
			if (i.getItemArt().equals("Waffe")) {

				// Laedt die WaffenListe aus der Klasse "WaffenViewController" in eine Observable List
				ObservableList<Waffe> WaffenListe = waffenViewController.getWaffenListe();
				Waffe w = null;

				// Sucht in der WaffenListe eine Waffe w, deren Name mit dem des Items i übereinstimmt
				for (int x = 0; x < WaffenListe.size(); x++) {
					if (WaffenListe.get(x).getName().equals(i.getName())) {
						w = WaffenListe.get(x);
					}
				}

				// Waehlt im Tab "Waffen" die Waffe w aus
				waffenViewController.getTvWaffen().getSelectionModel().select(w);

				// Öffnet die Detailansicht für die Waffe w
				itemAnsichtWaffe();

			} else if (i.getItemArt().equals("Rüstung")) {
				ObservableList<Ruestung> RuestungsListe = ruestungViewController.getRuestungsListe();
				Ruestung r = null;
				for (int x = 0; x < RuestungsListe.size(); x++) {
					if (RuestungsListe.get(x).getName().equals(i.getName())) {
						r = RuestungsListe.get(x);
					}
				}
				ruestungViewController.getTvRuestung().getSelectionModel().select(r);
				itemAnsichtRuestung();

			} else if (i.getItemArt().equals("Verbrauchsgegenstand")) {
				ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandListe = verbrauchsgegenstandViewController
						.getVerbrauchsgegenstandsListe();
				Verbrauchsgegenstand v = null;
				for (int x = 0; x < VerbrauchsgegenstandListe.size(); x++) {
					if (VerbrauchsgegenstandListe.get(x).getName().equals(i.getName())) {
						v = VerbrauchsgegenstandListe.get(x);
					}
				}
				verbrauchsgegenstandViewController.getTvVerbrauchsgegenstaende().getSelectionModel().select(v);
				itemAnsichtVerbrauchsgegenstand();
			}

			// Prüft, ob ein Objekt in der "WaffenView" ausgewählt ist und der Tab "Waffen" ausgewählt ist
		} else if (!waffenViewController.getTvWaffen().getSelectionModel().isEmpty() && tbWaffen.isSelected()) {

			// öffnet die Detailansicht für Waffen
			itemAnsichtWaffe();

		} else if (!ruestungViewController.getTvRuestung().getSelectionModel().isEmpty() && tbRuestungen.isSelected()) {
			itemAnsichtRuestung();
		} else if (!verbrauchsgegenstandViewController.getTvVerbrauchsgegenstaende().getSelectionModel().isEmpty()
				&& tbVerbrauchsgegenstaende.isSelected()) {
			itemAnsichtVerbrauchsgegenstand();
		} else {
			// Zeigt die Errornachricht an
			tError.setText("Kein Item gewählt!");
		}
	}

	private Stage stage;
	private Scene scene;
	private Parent root;

	/**
	 * Öffnet die Stage: ItemAnsicht für die in der Waffentabelle ausgewählten Waffe
	 */
	@FXML
	private void itemAnsichtWaffe() {

		// Speichert die ausgewählte Waffe in einer Variable w
		Waffe w = waffenViewController.getTvWaffen().getSelectionModel().getSelectedItem();
		System.out.println("ItemAnsichtWaffe wird geöffnet!\n");

		try {
			// Lädt die Szene ItemAnsichtWaffe
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/itemAnsicht/ItemAnsichtWaffe.fxml"));
			root = loader.load();
			root.setId("Detailansicht");

			// lädt die ControllerDatei um auf deren Methoden zugreifen zu können
			itemAnsichtWaffeController = loader.getController();
			// setzt Daten der Waffe in die Detailansicht ein
			itemAnsichtWaffeController.setInformation(w);

			stage = new Stage();
			stage.setTitle("Itemansicht");
			scene = new Scene(root, 900, 450);
			Image icon = new Image("file:img/icon/icon.png");
			stage.getIcons().add(icon);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	/**
	 * Öffnet die Stage: ItemAnsicht für die in der Rüstungstabelle ausgewählten Rüstung
	 */
	@FXML
	private void itemAnsichtRuestung() {
		Ruestung r = ruestungViewController.getTvRuestung().getSelectionModel().getSelectedItem();
		System.out.println("ItemAnsichtRuestung wird geöffnet!\n");

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/itemAnsicht/ItemAnsichtRuestung.fxml"));
			root = loader.load();
			root.setId("Detailansicht");

			itemAnsichtRuestungController = loader.getController();
			itemAnsichtRuestungController.setInformation(r);

			stage = new Stage();
			stage.setTitle("Itemansicht");
			scene = new Scene(root, 900, 450);
			Image icon = new Image("file:img/icon/icon.png");
			stage.getIcons().add(icon);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	/**
	 * Öffnet die Stage: ItemAnsicht für den in der Verbrauchsgegenstandstabelle ausgewählten Verbrauchsgegenstand
	 */
	@FXML
	private void itemAnsichtVerbrauchsgegenstand() {
		Verbrauchsgegenstand v = verbrauchsgegenstandViewController.getTvVerbrauchsgegenstaende().getSelectionModel()
				.getSelectedItem();
		System.out.println("ItemAnsichtVerbrauchsgegenstand wird geöffnet!\n");

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/itemAnsicht/ItemAnsichtVerbrauchsgegenstand.fxml"));
			root = loader.load();
			root.setId("Detailansicht");

			itemAnsichtVerbrauchsgegenstandController = loader.getController();
			itemAnsichtVerbrauchsgegenstandController.setInformation(v);

			stage = new Stage();
			stage.setTitle("Itemansicht");
			scene = new Scene(root, 900, 450);
			Image icon = new Image("file:img/icon/icon.png");
			stage.getIcons().add(icon);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	/**
	 * Lädt die Szene Item erstellen in die Stage
	 * 
	 * @param event - öffnet ItemErstellen
	 */
	@FXML
	private void handleButtonItemErstellenAction(ActionEvent event) {
		System.out.println("Item erstellen wird geöffnet\n");

		try {
			// lädt die aktuelle Stage in eine Variable
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();

			// Für erklärung, Siehe: Main.java -> start
			GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/itemErstellen/ItemErstellen.fxml"));
			root.setId("ItemErstellen");
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	/**
	 * Lädt die Szene Item löschen in die Stage
	 * 
	 * @param event - öffnet ItemLöschen
	 */
	@FXML
	private void handleButtonItemLoeschenAction(ActionEvent event) {
		System.out.println("Item löschen wird geöffnet\n");

		try {
			// lädt die aktuelle Stage in eine Variable
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();

			// Für erklärung, Siehe: Main.java -> start
			HBox root = (HBox) FXMLLoader.load(getClass().getResource("/itemLoeschen/ItemsLoeschen.fxml"));
			root.setId("ItemsLoeschen");
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

	/**
	 * Lädt erneut die Szene Hauptmenü in die Stage
	 * 
	 * @param event - öffnet Hauptmenue
	 */
	@FXML
	private void handleButtonHauptmenueAction(ActionEvent event) {
		System.out.println("Hauptmenü wird geöffnet\n");

		try {
			// lädt die aktuelle Stage in eine Variable
			Node source = (Node) event.getSource();
			Stage stage = (Stage) source.getScene().getWindow();
			
			// Für erklärung, Siehe: Main.java -> start
			GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/hauptmenue/Hauptmenue.fxml"));
			root.setId("Hauptmenue");
			Scene scene = new Scene(root, 1600, 900);
			scene.getStylesheets().add(getClass().getResource("/main/application.css").toExternalForm());
			stage.setScene(scene);

		} catch (IOException iOException) {
			System.out.println(iOException.getMessage());
		}
	}

}
