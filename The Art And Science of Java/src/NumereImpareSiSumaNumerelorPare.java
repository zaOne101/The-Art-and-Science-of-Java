/*
 * File: NumereImpareSiSumaNumerelorPare.java
 * -------------------------------------------
 * english translation pair numbers and impair numbers
 * Program care afiseaza toate numerele impare si suma numerelor pare de la
 * 1 la 100. Exercitiul 12 din Slide. 
 *
 */
public class NumereImpareSiSumaNumerelorPare {

	public static void main(String[] args) {
		System.out.println("Program care afiseaza numerele impare si suma numerelor pare de la 1 la 100");
		int parSum = 0;
		for (int i = 1; i <= MAX; i++) {
			if ( i % 2 == 0) {
				parSum += i;
			} else {
				System.out.println( i + " este numar impar.");
			}
		}
		System.out.println("Suma numerelor pare este de: " + parSum);
	}
	private static final int MAX = 100;
}
