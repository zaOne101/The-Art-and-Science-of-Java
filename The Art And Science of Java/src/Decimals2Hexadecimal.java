/*
 * File: Decimals2Hexadecimal.java
 * ------------------
 * @ Daniela Sofran
 * This program converts decimals to hex numbers.
 */

import java.util.*;

public class Dec2Hex {

	public static void main(String[] args) {
		/*Creates a scanner */
		Scanner input = new Scanner(System.in);
		
		/*Prompts the user a message and asks for a number*/
		System.out.println("This program converts a decimal to its equivalent hex number.");
		System.out.println("Enter a decimal number: ");
		int decimal = input.nextInt();
		int temp = decimal;
		
		/*Converts a number to hex */
		String hex ="";
		
		while (temp != 0) {
			int hexValue = temp % 16;
			
			//Convert a decimal value to a hex digit
			char hexDigit = (hexValue <= 9 && hexValue >= 0) ? 
					(char)(hexValue + '0') : (char) (hexValue - 10 + 'A');
			hex = hexDigit + hex ;
			temp /= 16;
		}
		System.out.println( decimal + " decimal is the hex number: " + hex);
		input.close();
		

	}

}
