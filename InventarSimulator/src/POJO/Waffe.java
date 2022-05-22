package POJO;

public class Waffe extends Ausruestung{

	public enum WaffenArt{
		AX("Axt"),
		BO("Bogen"),
		DO("Dolch"),
		GR("Groﬂschwert"),
		SC("Schwert"),
		SP("Speer");
		
		private String waffenArt;
		WaffenArt(String waffenArt){
			this.waffenArt = waffenArt;
		}
		public String getWaffenArt() {
			return this.waffenArt;
		}
	}
	
	private int schnelligkeit;
	private String waffenArt;
	
	public Waffe() {
	}
	
	public Waffe(ItemArt itemArt, String name, Seltenheit seltenheit, int wert, int staerke, int gewicht, Element element, int schnelligkeit, WaffenArt waffenArt) {
		super(itemArt, name, seltenheit, wert, staerke, gewicht, element);
		this.schnelligkeit = schnelligkeit;
		this.waffenArt = waffenArt.getWaffenArt();
	}

	public int getSchnelligkeit() {
		return schnelligkeit;
	}

	public void setSchnelligkeit(int schnelligkeit) {
		this.schnelligkeit = schnelligkeit;
	}

	public String getWaffenArt() {
		return waffenArt;
	}

	public void setWaffenArt(WaffenArt waffenArt) {
		this.waffenArt = waffenArt.getWaffenArt();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ",");
		sb.append(schnelligkeit + ",");
		sb.append(waffenArt);
		return sb.toString();
	}
}
