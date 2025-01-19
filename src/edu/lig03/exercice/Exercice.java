package edu.lig03.exercice;

import java.io.BufferedReader;
<<<<<<< Updated upstream
import java.io.File;
import java.io.FileNotFoundException;
=======
>>>>>>> Stashed changes
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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

	/*
	 * 02-Imperatif Exercices Exercice 1
	 */
	public static void exercice5() {
		// Donne la possibilité de generé un nombre random
		Random randomNumbers = new Random();
		// Déclaration des variables
		int nbGuess;
		int compteur = 0;
		/*
		 * Déclaration et initialisation de la variable avec le nombre random avec la
		 * bonne range ici de 1 à 9999 (le +1 est important car sinon il ne prendra
		 * jamais la valeur 9999)
		 */
		int nb = randomNumbers.nextInt(9999) + 1;
		/*
		 * Création d'une boucle Do While pour pouvoir verifier au moins une fois si le
		 * chiffre renseigné est le bon
		 */
		do {
			// Le programme lit le nombre renseigné
			nbGuess = Lecteur.lireEntier("Entrer un nombre");
			// Si le nombre renseigné est plus grand que le nombre à trouver
			if (nbGuess > nb) {
				System.out.println("Le nombre est inférieur");
			}
			// Si le nombre renseigné est plus petit que le nombre à trouver
			if (nbGuess < nb) {
				System.out.println("Le nombre est supérieur");
			}
			// Incrémentation du compteur
			compteur++;
			// La condition de la boucle !(condition) indique que c'est le contraire de la
			// condition entre les parenthése
		} while (!(nbGuess == nb));

		// Affichage du message de réussite avec le compteur

		System.out.println("Tu as trouvé en " + compteur + " coups!");
	}

	/*
	 * 02-Imperatif Exercices Exercice 2
	 */
	public static void exercice6() {
		// Le programme lit le nombre renseigné
		int n = Lecteur.lireEntier("Entrez un nombre entre 0 et 10000: ");
		// Verification que le nombre renseigné est correcte
		if (n < 0 || n > 10000) {
			// Affichage du'un message d'erreur
			System.out.println("Le nombre doit être compris entre 0 et 10000.");
		} else {
			// Si le nombre est bon utilise la fonction de calcul de la racine carée créé
			// plus bas
			int racineCarree = calculerRacineCarree(n);
			System.out.println("La racine carrée entière de " + n + " est: " + racineCarree);
		}

	}

	// Fonction pour trouver la racine carré
	public static int calculerRacineCarree(int n) {
		/*
		 * Déclaration des variables
		 */
		int debut = 0;
		int fin = n;
		int resultat = 0;
		// Creation d'une boucle while
		while (debut <= fin) {
			// Calcul le milieu du nombre
			int milieu = (debut + fin) / 2;
			int carre = milieu * milieu;
			// Si le milieu que multiplie le mileu == le nombre alors c'est la racine carré
			if (carre == n) {
				// On a trouvé la racine exacte
				return milieu;
				// Si milieu * milieu < N, alors milieu est trop petit et on ajuste debut pour
				// qu’il soit plus grand que milieu
			} else if (carre < n) {
				debut = milieu + 1;
				resultat = milieu;
				// Si milieu * milieu > N, milieu est trop grand et on ajuste fin
			} else {
				fin = milieu - 1;
			}
		}
		// Retourne la racine carrée entière
		return resultat;
	}

	/*
	 * 02-Imperatif Exercices Exercice 3
	 */
	public static void exercice7() {
		// declaration des variable nescessaire
		int goodResponse = 0;
		// Demande et assignation du nombre voulu par l'utilisateur
		int n = Lecteur.lireEntier("Quelle table de multiplication souhaitez-vous réviser ?");
		// Demande et assignation du nombre de question voulu
		int nbQuestion = Lecteur.lireEntier("Combien de questions souhaitez-vous ?");
		// boucle for car nous savons combien d'itération il va y avoir
		for (int i = 1; i <= nbQuestion; i++) {
			// Demande et assignation des réponses
			int response = Lecteur.lireEntier(i + "/" + nbQuestion + "Combien font " + i + "x" + n + "?");
			// verifie si la réponse est correcte
			if (response == i * n) {
				// Augmente le compteur de bonne réponse
				goodResponse++;
			}
			// Annonce le nombre de bonne réponse sur le nombre total de quetion posées
			System.out.println("Vous obtenez la note de " + goodResponse + " sur " + nbQuestion);

		}
	}
	
	public static void exercice8() {
		// Demande de saisie de la chaîne de caractères
		String phrase = Lecteur.lireTexte("Entrez une phrase à tester pour le palindrome: ");

		String phraseSansAccent = supprimerAccents(phrase);

		// Appel de la fonction palindrome et affichage du résultat
		boolean estPalindrome = palindrome(phraseSansAccent);
		if (estPalindrome) {
			System.out.println("La phrase est un palindrome.");
		} else {
			System.out.println("La phrase n'est pas un palindrome.");
		}

	}

	// Fonction qui détermine si une chaîne est un palindrome.

	public static boolean palindrome(String chaineATester) {
		// Normalisation de la chaîne pour ignorer les espaces, la ponctuation, et la
		// casse
		String normalisee = chaineATester.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

		// Vérification du palindrome en comparant la chaîne avec son inverse
		String inverse = new StringBuilder(normalisee).reverse().toString();
		return normalisee.equals(inverse);
	}

	// Fonction qui supprime les accents d'une chaîne.
	public static String supprimerAccents(String chaine) {
		// Utilisation de Normalizer pour séparé les accent de la phrase
		String sansAccents = Normalizer.normalize(chaine, Normalizer.Form.NFD);
		// Permet d'enlever tout les caractére qui ne sont pas des lettres
		sansAccents = sansAccents.replaceAll("[^\\p{ASCII}]", "");
		// Retourne la phrase sans accent
		return sansAccents;
	}

	public static void exercice9() {
		/*
		 * Chemin du fichier Doit bien faire refernce à l'emplacement du fichier
		 */
<<<<<<< Updated upstream
		String cheminFichier = "C:\\Users\\torrs\\Documents\\GitHub\\exercice\\src\\edu\\lig03\\exercice\\liste_mot_francais.txt";
=======
		String cheminFichier = "C:\\Users\\torrs\\eclipse-workspace\\exercice\\src\\edu\\lig03\\exercice\\listMot.txt";
>>>>>>> Stashed changes
		// Création d'une liste pour stocker les mots présent dans le fichier
		List<String> mots = new ArrayList<>();
		// Test pour verifier la presence du fichier au chemin specifier
		try (BufferedReader lecteur = new BufferedReader(new FileReader(cheminFichier))) {
			String ligne;
			// Tant qu'une ligne existe la lit
			while ((ligne = lecteur.readLine()) != null) {
				// Met la ligne en miniscule
				ligne.toLowerCase();
				// Ajout de la ligne dans notre liste
				mots.add(ligne);
			}
			// Affiche une erreur si le fichier n'est pas présent
		} catch (IOException e) {
			System.err.println("Erreur de lecture du fichier : " + e.getMessage());
		}
		Random rand = new Random();
		// Prend un mot aleatoire dans notre liste et prend la teille de la liste pour
		// permettre de futur changement
		String mot = mots.get(rand.nextInt(mots.size()));
		List<Character> propositions = new ArrayList<>();
		//System.out.println(mot);
		etatDuMot(mot, propositions);
		int erreurs = 0;
		//fait tourner la boucle indefiniment jusqu'a atteindre un break
		while (true) {
			//Utilise la fonction afficherPendu
			afficherPendu(erreurs);
			//Condition de défaite
			if (erreurs >= 6) {
				System.out.println("Vous avez perdu!");
				System.out.println(mot);
				break;
			}
			//Utilise la fonction enregsitreProposition
			if (!enregsitreProposition(mot, propositions)) {
				erreurs++;
			}
			//Utilise la fonction etatDuMot
			if (etatDuMot(mot, propositions)) {
				System.out.println("Vous avez gagné!");
				break;
			}

		}

	}
	//Fonction pour afficher l'évolution du pendu
	private static void afficherPendu(int erreurs) {
		System.out.println(" _______");
		System.out.println(" |     |");
		if (erreurs >= 1) {
			System.out.println(" O");
		}
		if (erreurs >= 2) {
			System.out.print("\\ ");
			if (erreurs >= 3) {
				System.out.println("/");
			} else {
				System.out.println();
			}
		}
		if (erreurs >= 4) {
			System.out.println(" |");
		}
		if (erreurs >= 5) {
			System.out.print("/ ");
			if (erreurs >= 6) {
				System.out.println("\\");				
			} else {
				System.out.println();
			}
		}
	}
	//Fonction qui enregistre les propositions de l'utilisateur
	private static boolean enregsitreProposition(String mot, List<Character> propositions) {
		String lettrePropose = Lecteur.lireTexte("Choisir une lettre");
		propositions.add(lettrePropose.charAt(0));

		return mot.contains(lettrePropose);
	}
	//Fonction qui montre l'avancement de la découverte du mot
	private static boolean etatDuMot(String mot, List<Character> propositions) {
		int nombreLettreTrouve = 0;
		for (int i = 0; i < mot.length(); i++) {
			if (propositions.contains(mot.charAt(i))) {
				System.out.print(mot.charAt(i));
				nombreLettreTrouve++;
			} else {
				System.out.print("-");
			}
		}
		System.out.println();
		return (mot.length() == nombreLettreTrouve);
	}

	public static void main(String[] args) {
//		 exercice1();
//		 exercice2();
//		 exercice3();
//		 exercice4();
//		exercice5();
//		exercice6();
<<<<<<< Updated upstream
		exercice7();
//		exercice8();
//		exercice9();
=======
//		exercice7();
//		exercice8();
		exercice9();
>>>>>>> Stashed changes
	}

}
