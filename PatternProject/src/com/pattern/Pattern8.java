package com.pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of rows : ");
		int rows=scan.nextInt();
		
		System.out.println(rows);
		/*
		for(int i=rows;i>0;i--)
		{
			//System.out.println("value of i "+i);
			for(int j=i;j>0;j--)
			{
				//System.out.println("value of j "+j);
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		

        // number of spaces 
        int i, j, k=2*rows; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<rows; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(j=0; j<k; j++) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
              
            // decrementing k after each loop 
            k = k - 2; 
              
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print(" *"); 
            } 
              
            // ending line after each row 
            System.out.println(); 
            
        }
            
	}
}