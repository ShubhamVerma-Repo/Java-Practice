package com.pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j;
		
		for(i=1;i<rows;i++)
		{			
			for(j=i;j<=rows;j++)
			{
				System.out.print(j);
			}
			for(j=1;j<=i;j++)
			{
				if(j==1)
					continue;
				System.out.print("  ");
			}
			for(j=rows;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(i=rows;i>=1;i--)
		{			
			for(j=i;j<=rows;j++)
			{
				System.out.print(j);
			}
			for(j=i;j>=1;j--)
			{
				if(j==1)
					continue;
				System.out.print("  ");
			}
			for(j=rows;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
