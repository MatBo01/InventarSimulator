package sortieralgorithmen;

import POJO.Item;
import POJO.Ruestung;
import POJO.Verbrauchsgegenstand;
import POJO.Waffe;
import javafx.collections.ObservableList;

/**
 * 			 Sortiert die Item/Waffen/Ruestungs/Verbrauchsgegenstandlisten mit dem SelectionSort Algorithmus
 */
public class SelectionSort {
	/**
	 * Sortiert die Liste alphabetisch nach Namen
	 * 
	 * @param ItemListe - ObservableList in der Item Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Buttons wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste alphabetisch sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Item> selectionSort(ObservableList<Item> ItemListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < ItemListe.size(); a++) {										//For-Schleife die die Liste durchgeht
				int min = a;																	//Kleinster index 
				String sorta = ItemListe.get(a).getName().toLowerCase();						//Der Name des Items von der Aktuellen Position Der Liste wird abgespeichert
				for (int b = a + 1; b < ItemListe.size(); b++) {								//For-Schleife die eine Position nach der ersten For-Schleife beginnt und dann bis zum ende der Liste läuft
					if (ItemListe.get(b).getName().toLowerCase().compareTo(sorta) < 0) {		//überprüft ob "kleiner" als der String sorta ist
						sorta = ItemListe.get(b).getName().toLowerCase();						//der Name von b wird in sorta abgespeichert
						min = b;																//b wird in min abgespeichert weil es kleiner als a ist
					}
				}
				if (min != a) {
					Item temp = ItemListe.get(min);												//Der Kleinste Index min wird in einer Tempöraren Variable eingesetzt
					ItemListe.set(min, ItemListe.get(a));										//Der Index von a wird in min eingesetzt
					ItemListe.set(a, temp);														//Der Index von Temp wird in a eingesetzt
				}
			}
		} else if (!richtung) {																	//Dasselbe Prinzip nur andersrum
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

	/**
	 * Sortiert die Liste alphabetisch nach Namen
	 * 
	 * @param RuestungsListe - ObservableList in der Ruestungs Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste alphabetisch sortiert je nach Button Betaetigung zurueck
	 */
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

	/**
	 * Sortiert die Liste alphabetisch nach Namen
	 * 
	 * @param WaffenListe - ObservableList in der Waffen Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste alphabetisch sortiert je nach Button Betaetigung zurueck
	 */
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

	/**
	 * Sortiert die Liste alphabetisch nach Namen
	 * 
	 * @param VerbrauchsgegenstandsListe - ObservableList in der Verbrauchsgegenstaends Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste alphabetisch sortiert je nach Button Betaetigung zurueck
	 */
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

