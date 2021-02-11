package com.m2iformation.poo;

public class Societe {
	private String nom;
	private String ville;
	
	public Societe() {
	}

	public Societe(String nom) {
		this.nom = nom;
	}

	public Societe(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Societe [nom=" + nom + ", ville=" + ville + "]";
	}
	
}
