package POJO;

public abstract class Ausruestung extends Item {

	public enum Element{
		K(" - "),
		F("Feuer"),
		W("Wasser"),
		E("Erde"),
		L("Luft"),
		D("Dunkelheit"),
		H("Heilig");
		
		private String element;
		Element(String element){
			this.element = element;
		}
		public String getElement() {
			return this.element;
		}
	}
	
	private int staerke;
	private double gewicht;
	private String element;
	
	public Ausruestung() {
	}
	
	public Ausruestung(ItemArt itemArt, String name, Seltenheit seltenheit, int wert, int staerke, double gewicht, Element element) {
		super(itemArt, name, seltenheit, wert);
		this.staerke = staerke;
		this.gewicht = gewicht;
		this.element = element.getElement();
	}

	public int getStaerke() {
		return staerke;
	}

	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public String getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element.getElement();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ",");
		sb.append(staerke + ",");
		sb.append(gewicht + ",");
		sb.append(element);
		return sb.toString();
	}
}
