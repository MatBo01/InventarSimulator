package itemAnsicht;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import POJO.Ruestung;
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
 * Detailansichstsfenster für Rüstungen
 */
public class ItemAnsichtRuestungController {

	@FXML
	private Text tName;

	@FXML
	private Text tAusruestungsArt;
	
	@FXML
	private Text tRuestungsArt;
	
	@FXML
	private Text tSeltenheit;
	
	@FXML
	private Text tWert;
	
	@FXML
	private Text tVerteidigung;
	
	@FXML
	private Text tGewicht;
	
	@FXML
	private Text tResistenz;
	
	@FXML
	private ImageView ivBild;
	
	@FXML
	private Button btZurueck;
	
	@FXML
	InventarAnsichtController inventarAnsichtController;
	
	/**
	 * Setzt Daten einer Rüstung in die Textfelder der Szene ein
	 * 
	 * @param r - ausgewählte Rüstung
	 * @throws FileNotFoundException - Exception wenn eine Datei nicht gefunden werden kann
	 */
	public void setInformation(Ruestung r) throws FileNotFoundException {
		tName.setText(r.getName());
		tAusruestungsArt.setText(r.getItemArt());
		tRuestungsArt.setText(r.getRuestungsArt());
		tSeltenheit.setText(r.getSeltenheit());
		tWert.setText(""+ r.getWert());
		tVerteidigung.setText(""+ r.getStaerke());
		tGewicht.setText(""+ r.getGewicht());
		tResistenz.setText(r.getElement());
		
		// Setzt je nach RüstungsArt ein anderes Bild in die ImageView ein
		InputStream  stoff = new FileInputStream("img/ruestungen/stoffruestung.png");
		InputStream leder = new FileInputStream("img/ruestungen/lederruestung.png");
		InputStream stahl = new FileInputStream("img/ruestungen/stahlruestung.png");

		Image image = null;
		switch(r.getRuestungsArt()) {
		case "Stoffrüstung":
			System.out.println("1");
			image = new Image(stoff);
			break;
		case "Lederrüstung":
			System.out.println("2");
			image = new Image(leder);
			break;
		case "Stahlrüstung":
			System.out.println("3");
			image = new Image(stahl);
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
