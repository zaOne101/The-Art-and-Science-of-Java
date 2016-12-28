/*
 * File: SumaNumerelorImparePanaLaOValoareData.java
 * ------------------------------------------------
 * Program care citeste un numar de la tastatura si calculeaza suma numerelor 
 * impare mai mici sau egale decat valoarea data. Este exercitiul 17 din Slide.
 */
import java.util.*;

public class SumaNumerelorImparePanaLaOValoareData {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Acest program calculeaza suma numerelor impare pana");
		System.out.println("la o valoare data. Introduceti un numar mai mare de 0");
		int numar = input.nextInt();
		int sum = 0;
		for (int i = 0; i <= numar; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("Suma numerelor impare este de: " + sum);

	}

}
