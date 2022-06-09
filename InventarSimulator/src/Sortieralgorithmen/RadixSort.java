package Sortieralgorithmen;

import POJO.Item;
import POJO.Ruestung;
import POJO.Verbrauchsgegenstand;
import POJO.Waffe;
import javafx.collections.ObservableList;

public class RadixSort {

	// Größte Zahl im Array finden
	private static int getMaxWW(ObservableList<Waffe> WaffenListe, int size) {

		int max = WaffenListe.get(0).getWert();

		for (int i = 1; i < size; i++) {
			if (max < WaffenListe.get(i).getWert()) {
				max = WaffenListe.get(i).getWert();
			}
		}

		return max;
	}

	private static void vorSortierungWW(ObservableList<Waffe> WaffenListe, int size, int position, boolean richtung) {

		Waffe[] ablage = new Waffe[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(WaffenListe.get(i).getWert() / position) % 10]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(WaffenListe.get(i).getWert() / position) % 10] - 1] = WaffenListe.get(i);
				zähler[(WaffenListe.get(i).getWert() / position) % 10]--;
			}
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(WaffenListe.get(i).getWert() / position) % 10] - 1] = WaffenListe.get(i);
				zähler[(WaffenListe.get(i).getWert() / position) % 10]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Waffe> radixSortWW(ObservableList<Waffe> WaffenListe, boolean richtung) {

		int size = WaffenListe.size();

		int max = getMaxWW(WaffenListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungWW(WaffenListe, size, position, richtung);
		}

		return WaffenListe;
	}

	// -----------------------------------------------------------------------------------------------------

	private static int getMaxWA(ObservableList<Waffe> WaffenListe, int size) {

		int max = WaffenListe.get(0).getStaerke();

		for (int i = 1; i < size; i++) {
			if (max < WaffenListe.get(i).getStaerke()) {
				max = WaffenListe.get(i).getStaerke();
			}
		}

		return max;
	}

	private static void vorSortierungWA(ObservableList<Waffe> WaffenListe, int size, int position, boolean richtung) {

		Waffe[] ablage = new Waffe[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(WaffenListe.get(i).getStaerke() / position) % 10]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(WaffenListe.get(i).getStaerke() / position) % 10] - 1] = WaffenListe.get(i);
				zähler[(WaffenListe.get(i).getStaerke() / position) % 10]--;
			}
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(WaffenListe.get(i).getStaerke() / position) % 10] - 1] = WaffenListe.get(i);
				zähler[(WaffenListe.get(i).getStaerke() / position) % 10]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Waffe> radixSortWA(ObservableList<Waffe> WaffenListe, boolean richtung) {

		int size = WaffenListe.size();

		int max = getMaxWA(WaffenListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungWA(WaffenListe, size, position, richtung);
		}

		return WaffenListe;
	}

	// -----------------------------------------------------------------------------------------------------

	private static int getMaxWG(ObservableList<Waffe> WaffenListe, int size) {

		int max = (int) WaffenListe.get(0).getGewicht();

		for (int i = 1; i < size; i++) {
			if (max < WaffenListe.get(i).getGewicht()) {
				max = (int) WaffenListe.get(i).getGewicht();
			}
		}

		return max;
	}

	private static void vorSortierungWG(ObservableList<Waffe> WaffenListe, int size, int position, boolean richtung) {

		Waffe[] ablage = new Waffe[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(int) ((WaffenListe.get(i).getGewicht() / position) % 10)]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(int) ((WaffenListe.get(i).getGewicht() / position) % 10)] - 1] = WaffenListe.get(i);
				zähler[(int) ((WaffenListe.get(i).getGewicht() / position) % 10)]--;
			}
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(int) ((WaffenListe.get(i).getGewicht() / position) % 10)] - 1] = WaffenListe.get(i);
				zähler[(int) ((WaffenListe.get(i).getGewicht() / position) % 10)]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Waffe> radixSortWG(ObservableList<Waffe> WaffenListe, boolean richtung) {

		int size = WaffenListe.size();

		int max = getMaxWG(WaffenListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungWG(WaffenListe, size, position, richtung);
		}

		return WaffenListe;
	}

