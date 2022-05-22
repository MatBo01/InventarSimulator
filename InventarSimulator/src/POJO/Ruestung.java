package POJO;

public class Ruestung extends Ausruestung {

	public enum RuestungsArt{
		STO("Stoffr�stung"),
		LED("Lederr�stung"),
		STA("Stahlr�stung");
		
		private String ruestungsArt;
		RuestungsArt(String ruestungsArt){
			this.ruestungsArt = ruestungsArt;
		}
		public String getRuestungsArt() {
			return this.ruestungsArt;
		}
	}

	private String ruestungsArt;
	
	public Ruestung() {
	}
	
	public Ruestung(ItemArt itemArt, String name, Seltenheit seltenheit, int wert, int staerke, int gewicht, Element element, RuestungsArt ruestungsArt) {
		super(itemArt, name, seltenheit, wert, staerke, gewicht, element);
		this.ruestungsArt = ruestungsArt.getRuestungsArt();
	}
	
	public String getRuestungsArt() {
		return ruestungsArt;
	}

	public void setRuestungsArt(RuestungsArt ruestungsArt) {
		this.ruestungsArt = ruestungsArt.getRuestungsArt();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ",");
		sb.append(ruestungsArt);
		return sb.toString();
	}
	
}
