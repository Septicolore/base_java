package com.m2iformation.tp_ecole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ecole {
	static List<Eleve> listeEleves = Arrays.asList(
			new Eleve("mich", "sam", 16, 2),
			new Eleve("toto", "titi", 17, 1),
			new Eleve("baffie", "laurent", 15, 2),
			new Eleve("duche", "jean-claude", 17, 3),
			new Eleve("beyonce", "beyonce", 17, 3),
			new Eleve("sartre", "jean-paul", 15, 1)
	);

	static ArrayList<Cours> listeCours = new ArrayList<>(Arrays.asList(
			new Cours("math", 150, 1),
			new Cours("math", 170, 2),
			new Cours("math", 205, 3),
			new Cours("anglais", 95, 1),
			new Cours("anglais", 105, 2),
			new Cours("anglais", 98, 3),
			new Cours("mécanique productique", 203, 1),
			new Cours("mécanique productique", 237, 2),
			new Cours("mécanique productique", 240, 3)
	));

	public static void main(String[] args) {
		for (Cours c: listeCours) {
			System.out.println("---------------- " + c.getNom() + " ----------------");

			for (Eleve el:listeEleves) {
				if (c.getAnnee() == el.getAnnee()){
					System.out.printf(
							"%s %s - %s : %d heures.%n",
							el.getPrenom(),
							el.getNom(),
							c.getNom(),
							c.getNbHeures()
					);
				}
			}

		}

	}
}
