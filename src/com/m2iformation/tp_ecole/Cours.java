package com.m2iformation.tp_ecole;

import java.util.ArrayList;

public class Cours {
	// un nom , un nombre d’heures et une année
	private String nom;
	private int nbHeures;
	private int annee;
	private ArrayList<Eleve> eleves = new ArrayList<>();

	public Cours() {
	}

	public Cours(String nom, int nbHeures, int annee) {
		this.nom = nom;
		this.nbHeures = nbHeures;
		this.annee = annee;
	}

	public void inscription(Eleve eleve){
		this.eleves.add(eleve);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHeures() {
		return nbHeures;
	}

	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Cours{" +
				"nom='" + nom + '\'' +
				", nbHeures=" + nbHeures +
				", annee=" + annee +
				", eleves=" + eleves +
				'}';
	}
}
