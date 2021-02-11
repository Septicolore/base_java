package com.m2iformation.poo;

public class TestSociete {

	public static void main(String[] args) {
		
		Societe google = new Societe();
		
		google.setNom("Google");
		google.setVille("San Francisco");
		
		System.out.println(google);
		
		
		Societe amazon = new Societe();
		
		amazon.setNom("Amazon");
		amazon.setVille("Los Angeles");
		
		
		// name pointe sur la référence N
		String name = "Samuel";
		// name pointe sur la référence O
		name = "samsam";
		// name pointe sur la référence F
		name = "sam";
		
		/*
		 * google.addSociete(amazon); // google.addSociete(&I)
		 * 
		 * System.out.println(amazon);
		 */
		
		/*
		 * int postalCode = 59600;
		 * 
		 * google.addNumber(postalCode);
		 * 
		 * System.out.println(postalCode);
		 */
		
		/*
		 * String pdg = "Sundar Pichai";
		 * 
		 * google.addPdg(pdg);
		 * 
		 * System.out.println();
		 */
	}

}
