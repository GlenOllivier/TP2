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
}
