package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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

public class DataExchange {

	// Item-Liste laden -----------------------------------

	public static ObservableList<Item> getItemsFromDb() {
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Item> ItemListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neue Person wird erstellt
				Item i = new Item();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Person gespeichert
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

	public static ObservableList<Waffe> getWeaponsFromDb() {
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Waffe> WaffenListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neue Person wird erstellt
				Waffe w = new Waffe();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				if (ItemArt.valueOf(spalten[0]) != ItemArt.W) {
					continue;
				}

				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Person gespeichert
				w.setItemArt(ItemArt.valueOf(spalten[0]));
				w.setName(spalten[1]);
				w.setSeltenheit(Seltenheit.valueOf(spalten[2]));
				w.setWert(Integer.parseInt(spalten[3]));
				w.setStaerke(Integer.parseInt(spalten[4]));
				w.setGewicht(Integer.parseInt(spalten[5]));
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

	public static ObservableList<Ruestung> getArmorFromDb() {
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Ruestung> RuestungsListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neue Person wird erstellt
				Ruestung r = new Ruestung();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				if (ItemArt.valueOf(spalten[0]) != ItemArt.R) {
					continue;
				}

				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Person gespeichert
				r.setItemArt(ItemArt.valueOf(spalten[0]));
				r.setName(spalten[1]);
				r.setSeltenheit(Seltenheit.valueOf(spalten[2]));
				r.setWert(Integer.parseInt(spalten[3]));
				r.setStaerke(Integer.parseInt(spalten[4]));
				r.setGewicht(Integer.parseInt(spalten[5]));
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

	public static ObservableList<Verbrauchsgegenstand> getConsumablesFromDb() {
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Verbrauchsgegenstand> VerbrauchsListe = FXCollections.observableArrayList();

		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);

			while (s.hasNext()) {
				// neue Person wird erstellt
				Verbrauchsgegenstand v = new Verbrauchsgegenstand();

				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();

				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");

				if (ItemArt.valueOf(spalten[0]) != ItemArt.V) {
					continue;
				}

				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Person gespeichert
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

	public static void safeWeaponToDB(Waffe w) throws IOException {

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

	public static void safeArmorToDB(Ruestung r) throws IOException {

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

	public static void safeConsumablesToDB(Verbrauchsgegenstand v) throws IOException {

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

		String verbrauchsArt = "";
		switch (v.getVerbrauchsgegenstandsArt()) {
		case "Essen":
			verbrauchsArt = "E";
			break;
		case "Trank":
			verbrauchsArt = "T";
			break;
		}

		try (FileWriter f = new FileWriter("Items.txt", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);) {

			p.println("V," + v.getName() + seltenheit + v.getWert()	+ buffs + verbrauchsArt);

		} catch (FileNotFoundException i) {
			i.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ObservableList<Waffe> WaffenListe = FXCollections.observableArrayList();
		WaffenListe = getWeaponsFromDb();
		System.out.println(WaffenListe.isEmpty());
		for (Waffe waffen : WaffenListe) {
			System.out.println(waffen.toString());
		}

		System.out.println();

		ObservableList<Ruestung> RuestungsListe = FXCollections.observableArrayList();
		RuestungsListe = getArmorFromDb();
		System.out.println(RuestungsListe.isEmpty());
		for (Ruestung ruestungen : RuestungsListe) {
			System.out.println(ruestungen.toString());
		}

		System.out.println();

		ObservableList<Verbrauchsgegenstand> VerbrauchsListe = FXCollections.observableArrayList();
		VerbrauchsListe = getConsumablesFromDb();
		System.out.println(VerbrauchsListe.isEmpty());
		for (Verbrauchsgegenstand verbrauchsgegenstaende : VerbrauchsListe) {
			System.out.println(verbrauchsgegenstaende.toString());
		}

		System.out.println();

		ObservableList<Item> ItemListe = FXCollections.observableArrayList();
		ItemListe = getItemsFromDb();
		System.out.println(VerbrauchsListe.isEmpty());
		for (Item item : ItemListe) {
			System.out.println(item.toString());
		}
	}
}
