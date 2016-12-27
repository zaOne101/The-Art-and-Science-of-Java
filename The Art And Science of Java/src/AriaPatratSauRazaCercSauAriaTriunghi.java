/*
 * File: AriaPatratSauRazaCercSauAriaTriunghi.java
 * ------------------------------------------------
 * Program care afiseaza, in functie de preferinte, aria unui patrat, aria unui cerc cu
 * raza unui cerc, sau aria unui triunghi. Exercitiul 11 din slide.
 * @ItSchool
 */

import java.util.*;

public class AriaPatratSauCercSauTriunghi {

	public static void main(String[] args) {
		System.out.println("Acest program poate calcula, in functie de");
		System.out.println("preferintele dumneavoastra, aria unui patrat");
		System.out.println("sau raza unui cerc sau aria unui triunghi");
		Scanner input = new Scanner(System.in);
		System.out.println("Daca doriti sa calculati aria unui patrat, apasati 1");
		System.out.println("Daca doriti sa calculati raza unui cerc, apasati 2");
		System.out.println("Daca doriti sa calculati aria unui triunghi, apasati 3");
		int selectie = input.nextInt();
		switch (selectie) {
			case 1 : { 
				System.out.println("Introduceti latura patratului: ");
				int latura = input.nextInt();
				int aria = latura * latura;
				System.out.println("Aria patratului cu latura de " + latura + "este de " + aria );
				break;
			}
			case 2 : {
				System.out.println("Introduceti raza cercului: " );
				double raza = input.nextInt();
				final double PI = 3.141592;
				double aria = raza * raza * PI;
				System.out.println("Aria cercului cu raza de " + raza + " este de " + aria);
				break;
			}
			case 3 : {
				System.out.println("Introduceti baza si inaltimea triunghiului: ");
				int baza = input.nextInt();
				int h = input.nextInt();
				double aria =( baza * h ) / 2;
				System.out.println("Aria triungjului cu baza de " + baza + " si inaltimea de " + h + "este de: " + aria);
				break;
			}
			default : System.out.println("Va rugam sa introduceti una din optiuni, 1 , 2 , sau 3.");
			
		}
		input.close();
		
	}

}
