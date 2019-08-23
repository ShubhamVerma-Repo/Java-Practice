package com.pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("enter the no of rows : ");
		int rows=scan.nextInt();
		
		int i,j,p,q;
		
		for(i=1;i<=rows;i++)
		{
			if (i % 2 == 0) {
				p = 0;
				q = 1;
			} else {
				p = 1;
				q = 0;
			}				
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(q);				
				else
					System.out.print(p);
			}
			System.out.println();
		}
	}

}
