package com.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) 
	{
		            	    
		            int matrix[][],matrix1[][];
		            int row, column;
		            	    
		            Scanner in = new Scanner(System.in);	
		            	
		            System.out.print("Number of rows :  ");
		            row = Integer.parseInt(in.nextLine());
		            		
		            System.out.print("Number of columns :  ");
		            column = Integer.parseInt(in.nextLine());
		            		
		            matrix = new int[row][column];
		            matrix1 = new int[row][column];
		            		
		            System.out.println("Enter the data :");
		            		
		            for(int i=0; i < row; i++)
		             {
		            			
		                for(int j=0; j < column; j++)
		                 {
		                     matrix[i][j] = in.nextInt();
		                 }
		            }
		                 
		              
		            System.out.println("\nThe Matrix is :");
		            	
		            for(int i=0; i < row; i++) 
		            {
		            			
		                for(int j=0; j < column; j++) 
		                {
		                    System.out.print("\t" + matrix[i][j]);
		                }
		                System.out.println();
		            }
		                    
		                 
		            System.out.print("Size of row : ");
		            int x =  matrix.length;
		            System.out.println(x);
		                
		            System.out.print("Size of column : ");
		            int y =  matrix[0].length;
		            System.out.println(y);
		             
		            System.out.println();
		            System.out.println();
		            
		            
		            	
		            //****************************************************
		            
		            
		            
		            	for(int i=0; i < row; i++) 
		            
		                   {
		             
		                      if(i%2==0)
		                    {
		                        for(int j=0; j < column; j++)
		            			{
		                                matrix1[i][j]=matrix[i][j];
		                                System.out.print(matrix1[i][j]);
		            
		            			}
		            
		                    }
		            
		                       else
		                       {
		                         for(int j=matrix[i].length-1; j < column; j--) 
		            		
		                        	{
		                        	    if(j>=0)
		                        	    {
		                        	    
		                        				matrix1[i][j]=matrix[i][j];
		                        				
		                        				System.out.print(matrix1[i][j]);
		                        	    }         
		                        	 }
		            			}  
		                       
		            }
		            
		            
		            //****************************************************
		            
		            
		            System.out.println();
		            System.out.println();
		            System.out.println("diagonal");
		            		
		            		
		            
		            for(int i=0; i <row; i++) 
		            {
		            		if(i!=2)
		            		{
		                        for(int j=0; j < column; j++) 
		                        {
		                        				if((i==0 && j!=2) || (i==1 && j==0))
		                        				{
		                        				 System.out.print(matrix[i][j]);   
		                        				}
		                        	
		                        }
		            		}		
		            }		
		            		
		            		
		            //****************************************************		
		            		
		            		for(int i=row; i >=0; i--) 
		            {
		            			
		            for(int j=0; j < column; j++) 
		            {
		            				if((i==0 && j==2) || (i==1 && j==1) || (i==2 && j==0))
		            				{
		            				 System.out.print(matrix[i][j]);   
		            				}
		            	
		            		}
		            		
		            }
		            
		            //****************************************************
		            
		            
		            for(int i=1; i <row; i++) 
		            {
		                        for(int j=1; j < column; j++) 
		                        {
		                        				if((i==1 && j==2) || (i==2 && j!=0))
		                        				{
		                        				 System.out.print(matrix[i][j]);   
		                        				}
		                        	
		                        }
		            }







	}

}
