package com.practice.collections;
import java.util.*;

public class ComparableInterfaceDemo {

	public static void main(String[] args) {

		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(2);
		intList.add(9);
		intList.add(33);
		intList.add(6);
		
		System.out.println("------Integer ArrayList before Sorting--------");
		intList.forEach(System.out::println);
		
		/*
		 * Collections is the class and Sort() is the method which sort the 
		 * elements of the arrayList in natural order whether it is Integer or String
		 * 
		 * internally in sort() method, swapping is done on the basis of 
		 * positive integer or negative integer
		 */
		Collections.sort(intList);
		
		System.out.println("\n\n-------ArrayList after Sorting--------");
		intList.forEach(System.out::println);
		
		
		ArrayList<String> stringList=new ArrayList<String>();
		stringList.add("hello");
		stringList.add("black");
		stringList.add("blue");
		stringList.add("22");
		
		System.out.println("\n\n------String ArrayList before Sorting-------");
		stringList.forEach(System.out::println);
		
		Collections.sort(stringList);
		
		System.out.println("\n\n------String ArrayList after Sorting--------");
		stringList.forEach(System.out::println);
		
		
		ArrayList<Details> detailList=new ArrayList<Details>();
		detailList.add(new Details(2,"first"));
		detailList.add(new Details(54,"second"));
		detailList.add(new Details(9,"third"));
		detailList.add(new Details(14,"forth"));
		
		System.out.println("\n\n--------Custom Type ArrayList before sorting-----------");
		detailList.forEach(System.out::println);
		
		/*
		 * we are using sort method of collections class on our Custom class
		 * 
		 * this is possible only when we have implemented the Comparable Interface and
		 * its method in order to do comparison between the data and then arrange them
		 * in ascending or descending order
		 */
		
		Collections.sort(detailList);
		
		System.out.println("\n\n--------Custom Type ArrayList after sorting usign Comparable Interface-----------");
		detailList.forEach(System.out::println);
	}
}




/*
 * in this class we are implementing the comparable interface
 * the motive behind to implement this interface is
 * 
 * we need to compare the elements and swap them in order to sort
 * and arrange them in ascending order
 * 
 *  so if we want to use custom type arraylist and requires to sort the elements
 *  and arrange them in ascending order then we have to do this thing
 */

class Details implements Comparable<Details>
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Details(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Details [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	/*
	 * 		COMPARISON STRATEGY
	 */
	
	/*
	 * here we are overriding the compareTo() method of comparable interface
	 * 
	 * in this we are checking the elements in order to swap and arrange in 
	 * ascending order.
	 * 
	 * so here there are two things : 
	 * 
	 * if +ve integer is return from the compareTo() method then the two elements 
	 * will swap among them
	 * 
	 * if -ve integer is returned from the compareTo() method then the order
	 * of these two elements remain the same 
	 * 
	 * 		:: this is internal to swap the no. if there is +ve from compareTo()
	 * 			and order remain same if there is -ve from compareTo()
	 */
	
	/*
	 * here we are first try to compare the rollno of details class
	 */
	
	
	//------------------------------------------------------------
	
	/*
	 * this will sort in ascending order
	 */
	/*@Override
	public int compareTo(Details details) {
		if(this.getRollno() > details.getRollno())
			return 1;
		else
			return -1;
	}*/
	
	//------------------------------------------------------------
	
	/*
	 * this will sort in descending order by changing the sing of comparison
	 */
	@Override
	public int compareTo(Details details) {
		if(this.getRollno() < details.getRollno())
			return 1;
		else
			return -1;
	}
	
	
	/*
	 * here the sorting is done on the basis of name (String)
	 */
	
	/*@Override
	public int compareTo(Details detail) {
		return this.name.compareTo(detail.name);
	}*/
		
}