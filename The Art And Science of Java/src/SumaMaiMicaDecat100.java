/*
 * File: SumaMaiMicaDecat100.java
 * ------------------------------
 * Program care citeste de la tastatura numere cat timp suma lor este mai
 * mica decat 100, dupa care se opreste si afiseaza suma.
 * Este exercitiul 15 din Slide.
 *
 */

import java.util.*;

public class SumaMaiMicaDecat100 {

	public static void main(String[] args) {
		System.out.println("This program reads in numbers from the keyboard");
		System.out.println("and stops when their sum is greater than 100");
		System.out.println("and displays that sum.");
		System.out.println("Enter numbers, one per line: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;
		while ((sum + number) < 100) {
			sum += number;
			number = input.nextInt();
		}
		System.out.println("The sum of the numbers entered so far is " + sum);
		
		
	}

}
