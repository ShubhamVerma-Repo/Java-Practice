package com.practice.generics;

import java.util.*;

public class IntroOfGeneric<T> {

	public void printArray(T[] arr)
	{
		
		/*
		 * checking the first element of array 
		 * by using { instanceof } and we are checking on Integer here
		 * if that first element is integer than ____ else ____ 
		 */
		if(arr[0] instanceof Integer){			
			System.out.println("interger type array : ");
		}
		else
			System.out.println("string type array : ");
		
		
		/*
		 * for loop to print array
		 */
		
		for(T value : arr)
		{
			System.out.print(value + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		/*
		 * Integer array to pass
		 * this integer array pass to the GENERIC CLASS 
		 */
		Integer[] intArray={1,2,3,4,5};
		
		/*
		 * String array to pass
		 * this string array pass to the GENERIC CLASS 
		 */
		String[] stringArray={"S","H","U","B","H","A","M"};
		
		/*
		 * making the object of IntroOfGeneric class of type (INTEGER)
		 * and passing the integer array to the GENERIC METHOD
		 */
		IntroOfGeneric<Integer> object1=new IntroOfGeneric<Integer>();
		//System.out.println("Integer type array : ");
		object1.printArray(intArray);
		
		/*
		 * making the object of IntroOfGeneric class of type (STRING)
		 * and passing the string array to the GENERIC METHOD
		 */
		IntroOfGeneric<String> object2=new IntroOfGeneric<String>();
		//System.out.println("String type array : ");
		object2.printArray(stringArray);
		
		
		Integer [] array=new Integer[5];		
		array[4]=9;
		int a=array[4];
		System.out.println(a);
		
		
		//NON GENERIC ARRAYLIST
		ArrayList list=new ArrayList();
		list.add(48);
		System.out.println( list.get(0));
		//int x=(int) list.get(0);
		//System.out.println(x);
		
		
		//GENERIC ARRAYLIST
		ArrayList<Integer> integerArray=new ArrayList<>();
		integerArray.add(32);
		int hj=integerArray.get(0);
		System.out.println(hj);
	}
	
}

