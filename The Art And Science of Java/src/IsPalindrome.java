/*
 * File: IsPalindrome.java
 * ------------------------
 * 2. Scrieti un program care verifica daca un numar este palindrom folosind metodele:
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 *      public static int reverse(int number)
 * // Return true if number is a palindrome
 *                             public static boolean isPalindrome(int number)
 */



import java.util.*;

//This class is buggy. If digits are divisible by ten, then the reverse doesent print. numbers like 101, 100, 11110, are buggy
public class IsPalindrome {

                 public static void main(String[] args) {
                           		System. out.println("This program takes in a number, prints out it's reverse, then checks if the number is a Palindrome");
                                Scanner input = new Scanner(System.in);
                                System. out.println("Please enter an integer number: ");
                                 int num = input.nextInt();
                                System. out.println("The reverse number is " + reverse(num));
                                System. out.println("Is the number a palindrome? "+ isPalindrome(num, reverse (num)));
                                input.close();
                 }
                
                 private static int reverse(int n) {
                                 int reversed = 0;
                                 while (n > 0) {
                                                 reversed = reversed *10 + n % 10;
                                                 n /= 10;
                                 }
                                 return reversed;
                }
                
                 private static boolean isPalindrome( int n, int reversed) {
                                 return n == reversed;
                }

}
