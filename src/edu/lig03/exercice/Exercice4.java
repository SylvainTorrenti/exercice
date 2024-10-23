package edu.lig03.exercice;

import java.util.Random;
import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		String response = "";
		int essai = 0;
		int nb;
		Random randomNumbers = new Random();
		nb = randomNumbers.nextInt(100) + 1;
		System.out.println(nb);
		System.out.println("Le nombre est le bon?");
		Scanner in = new Scanner(System.in);
		response = in.next();
		while (!(response.equals("ok"))) {
			if (response.equals(">")) {
				System.out.println("Le nombre est >");
				System.out.println(randomNumbers.nextInt(100) + 1);
				essai++;
				response = in.next();
			}
			if (response.equals("<")) {
				System.out.println("le nombre est <");
				System.out.println(randomNumbers.nextInt(100) + 1);
				essai++;
				response = in.next();
			}

		}
		if (essai == 20) {
			System.out.println("J'ai Perdu...");
		}
		if (response.equals("ok")) {
			System.out.println("J'ai trouvé je suis le meilleur!");
		}
	}
}
