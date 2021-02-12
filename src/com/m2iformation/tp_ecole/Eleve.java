package com.m2iformation.tp_ecole;

public class Eleve {
	// un nom, prénom, âge et l’année du cours
	private String nom;
	private String prenom;
	private int age;
	private int annee;

	public Eleve() {
	}

	public Eleve(String nom, String prenom, int age, int annee) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.annee = annee;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Eleve{" +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", age=" + age +
				", annee=" + annee +
				'}';
	}
}
