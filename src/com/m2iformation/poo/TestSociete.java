package com.m2iformation.poo;

public class TestSociete {

	public static void main(String[] args) {
		
		Societe google = new Societe();
		
		google.setNom("Google");
		google.setVille("San Francisco");
		
		System.out.println(google);
		
		
		Societe amazon = new Societe("Amazon", "LA");
		
		
	}

}
