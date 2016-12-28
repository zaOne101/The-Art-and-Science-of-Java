/*
 * File: Table.java
 * -----------------
 * Scrieti o metoda care calculeaza urmatorul sir: 
 * m(i) = 1/ 2 + 2 / 3 + ... + i / i + 1
 * si sa afiseze un tabel pentru i <= 20
 */

import java.util.*;

public class Table {

	public static void main(String[] args) {
		System.out.println("This program generates a table");
		int TABLE_MAX = 20;
		generateTable(TABLE_MAX);
		
	}
	private static void generateTable(int max) {
		System.out.println("i      m(i)");
		double mi = 0;
		for (int i = 1; i <= max; i ++) {
			mi += m(i);
			System.out.println(i + "      " + mi);
		}
	}
	
	private static double m(int i) {
		double m =(double) i / (i + 1);  
		return m;
	}

}
