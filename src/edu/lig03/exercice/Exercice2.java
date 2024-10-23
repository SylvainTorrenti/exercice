package edu.lig03.exercice;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		int compteur = 1;
		System.out.println("Donnez un nombre entre 7 et 22.");
		Scanner in = new Scanner(System.in);
		int nb1 = in.nextInt();

		while (nb1 < 7 || nb1 > 22) {
			System.out.println("Donnez un nombre entre 7 et 22.");
			nb1 = in.nextInt();
			compteur++;
		}
		System.out.println("Vous avez entré le bon nombre en " + compteur + " essais!");
	}

}
