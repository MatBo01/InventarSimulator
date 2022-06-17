package dataExchange;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import POJO.Ausruestung.Element;
import POJO.Item;
import POJO.Item.ItemArt;
import POJO.Item.Seltenheit;
import POJO.Ruestung;
import POJO.Ruestung.RuestungsArt;
import POJO.Verbrauchsgegenstand;
import POJO.Verbrauchsgegenstand.Buffs;
import POJO.Verbrauchsgegenstand.VerbrauchsgegenstandsArt;
import POJO.Waffe;
import POJO.Waffe.WaffenArt;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Methoden für den Daten-Austausch zwischen Programm und DatenBank (.txt Datei)
 */
public class DataExchange {

	// Item-Liste laden -----------------------------------

	/**
	 * Ließt alle Items aus der Textdatei Items.txt aus und speichert sie als Objekte in einer ObservableList
	 * 
	 * @return - ItemListe in der alle Items gespeichert sind
	 */
	public static ObservableList<Item> getItemsFromDb() {

		// ObservableList in der Objekte(Items) gespeichert werden können, wird erstellt
		ObservableList<Item> ItemListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neues Item wird erstellt
				Item i = new Item();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				// jeweilige Werte des Arrays werden in dazugehörige Parameter des Items gespeichert
				i.setItemArt(ItemArt.valueOf(spalten[0]));
				i.setName(spalten[1]);
				i.setSeltenheit(Seltenheit.valueOf(spalten[2]));
				i.setWert(Integer.parseInt(spalten[3]));

				// Item wird der ObservableList hinzugefügt
				ItemListe.add(i);
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return ItemListe;
	}

	// Waffen-Liste laden ---------------------------------

	/**
	 * Ließt alle Waffen aus der Textdatei Items.txt aus und speichert sie als Objekte in einer ObservableList
	 * 
	 * @return - WaffenListe in der alle Waffen gespeichert sind
	 */
	public static ObservableList<Waffe> getWeaponsFromDb() {
		// ObservableList in der Objekte(Waffen) gespeichert werden können, wird erstellt
		ObservableList<Waffe> WaffenListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neue Waffe wird erstellt
				Waffe w = new Waffe();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				if (ItemArt.valueOf(spalten[0]) != ItemArt.W) {
					continue;
				}

				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Waffe gespeichert
				w.setItemArt(ItemArt.valueOf(spalten[0]));
				w.setName(spalten[1]);
				w.setSeltenheit(Seltenheit.valueOf(spalten[2]));
				w.setWert(Integer.parseInt(spalten[3]));
				w.setStaerke(Integer.parseInt(spalten[4]));
				w.setGewicht(Double.parseDouble(spalten[5]));
				w.setElement(Element.valueOf(spalten[6]));
				w.setSchnelligkeit(Integer.parseInt(spalten[7]));
				w.setWaffenArt(WaffenArt.valueOf(spalten[8]));

				// Waffe wird der ObservableList hinzugefügt
				WaffenListe.add(w);
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return WaffenListe;
	}

	// Rüstungs-Liste laden -----------------------------

	/**
	 * Ließt alle Rüstungen aus der Textdatei Items.txt aus und speichert sie als Objekte in einer ObservableList
	 * 
	 * @return - RuestungsListe in der alle Waffen gespeichert sind
	 */
	public static ObservableList<Ruestung> getArmorFromDb() {
		// ObservableList in der Objekte(Rüstungen) gespeichert werden können, wird erstellt
		ObservableList<Ruestung> RuestungsListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neue Rüstung wird erstellt
				Ruestung r = new Ruestung();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				if (ItemArt.valueOf(spalten[0]) != ItemArt.R) {
					continue;
				}

				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Rüstung gespeichert
				r.setItemArt(ItemArt.valueOf(spalten[0]));
				r.setName(spalten[1]);
				r.setSeltenheit(Seltenheit.valueOf(spalten[2]));
				r.setWert(Integer.parseInt(spalten[3]));
				r.setStaerke(Integer.parseInt(spalten[4]));
				r.setGewicht(Double.parseDouble(spalten[5]));
				r.setElement(Element.valueOf(spalten[6]));
				r.setRuestungsArt(RuestungsArt.valueOf(spalten[7]));

				// Rüstung wird der ObservableList hinzugefügt
				RuestungsListe.add(r);
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return RuestungsListe;
	}

	// Verbrauchsgegenstands-Liste laden ------------

