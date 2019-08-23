package com.pattern;
import java.util.*;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j;
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
