package Suchalgorithmen;

import POJO.*;
import javafx.collections.ObservableList;

public class LinearSearch {

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
