/*
 * File : SumDigits.java
 * ---------------------
 * 1. Scrieti un program care calculeaza suma cifrelor unui numar. Folositi o metoda cu urmatorul antet:
 * public static int sumDigits(long n)
 * ex.  sumDigits(234); returneaza 9 (2+3+4)
 */


import java.util.*;

public class SumDigits {

                 public static void main(String[] args) {
                                Scanner input = new Scanner(System.in );
                                System. out.println("This program calculates the sum of the digits of an integer number.");
                                System. out.println("Enter number: ");
                                 long num = input.nextLong();
                                input.close();
                                System. out.println("The sum of the digits is: " + digitSum(num));
                }
                
                 private static long digitSum(long n) {
                                 long dSum = 0;
                                 while (n > 0) {
                                                 dSum += n % 10;
                                                 n /= 10;
                                 }
                                 return dSum;
                }

}
