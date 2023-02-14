package figure;

public class Quadrato extends FiguraGeometrica implements ColoreSuperficie {
private int lato;

//costruttore

public Quadrato(int lato) {	
	this.lato = lato;
  }

//get e set
public int getLato() {
	return lato;
}
public void setLato(int lato) {
	this.lato = lato;
}

@Override
public int calcoloSuperficie() {
	// TODO Auto-generated method stub
	int superficie = this.lato * this.lato;
	return superficie;
}

@Override
public void StampaColore() {
	System.out.println("Il quadrato ha superficie rossa.");
	
}

}