//-----------------------------------------------------------------------------------------------------

	private static int getMaxWS(ObservableList<Waffe> WaffenListe, int size) {

		int max = WaffenListe.get(0).getSchnelligkeit();

		for (int i = 1; i < size; i++) {
			if (max < WaffenListe.get(i).getSchnelligkeit()) {
				max = WaffenListe.get(i).getSchnelligkeit();
			}
		}

		return max;
	}

	private static void vorSortierungWS(ObservableList<Waffe> WaffenListe, int size, int position, boolean richtung) {

		Waffe[] ablage = new Waffe[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(WaffenListe.get(i).getSchnelligkeit() / position) % 10]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(WaffenListe.get(i).getSchnelligkeit() / position) % 10] - 1] = WaffenListe.get(i);
				zähler[(WaffenListe.get(i).getSchnelligkeit() / position) % 10]--;
			}
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(WaffenListe.get(i).getSchnelligkeit() / position) % 10] - 1] = WaffenListe.get(i);
				zähler[(WaffenListe.get(i).getSchnelligkeit() / position) % 10]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				WaffenListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Waffe> radixSortWS(ObservableList<Waffe> WaffenListe, boolean richtung) {

		int size = WaffenListe.size();

		int max = getMaxWS(WaffenListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungWS(WaffenListe, size, position, richtung);
		}

		return WaffenListe;
	}

	// -----------------------------------------------------------------------------------------------------

	private static int getMaxRW(ObservableList<Ruestung> RuestungsListe, int size) {

		int max = RuestungsListe.get(0).getWert();

		for (int i = 1; i < size; i++) {
			if (max < RuestungsListe.get(i).getWert()) {
				max = RuestungsListe.get(i).getWert();
			}
		}

		return max;
	}

	private static void vorSortierungRW(ObservableList<Ruestung> RuestungsListe, int size, int position,
			boolean richtung) {

		Ruestung[] ablage = new Ruestung[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(RuestungsListe.get(i).getWert() / position) % 10]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(RuestungsListe.get(i).getWert() / position) % 10] - 1] = RuestungsListe.get(i);
				zähler[(RuestungsListe.get(i).getWert() / position) % 10]--;
			}
			for (int i = 0; i < size; i++) {
				RuestungsListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(RuestungsListe.get(i).getWert() / position) % 10] - 1] = RuestungsListe.get(i);
				zähler[(RuestungsListe.get(i).getWert() / position) % 10]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				RuestungsListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Ruestung> radixSortRW(ObservableList<Ruestung> RuestungsListe, boolean richtung) {

		int size = RuestungsListe.size();

		int max = getMaxRW(RuestungsListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungRW(RuestungsListe, size, position, richtung);
		}

		return RuestungsListe;
	}

	// -----------------------------------------------------------------------------------------------------

	private static int getMaxRV(ObservableList<Ruestung> RuestungsListe, int size) {

		int max = RuestungsListe.get(0).getStaerke();

		for (int i = 1; i < size; i++) {
			if (max < RuestungsListe.get(i).getStaerke()) {
				max = RuestungsListe.get(i).getStaerke();
			}
		}

		return max;
	}

	private static void vorSortierungRV(ObservableList<Ruestung> RuestungsListe, int size, int position,
			boolean richtung) {

		Ruestung[] ablage = new Ruestung[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(RuestungsListe.get(i).getStaerke() / position) % 10]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(RuestungsListe.get(i).getStaerke() / position) % 10] - 1] = RuestungsListe.get(i);
				zähler[(RuestungsListe.get(i).getStaerke() / position) % 10]--;
			}
			for (int i = 0; i < size; i++) {
				RuestungsListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(RuestungsListe.get(i).getStaerke() / position) % 10] - 1] = RuestungsListe.get(i);
				zähler[(RuestungsListe.get(i).getStaerke() / position) % 10]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				RuestungsListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Ruestung> radixSortRV(ObservableList<Ruestung> RuestungsListe, boolean richtung) {

		int size = RuestungsListe.size();

		int max = getMaxRV(RuestungsListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungRV(RuestungsListe, size, position, richtung);
		}

		return RuestungsListe;
	}

	// -----------------------------------------------------------------------------------------------------

	private static int getMaxRG(ObservableList<Ruestung> RuestungsListe, int size) {

		int max = (int) RuestungsListe.get(0).getGewicht();

		for (int i = 1; i < size; i++) {
			if (max < RuestungsListe.get(i).getGewicht()) {
				max = (int) RuestungsListe.get(i).getGewicht();
			}
		}

		return max;
	}

	private static void vorSortierungRG(ObservableList<Ruestung> RuestungsListe, int size, int position,
			boolean richtung) {

		Ruestung[] ablage = new Ruestung[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(int) ((RuestungsListe.get(i).getGewicht() / position) % 10)]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(int) ((RuestungsListe.get(i).getGewicht() / position) % 10)] - 1] = RuestungsListe
						.get(i);
				zähler[(int) ((RuestungsListe.get(i).getGewicht() / position) % 10)]--;
			}
			for (int i = 0; i < size; i++) {
				RuestungsListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(int) ((RuestungsListe.get(i).getGewicht() / position) % 10)] - 1] = RuestungsListe
						.get(i);
				zähler[(int) ((RuestungsListe.get(i).getGewicht() / position) % 10)]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				RuestungsListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Ruestung> radixSortRG(ObservableList<Ruestung> RuestungsListe, boolean richtung) {

		int size = RuestungsListe.size();

		int max = getMaxRG(RuestungsListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungRG(RuestungsListe, size, position, richtung);
		}

		return RuestungsListe;
	}

	// -----------------------------------------------------------------------------------------------------

	private static int getMaxVW(ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, int size) {

		int max = (int) VerbrauchsgegenstandsListe.get(0).getWert();

		for (int i = 1; i < size; i++) {
			if (max < VerbrauchsgegenstandsListe.get(i).getWert()) {
				max = (int) VerbrauchsgegenstandsListe.get(i).getWert();
			}
		}

		return max;
	}

	private static void vorSortierungVW(ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, int size,
			int position, boolean richtung) {

		Verbrauchsgegenstand[] ablage = new Verbrauchsgegenstand[size];
		int[] zähler = new int[10];

		for (int i = 0; i < size; i++)
			zähler[(int) ((VerbrauchsgegenstandsListe.get(i).getWert() / position) % 10)]++;

		for (int i = 1; i < 10; i++)
			zähler[i] += zähler[i - 1];

		if (richtung) {

			for (int i = size - 1; i >= 0; i--) {
				ablage[zähler[(int) ((VerbrauchsgegenstandsListe.get(i).getWert() / position) % 10)]
						- 1] = VerbrauchsgegenstandsListe.get(i);
				zähler[(int) ((VerbrauchsgegenstandsListe.get(i).getWert() / position) % 10)]--;
			}
			for (int i = 0; i < size; i++) {
				VerbrauchsgegenstandsListe.set(i, ablage[i]);
			}
		} else if (!richtung) {
			for (int i = 0; i < size; i++) {
				ablage[zähler[(int) ((VerbrauchsgegenstandsListe.get(i).getWert() / position) % 10)]
						- 1] = VerbrauchsgegenstandsListe.get(i);
				zähler[(int) ((VerbrauchsgegenstandsListe.get(i).getWert() / position) % 10)]--;
			}
			int n = size - 1;
			for (int i = 0; i < size; i++) {
				VerbrauchsgegenstandsListe.set(i, ablage[n]);
				n--;
			}
		}

	}

	public static ObservableList<Verbrauchsgegenstand> radixSortVW(
			ObservableList<Verbrauchsgegenstand> VerbrauchsgegenstandsListe, boolean richtung) {

		int size = VerbrauchsgegenstandsListe.size();

		int max = getMaxVW(VerbrauchsgegenstandsListe, size);

		for (int position = 1; max / position > 0; position *= 10) {
			vorSortierungVW(VerbrauchsgegenstandsListe, size, position, richtung);
		}

		return VerbrauchsgegenstandsListe;
	}

}