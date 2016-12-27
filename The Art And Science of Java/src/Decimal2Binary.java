/*
 * File: Decimal2Binary.java
 * ---------------------
 * @Eric Roberts
 * Program that converts a decimal into it's binary equivalent.
 */

import java.util.*;

public class Decimal2Binary {

	public static void main(String[] args) {
		System.out.println("This program converts a decimal to it's binary equivalent");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a decimal number:");
		int decimal = input.nextInt();
		int temp = decimal;
		String binary = "";
		int remainder;
		while (temp > 0) {
			remainder = temp % 2;
			binary = binary + remainder;
			temp /= 2;
			}
		System.out.println(binary);
		char[] binArray = binary.toCharArray();
		for (int i = binArray.length - 1; i >= 0; i--) {
			System.out.print(binArray[i]);
			
		}
	}

}
