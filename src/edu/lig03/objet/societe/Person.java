package edu.lig03.objet.societe;

public class Person {
	private String nom;
	private String prenom;
	private Societe employeur;
	
	
	public Person(String nom, String prenom, Societe employeur) {
		this.nom = nom;
		this.prenom = prenom;
		this.employeur = employeur;
	}


	public Societe getEmployeur() {
		return employeur;
	}


	public void setEmployeur(Societe employeur) {
		this.employeur = employeur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "nom = " + nom + ", prenom = " + prenom + ", societe = " + employeur;
	}
	
	
}
