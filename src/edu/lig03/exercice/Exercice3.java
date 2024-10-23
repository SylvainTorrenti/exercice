package edu.lig03.exercice;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nb1;
		int nbGrand = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Entrer un nombre");
			nb1 = in.nextInt();
			if (nb1 > nbGrand) {
				nbGrand = nb1;
			}
		}
		System.out.println("Le nombre le plus grand est : " + nbGrand);

	}

}
