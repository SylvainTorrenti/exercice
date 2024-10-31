package edu.lig03.exercice;

import java.util.Random;

import edu.lig03.utilitaire.Lecteur;

public class Exercice {

	public static void exercice1() {
		int nombre1;
		int nombre2;
		int resultat;

		nombre1 = Lecteur.lireEntier("Premier nombre");
		nombre2 = Lecteur.lireEntier("Second nombre");
		resultat = nombre1 + nombre2;
		System.out.println("La somme de " + nombre1 + " + " + nombre2 + " = " + resultat);
	}

	public static void exercice2() {
		int compteur = 1;
		int nb1 = Lecteur.lireEntier("Entrer nombre");

		while (nb1 < 7 || nb1 > 22) {
			nb1 = Lecteur.lireEntier("Donnez un nombre entre 7 et 22.");
			compteur++;
		}
		System.out.println("Vous avez entré le bon nombre en " + compteur + " essais!");

	}

	public static void exercice3() {
		int nb1;
		int nbGrand = 0;
		for (int i = 1; i < 11; i++) {
			nb1 = Lecteur.lireEntier("Entrer le " + i + " nombre");
			if (nb1 > nbGrand) {
				nbGrand = nb1;
			}
		}
		System.out.println("Le nombre le plus grand est : " + nbGrand);
	}

	public static void exercice4() {

		double valeurMini;
		double valeurMaxi;
		double valeurProposee;
		int nombreEssaisRestant;
		String indication;

		valeurMini = 0;
		valeurMaxi = 100;
		nombreEssaisRestant = 20;
		do {
			valeurProposee = Math.floor((valeurMini + valeurMaxi) / 2);
			System.out.println(valeurProposee);
			indication = Lecteur.lireTexte("Indication ?");
			if (indication.equals("<")) {
				valeurMaxi = valeurProposee;
			}
			if (indication.equals(">")) {
				valeurMini = valeurProposee;
			}
			nombreEssaisRestant--;
		} while (!indication.equals("ok") && nombreEssaisRestant != 0);
		if (!indication.equals("ok")) {
			System.out.println("Top difficile pour moi, j'ai perdu");
		} else {
			System.out.println("J'ai trouvé c'était " + valeurProposee);
		}
	}

	public static void exercice5() {
		Random randomNumbers = new Random();
		int nbGuess;
		int nb = randomNumbers.nextInt(9999) + 1;
		do {
			nbGuess = Lecteur.lireEntier("Entrer un nombre");
			if (nbGuess > nb) {
				System.out.println("Le nombre est inférieur");
			}
			if (nbGuess < nb) {
				System.out.println("Le nombre est supérieur");
			}
		} while (!(nbGuess == nb));
		System.out.println("Tu as trouvé");
	}

	public static void main(String[] args) {
		 exercice1();
//		 exercice2();
//		 exercice3();
//		 exercice4();
//		exercice5();
	}

}
