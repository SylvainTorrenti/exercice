package edu.lig03.utilitaire;

import java.util.Scanner;

public class Lecteur {

	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Lire un entier à partir de la console
	 * @return
	 */
	public static int lireEntier() {
		return sc.nextInt();
	}
	
	public static int lireEntier(String message) {
		afficherMessage(message);
		return lireEntier();
	}

	/**
	 * Lire un nombre décimal à partir de la console
	 * @return
	 */
	public static float lireDecimal() {
		return sc.nextFloat();
	}
	
	public static float lireDecimal(String message) {
		afficherMessage(message);
		return lireDecimal();
	}

	/**
	 * Lire une chaine à partir de la console
	 * @return
	 */
	public static String lireTexte() {
		return sc.nextLine();
	}

	public static String lireTexte(String message) {
		afficherMessage(message);
		return lireTexte();
	}

	
	private static void afficherMessage(String message) {
		System.out.println("> " + message);
	}

}
