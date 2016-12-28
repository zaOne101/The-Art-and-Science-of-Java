/*
 * File: MinimMaxim.java
 * ---------------------
 * Program care determina minimul si maximul dintre doua numere.
 * Este exercitiul nr 6 din curs.
 */

import java.util.*;

public class MinimMaxim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Acest program determina minimul si maximul dintre doua numere.");
		System.out.println("Introduceti primul numar: ");
		int numarul1 = input.nextInt();
		System.out.println("Introduceti numarul 2: ");
		int numarul2 = input.nextInt();
		if (numarul1 == numarul2) {
			System.out.println("Numerele sunt egale!");
		} else if (numarul1 > numarul2) {
			System.out.println(numarul1 +" este mai mare, deci este maximul.");
			System.out.println(numarul2 + " este minimul intre cele doua numere.");
		} else {
			System.out.println(numarul2 +" este mai mare, deci este maximul." );
			System.out.println(numarul1 + " este minimul intre cele doua numere.");
		}
	}

}
