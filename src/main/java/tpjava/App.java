package tpjava;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palindrome;
		System.out.println("Veuillez entrer un palindrome a tester :");
		palindrome = scanner.nextLine();

		if (isPalindrome(palindrome)) {
			System.out.println(palindrome + " est un palindrome");
		} else {
			System.out.println(palindrome + " n'est pas un palindrome.");
		}
		scanner.close();
	}

	public static void printFirstPrimes(int nbPrimes) {
		int nb = 2;
		while (nbPrimes > 0) {
			if (isPrime(nb)) {
				System.out.println(nb);
				nbPrimes--;
			}
			nb++;
		}
	}

	public static boolean isPrime(int nb) {
		if (nb <= 1) {
			return false;
		}
		for (int i = 2; i <= nb / 2; i++) {
			if (nb % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPerfect(int nb) {
		if (nb <= 1) {
			return false;
		}
		int somme = 1;
		for (int i = 2; i < nb; i++) {
			if (nb % i == 0) {
				somme += i;
			}
		}
		return (somme == nb);
	}

	public static boolean isPalindrome(String phrase) {
		phrase = phrase.toLowerCase();
		for (int i = 0; i < phrase.length() / 2; i++) {
			if (phrase.charAt(i) != phrase.charAt(phrase.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
