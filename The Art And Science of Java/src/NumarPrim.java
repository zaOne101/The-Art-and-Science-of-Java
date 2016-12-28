/*
 * File:  NumarPrim.java
 * ---------------------
 * Program care citeste de la tastatura daca un numar, verifica daca este prim 
 * si apoi afiseaza un mesaj in functie daca numarul este prim sau nu.
 * Este exercitiul 18 din slide.
 */
import java.util.*;

public class NumarPrim {

	public static void main(String[] args) {
		System.out.println("Acest program citeste un numar de la tastatura dupa");
		System.out.println("care afiseaza daca numarul este prim sau nu.");
		Scanner input = new Scanner(System.in);
		System.out.println("Introduceti un numar pozitiv: ");
		int n = input.nextInt();
		if (n < 0){
			System.out.println("Acest numar nu este pozitiv.");
		}
		else if (estePrim(n)) {
			System.out.println("Acesta este numar prim.");
		}
		else {
			System.out.println("Acest numar nu este prim.");
		}
		input.close();
	}
	private static boolean estePrim( int n) {
		boolean estePrm = true;
		for (int i = 2; i < n; i++) {
			if ( n == 1) {
				estePrm = true;
			}
			else if  (n % i == 0) {
				estePrm = false;
			}
		}
		return estePrm;
	}
}
