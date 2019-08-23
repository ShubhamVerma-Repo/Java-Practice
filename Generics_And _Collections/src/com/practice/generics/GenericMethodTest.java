package com.practice.generics;

public class GenericMethodTest {

	/*
	 * Creating a generic method 
	 * here we have to mention the parameter so we use <T> in method definition
	 */
	public static <T> void genericArrayMethod(T[] array)
	{
		for(T printArray:array)
		{
			System.out.print(printArray);
		}
	}
	
	public static void main(String[] args)
	{
		Integer [] integerArray={1,2,3,4,4};
		
		String [] stringArray={"A","A","A","A"};
		
		GenericMethodTest.genericArrayMethod(integerArray);
		
		GenericMethodTest.genericArrayMethod(stringArray);
	}
}
