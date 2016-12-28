/*
 * MediaSauSumaPatratelorSauSumaCuburilor.java
 * -------------------------------------------
 * Program care afiseaza suma artimetica a doua numere
 * reale, sau patratul sau cubul, dupa selectia userului? 
 * Este exercitiul 10 din Slide, cu urmatorul enunt: 
 * "Scrieti un program care citeste doua numere reale a si b,
 * apoi afiseaza media aritmetica, suma patratelor sau suma cuburilor,
 * in functie de dorinta utilizatorului."
 */

import java.util.*;

public class MediaSauSumaPatratelorSauSumaCuburilor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Acest program calculeaza media artimetica,");
		System.out.println("sau suma patratelor sau suma cuburilor a ");
		System.out.println("a doua numere.");
		System.out.println("Introduceti cele doua numere:");
		int numar1 = 0;
		int numar2 = 0;
		try { 
			numar1 = Integer.parseInt(input.nextLine());
			numar2 = Integer.parseInt(input.nextLine());
		} catch(NumberFormatException e) { 
			e.printStackTrace();
		}
		double mediaAritmetica =(double) (numar1 + numar2) / 2;
		double sumaPatratelor = (double) (numar1 * numar1 + numar2 + numar2);
		double sumaCuburilor = (double)(numar1 * numar1 * numar1 + numar2 * numar2 * numar2);
		System.out.println("Va rugam sa scrieti care din optiuni doriti a fi calculate:");
		System.out.println("media numerelor, suma patratelor sau suma cuburilor");
		String raspuns = input.nextLine();
		switch(raspuns) {
		case "media" : System.out.println("Media numerelor " + numar1 + " si " + numar2 + " este de: " + mediaAritmetica );
					   break;
		case "suma patratelor" : System.out.println("Suma patratelor numerelor " + numar1 + " si " + numar2 + " este de: " + sumaPatratelor); 
								 break;	
		case "suma cuburilor" : System.out.println("Suma cuburilor numerelor " + numar1 + " si " + numar2 + " este de: " + sumaCuburilor);
								 break;
		
		}
	}

}
