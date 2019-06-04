package tpjava;

import java.util.Random;

public class Deck {
	private Carte[] cartes;

	public Deck() {
		cartes = new Carte[52];
		int curseur = 0;
		String[] colors = { "Heart", "Diamond", "Spade", "Club" };
		for (int i = 0; i < colors.length; i++) {
			for (int j = 1; j <= 13; j++) {
				cartes[curseur] = new Carte(j, colors[i]);
				curseur++;
			}
		}
	}

	public Deck(Carte[] cartes) {
		this.cartes = cartes;
	}

	public void afficher() {
		System.out.println("Contenu du deck :");
		for (int i = 0; i < cartes.length; i++) {
			System.out.println(cartes[i].getValeur() + " of " + cartes[i].getCouleur());
		}
	}

	public void melanger() {
		Carte[] cartesMelangees = new Carte[cartes.length];
		Random rand = new Random();

		for (int i = 0; i < cartes.length; i++) {
			while (true) {
				int indexCarte = rand.nextInt(cartes.length);
				if (cartesMelangees[indexCarte] == null) {
					cartesMelangees[indexCarte] = cartes[i];
					break;
				}
			}
		}
		cartes = cartesMelangees;
	}

	public Deck diviser() {
		Carte[] newCartes1 = new Carte[cartes.length / 2];
		Carte[] newCartes2 = new Carte[cartes.length / 2 + cartes.length % 2];

		for (int i = 0; i < cartes.length / 2; i++) {
			newCartes1[i] = cartes[i];
		}

		for (int i = cartes.length / 2; i < cartes.length; i++) {
			newCartes2[i - cartes.length / 2] = cartes[i];
		}
		cartes = newCartes1;
		return new Deck(newCartes2);
	}

	public Carte draw() {
		if (cartes.length < 1) {
			return null;
		}
		Carte[] newCartes = new Carte[cartes.length - 1];
		Carte drawnCarte = cartes[0];
		for (int i = 1; i < cartes.length; i++) {
			newCartes[i - 1] = cartes[i];
		}
		cartes = newCartes;
		return drawnCarte;
	}

	public void addCard(Carte carte) {
		Carte[] newCartes = new Carte[cartes.length + 1];
		for (int i = 0; i < cartes.length; i++) {
			newCartes[i] = cartes[i];
		}
		newCartes[cartes.length] = carte;
		cartes = newCartes;
	}

	public int getSize() {
		return this.cartes.length;
	}
}
