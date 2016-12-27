/* 
 * File: CountLettersInArray.java
 *-------------------------------
 * @ItSchool
 */

public class CountLettersInArray {

	public static void main(String[] args) {
		int[][] array1 = {
				{1, 2, 2, 2, 2},
				{2, 1, 2, 2, 2},
				{2, 2, 0, 2, 2},
				{2, 2, 2, 1, 2},
				{2, 2, 2, 2, 1}
		};
		int sum = 0;
		for (int i= 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (i == j) {
					sum += array1[i][j];
					System.out.println("Suma elemenelor parcurse pana acum este: " + sum);
					
				}
			}
		}
		
		int[][] array2 = new int[4][4];
		
		for ( int i = 0; i < array2.length; i ++) {
			for (int j = 0; j < array2.length; j ++){
				array2[i][j] = i; 
			}
		}
		int minus = 5;
		for (int i = array2.length; i >= 0; i--) {
			for (int j = array2[i].length; j >= 0; j--) {
				System.out.println("Array [" + i + "][" + j + "] = " + array2[i][j]);
				if (i == j && (i < array2.length) && j < array2.length) {
					minus -= array2[i][j];
					System.out.println("Array [" + i + "] [" + j + "] : " + i + " - " + j + " = " + minus);
				}
			}
			
		}
	}

}
