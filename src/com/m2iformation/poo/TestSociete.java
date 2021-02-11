package com.m2iformation.poo;

public class TestSociete {

	public static void main(String[] args) {
		
		Adresse ad = new Adresse("rue du maréchal leclerc", 321, "Lille");
		
		Societe google = new Societe();
		
		google.setNom("Google");
		google.setAdresse(ad);
		
		System.out.println(google);
		
		Societe amazon = new Societe("Amazon", ad);
		
		System.out.println(amazon);
		
		
		ad.setVille("Lyon");
		ad.setNumDeRue(1278);
		
		System.out.println(google);
		System.out.println(amazon);
		
		
	}

}
