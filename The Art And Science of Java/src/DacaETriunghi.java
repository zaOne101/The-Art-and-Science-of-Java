/*
 * File : DacaETriunghi.java
 * -------------------------
 * Acest program verifica daca 3 numere oarecare pot fi laturile unui triunghi.
 * Este exercitiul 9 din slide, cu enuntul :
 * "Se cunosc 3 numere reale: a, b si c. Sa se verifice daca numerele pot fi 
 * laturile unui triungi, si in caz afirmativ, sa se determine natura triunghilui
 * in functie de laturi (echilateral, isoscel, oarecare). Trei numere pot fi 
 * laturile unui triunghi daca sunt pozitive si suma a orcare doua dintre ele 
 * este mai mare decat al treilea."
 * @Daniela Sofran
 */

import java.util.*;

public class DacaETriunghi {

	public static void main(String[] args) {
		System.out.println("Acest program verifica daca 3 numere oarecare pot fi laturile unui triunghi.");
		Scanner input = new Scanner(System.in);
		System.out.println("Introduceti cele 3 numere");
		System.out.print("Numarul 1: ");
		int a = input.nextInt();
		System.out.println("Numarul 2: ");
		int b = input.nextInt();
		System.out.println("Numarul 3: ");
		int c = input.nextInt();
		boolean esteTriunghi = ((a > 0) && (b > 0) && (c > 0)) && (((a + b) > c) || ((a + c) > b) || ((b + c) > a) );
		if (esteTriunghi) {
			if ( (a == b) && (a == c)) {
				System.out.println("Acest triunghi este echilateral");
			} else if ((a == b) || (a == c) || (b == c)) {
				System.out.println("Acest triunghi este isoscel.");
			} else {
				System.out.println ("Acest triunghi este un triunghi oarecare.");
			}
		} else {
			System.out.println("Acesta nu poate fi un triunghi");
		}
	}

}
