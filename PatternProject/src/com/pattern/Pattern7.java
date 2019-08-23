package com.pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j,k;
		/*for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}*/
		
		
		 for ( i = 1; i <= rows; i++) 
		 {
	            for ( j = 1; j <= rows - i; j++) 
	            {
	                System.out.print(" ");
	            }
	            for ( k = 1; k <= i; k++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }

	}

}
