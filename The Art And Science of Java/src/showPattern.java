/*
 * File: AfiseazaPatternul.java
 * ----------------------------
 * Program care afiseaza doua patternuri.
 * Este exercitiul 13.
 */

public class AfiseazaPatternul {

	public static void main(String[] args) {
		int max = 8;
		for (int i = max; i >= 1; i--) {
			for (int j = i; j >= 1; j--){
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		
		String pattern = " #";
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(pattern);
			}
			System.out.println("");
		}
	}

}
