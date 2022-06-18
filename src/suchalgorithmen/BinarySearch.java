package suchalgorithmen;

import POJO.*;
import sortieralgorithmen.RadixSort;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Binär-Suche Suchalgorithmus für jeden Item-Typ aus den ObservableLists, 	Vergleicht nur Integer und gibt eine Liste mit Ergebnissen zurück
 */
public class BinarySearch {

	/**
	 * Durchsucht Item-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * Die eingelesene Liste wird mit RadixSort sortiert, (max-min)/2 + min errechnet nach jedem Durchgang 2 neue Hälften der Liste, um sich dem Eingabewert zu nähern
	 * @param ItemListe - ObservableList in der Items aus der "Alles"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde. Wird in Integer umgewandelt.
	 * @return ItemListe2 - Gibt eine neue Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Item> binarySearchAlles(ObservableList<Item> ItemListe, String eingabe) {

		int min = 0, max = ItemListe.size() - 1, x;
		int n = Integer.parseInt(eingabe);
		ObservableList<Item> ItemListe2 = FXCollections.observableArrayList();

		ItemListe = RadixSort.radixSortIW(ItemListe, true);
		for (int pos = 0; min <= max; pos = (max - min) / 2 + min) {
			x = ItemListe.get(pos).getWert();
			if (x == n) {
				ItemListe2.add(ItemListe.get(pos));
			}
			if (x <= n)
				min = pos + 1;
			else
				max = pos - 1;
		}
		return ItemListe2;
	}

	/** Durchsucht Waffen-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * Die eingelesene Liste wird mit RadixSort sortiert, (max-min)/2 + min errechnet nach jedem Durchgang 2 neue Hälften der Liste, um sich dem Eingabewert zu nähern
	 * @param WaffenListe - ObservableList in der Waffen aus der "Waffen"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde. Wird in Integer umgewandelt.
	 * @return WaffenListe2 - Gibt eine neue Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Waffe> binarySearchWaffen(ObservableList<Waffe> WaffenListe, String eingabe) {

		int min = 0, max = WaffenListe.size() - 1, x;
		int n = Integer.parseInt(eingabe);
		ObservableList<Waffe> WaffenListe2 = FXCollections.observableArrayList();

		WaffenListe = RadixSort.radixSortWA(WaffenListe, true);
		for (int pos = 0; min <= max; pos = (max - min) / 2 + min) {
			x = WaffenListe.get(pos).getStaerke();
			if (x == n) {
				WaffenListe2.add(WaffenListe.get(pos));
			}
			if (x <= n)
				min = pos + 1;
			else
				max = pos - 1;
		}

		min = 1;
		max = WaffenListe.size() - 1;
		WaffenListe = RadixSort.radixSortWW(WaffenListe, true);
		for (int pos = 0; min <= max; pos = (max - min) / 2 + min) {
			x = WaffenListe.get(pos).getWert();
			if (x == n) {
				WaffenListe2.add(WaffenListe.get(pos));
			}
			if (x <= n)
				min = pos + 1;
			else
				max = pos - 1;
		}

		min = 1;
		max = WaffenListe.size() - 1;
		WaffenListe = RadixSort.radixSortWS(WaffenListe, true);
		for (int pos = 0; min <= max; pos = (max - min) / 2 + min) {
			x = WaffenListe.get(pos).getSchnelligkeit();
			if (x == n) {
				WaffenListe2.add(WaffenListe.get(pos));
			}
			if (x <= n)
				min = pos + 1;
			else
				max = pos - 1;
		}
		return WaffenListe2;
	}

	/** Durchsucht Ruestung-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * Die eingelesene Liste wird mit RadixSort sortiert, (max-min)/2 + min errechnet nach jedem Durchgang 2 neue Hälften der Liste, um sich dem Eingabewert zu nähern
	 * @param RuestungListe - RuestungsListe ObservableList in der Ruestungen aus der "Ruestung"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde. Wird in Integer umgewandelt.
	 * @return RuestungListe2 - Gibt eine neue Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Ruestung> binarySearchRuestung(ObservableList<Ruestung> RuestungListe,
			String eingabe) {

		int min = 0, max = RuestungListe.size() - 1, x;
		int n = Integer.parseInt(eingabe);
		ObservableList<Ruestung> RuestungListe2 = FXCollections.observableArrayList();

		RuestungListe = RadixSort.radixSortRW(RuestungListe, true);
		for (int pos = 0; min <= max; pos = (max - min) / 2 + min) {
			x = RuestungListe.get(pos).getWert();
			if (x == n) {
				RuestungListe2.add(RuestungListe.get(pos));
			}
			if (x <= n)
				min = pos + 1;
			else
				max = pos - 1;
		}

		min = 1;
		max = RuestungListe.size() - 1;
		RuestungListe = RadixSort.radixSortRV(RuestungListe, true);
		for (int pos = 0; min <= max; pos = (max - min) / 2 + min) {
			x = RuestungListe.get(pos).getStaerke();
			if (x == n) {
				RuestungListe2.add(RuestungListe.get(pos));
			}
			if (x <= n)
				min = pos + 1;
			else
				max = pos - 1;
		}
		return RuestungListe2;
	}

	/** Durchsucht Verbrauchsgegenstand-Liste und gibt eine neue Liste mit Elementen zurück, die die Eingabe beeinhalten.
	 * Die eingelesene Liste wird mit RadixSort sortiert, (max-min)/2 + min errechnet nach jedem Durchgang 2 neue Hälften der Liste, um sich dem Eingabewert zu nähern
	 * @param VerbrauchsgegenstandsListe - ObservableList in der Verbrauchsgegenstände aus der "Verbrauchsgegenstand"-Ansicht gespeichert sind.
	 * @param eingabe - String, welches gesucht wird und von einer Textbox übergeben wurde. Wird in Integer umgewandelt.
	 * @return VerbrauchsgegenstandsListe2 - Gibt eine neue Liste mit den gesuchten Elemten zurück
	 */
	public static ObservableList<Verbrauchsgegenstand> binarySearchVerbrauchsgegenstand(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, String eingabe) {

		int min = 0, max = VerbrauchsgegenstandsListe.size() - 1, x;
		int n = Integer.parseInt(eingabe);
		ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe2 = FXCollections.observableArrayList();

		VerbrauchsgegenstandsListe = RadixSort.radixSortVW(VerbrauchsgegenstandsListe, true);
		for (int pos = 0; min <= max; pos = (max - min) / 2 + min) {
			x = VerbrauchsgegenstandsListe.get(pos).getWert();
			if (x == n) {
				VerbrauchsgegenstandsListe2.add(VerbrauchsgegenstandsListe.get(pos));
			}
			if (x <= n)
				min = pos + 1;
			else
				max = pos - 1;
		}
		return VerbrauchsgegenstandsListe2;
	}
}
