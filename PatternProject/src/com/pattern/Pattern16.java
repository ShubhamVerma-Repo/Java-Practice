package com.pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("enter rows of matrix : ");
		int rows=scan.nextInt();
		System.out.print("enter columns of matrix : ");
		int columns=scan.nextInt();
		
		int arr[][]= new int [rows][columns] ;
		
		System.out.println("enter the data of the matrix ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Matrix is : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				switch(i)
				{
				case 1: 
				}
			}
			
		}
		
	}

}
