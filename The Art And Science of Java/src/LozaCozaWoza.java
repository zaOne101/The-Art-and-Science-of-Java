/*
 * File: LozaCozaWoza.java
 * -----------------------
 * Program care afiseaza numerele de la 1 la 110, iar pentru numerele care se 
 * impart la 3 se va afisa "Coza", pentru numerele care se impart la 5 se va 
 * afisa "Loza", pentru numerele care sunt divizibile cu 7 se va afisa "Woza".
 * Daca numarul este divizibil cu 3 si 5, se va scrie "CozaLoza" si asa mai 
 * departe.
 */

import java.util.*;

public class LozaCozaWoza {

	public static void main(String[] args) {
		System.out.println("Acest program afiseaza numerele de la 1 la 100");
		System.out.println("iar daca numarul este divizibil cu 3 se va afisa ");
		System.out.println("'Coza', pentru numerele divizibile cu 5 se va afisa");
		System.out.println("'Loza', iar pentru numerele divizibile cu 7 se va");
		System.out.println("'Woza'");
		for ( int i = 1; i <= MAX_NUM; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					 if (i % 7 == 0) {
						 System.out.println("CozaLozaWoza");
					 } else
					 System.out.println("CozaLoza");
				 } else {
					 System.out.println("Coza");
				 }
			} else if ( i % 5 == 0) {
				if ( i % 7 == 0) {
					System.out.println("LozaWoza");
				} else {
					System.out.println("Loza");
				}
			} else {
				System.out.println(i);
			}
		}
	}
/*Private constants */
	private static final int MAX_NUM = 110;

}
