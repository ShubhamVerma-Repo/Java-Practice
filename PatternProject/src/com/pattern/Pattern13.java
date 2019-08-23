package com.pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j;
		
		for(i=1;i<=rows+2;i++)
		{
			if(i%2==0)
				continue;
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
			if(i%2==0)
				continue;
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
