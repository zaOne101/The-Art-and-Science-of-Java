/*
 * File: CelsiusToFahrenheit.java
 * -------------------------------
 * 3. Scrieti un program care face conversia intre Celsius si Fahrenheit avand metodele:
 *  Convert from Celsius to Fahrenheit 
 *		public static double celsiusToFahrenheit(double celsius)
 *  Convert from Fahrenheit to Celsius 
 *  	public static double fahrenheitToCelsius(double fahrenheit)
 *  formula de conversie este:
 *  	fahrenheit = (9.0 / 5) * celsius + 32
 *  	celsius = (5.0 / 9) * (fahrenheit – 32)
 * @ItSchoool from previously solved @EricRoberts
 */

import java.util.*;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		System.out.println("Program care converteste gradele Celsius in Farenheight si invers");
		Scanner input = new Scanner(System.in);
		System.out.println("Introduceti gradele in Celsius: ");
		double celsius = input.nextDouble();
		System.out.println(celsius + " grade Celsius sunt " + celsiusToFahrenheit(celsius) + " grade Fahrenheit" );
		System.out.println("Introduceti gradele in Fahrenheit");
		double fahrenheit = input.nextDouble();
		System.out.println(fahrenheit + " grade Fahrenheit sunt " + fahrenheitToCelsius(fahrenheit) + " grade Celsius");
		input.close();
	}
	
	/** Convert from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius =  (5.0 / 9) * (fahrenheit - 32);
		return celsius; 
	}
	
}
