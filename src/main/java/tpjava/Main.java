package tpjava;

public class Main {

	public static void main(String[] args) {
		Deck d = new Deck();
		d.afficher();
		d.melanger();
		d.afficher();
		Deck d2 = d.diviser();
		d.afficher();
		d2.afficher();
	}

}
