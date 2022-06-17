package POJO;

public class Verbrauchsgegenstand extends Item{

	public enum Buffs{
		HE("Heilung"),
		AU("Ausdauerregeneration"),
		VE("Verteidigungserhöhung"),
		AN("Angriffserhöhung"),
		GE("Geschwindigkeitserhöhung");
		
		private String buffs;
		Buffs(String buffs){
			this.buffs = buffs;
		}
		public String getBuffs() {
			return this.buffs;
		}
	}
	public enum VerbrauchsgegenstandsArt{
		E("Essen"),
		T("Trank");
		
		private String verbrauchsgegenstandsArt;
		VerbrauchsgegenstandsArt(String verbrauchsgegenstandsArt){
			this.verbrauchsgegenstandsArt = verbrauchsgegenstandsArt;
		}
		public String getVerbrauchsgegenstandsArt() {
			return this.verbrauchsgegenstandsArt;
		}
	}
	
	private String buffs;
	private String verbrauchsgegenstandsArt;
	
	public Verbrauchsgegenstand() {
		
	}
	
	public Verbrauchsgegenstand(ItemArt itemArt, String name, Seltenheit seltenheit, int wert, Buffs buffs, VerbrauchsgegenstandsArt verbrauchsgegenstandsArt) {
		super(itemArt, name, seltenheit, wert);
		this.buffs = buffs.getBuffs();
		this.verbrauchsgegenstandsArt = verbrauchsgegenstandsArt.getVerbrauchsgegenstandsArt();
	}

	public String getBuffs() {
		return buffs;
	}

	public void setBuffs(Buffs buffs) {
		this.buffs = buffs.getBuffs();
	}

	public String getVerbrauchsgegenstandsArt() {
		return verbrauchsgegenstandsArt;
	}

	public void setVerbrauchsgegenstandsArt(VerbrauchsgegenstandsArt verbrauchsgegenstandsArt) {
		this.verbrauchsgegenstandsArt = verbrauchsgegenstandsArt.getVerbrauchsgegenstandsArt();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ",");
		sb.append(buffs + ",");
		sb.append(verbrauchsgegenstandsArt);
		return sb.toString();
	}
}
