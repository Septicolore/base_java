package com.m2iformation.poo;

public class Societe {
	private String nom;
	private Adresse adresse;
	
	public Societe() {
	}

	public Societe(String nom) {
		this.nom = nom;
	}

	public Societe(String nom, Adresse ad) {
		this.nom = nom;
		this.adresse = ad;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public final Adresse getAdresse() {
		return adresse;
	}

	public final void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Societe [nom=" + nom + ", adresse=" + adresse + "]";
	}
	
}
