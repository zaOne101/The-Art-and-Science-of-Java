/*
 * File: CateNumerePareSiImpare.java
 * ---------------------------------
 * Program care citeste numere de la tastatura pana la inalnirea valorii de 0, dupa care
 * se opreste si afiseaza cate numere sunt pare si cate sunt impare.
 * Este exercitiul 16 din Slide.
 * @ItSchool
 */
import java.util.*;

public class CateNumerePareSiImpare {

	public static void main(String[] args) {
		System.out.println("Acest program citeste numere de la tastatura pana");
		System.out.println("la intalnirea valorii 0, dupa care afiseaza cate ");
		System.out.println(" numere pare s-au introdus si cate numere impare.");
		Scanner input = new Scanner(System.in);
		System.out.println("Introduceti numere, cate 1 pe rand, iar cand ati ");
		System.out.println(" terminat introduceti valoarea 0" );
		int numar = input.nextInt();
		int countPair = 0;
		int countImpair = 0;
		if (numar % 2 == 0) {
			countPair = 1;
		} else {
			countImpair = 1;
		}
		while (numar != SENTINEL) {
			numar = input.nextInt();
			if (numar % 2 == 0) {
				countPair++;
			} else {
				countImpair++;
			}
		}
		System.out.println(countPair + " sunt numere pare, iar " + countImpair + " sunt numere impare");	
		input.close();
	}
/* Private constants */
	private static final int SENTINEL = 0;
}
