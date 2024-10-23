package edu.lig03.objet.societe;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Création de la societe Sysord
		Societe sysord = new Societe("48980356", FormeJuridique.SARL, "SYSORD", new Date(106, 3, 14), "0102030405",
				20000l);
		Societe sysord2 = new Societe("48980356", FormeJuridique.SARL, "SYSORD", new Date(106, 3, 14), "0102030405",
				20000l);

		// Création de la societe Airbus
		Societe airbus = new Societe("384474814", FormeJuridique.SAS, "SYSORD", new Date(91, 9, 18), "3302030405",
				39000000000l);

		// Création de la societe AliceConseil
		Societe aliceConseil = new Societe("808424980", FormeJuridique.EURL, "ALICE CONSEIL", new Date(115, 0, 1),
				"4402030405", 5000l);

//		System.out.println(sysord);
//		System.out.println(sysord.equals(sysord2));
		Person sylvain = new Person("Torrenti", "Sylvain",aliceConseil);
		System.out.println(sylvain);
	}

}
