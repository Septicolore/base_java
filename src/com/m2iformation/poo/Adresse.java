package com.m2iformation.poo;

public class Adresse {
	
	private String nomDeRue;
	private int numDeRue;
	private String ville;
	
	public Adresse() {}
	
	public Adresse(String nomDeRue, int numDeRue, String ville) {
		this.nomDeRue = nomDeRue;
		this.numDeRue = numDeRue;
		this.ville = ville;
	}

	public String getNomDeRue() {
		return nomDeRue;
	}

	public void setNomDeRue(String nomDeRue) {
		this.nomDeRue = nomDeRue;
	}

	public int getNumDeRue() {
		return numDeRue;
	}

	public void setNumDeRue(int numDeRue) {
		this.numDeRue = numDeRue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [nomDeRue=" + nomDeRue + ", numDeRue=" + numDeRue + ", ville=" + ville + "]";
	}

}
