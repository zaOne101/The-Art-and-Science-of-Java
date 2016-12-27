/*
 * File: FeetToMeters.java
 * -----------------------
 * @Daniela Sofran
 * 4. Scrieti un program care face conversia intre feet si metri folosinf metodele:
 * Convert from feet to meters 
 * 		public static double footToMeter(double foot)
 * 
 * Convert from meters to feet 
 * 		public static double meterToFoot(double meter)
 * @
 * formula de conversie este:
 * meter = 0.305 * foot
 * foot = 3.279 * meter
 */

import java.util.*;

public class FeetToMeters {

	public static void main(String[] args) {
		System.out.println("This program converts feet into meters and meters into feet");
		Scanner input = new Scanner(System.in);
		System.out.println("Introduceti feet: ");
		double feet = input.nextDouble();
		System.out.println(feet + " feet = " + footToMeter(feet) + " meters");
		System.out.println("Introduceti meters: ");
		double meters = input.nextDouble();
		System.out.println(meters + " meters = " + meterToFoot(meters) + " feet");
		input.close();
	}
	
	/** Convert from feet to meters */
	public static double footToMeter(double feet) {
		double meters =  0.305 * feet;
		return meters;
	}
	
	/** Convert from meters to feet */
	public static double meterToFoot(double meter){
		double feet = 3.279 * meter;
		return feet;
	}
}