	/**
	 * Ließt alle Verbrauchsgegenstände aus der Textdatei Items.txt aus und speichert sie als Objekte in einer ObservableList
	 * 
	 * @return - VerbrauchsgegenstandsListe in der alle Waffen gespeichert sind
	 */
	public static ObservableList<Verbrauchsgegenstand> getConsumablesFromDb() {
		// ObservableList in der Objekte(Verbrauchsgegenstände) gespeichert werden können, wird erstellt
		ObservableList<Verbrauchsgegenstand> VerbrauchsListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neuer Verbrauchsgegenstand wird erstellt
				Verbrauchsgegenstand v = new Verbrauchsgegenstand();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				if (ItemArt.valueOf(spalten[0]) != ItemArt.V) {
					continue;
				}

				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Verbrauchsgegenstände gespeichert
				v.setItemArt(ItemArt.valueOf(spalten[0]));
				v.setName(spalten[1]);
				v.setSeltenheit(Seltenheit.valueOf(spalten[2]));
				v.setWert(Integer.parseInt(spalten[3]));
				v.setBuffs(Buffs.valueOf(spalten[4]));
				v.setVerbrauchsgegenstandsArt(VerbrauchsgegenstandsArt.valueOf(spalten[5]));

				// Verbrauchsgegenstand wird der ObservableList hinzugefügt
				VerbrauchsListe.add(v);
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return VerbrauchsListe;
	}

	// Waffen-Liste speichern ---------------------------------

