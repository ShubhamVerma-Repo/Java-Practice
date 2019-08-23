package com.pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j;
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