	/**
	 * Sortiert die Liste nach Gewichtung 
	 * 
	 * @param ItemListe - ObservableList in der Item Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Item> selectionSortSeltenheit(ObservableList<Item> ItemListe, boolean richtung) {		
		
		if (richtung) {
			for (int i = 0; i < ItemListe.size(); i++) {
				int min = i;														//Kleinster Index
				if (!ItemListe.get(i).getSeltenheit().equals("Normal")) {			//Wenn der Inhalt von der aktuellen Position nicht "Normal" ist 
					for (int n = i + 1; n < ItemListe.size(); n++) {				//Kommt man in die Forschleife und die läuft solange bis ein "Normal" gefunden wird 
						if (ItemListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;												//Der Index wird ersetzt
							break;													//und die Schleife unterbrochen
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
							break;
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
							break;
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
							break;
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
							break;
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
					for (int n = j - 1; n >= 0; n--) {
						if (ItemListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
							break;
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
					for (int n = j - 1; n >= 0; n--) {
						if (ItemListe.get(n).getSeltenheit().equals("Selten")) {
							min = n;
							break;
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
							break;
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

	/**
	 * Sortiert die Liste nach Gewichtung 
	 * 
	 * @param WaffenListe - ObservableList in der Waffen Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Waffe> selectionSortWaffeSeltenheit(ObservableList<Waffe> WaffenListe,
			boolean richtung) {

		if (richtung) {
			for (int i = 0; i < WaffenListe.size(); i++) {
				int min = i;
				if (!WaffenListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i + 1; n < WaffenListe.size(); n++) {
						if (WaffenListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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
					for (int n = j - 1; n >= 0; n--) {
						if (WaffenListe.get(n).getSeltenheit().equals("Ungewöhnlich")) {
							min = n;
							break;
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
							break;
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
							break;
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

	/**
	 * Sortiert die Liste nach Gewichtung 
	 * 
	 * @param RuestungsListe - ObservableList in der Ruestungs Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Ruestung> selectionSortRuestungSeltenheit(ObservableList<Ruestung> RuestungsListe,
			boolean richtung) {

		if (richtung) {
			for (int i = 0; i < RuestungsListe.size(); i++) {
				int min = i;
				if (!RuestungsListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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

	/**
	 * Sortiert die Liste nach Gewichtung
	 * 
	 * @param VerbrauchsgegenstandListe - ObservableList in der Verbrauchsgegenstands Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Verbrauchsgegenstand> selectionSortVerbrauchsgegenstandSeltenheit(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandListe, boolean richtung) {

		if (richtung) {
			for (int i = 0; i < VerbrauchsgegenstandListe.size(); i++) {
				int min = i;
				if (!VerbrauchsgegenstandListe.get(i).getSeltenheit().equals("Normal")) {
					for (int n = i + 1; n < VerbrauchsgegenstandListe.size(); n++) {
						if (VerbrauchsgegenstandListe.get(n).getSeltenheit().equals("Normal")) {
							min = n;
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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

	/**
	 * Sortiert die Liste nach Gewichtung
	 * 
	 * @param ItemListe - ObservableList in der Item Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Item> selectionSortArt(ObservableList<Item> ItemListe, boolean richtung) {

		if (richtung) {
			for (int i = 0; i < ItemListe.size(); i++) {
				int min = i;
				if (!ItemListe.get(i).getItemArt().equals("Waffe")) {
					for (int n = i + 1; n < ItemListe.size(); n++) {
						if (ItemListe.get(n).getItemArt().equals("Waffe")) {
							min = n;
							break;
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
							break;
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
							break;
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
							break;
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

	/**
	 * Sortiert die Liste alphabetisch
	 * 
	 * @param WaffenListe - ObservableList in der Waffen Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste alphabetisch sortiert je nach Button Betaetigung zurueck
	 */
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

	/**
	 * Sortiert die Liste nach Gewichtung
	 * 
	 * @param RuestungsListe - ObservableList in der Waffen Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Ruestung> selectionSortArtRuestung(ObservableList<Ruestung> RuestungsListe,
			boolean richtung) {

		if (richtung) {
			for (int i = 0; i < RuestungsListe.size(); i++) {
				int min = i;
				if (!RuestungsListe.get(i).getRuestungsArt().equals("Stoffrüstung")) {
					for (int n = i + 1; n < RuestungsListe.size(); n++) {
						if (RuestungsListe.get(n).getRuestungsArt().equals("Stoffrüstung")) {
							min = n;
							break;
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
							break;
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
							break;
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
							break;
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

	/**
	 * Sortiert die Liste nach Gewichtung 
	 * 
	 * @param VerbrauchsgegenstandsListe - ObservableList in der Verbrauchsgegenstands Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Verbrauchsgegenstand> selectionSortArtVerbrauchsgegenstand(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, boolean richtung) {
		if (richtung) {
			for (int a = 0; a < VerbrauchsgegenstandsListe.size(); a++) {
				int min = a;
				String sorta = VerbrauchsgegenstandsListe.get(a).getVerbrauchsgegenstandsArt().toLowerCase();
				for (int b = a + 1; b < VerbrauchsgegenstandsListe.size(); b++) {
					if (VerbrauchsgegenstandsListe.get(b).getVerbrauchsgegenstandsArt().toLowerCase().compareTo(sorta) < 0) {
						sorta = VerbrauchsgegenstandsListe.get(b).getVerbrauchsgegenstandsArt().toLowerCase();
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
				String sorta = VerbrauchsgegenstandsListe.get(a).getVerbrauchsgegenstandsArt().toLowerCase();
				for (int b = a - 1; b >= 0; b--) {
					if (VerbrauchsgegenstandsListe.get(b).getVerbrauchsgegenstandsArt().toLowerCase().compareTo(sorta) < 0) {
						sorta = VerbrauchsgegenstandsListe.get(b).getVerbrauchsgegenstandsArt().toLowerCase();
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

	/**
	 * Sortiert die Liste nach Gewichtung
	 * 
	 * @param VerbrauchsgegenstandsListe - ObservableList in der Verbrauchsgegenstands Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return VerbrauchsgegenstandsListe - Gibt die Liste nach Gewichtung sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Verbrauchsgegenstand> selectionSortBuffVerbrauchsgegenstand(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, boolean richtung) {
		if (richtung) {
			for (int i = 0; i < VerbrauchsgegenstandsListe.size(); i++) {
				int min = i;
				if (!VerbrauchsgegenstandsListe.get(i).getBuffs().equals("Heilung")) {
					for (int n = i + 1; n < VerbrauchsgegenstandsListe.size(); n++) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Heilung")) {
							min = n;
							break;
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
							break;
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
							break;
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
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Verteidigungserhöhung")
						&& !VerbrauchsgegenstandsListe.get(j).getBuffs().equals("Angriffserhöhung")) {
					for (int n = j + 1; n < VerbrauchsgegenstandsListe.size(); n++) {
						if (VerbrauchsgegenstandsListe.get(n).getBuffs().equals("Angriffserhöhung")) {
							min = n;
							break;
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
							break;
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
							break;
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
							break;
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
							break;
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

	/**
	 * Sortiert die Liste alphabetisch nach Namen
	 * 
	 * @param RuestungsListe - ObservableList in der Ruestungs Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste alphabetisch sortiert je nach Button Betaetigung zurueck
	 */
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
	
