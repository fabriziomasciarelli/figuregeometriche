package figure;

public class Main {
	

	public static void main(String[] args) {
		Quadrato Q = new Quadrato(15);
		System.out.println(Q.calcoloSuperficie());
		Q.StampaColore();
		
		Rettangolo R = new Rettangolo(10,5);
		System.out.println(R.calcoloSuperficie());
		R.StampaColore();
		
		Triangolo T = new Triangolo(10,20);
		System.out.println(T.calcoloSuperficie());
		T.StampaColore();
	}

}
