package com.m2iformation;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JustePrix {

	public static void main(String[] args) {
//		int min = 100;
//		int max = 200;
//		int numberRandom = (new Random().nextInt((max - min) + 1)) + min;
		int numberRandom = (new Random().nextInt(100)) + 1;
//		int numberRandom = (int)(Math.random() * 100);
		int numberPlayer = -1;
		int numberOfTests = 6;

		Scanner sc = new Scanner(System.in);
		System.out.println("Tu vas jouer au juste prix. Tu devras choisir un chiffre entre 1 et 100.");

		do {
			System.out.println("Il te reste " + numberOfTests-- + " essais.");
			System.out.println("Choisis un entier entre 1 et 100 : ");
			numberPlayer = sc.nextInt();

			if (numberPlayer > numberRandom){
				System.out.println("Le juste prix est plus bas");
			}else if (numberPlayer < numberRandom){
				System.out.println("Le juste prix est plus grand");
			}else{
				System.out.println("Tu as trouvé le juste de prix : " + numberRandom);
				break;
			}

			if (numberOfTests <= 0) {
				System.out.println("Tu as perdu");
				break;
			}

		} while (numberRandom != numberPlayer);


	}

}


//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
////		int numberFind = 56;
//		int numberFind = new Random().nextInt(100) + 1;
//
//		int numberPlayer;
//
//		int numberOfTests = 0;
//
//		System.out.println("Bonjour nous allons jouer au juste prix");
//		System.out.println("Choisis un entier compris entre 1 et 100 afin de trouver le juste prix");
//
//		do {
//			System.out.print("Tu penses à quel nombre : ");
//			numberPlayer = sc.nextInt();
//			numberOfTests++;
//			if (numberPlayer < numberFind) {
//				System.out.println("Le juste est prix est plus grand");
//			} else if (numberPlayer > numberFind) {
//				System.out.println("Le juste est prix est plus petit");
//			} else {
//				System.out.println("Félicitations, tu as gagné. Il t'a fallu " + numberOfTests + " essai(s).");
//				break;
//			}
//			if (numberOfTests >= 6){
//				System.out.println("Désolé mais tu as perdu. Tu as eu le droit à tes 6 essais.");
//				break;
//			}
//
//		} while (numberPlayer != numberFind);
//
//	}
