package com.pattern;

import java.util.Scanner;

public class Dare_Pattern1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j;
		
		for(i=1;i<=rows+1;i++)
		{
			for(j=rows;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();			
		}
		
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			int l=1;
			for(j=i;j<=rows;j++)
			{
				System.out.print(l + " ");
				l++;
			}
			System.out.println();
		}
	}

}
