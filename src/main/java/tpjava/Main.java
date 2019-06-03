package tpjava;

public class Main {

	public static void main(String[] args) {

		Carte c1 = new Carte(1, "Spade");
		Carte c2 = new Carte(13, "Heart");
		Carte c3 = new Carte(2, "Diamond");
		System.out.println(c1.getValeur() + " of " + c1.getCouleur());
		System.out.println(c2.getValeur() + " of " + c2.getCouleur());
		System.out.println(c3.getValeur() + " of " + c3.getCouleur());
	}

}