	/**
	 * Sortiert die Liste alphabetisch nach Namen
	 * 
	 * @param WaffenListe - ObservableList in der Waffen Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste alphabetisch sortiert je nach Button Betaetigung zurueck
	 */
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
	
	/**
	 * Sortiert die Liste nach Zahlen
	 * 
	 * @param WaffenListe - ObservableList in der Waffen Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Zahlen sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Waffe> selectionSortWaffeGewicht(ObservableList<Waffe> WaffenListe, boolean richtung) {

		if (richtung) {
			for (int a = 0; a < WaffenListe.size(); a++) {

				for (int b = a + 1; b < WaffenListe.size(); b++) {
					if (WaffenListe.get(a).getGewicht() > WaffenListe.get(b).getGewicht()) {
						Waffe temp = WaffenListe.get(a);
						WaffenListe.set(a, WaffenListe.get(b));
						WaffenListe.set(b, temp);
					}
				}
			}

		} else if (!richtung) {
			for (int a = WaffenListe.size() - 1; a >= 0; a--) {

				for (int b = a - 1; b >= 0; b--) {
					if (WaffenListe.get(a).getGewicht() > WaffenListe.get(b).getGewicht()) {
						Waffe temp = WaffenListe.get(a);
						WaffenListe.set(a, WaffenListe.get(b));
						WaffenListe.set(b, temp);
					}
				}
			}
		}
		return WaffenListe;
	}

	/**
	 * Sortiert die Liste nach Zahlen
	 * 
	 * @param RuestungsListe - ObservableList in der Ruestungs Objekte gespeichert sind
	 * @param richtung - Mit jeder Betaetigung des Button wird die Reihenfolge der Liste gedreht
	 * @return - Gibt die Liste nach Zahlen sortiert je nach Button Betaetigung zurueck
	 */
	public static ObservableList<Ruestung> selectionSortRuestungGewicht(ObservableList<Ruestung> RuestungsListe,
			boolean richtung) {

		if (richtung) {
			for (int a = 0; a < RuestungsListe.size(); a++) {

				for (int b = a + 1; b < RuestungsListe.size(); b++) {
					if (RuestungsListe.get(a).getGewicht() > RuestungsListe.get(b).getGewicht()) {
						Ruestung temp = RuestungsListe.get(a);
						RuestungsListe.set(a, RuestungsListe.get(b));
						RuestungsListe.set(b, temp);
					}
				}
			}

		} else if (!richtung) {
			for (int a = RuestungsListe.size() - 1; a >= 0; a--) {

				for (int b = a - 1; b >= 0; b--) {
					if (RuestungsListe.get(a).getGewicht() > RuestungsListe.get(b).getGewicht()) {
						Ruestung temp = RuestungsListe.get(a);
						RuestungsListe.set(a, RuestungsListe.get(b));
						RuestungsListe.set(b, temp);
					}
				}
			}
		}
//	}
		return RuestungsListe;
	}
}
