package com.practice.generics;

import java.util.Scanner;

public class TestedBoundedClass {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter two numbers  : ");
		/*Number x=scan.nextBigInteger();
		Number y=scan.nextBigInteger();*/
		
		Number first=scan.nextBigInteger();
		Number second=scan.nextBigInteger();
		
		/*
		 * Creating object of PrintCalculation class of <A> Type or <B> Type
		 */
		PrintCalculation<A> obj=new PrintCalculation<A>();
		obj.Print(new A().sum(first,second));
		
		PrintCalculation1<B> obj1=new PrintCalculation1<B>();
		obj1.Print(new B().multiplication(first,second));
		
		
	}

}

/*
 * Creating a BOUNDED CLASS PrintCalculation which bounded by the INTERFACE ( Test1 )
 * Creating a BOUNDED CLASS PrintCalculation1 which bounded by the INTERFACE ( Test2 )
 * Now we only pass those classes or interfaces to this class who ( PrintCalculation || PrintCalculation1 )
 *  implements the INTERFACE ( Test1 or Test2 ) respectively 
 */

class PrintCalculation <T extends Test1>
{
	
	/*
	 * here we are taking Number in the argument because passing number can be anything
	 * int, double, float, short, byte who so ever extends Number class. 
	 */	
	public void Print(Number arr)
	{
			System.out.println("sum  : "+arr);
	}
}

class PrintCalculation1 <T extends Test2>
{
	public void Print(Number arr)
	{
			System.out.println("multiplication : "+arr);
	}
}

/*
 * Creating two different interfaces Test1 & Test2 to be implemented by the class
 */

interface Test1
{
	public Number sum(Number x,Number y);
}

interface Test2
{
	public Number multiplication(Number x,Number y);
}


/*
 * Creating two different classes A & B to implement two different interfaces Test1 & Test2 respectively
 */
class A implements Test1
{
	public Number sum(Number x, Number y) {

		return (int) x + (int)y;
	}
}

class B implements Test2
{
	public Number multiplication(Number x, Number y)
	{
		return (int) x * (int) y;
	}
}