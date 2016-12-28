/*
 * File : MediaAritmetica.java
 * -----------------------------------
 * Program care afiseaza suma numerelor care au fost introduse , pana cand 
 * userul introduce numarul 0. Este exercitiul 13 din Slide.
 */

import java.util.*;

public class MediaAritmeticaSentinel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Acest program afiseaza suma numerelor pe care le introduceti");
		System.out.println("Introduceti numerele, iar cand doriti sa va opriti, introduceti " + SENTINEL);
		double numar = input.nextDouble();
		double total = 0;
		while (numar != SENTINEL) {
			total += numar;
			numar = input.nextDouble();
		}
		System.out.println("Totalul este de : " + total);
		input.close();
	}

	private static final int SENTINEL = 0;
}
