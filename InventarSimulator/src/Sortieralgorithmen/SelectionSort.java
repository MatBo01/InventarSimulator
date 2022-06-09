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

	public static ObservableList<Ruestung> selectionSortRuestung(ObservableList<Ruestung> RuestungsListe,
			boolean richtung) {

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

	public static ObservableList<Waffe> selectionSortWaffe(ObservableList<Waffe> WaffenListe, boolean richtung) {

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

	public static ObservableList<Verbrauchsgegenstand> selectionSortVerbrauchsgegenstand(
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

	public static ObservableList<Item> selectionSortSeltenheit(ObservableList<Item> ItemListe, boolean richtung) {

		if (richtung) {
			for (int i = 0; i < ItemListe.size(); i++) {
				int min = i;
				if (!ItemListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i + 1; n < ItemListe.size(); n++) {
						if (ItemListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(i));
				ItemListe.set(i, temp);
			}
			for (int j = 0; j < ItemListe.size(); j++) {
				int min = j;
				if (!ItemListe.get(j).getSeltenheit().equals("Normal")
						&& !ItemListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j + 1; n < ItemListe.size(); n++) {
						if (ItemListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);

			}
			for (int j = 0; j < ItemListe.size(); j++) {
				int min = j;
				if (!ItemListe.get(j).getSeltenheit().equals("Normal")
						&& !ItemListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !ItemListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j + 1; n < ItemListe.size(); n++) {
						if (ItemListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);

			}

			for (int j = 0; j < ItemListe.size(); j++) {
				int min = j;
				if (!ItemListe.get(j).getSeltenheit().equals("Normal")
						&& !ItemListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !ItemListe.get(j).getSeltenheit().equals("Selten")
						&& !ItemListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j + 1; n < ItemListe.size(); n++) {
						if (ItemListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);

			}
		} else if (!richtung) {
			for (int i = ItemListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!ItemListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i - 1; n >= 0; n--) {
						if (ItemListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(i));
				ItemListe.set(i, temp);
			}
			for (int j = ItemListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!ItemListe.get(j).getSeltenheit().equals("Normal")
						&& !ItemListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j - 1; n > 0; n--) {
						if (ItemListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);

			}
			for (int j = ItemListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!ItemListe.get(j).getSeltenheit().equals("Normal")
						&& !ItemListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !ItemListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j - 1; n > 0; n--) {
						if (ItemListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);

			}

			for (int j = ItemListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!ItemListe.get(j).getSeltenheit().equals("Normal")
						&& !ItemListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !ItemListe.get(j).getSeltenheit().equals("Selten")
						&& !ItemListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j - 1; n >= 0; n--) {
						if (ItemListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);

			}
		}

		return ItemListe;
	}

	public static ObservableList<Waffe> selectionSortWaffeSeltenheit(ObservableList<Waffe> WaffenListe,
			boolean richtung) {

		if (richtung) {
			for (int i = 0; i < WaffenListe.size(); i++) {
				int min = i;
				if (!WaffenListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i + 1; n < WaffenListe.size(); n++) {
						if (WaffenListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(i));
				WaffenListe.set(i, temp);
			}
			for (int j = 0; j < WaffenListe.size(); j++) {
				int min = j;
				if (!WaffenListe.get(j).getSeltenheit().equals("Normal")
						&& !WaffenListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j + 1; n < WaffenListe.size(); n++) {
						if (WaffenListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(j));
				WaffenListe.set(j, temp);

			}
			for (int j = 0; j < WaffenListe.size(); j++) {
				int min = j;
				if (!WaffenListe.get(j).getSeltenheit().equals("Normal")
						&& !WaffenListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !WaffenListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j + 1; n < WaffenListe.size(); n++) {
						if (WaffenListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(j));
				WaffenListe.set(j, temp);

			}

			for (int j = 0; j < WaffenListe.size(); j++) {
				int min = j;
				if (!WaffenListe.get(j).getSeltenheit().equals("Normal")
						&& !WaffenListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !WaffenListe.get(j).getSeltenheit().equals("Selten")
						&& !WaffenListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j + 1; n < WaffenListe.size(); n++) {
						if (WaffenListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(j));
				WaffenListe.set(j, temp);

			}
		} else if (!richtung) {
			for (int i = WaffenListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!WaffenListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i - 1; n >= 0; n--) {
						if (WaffenListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(i));
				WaffenListe.set(i, temp);
			}
			for (int j = WaffenListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!WaffenListe.get(j).getSeltenheit().equals("Normal")
						&& !WaffenListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j - 1; n > 0; n--) {
						if (WaffenListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(j));
				WaffenListe.set(j, temp);

			}
			for (int j = WaffenListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!WaffenListe.get(j).getSeltenheit().equals("Normal")
						&& !WaffenListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !WaffenListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j - 1; n >= 0; n--) {
						if (WaffenListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(j));
				WaffenListe.set(j, temp);

			}

			for (int j = WaffenListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!WaffenListe.get(j).getSeltenheit().equals("Normal")
						&& !WaffenListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !WaffenListe.get(j).getSeltenheit().equals("Selten")
						&& !WaffenListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j - 1; n >= 0; n--) {
						if (WaffenListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Waffe temp = WaffenListe.get(min);
				WaffenListe.set(min, WaffenListe.get(j));
				WaffenListe.set(j, temp);

			}
		}

		return WaffenListe;
	}

	public static ObservableList<Ruestung> selectionSortRuestungSeltenheit(ObservableList<Ruestung> RuestungsListe,
			boolean richtung) {

		if (richtung) {
			for (int i = 0; i < RuestungsListe.size(); i++) {
				int min = i;
				if (!RuestungsListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(i));
				RuestungsListe.set(i, temp);
			}
			for (int j = 0; j < RuestungsListe.size(); j++) {
				int min = j;
				if (!RuestungsListe.get(j).getSeltenheit().equals("Normal")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);

			}
			for (int j = 0; j < RuestungsListe.size(); j++) {
				int min = j;
				if (!RuestungsListe.get(j).getSeltenheit().equals("Normal")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);

			}

			for (int j = 0; j < RuestungsListe.size(); j++) {
				int min = j;
				if (!RuestungsListe.get(j).getSeltenheit().equals("Normal")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Selten")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);

			}
		} else if (!richtung) {
			for (int i = RuestungsListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!RuestungsListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i - 1; n >= 0; n--) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(i));
				RuestungsListe.set(i, temp);
			}
			for (int j = RuestungsListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!RuestungsListe.get(j).getSeltenheit().equals("Normal")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j - 1; n >= 0; n--) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);

			}
			for (int j = RuestungsListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!RuestungsListe.get(j).getSeltenheit().equals("Normal")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j - 1; n >= 0; n--) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);

			}

			for (int j = RuestungsListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!RuestungsListe.get(j).getSeltenheit().equals("Normal")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Selten")
						&& !RuestungsListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j - 1; n >= 0; n--) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);

			}
		}

		return RuestungsListe;
	}

	public static ObservableList<Verbrauchsgegenstand> selectionSortVerbrauchsgegenstandSeltenheit(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandListe, boolean richtung) {

		if (richtung) {
			for (int i = 0; i < VerbrauchsgegenstandListe.size(); i++) {
				int min = i;
				if (!VerbrauchsgegenstandListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i + 1; n < VerbrauchsgegenstandListe.size(); n++) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(i));
				VerbrauchsgegenstandListe.set(i, temp);
			}
			for (int j = 0; j < VerbrauchsgegenstandListe.size(); j++) {
				int min = j;
				if (!VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Normal")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j + 1; n < VerbrauchsgegenstandListe.size(); n++) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(j));
				VerbrauchsgegenstandListe.set(j, temp);

			}
			for (int j = 0; j < VerbrauchsgegenstandListe.size(); j++) {
				int min = j;
				if (!VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Normal")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j + 1; n < VerbrauchsgegenstandListe.size(); n++) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(j));
				VerbrauchsgegenstandListe.set(j, temp);

			}

			for (int j = 0; j < VerbrauchsgegenstandListe.size(); j++) {
				int min = j;
				if (!VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Normal")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Selten")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j + 1; n < VerbrauchsgegenstandListe.size(); n++) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(j));
				VerbrauchsgegenstandListe.set(j, temp);

			}
		} else if (!richtung) {
			for (int i = VerbrauchsgegenstandListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!VerbrauchsgegenstandListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(i));
				VerbrauchsgegenstandListe.set(i, temp);
			}
			for (int j = VerbrauchsgegenstandListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Normal")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Ungewöhnlich")) {
					for (int n = j - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(j));
				VerbrauchsgegenstandListe.set(j, temp);

			}
			for (int j = VerbrauchsgegenstandListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Normal")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Selten")) {
					for (int n = j - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(j));
				VerbrauchsgegenstandListe.set(j, temp);

			}

			for (int j = VerbrauchsgegenstandListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Normal")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Ungewöhnlich")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Selten")
						&& !VerbrauchsgegenstandListe.get(j).getSeltenheit().equals("Episch")) {
					for (int n = j - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Episch")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandListe.get(min);
				VerbrauchsgegenstandListe.set(min, VerbrauchsgegenstandListe.get(j));
				VerbrauchsgegenstandListe.set(j, temp);

			}
		}

		return VerbrauchsgegenstandListe;
	}

	public static ObservableList<Item> selectionSortArt(ObservableList<Item> ItemListe, boolean richtung) {

		if (richtung) {
			for (int i = 0; i < ItemListe.size(); i++) {
				int min = i;
				if (!ItemListe.get(i).getItemArt().equals("Waffe")) {
					for (int n = i + 1; n < ItemListe.size(); n++) {
						if (ItemListe.get(n).getItemArt().equals("Waffe")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(i));
				ItemListe.set(i, temp);
			}
			for (int j = 0; j < ItemListe.size(); j++) {
				int min = j;
				if (!ItemListe.get(j).getItemArt().equals("Waffe")
						&& !ItemListe.get(j).getItemArt().equals("Rüstung")) {
					for (int n = j + 1; n < ItemListe.size(); n++) {
						if (ItemListe.get(n).getItemArt().equals("Rüstung")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);
			}
		}

		else if (!richtung) {
			for (int i = ItemListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!ItemListe.get(i).getItemArt().equals("Waffe")) {
					for (int n = i - 1; n >= 0; n--) {
						if (ItemListe.get(n).getItemArt().equals("Waffe")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(i));
				ItemListe.set(i, temp);
			}
			for (int j = ItemListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!ItemListe.get(j).getItemArt().equals("Waffe")
						&& !ItemListe.get(j).getItemArt().equals("Rüstung")) {
					for (int n = j - 1; n >= 0; n--) {
						if (ItemListe.get(n).getItemArt().equals("Rüstung")) {
							min = n;
						}
					}
				}
				Item temp = ItemListe.get(min);
				ItemListe.set(min, ItemListe.get(j));
				ItemListe.set(j, temp);

			}

		}

		return ItemListe;
	}

	public static ObservableList<Waffe> selectionSortArtWaffe(ObservableList<Waffe> WaffenListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < WaffenListe.size(); a++) {
				int min = a;
				String sorta = WaffenListe.get(a).getWaffenArt().toLowerCase();
				for (int b = a + 1; b < WaffenListe.size(); b++) {
					if (WaffenListe.get(b).getWaffenArt().toLowerCase().compareTo(sorta) < 0) {
						sorta = WaffenListe.get(b).getWaffenArt().toLowerCase();
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
				String sorta = WaffenListe.get(a).getWaffenArt().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (WaffenListe.get(b).getWaffenArt().toLowerCase().compareTo(sorta) < 0) {
						sorta = WaffenListe.get(b).getWaffenArt().toLowerCase();
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

	public static ObservableList<Ruestung> selectionSortArtRuestung(ObservableList<Ruestung> RuestungsListe,
			boolean richtung) {

		if (richtung) {
			for (int i = 0; i < RuestungsListe.size(); i++) {
				int min = i;
				if (!RuestungsListe.get(i).getRuestungsArt().equals("Stoffrüstung")) {
					for (int n = i + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getRuestungsArt().equals("Stoffrüstung")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(i));
				RuestungsListe.set(i, temp);
			}
			for (int j = 0; j < RuestungsListe.size(); j++) {
				int min = j;
				if (!RuestungsListe.get(j).getRuestungsArt().equals("Stoffrüstung")
						&& !RuestungsListe.get(j).getRuestungsArt().equals("Lederrüstung")) {
					for (int n = j + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getRuestungsArt().equals("Lederrüstung")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);
			}
		}

		else if (!richtung) {
			for (int i = RuestungsListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!RuestungsListe.get(i).getRuestungsArt().equals("Stoffrüstung")) {
					for (int n = i - 1; n >= 0; n--) {
						if (RuestungsListe.get(n).getRuestungsArt().equals("Stoffrüstung")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(i));
				RuestungsListe.set(i, temp);
			}
			for (int j = RuestungsListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!RuestungsListe.get(j).getRuestungsArt().equals("Stoffrüstung")
						&& !RuestungsListe.get(j).getRuestungsArt().equals("Lederrüstung")) {
					for (int n = j - 1; n >= 0; n--) {
						if (RuestungsListe.get(n).getRuestungsArt().equals("Lederrüstung")) {
							min = n;
						}
					}
				}
				Ruestung temp = RuestungsListe.get(min);
				RuestungsListe.set(min, RuestungsListe.get(j));
				RuestungsListe.set(j, temp);

			}

		}

		return RuestungsListe;
	}

	public static ObservableList<Verbrauchsgegenstand> selectionSortArtVerbrauchsgegenstand(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, boolean richtung) {
		if (richtung) {
			for (int i = 0; i < VerbrauchsgegenstandsListe.size(); i++) {
				int min = i;
				if (!VerbrauchsgegenstandsListe.get(i).getVerbrauchsgegenstandsArt().equals("Essen")) {
					for (int n = i + 1; n < VerbrauchsgegenstandsListe.size(); n++) {
						if (VerbrauchsgegenstandsListe.get(n).getVerbrauchsgegenstandsArt().equals("Essen")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(i));
				VerbrauchsgegenstandsListe.set(i, temp);
			}
		} else if (!richtung) {
			for (int i = VerbrauchsgegenstandsListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!VerbrauchsgegenstandsListe.get(i).getVerbrauchsgegenstandsArt().equals("Essen")) {
					for (int n = i - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandsListe.get(n).getVerbrauchsgegenstandsArt().equals("Essen")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(i));
				VerbrauchsgegenstandsListe.set(i, temp);
			}
		}
		return VerbrauchsgegenstandsListe;

	}

	public static ObservableList<Verbrauchsgegenstand> selectionSortBuffVerbrauchsgegenstand(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, boolean richtung) {
		if (richtung) {
			for (int i = 0; i < VerbrauchsgegenstandsListe.size(); i++) {
				int min = i;
				if (!VerbrauchsgegenstandsListe.get(i).getBuffs().equals("Heilung")) {
					for (int n = i + 1; n < VerbrauchsgegenstandsListe.size(); n++) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Heilung")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(i));
				VerbrauchsgegenstandsListe.set(i, temp);
			}
			for (int j = 0; j < VerbrauchsgegenstandsListe.size(); j++) {
				int min = j;
				if (!VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Heilung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Ausdauerregeneration")) {
					for (int n = j + 1; n < VerbrauchsgegenstandsListe.size(); n++) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Ausdauerregeneration")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(j));
				VerbrauchsgegenstandsListe.set(j, temp);

			}
			for (int j = 0; j < VerbrauchsgegenstandsListe.size(); j++) {
				int min = j;
				if (!VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Heilung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Ausdauerregeneration")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Verteidigungserhöhung")) {
					for (int n = j + 1; n < VerbrauchsgegenstandsListe.size(); n++) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Verteidigungserhöhung")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(j));
				VerbrauchsgegenstandsListe.set(j, temp);

			}for (int j = 0; j < VerbrauchsgegenstandsListe.size(); j++) {
				int min = j;
				if (!VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Heilung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Ausdauerregeneration")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Verteidigungserhöhung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Angriffserhöhung")) {
					for (int n = j + 1; n < VerbrauchsgegenstandsListe.size(); n++) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Angriffserhöhung")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(j));
				VerbrauchsgegenstandsListe.set(j, temp);

			}
		} else if (!richtung) {
			for (int i = VerbrauchsgegenstandsListe.size() - 1; i >= 0; i--) {
				int min = i;
				if (!VerbrauchsgegenstandsListe.get(i).getBuffs().equals("Heilung")) {
					for (int n = i - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Heilung")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(i));
				VerbrauchsgegenstandsListe.set(i, temp);
			}
			for (int j = VerbrauchsgegenstandsListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Heilung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Ausdauerregeneration")) {
					for (int n = j - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Ausdauerregeneration")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(j));
				VerbrauchsgegenstandsListe.set(j, temp);

			}
			for (int j = VerbrauchsgegenstandsListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Heilung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Ausdauerregeneration")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Verteidigungserhöhung")) {
					for (int n = j - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Verteidigungserhöhung")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(j));
				VerbrauchsgegenstandsListe.set(j, temp);

			}

			for (int j = VerbrauchsgegenstandsListe.size() - 1; j >= 0; j--) {
				int min = j;
				if (!VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Heilung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Ausdauerregeneration")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Verteidigungserhöhung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Angriffserhöhung")) {
					for (int n = j - 1; n >= 0; n--) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Angriffserhöhung")) {
							min = n;
						}
					}
				}
				Verbrauchsgegenstand temp = VerbrauchsgegenstandsListe.get(min);
				VerbrauchsgegenstandsListe.set(min, VerbrauchsgegenstandsListe.get(j));
				VerbrauchsgegenstandsListe.set(j, temp);

			}
		}

		return VerbrauchsgegenstandsListe;

	}
	public static ObservableList<Ruestung> selectionSortRuestungResistenz(ObservableList<Ruestung> RuestungsListe,
			boolean richtung) {

		if (richtung) {
			for (int a = 0; a < RuestungsListe.size(); a++) {
				int min = a;
				String sorta = RuestungsListe.get(a).getElement().toLowerCase();
				for (int b = a + 1; b < RuestungsListe.size(); b++) {
					if (RuestungsListe.get(b).getElement().toLowerCase().compareTo(sorta) < 0) {
						sorta = RuestungsListe.get(b).getElement().toLowerCase();
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
				String sorta = RuestungsListe.get(a).getElement().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (RuestungsListe.get(b).getElement().toLowerCase().compareTo(sorta) < 0) {
						sorta = RuestungsListe.get(b).getElement().toLowerCase();
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

	public static ObservableList<Waffe> selectionSortWaffeElement(ObservableList<Waffe> WaffenListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < WaffenListe.size(); a++) {
				int min = a;
				String sorta = WaffenListe.get(a).getElement().toLowerCase();
				for (int b = a + 1; b < WaffenListe.size(); b++) {
					if (WaffenListe.get(b).getElement().toLowerCase().compareTo(sorta) < 0) {
						sorta = WaffenListe.get(b).getElement().toLowerCase();
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
				String sorta = WaffenListe.get(a).getElement().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (WaffenListe.get(b).getElement().toLowerCase().compareTo(sorta) < 0) {
						sorta = WaffenListe.get(b).getElement().toLowerCase();
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
}
