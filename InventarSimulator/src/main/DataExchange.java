package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import POJO.Ausruestung.Element;
import POJO.Item;
import POJO.Item.ItemArt;
import POJO.Item.Seltenheit;
import POJO.Ruestung;
import POJO.Ruestung.RuestungsArt;
import POJO.Verbrauchsgegenstaende;
import POJO.Verbrauchsgegenstaende.Buffs;
import POJO.Verbrauchsgegenstaende.VerbrauchsgegenstandsArt;
import POJO.Waffe;
import POJO.Waffe.WaffenArt;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataExchange {
	
	public static ObservableList<Item> getItemsFromDb(){
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Item> ItemListe = FXCollections.observableArrayList();
		
		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);
			
			while(s.hasNext()) {
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
				
				// Person wird der ObservableList hinzugefügt
				ItemListe.add(i);	
			}
			s.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return ItemListe;
	}
	
	public static ObservableList<Waffe> getWeaponsFromDb(){
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Waffe> WaffenListe = FXCollections.observableArrayList();
		
		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);
			
			while(s.hasNext()) {
				// neue Person wird erstellt
				Waffe w = new Waffe();
				
				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();
				
				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");
				
				if(ItemArt.valueOf(spalten[0]) != ItemArt.W) {
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
				
				// Person wird der ObservableList hinzugefügt
				WaffenListe.add(w);	
			}
			s.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return WaffenListe;
	}
	
	public static ObservableList<Ruestung> getArmorFromDb(){
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Ruestung> RuestungsListe = FXCollections.observableArrayList();
		
		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);
			
			while(s.hasNext()) {
				// neue Person wird erstellt
				Ruestung r = new Ruestung();
				
				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();
				
				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");
				
				if(ItemArt.valueOf(spalten[0]) != ItemArt.R) {
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
				
				// Person wird der ObservableList hinzugefügt
				RuestungsListe.add(r);	
			}
			s.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return RuestungsListe;
	}
	
	public static ObservableList<Verbrauchsgegenstaende> getConsumablesFromDb(){
		// ObservableList in der Objekte(Personen) gespeichert werden können, wird erstellt
		ObservableList<Verbrauchsgegenstaende> VerbrauchsListe = FXCollections.observableArrayList();
		
		// Textdatei wird eingelesen
		File db = new File("Items.txt");
		Scanner s = null;
		try {
			s = new Scanner(db);
			
			while(s.hasNext()) {
				// neue Person wird erstellt
				Verbrauchsgegenstaende v = new Verbrauchsgegenstaende();
				
				// jede Zeile wird in einen String gespeichert
				String zeile = s.nextLine();
				
				// String wird bei eingegebenen Zeichen (,) gespaltet und in array gespeichert
				String[] spalten = zeile.split(",");
				
				if(ItemArt.valueOf(spalten[0]) != ItemArt.V) {
					continue;
				}
				
				// jeweilige Werte des Arrays werden in dazugehörige Parameter der Person gespeichert
				v.setItemArt(ItemArt.valueOf(spalten[0]));
				v.setName(spalten[1]);
				v.setSeltenheit(Seltenheit.valueOf(spalten[2]));
				v.setWert(Integer.parseInt(spalten[3]));
				v.setBuffs(Buffs.valueOf(spalten[4]));
				v.setVerbrauchsgegenstandsArt(VerbrauchsgegenstandsArt.valueOf(spalten[5]));
				
				// Person wird der ObservableList hinzugefügt
				VerbrauchsListe.add(v);	
			}
			s.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not Found");
		}

		return VerbrauchsListe;
	}
	
	

	public static void main(String[] args){
		ObservableList<Waffe> WaffenListe = FXCollections.observableArrayList();
		WaffenListe = getWeaponsFromDb();
		System.out.println(WaffenListe.isEmpty());
		for(Waffe waffen: WaffenListe) {
			System.out.println(waffen.toString());
		}
		
		System.out.println();
		
		ObservableList<Ruestung> RuestungsListe = FXCollections.observableArrayList();
		RuestungsListe = getArmorFromDb();
		System.out.println(RuestungsListe.isEmpty());
		for(Ruestung ruestungen: RuestungsListe) {
			System.out.println(ruestungen.toString());
		}
		
		System.out.println();
		
		ObservableList<Verbrauchsgegenstaende> VerbrauchsListe = FXCollections.observableArrayList();
		VerbrauchsListe = getConsumablesFromDb();
		System.out.println(VerbrauchsListe.isEmpty());
		for(Verbrauchsgegenstaende verbrauchsgegenstaende: VerbrauchsListe) {
			System.out.println(verbrauchsgegenstaende.toString());
		}
		
		System.out.println();
		
		ObservableList<Item> ItemListe = FXCollections.observableArrayList();
		ItemListe = getItemsFromDb();
		System.out.println(VerbrauchsListe.isEmpty());
		for(Item item: ItemListe) {
			System.out.println(item.toString());
		}
	}
}
