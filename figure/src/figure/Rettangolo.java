package figure;

public class Rettangolo extends FiguraGeometrica implements ColoreSuperficie {
	private int altezza;
	private int base;
	public Rettangolo(int base, int altezza) {
		//costruttore
		
		this.base = base;
		this.altezza = altezza;
	}//get e set
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	@Override
	public int calcoloSuperficie() {
		int superficie = this.base * this.altezza;
		return superficie;
	}
	@Override
	public void StampaColore() {
		System.out.println("Il rettangolo ha superficie verde.");
		
	}

}
