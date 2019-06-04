package tpjava;

public class Bataille {
	private Deck j1, j2, pile;

	public Bataille() {
		j1 = new Deck();
		j1.melanger();
		j2 = j1.diviser();
		pile = new Deck(new Carte[0]);
	}

	public void start() {
		Carte c1, c2;
		int nbManche = 0;

		while (true) {
			nbManche++;
			System.out.println("Manche " + nbManche);

			// les joueurs tirent une carte
			c1 = j1.draw();
			c2 = j2.draw();

			if (c1 != null && c2 != null) {
				System.out.println("J1 | " + c1.getValeur() + " of " + c1.getCouleur() + " - " + +c2.getValeur()
						+ " of " + c2.getCouleur() + " | J2");

				while (c1.equals(c2)) {

					// egalite dans la manche, nouvelle carte tiree
					pile.addCard(c1);
					pile.addCard(c2);
					c1 = j1.draw();
					c2 = j2.draw();

					if (c1 == null || c2 == null) {
						// un des deux decks est vide
						break;
					}
					System.out.println("J1 | " + c1.getValeur() + " of " + c1.getCouleur() + " - " + +c2.getValeur()
							+ " of " + c2.getCouleur() + " | J2");
				}
			}

			if (c1 == null || c2 == null) {
				// un des deux decks est vide

				if (c1 == null && c2 == null) {
					// egalite
					System.out.println("Egalite");

					break;
				}
				if (c1 == null) {
					// victoire j2
					System.out.println("J1 | " + "null" + " - " + +c2.getValeur() + " of " + c2.getCouleur() + " | J2");
					System.out.println("Victoire de J2");
					break;

				}
				if (c2 == null) {
					// victoire j1
					System.out.println("J1 | " + c1.getValeur() + " of " + c1.getCouleur() + " - " + "null" + " | J2");
					System.out.println("Victoire de J1");
					break;

				}

			} else if (c1.beats(c2)) {
				// j1 gagne la manche

				j1.addCard(c1);
				j1.addCard(c2);
				while (pile.getSize() > 0) {
					j1.addCard(pile.draw());
				}

				System.out.println("J1 gagne la manche");
				System.out.println("J1 | " + j1.getSize() + " - " + j2.getSize() + " | J2");

			} else {
				// j2 gagne la manche
				j2.addCard(c1);
				j2.addCard(c2);
				while (pile.getSize() > 0) {
					j2.addCard(pile.draw());
				}
				System.out.println("J2 gagne la manche");
				System.out.println("J1 | " + j1.getSize() + " - " + j2.getSize() + " | J2");

			}
			j1.melanger();
			j2.melanger();
		}
	}

}
