/*
 * File: AnBisect.java
 * -------------------
 * Acest program arata daca un anumit an este sau nu bisect.
 * Este exercitiul 7 din curs.
 * Un an este bisect atunci cand este divizibil la 4, doar daca nu 
 * este divizibil cu 100. Cand este divizibil cu 100, este an bisect
 * doar daca este divizibil cu 400. 
 * 
 */

import java.util.*;

public class AnBisesct {

	public static void main(String[] args) {
		System.out.println("Acest program verifica daca un anumit an este bisect.");
		Scanner input = new Scanner(System.in);
		System.out.print("Introduceti anul: ");
		int an = input.nextInt();
		boolean esteBisect = ((an % 4 == 0) &&( an % 100 != 0)) || (an % 400 == 0);
		if (esteBisect) {
			System.out.println("Acest an este bisect.");
		} else {
			System.out.println("Acest an nu este bisect.");
		}
		input.close();
	}

}
