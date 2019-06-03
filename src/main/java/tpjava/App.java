package tpjava;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String palindrome;
//		System.out.println("Veuillez entrer un palindrome a tester :");
//		palindrome = scanner.nextLine();
//
//		if (isPalindrome(palindrome)) {
//			System.out.println(palindrome + " est un palindrome");
//		} else {
//			System.out.println(palindrome + " n'est pas un palindrome.");
//		}
//		scanner.close();
		plusMoins();
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

	public static void plusMoins() {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int nbCache = rand.nextInt(100) + 1;
		int nbChoisis;
		int nbCoups = 0;

		do {
			System.out.print("Choisissez un nombre entre 1 et 100 : ");
			nbChoisis = scanner.nextInt();
			if (nbChoisis < nbCache) {
				System.out.println("C'est plus !");
			}
			if (nbChoisis > nbCache) {
				System.out.println("C'est moins !");
			}
			nbCoups++;
		} while (nbChoisis != nbCache);

		System.out.println("Trouve en " + nbCoups + " coups.");
		scanner.close();
	}
}
