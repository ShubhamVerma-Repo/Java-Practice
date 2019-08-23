package com.pattern;

import java.util.Scanner;

public class Dare_Pattern {

	public static void main(String[] args) {

		Scanner scan=new  Scanner(System.in);
		
		System.out.print("enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j,k=5,l=1;
		
		 /*l=5;
		 for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(l + " ");
			}
			l--;
			for (j = i; j <rows; j++) 
	        { 
	            System.out.print(k + " "); 
	        }          
			System.out.println(); 
		}*/
		
		//---------------------------------------------------
		
		for(i=rows;i>=1;i--)
		{
			for(j=i;j<=rows;j++)
			{
				System.out.print(j + " ");
			}
			for (j = l; j <rows; j++) 
	        { 
	            System.out.print(k + " "); 
	        }
			l++;
			System.out.println(); 
		}
	}

}
