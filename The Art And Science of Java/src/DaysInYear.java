/*
 * File: DaysInYear.java
 * ---------------------
 * @Daniela Sofran
 * 6. Scrieti un program care calculeaza numarul de zile dintr-un an
 * folosind o metoda cu urmatorul antet:
 * 		public static int numberOfDaysInAYear(int year)
 */

import java.util.*;

public class DaysInYear {

	public static void main(String[] args) {
	System.out.println("This program calculates the number of days for any given year");
	Scanner input = new Scanner(System.in);
	System.out.println("Enter year number: ");
	int year = input.nextInt();
	System.out.println("Year " + year + " has " + numberOfDaysInAYear(year) + " days.");
	input.close();
	}

	public static int numberOfDaysInAYear(int year) {
		if (isLeapYear(year)) {
			return NUM_DAYS_LEAP_YEAR; 
		} else {
			return NUM_DAYS_REGULAR_YEAR;
		}
	}
	
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) &&( year % 100 != 0)) || (year % 400 == 0);
	}
	
	private static final int NUM_DAYS_LEAP_YEAR = 366;
	private static final int NUM_DAYS_REGULAR_YEAR = 365;
}
