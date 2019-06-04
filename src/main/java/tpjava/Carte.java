package tpjava;

public class Carte {
	private int _valeur;
	private String _couleur;

	public Carte(int valeur, String couleur) {
		_valeur = valeur;
		_couleur = couleur;
	}

	public int getValeur() {
		return _valeur;
	}

	public String getCouleur() {
		return _couleur;
	}

	public boolean equals(Carte carte) {
		return (this.getValeur() == carte.getValeur());
	}

	public boolean beats(Carte carte) {
		int v1, v2;
		v1 = (this.getValeur() == 1) ? 14 : this.getValeur();
		v2 = (carte.getValeur() == 1) ? 14 : carte.getValeur();
		return (v1 > v2);
	}
}
