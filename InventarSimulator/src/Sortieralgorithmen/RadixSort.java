package Sortieralgorithmen;

import POJO.Item;
import POJO.Waffe;
import javafx.collections.ObservableList;

public class RadixSort {

	// Gr��te Zahl im Array finden
	private static int getMax(ObservableList<Waffe> WaffenListe, int size) {

		int max = WaffenListe.get(0).getWert();

		for (int i = 1; i < size; i++) {
			if (max < WaffenListe.get(i).getWert()) {
				max = WaffenListe.get(i).getWert();
			}
		}

		return max;
	}

	private static void vorSortierung(ObservableList<Waffe> WaffenListe, int size, int position, boolean richtung) {

		Waffe[] ablage = new Waffe[size];
		int[] zhler = new int[10];

		for (int i = 0; i < size; i++)
			zhler[(WaffenListe.get(i).getWert() / position) % 10]++;

		for (int i = 1; i < 10; i++)
			zhler[i] += zhler[i - 1];

		for (int i = size - 1; i >= 0; i--) {
			ablage[zhler[(WaffenListe.get(i).getWert() / position) % 10] - 1] = WaffenListe.get(i);
			zhler[(WaffenListe.get(i).getWert() / position) % 10]--;
		}

		if (richtung) {
			System.out.println("1");
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[i]);
			}
		
			
		}
	}

	public static ObservableList<Waffe> radixSort(ObservableList<Waffe> WaffenListe, boolean richtung) {

		int size = WaffenListe.size();

		int max = getMax(WaffenListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierung(WaffenListe, size, position, richtung);
		}

		return WaffenListe;
	}
}