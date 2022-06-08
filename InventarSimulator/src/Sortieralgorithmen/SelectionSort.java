package Sortieralgorithmen;

import POJO.Item;
import POJO.Ruestung;
import POJO.Verbrauchsgegenstand;
import POJO.Waffe;
import javafx.collections.ObservableList;

public class SelectionSort {
	public static ObservableList<Item> selectionSort(ObservableList<Item> ItemListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < ItemListe.size(); a++) {
				int min = a;
				String sorta = ItemListe.get(a).getName().toLowerCase();
				for (int b = a + 1; b < ItemListe.size(); b++) {
					if (ItemListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = ItemListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Item temp = ItemListe.get(min);
					ItemListe.set(min, ItemListe.get(a));
					ItemListe.set(a, temp);
				}
			}
		} else if (!richtung) {
			for (int a = ItemListe.size() - 1; a >= 0; a--) {
				int min = a;
				String sorta = ItemListe.get(a).getName().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (ItemListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = ItemListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Item temp = ItemListe.get(min);
					ItemListe.set(min, ItemListe.get(a));
					ItemListe.set(a, temp);
				}
			}
		}
		return ItemListe;
	}
	
	public static ObservableList<Item> selectionSort(ObservableList<Item> ItemListe, byte richtung) {
		switch(richtung) {
		case 1:
			for (int i = 0; i < ItemListe.size(); i++) {
				int min = i;
				if (!ItemListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i+1; n <ItemListe.size(); n++) {
						if (ItemListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(i));
				ItemListe.set(i, temp);
			}
			break;
		case 2:
			for (int i = 0; i < ItemListe.size(); i++) {
				int min = i;
				if (!ItemListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i+1; n <ItemListe.size(); n++) {
						if (ItemListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(i));
				ItemListe.set(i, temp);
			}
			break;
		}
		
		return ItemListe;
	}

	public static ObservableList<Ruestung> selectionSortR(ObservableList<Ruestung> RuestungsListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < RuestungsListe.size(); a++) {
				int min = a;
				String sorta = RuestungsListe.get(a).getName().toLowerCase();
				for (int b = a + 1; b < RuestungsListe.size(); b++) {
					if (RuestungsListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = RuestungsListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Ruestung temp = RuestungsListe.get(min);
					RuestungsListe.set(min, RuestungsListe.get(a));
					RuestungsListe.set(a, temp);
				}
			}
		} else if (!richtung) {
			for (int a = RuestungsListe.size() - 1; a >= 0; a--) {
				int min = a;
				String sorta = RuestungsListe.get(a).getName().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (RuestungsListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = RuestungsListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Ruestung temp = RuestungsListe.get(min);
					RuestungsListe.set(min, RuestungsListe.get(a));
					RuestungsListe.set(a, temp);
				}
			}
		}
		return RuestungsListe;
	}

	public static ObservableList<Waffe> selectionSortW(ObservableList<Waffe> WaffenListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < WaffenListe.size(); a++) {
				int min = a;
				String sorta = WaffenListe.get(a).getName().toLowerCase();
				for (int b = a + 1; b < WaffenListe.size(); b++) {
					if (WaffenListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = WaffenListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Waffe temp = WaffenListe.get(min);
					WaffenListe.set(min, WaffenListe.get(a));
					WaffenListe.set(a, temp);
				}
			}
		} else if (!richtung) {
			for (int a = WaffenListe.size() - 1; a >= 0; a--) {
				int min = a;
				String sorta = WaffenListe.get(a).getName().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (WaffenListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = WaffenListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Waffe temp = WaffenListe.get(min);
					WaffenListe.set(min, WaffenListe.get(a));
					WaffenListe.set(a, temp);
				}
			}
		}
		return WaffenListe;
	}

	public static ObservableList<Verbrauchsgegenstand> selectionSortV(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < VerbrauchsgegenstandsListe.size(); a++) {
				int min = a;
				String sorta = VerbrauchsgegenstandsListe.get(a).getName().toLowerCase();
				for (int b = a + 1; b < VerbrauchsgegenstandsListe.size(); b++) {
					if (VerbrauchsgegenstandsListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = VerbrauchsgegenstandsListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
					VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(a));
					VerbrauchsgegenstandsListe.set(a, temp);
				}
			}
		} else if (!richtung) {
			for (int a = VerbrauchsgegenstandsListe.size() - 1; a >= 0; a--) {
				int min = a;
				String sorta = VerbrauchsgegenstandsListe.get(a).getName().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (VerbrauchsgegenstandsListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {
						sorta = VerbrauchsgegenstandsListe.get(b).getName().toLowerCase();
						min = b;
					}
				}
				if (min != a) {
					Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
					VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(a));
					VerbrauchsgegenstandsListe.set(a, temp);
				}
			}
		}
		return VerbrauchsgegenstandsListe;
	}

}
