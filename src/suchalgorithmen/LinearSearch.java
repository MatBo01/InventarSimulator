package suchalgorithmen;

import POJO.*;
import javafx.collections.ObservableList;

/**
 * Linear-Suche Suchalgorithmus für jeden Item-Typ aus den ObservableLists, Vergleicht nur Strings und gibt eine Liste mit Ergebnissen zurück
 */
public class LinearSearch {

	/**
	 * Vergleicht Eingabe mit jedem Wert aus der Item-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * @param ItemListe - ObservableList in der Items aus der "Alles"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde.
	 * @return ItemListe - Gibt eine modifierte Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Item> alles(ObservableList<Item> ItemListe, String eingabe) {
		for (int i = 0; i < ItemListe.size(); i++) {
			if (ItemListe.get(i).toString().toLowerCase().contains(eingabe.toLowerCase())) {
				ItemListe.set(i, ItemListe.get(i));
			}

			else {
				ItemListe.remove(i);
				i--;
			}
		}
		return ItemListe;
	}

	/**
	 * Vergleicht Eingabe mit jedem Wert aus der Ruestung-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * @param RuestungsListe - ObservableList in der Ruestungen aus der "Ruestung"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde.
	 * @return RuestungsListe - Gibt eine modifierte Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Ruestung> ruestung(ObservableList<Ruestung> RuestungsListe, String eingabe) {
		for (int i = 0; i < RuestungsListe.size(); i++) {
			if (RuestungsListe.get(i).toString().toLowerCase().contains(eingabe.toLowerCase())) {
				RuestungsListe.set(i, RuestungsListe.get(i));
			}

			else {
				RuestungsListe.remove(i);
				i--;
			}
		}
		return RuestungsListe;
	}

	/**
	 * Vergleicht Eingabe mit jedem Wert aus der Waffen-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * @param WaffenListe - ObservableList in der Waffen aus der "Waffen"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde.
	 * @return WaffenListe - Gibt eine modifierte Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Waffe> waffe(ObservableList<Waffe> WaffenListe, String eingabe) {
		for (int i = 0; i < WaffenListe.size(); i++) {
			if (WaffenListe.get(i).toString().toLowerCase().contains(eingabe.toLowerCase())) {
				WaffenListe.set(i, WaffenListe.get(i));
			}

			else {
				WaffenListe.remove(i);
				i--;
			}
		}
		return WaffenListe;
	}

	/**
	 * Vergleicht Eingabe mit jedem Wert aus der Verbrauchsgegenstand-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * @param VerbrauchsgegenstandsListe - ObservableList in der Verbrauchsgegenstände aus der "Verbrauchsgegenstand"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde.
	 * @return VerbrauchsgegenstandsListe - Gibt eine modifierte Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Verbrauchsgegenstand> verbrauchsgegenstand(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, String eingabe) {
		for (int i = 0; i < VerbrauchsgegenstandsListe.size(); i++) {
			if (VerbrauchsgegenstandsListe.get(i).toString().toLowerCase().contains(eingabe.toLowerCase())) {
				VerbrauchsgegenstandsListe.set(i, VerbrauchsgegenstandsListe.get(i));
			}

			else {
				VerbrauchsgegenstandsListe.remove(i);
				i--;
			}
		}
		return VerbrauchsgegenstandsListe;
	}

}
