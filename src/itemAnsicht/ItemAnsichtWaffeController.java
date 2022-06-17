package itemAnsicht;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import POJO.Waffe;
import inventarAnsicht.InventarAnsichtController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Detailansichstsfenster für Waffen
 */
public class ItemAnsichtWaffeController {

	@FXML
	private Text tName;

	@FXML
	private Text tAusruestungsArt;

	@FXML
	private Text tWaffenArt;

	@FXML
	private Text tSeltenheit;

	@FXML
	private Text tWert;

	@FXML
	private Text tAngriff;

	@FXML
	private Text tGewicht;

	@FXML
	private Text tElement;

	@FXML
	private Text tSchnelligkeit;

	@FXML
	private ImageView ivBild;

	@FXML
	private Button btZurueck;

	@FXML
	InventarAnsichtController inventarAnsichtController;

	/**
	 * Setzt Daten einer Waffe in die Textfelder der Szene ein
	 * 
	 * @param w - ausgewählte Waffe
	 * @throws FileNotFoundException - Exception wenn eine Datei nicht gefunden werden kann
	 */
	public void setInformation(Waffe w) throws FileNotFoundException {
		tName.setText(w.getName());
		tAusruestungsArt.setText(w.getItemArt());
		tWaffenArt.setText(w.getWaffenArt());
		tSeltenheit.setText(w.getSeltenheit());
		tWert.setText("" + w.getWert());
		tAngriff.setText("" + w.getStaerke());
		tGewicht.setText("" + w.getGewicht());
		tElement.setText(w.getElement());
		tSchnelligkeit.setText("" + w.getWert());

		// Setzt je nach WaffenArt ein anderes Bild in die ImageView ein
		InputStream axt = new FileInputStream("img/waffen/axt.png");
		InputStream bogen = new FileInputStream("img/waffen/bogen.png");
		InputStream dolch = new FileInputStream("img/waffen/dolch.png");
		InputStream grossschwert = new FileInputStream("img/waffen/grossschwert.png");
		InputStream schwert = new FileInputStream("img/waffen/schwert.png");
		InputStream speer = new FileInputStream("img/waffen/speer.png");

		Image image = null;
		switch(w.getWaffenArt()) {
		case "Axt":
			System.out.println("1");
			image = new Image(axt);
			break;
		case "Bogen":
			System.out.println("2");
			image = new Image(bogen);
			break;
		case "Dolch":
			System.out.println("3");
			image = new Image(dolch);
			break;
		case "Großschwert":
			System.out.println("4");
			image = new Image(grossschwert);
			break;
		case "Schwert":
			System.out.println("5");
			image = new Image(schwert);
			break;
		case "Speer":
			System.out.println("6");
			image = new Image(speer);
			break;
		}
		ivBild.setImage(image);
	}

	/**
	 * Schließt das Fenster
	 * 
	 * @param event - Fenster wird geschlossen
	 */
	@FXML
	private void handleButtonZurueckAction(ActionEvent event) {
		System.out.println("Fenster wird geschlossen\n");

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
}
