/*
 * File: PunctajulInNota.java
 * --------------------------
 * Acest program  afiseaza nota unui elev in functie de punctaj.
 * Este exercitiul 8 din curs, care are urmatorul enunt: 
 * " Scrieti un program Java care sa determine nota unui student in
 * functie de punctajul obtinut dupa urmatoarele reguli: 
 * 1. Daca scorul este >= 90% => nota = A
 * 2. Daca scorul este >= 70% si < 90% => nota = B
 * 3. Daca scorul este >= 50% si < 70% => nota = c
 * 4. Daca scorul este < 50% => nota = F
 * Punctajul este de la 0 - 100 si se atribuie la inceputul programului unei variabile.
 * 
 */

import java.util.*;

public class PunctajulInNota {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Acest program calculeaza nota in functie de puntaj.");
		System.out.print("Introduceti punctajul(de la 0 la 100): ");
		int punctaj = input.nextInt();
		if (punctaj >= 90) {
			System.out.println("Nota corespondenta este A.");
		} else if ((punctaj <=70) && (punctaj < 90)) {
			System.out.println("Nota corespondenta este B.");
		} else if ((punctaj <= 50) && (punctaj < 70)) {
			System.out.println("Nota corespondenta este C.");
		} else if ((punctaj <= 0) && (punctaj < 50)) {
			System.out.println("Nota corespondenta este D.");
		} else {
			System.out.println("Input incorect. Introduceti puncajul viabil.");
		}
	}

}
