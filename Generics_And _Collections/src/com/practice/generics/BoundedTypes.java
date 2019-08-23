package com.practice.generics;

public class BoundedTypes {

	public static void main(String[] args) {

		Integer integerArray[]={1,2,3,4,5};
		PrintSum<Integer> integerObject=new PrintSum<Integer>();
		integerObject.print(integerArray);
		
		Double doubleArray[]={1.0,2.1,3.2,4.3,5.4};
		PrintSum<Double> doubleObject=new PrintSum<Double>();
		doubleObject.print(doubleArray);
				
		/*PrintSum<String> stringObject=new PrintSum<String>();
		 *
		 * 
		 * Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type PrintSum<T>
		 * 
		 * 
		 * it doesn't accept the String Type Parameter since it don't extends the Number Class
		 * 
		 * */ 
		
		
	}

}


//BOUNDED TYPE CLASS

			//IT ONLY ACCEPT THE CLASSES WHO EXTENDS THE NUMBER CLASS such as : Integer,Float,Double
class PrintSum<T extends Number>
{
	public void print(T[] arr)
	{
		double sum=0;
		for(T value:arr)
		{
			sum=sum+value.doubleValue();	//we take double value since we are returning sum in DOUBLE
		}
		System.out.println("sum : "+sum);
	}
}



/*
 *here we are only making our method GENERIC (Number) instead of class
 *Although there is no difference between these two but still  
 */

class PrintSumMethodGeneric
{
	public <T extends Number> void print(T[] arr)
	{
		double sum=0;
		for(T value:arr)
		{
			sum=sum+value.doubleValue();	//we take double value since we are returning sum in DOUBLE
		}
		System.out.println("sum : "+sum);
	}
}
