package com.m2iformation.poo;

public class Societe {
	private String nom;
	private String ville;
	
	
	// Passage par copie
	public int addNumber(int number) {
		number++;
		System.out.println(number);
		return number;
	}
	
	// Passage par copie
	public String addPdg(String pdg) {
		pdg = pdg.toUpperCase();
		System.out.println(pdg);
		return pdg;
	}
	
	// Passage par référence
	public void addSociete(Societe soc) {
		soc.setNom(soc.getNom().toUpperCase());
		soc.setVille(soc.getVille().toUpperCase());
		System.out.println(soc);
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
