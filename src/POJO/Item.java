package POJO;

public class Item {

	public enum ItemArt{
		W("Waffe"),
		R("Rüstung"),
		V("Verbrauchsgegenstand");
		
		private String art;
		ItemArt(String art){
			this.art = art;
		}
		public String getArt() {
			return this.art;
		}
	}
	public enum Seltenheit{
		N("Normal"),
		U("Ungewöhnlich"),
		S("Selten"),
		E("Episch"),
		L("Legendär");
		
		private String seltenheit;
		Seltenheit(String seltenheit){
			this.seltenheit = seltenheit;
		}
		public String getSeltenheit() {
			return this.seltenheit;
		}
	}
	
	private String name;
	private String itemArt;
	private String seltenheit;
	private int wert;
	
	public Item() {
	}
	
	public Item(ItemArt itemArt, String name, Seltenheit seltenheit, int wert) {
		this.itemArt = itemArt.getArt();
		this.name = name;
		this.seltenheit = seltenheit.getSeltenheit();
		this.wert = wert;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemArt() {
		return itemArt;
	}

	public void setItemArt(ItemArt art) {
		this.itemArt = art.getArt();
	}

	public String getSeltenheit() {
		return seltenheit;
	}

	public void setSeltenheit(Seltenheit seltenheit) {
		this.seltenheit = seltenheit.getSeltenheit();
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(itemArt + ",");
		sb.append(name + ",");
		sb.append(seltenheit + ",");
		sb.append(wert);
		return sb.toString();
	}
}
