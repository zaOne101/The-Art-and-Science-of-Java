/*
 * File: IsPalindromeAndPrime.java
 * --------------------------
 * 7. Verificati daca un numar este si palindrom si prim.
 * ex. 131 este si palindrom si prim
 */

import java.util.*;

public class IsPalindromeAndPrime {

	public static void main(String[] args) {
		System.out.println("This program checks if a number is both a palindrome and a prime number");
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number: ");
		long num = input.nextLong();
		if (isPalindromeAndPrime(num)) {
		System.out.println("Number " + num + "is a prime palindrome");
		} else {
			System.out.println("This is not a prime palindrome");
		}
		input.close();
	}
	
	private static boolean isPalindromeAndPrime(long num) {
		return (num % 2 != 0) && (isPalindrome(num));
	}
	
	private static boolean isPalindrome(long num) {
		long reversed = 0;
		long temp = num;
		 while (num > 0) {
             reversed = reversed * 10 + num % 10;
             num /= 10;
         }
		 return reversed == temp;
	}

}
