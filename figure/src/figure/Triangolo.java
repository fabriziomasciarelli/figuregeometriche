package figure;

public class Triangolo extends FiguraGeometrica implements ColoreSuperficie {
	private int altezza;
    private int base;
    //costruttori
    public Triangolo(int base, int altezza) {
	
	this.base = base;
	this.altezza = altezza;
}    
    //get set
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	@Override
	public int calcoloSuperficie() {
		int superficie = (this.base * this.altezza) /2;
		return superficie;
		
	}
	@Override
	public void StampaColore() {
		System.out.println("Il triangolo ha superficie gialla.");
		
	}

}
