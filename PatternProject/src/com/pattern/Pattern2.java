package com.pattern;

import java.util.*;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, j, k = 1;

		System.out.print("Enter the no of rows : ");
		int rows = scan.nextInt();
		for (i = 1; i <= rows; i++) {
			for (j = 1; j <= i ; j++) {
				System.out.print(k++ + " ");
			}

			System.out.println();

		}

		int x, y;

		char z = 'A';

		for (x = 1; x <= rows; x++) {
			for (y = 1; y <= x; y++) {
				System.out.print(z++ + " ");
			}

			System.out.println();

		}

	}
}