	/**
	 * Speichert eine Waffe w in die Datenbank (Item.txt Datei)
	 * 
	 * @param w - Objekt: Waffe das in die Datenbank gespeichert wird
	 * @throws IOException - Exception falls die Datei nicht geöffnet werden kann
	 */
	public static void safeWeaponToDB(Waffe w) throws IOException {

		// Setzt für Variable seltenheit das Enum des jeweiligen Strings ein
		String seltenheit = "";
		switch (w.getSeltenheit()) {
		case "Normal":
			seltenheit = ",N,";
			break;
		case "Ungewöhnlich":
			seltenheit = ",U,";
			break;
		case "Selten":
			seltenheit = ",S,";
			break;
		case "Episch":
			seltenheit = ",E,";
			break;
		case "Legendär":
			seltenheit = ",L,";
			break;
		}

		// Setzt für Variable element das Enum des jeweiligen Strings ein
		String element = "";
		switch (w.getElement()) {
		case " - ":
			element = ",K,";
			break;
		case "Feuer":
			element = ",F,";
			break;
		case "Wasser":
			element = ",W,";
			break;
		case "Erde":
			element = ",E,";
			break;
		case "Luft":
			element = ",L,";
			break;
		case "Dunkelheit":
			element = ",D,";
			break;
		case "Heilig":
			element = ",H,";
			break;
		}

		// Setzt für Variable waffenArt das Enum des jeweiligen Strings ein
		String waffenArt = "";
		switch (w.getWaffenArt()) {
		case "Axt":
			waffenArt = ",AX";
			break;
		case "Bogen":
			waffenArt = ",BO";
			break;
		case "Dolch":
			waffenArt = ",DO";
			break;
		case "Großschwert":
			waffenArt = ",GR";
			break;
		case "Schwert":
			waffenArt = ",SC";
			break;
		case "Speer":
			waffenArt = ",SP";
			break;
		}

		// Schreibt einen String für die Waffe ans Ende des Textdokuments
		try (FileWriter f = new FileWriter("Items.txt", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {

			p.println("W," + w.getName() + seltenheit + w.getWert() + "," + w.getStaerke() + "," + w.getGewicht()
					+ element + w.getSchnelligkeit() + waffenArt);

		} catch (FileNotFoundException i) {
			i.printStackTrace();
		}
	}

	// Rüstungs-Liste speichern ---------------------------------

	/**
	 * Speichert eine Rüstung r in die Datenbank (Item.txt Datei)
	 * 
	 * @param r - Objekt: Rüstung das in die Datenbank gespeichert wird
	 * @throws IOException - Exception falls die Datei nicht geöffnet werden kann
	 */
	public static void safeArmorToDB(Ruestung r) throws IOException {

		// Setzt für Variable seltenheit das Enum des jeweiligen Strings ein
		String seltenheit = "";
		switch (r.getSeltenheit()) {
		case "Normal":
			seltenheit = ",N,";
			break;
		case "Ungewöhnlich":
			seltenheit = ",U,";
			break;
		case "Selten":
			seltenheit = ",S,";
			break;
		case "Episch":
			seltenheit = ",E,";
			break;
		case "Legendär":
			seltenheit = ",L,";
			break;
		}

		// Setzt für Variable element das Enum des jeweiligen Strings ein
		String element = "";
		switch (r.getElement()) {
		case " - ":
			element = ",K,";
			break;
		case "Feuer":
			element = ",F,";
			break;
		case "Wasser":
			element = ",W,";
			break;
		case "Erde":
			element = ",E,";
			break;
		case "Luft":
			element = ",L,";
			break;
		case "Dunkelheit":
			element = ",D,";
			break;
		case "Heilig":
			element = ",H,";
			break;
		}

		// Setzt für Variable ruestungsArt das Enum des jeweiligen Strings ein
		String ruestungsArt = "";
		switch (r.getRuestungsArt()) {
		case "Stoffrüstung":
			ruestungsArt = "STO";
			break;
		case "Lederrüstung":
			ruestungsArt = "LED";
			break;
		case "Stahlrüstung":
			ruestungsArt = "STA";
			break;
		}

		// Schreibt einen String für die Rüstung ans Ende des Textdokuments
		try (FileWriter f = new FileWriter("Items.txt", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {

			p.println("R," + r.getName() + seltenheit + r.getWert() + "," + r.getStaerke() + "," + r.getGewicht()
					+ element + ruestungsArt);

		} catch (FileNotFoundException i) {
			i.printStackTrace();
		}
	}

	// Verbrauchsgegenstands-Liste speichern ---------------------------------

	/**
	 * Speichert einen Verbrauchsgegenstand v in die Datenbank (Item.txt Datei)
	 * 
	 * @param v - Objekt: Verbrauchsgegenstand das in die Datenbank gespeichert wird
	 * @throws IOException - Exception falls die Datei nicht geöffnet werden kann
	 */
	public static void safeConsumablesToDB(Verbrauchsgegenstand v) throws IOException {

		// Setzt für Variable seltenheit das Enum des jeweiligen Strings ein
		String seltenheit = "";
		switch (v.getSeltenheit()) {
		case "Normal":
			seltenheit = ",N,";
			break;
		case "Ungewöhnlich":
			seltenheit = ",U,";
			break;
		case "Selten":
			seltenheit = ",S,";
			break;
		case "Episch":
			seltenheit = ",E,";
			break;
		case "Legendär":
			seltenheit = ",L,";
			break;
		}

		// Setzt für Variable buffs das Enum des jeweiligen Strings ein
		String buffs = "";
		switch (v.getBuffs()) {
		case "Heilung":
			buffs = ",HE,";
			break;
		case "Ausdauerregeneration":
			buffs = ",AU,";
			break;
		case "Verteidigungserhöhung":
			buffs = ",VE,";
			break;
		case "Angriffserhöhung":
			buffs = ",AN,";
			break;
		case "Geschwindigkeitserhöhung":
			buffs = ",GE,";
			break;
		}

		// Setzt für Variable verbrauchsArt das Enum des jeweiligen Strings ein
		String verbrauchsArt = "";
		switch (v.getVerbrauchsgegenstandsArt()) {
		case "Essen":
			verbrauchsArt = "E";
			break;
		case "Trank":
			verbrauchsArt = "T";
			break;
		}

		// Schreibt einen String für die Rüstung ans Ende des Textdokuments
		try (FileWriter f = new FileWriter("Items.txt", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {

			p.println("V," + v.getName() + seltenheit + v.getWert() + buffs + verbrauchsArt);

		} catch (FileNotFoundException i) {
			i.printStackTrace();
		}
	}

	// Item löschen -------------------------------------------------------------
	
	/**
	 * Löscht ein Item i aus der Datenbank (Item.txt Datei)
	 * 
	 * @param i - Objekt: Item, welche gelöscht werden soll
	 * @throws FileNotFoundException - Exception wenn eine Datei nicht gefunden werden kann
	 * @throws IOException - Exception falls die Datei nicht geöffnet werden kann
	 */
	public static void itemLoeschen(Item i) throws FileNotFoundException, IOException {

		
		File items = new File("Items.txt"); // Datei Items.txt wird ins Programm geladen
		File tempItems = new File("TempItems.txt"); // Datei TempItems.txt wird ins Programm geladen

		BufferedReader itemsReader = new BufferedReader(new FileReader(items));
		BufferedWriter itemsWriter = new BufferedWriter(new FileWriter(tempItems));

		String loeschenZeile = i.toString(); // Zeile die gelöscht werden soll
		String aktuelleZeile;

		while ((aktuelleZeile = itemsReader.readLine()) != null) { // geht Items.txt durch, bis keine Einträge mehr vorhanden sind
			Item vergleichsItem = new Item(); // Item für den Vergleich mit loeschenZeile

			String[] spalten = aktuelleZeile.split(","); // String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert

			// Daten der aktuellen Zeile werden ins Vergleichsitem gespeichert
			vergleichsItem.setItemArt(ItemArt.valueOf(spalten[0]));
			vergleichsItem.setName(spalten[1]);
			vergleichsItem.setSeltenheit(Seltenheit.valueOf(spalten[2]));
			vergleichsItem.setWert(Integer.parseInt(spalten[3]));

			// Alle jede Zeile die nicht mit der loeschenZeile übereinstimmen, werden in TempItems.txt geschrieben
			if (vergleichsItem.toString().equals(loeschenZeile)) {
				continue;
			}
			itemsWriter.write(aktuelleZeile + "\n");
		}

		itemsReader.close();
		itemsWriter.close();

		// Items.txt wird gelöscht und TempItems.txt wird in Items.txt umbenannt
		items.delete();
		tempItems.renameTo(items);
	}
}
