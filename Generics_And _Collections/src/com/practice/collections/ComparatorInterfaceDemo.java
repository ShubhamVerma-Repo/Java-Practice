package com.practice.collections;
import java.util.*;


/*
 * the main advantage of Comparator interface is :
 * 
 * we can define more than one comparison strategies
 * 
 * such as  ::
 * 				StudentComparator1 --> Arrange the studentList data in ascending order of Rollno
 * 				StudentComparator2 --> Arrange the studentList data in descending order of Rollno
 */

public class ComparatorInterfaceDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studList=new ArrayList<Student>();
		studList.add(new Student("shubham",55));
		studList.add(new Student("chirag",78));
		studList.add(new Student("vansh",21));
		studList.add(new Student("priyanka",32));
		
		System.out.println("----------student list before sorting--------");
		studList.forEach(System.out::println);
		
		
		/*
		 * here we know that our Student class does not implements the Comparable interface
		 * that is why our student Class is not able to sort the elements of its own
		 * 
		 * and we don't want to manipulate/add some data to our Student class
		 * so we make a new class i.e., StudentComparator1 (can be more than one) which implements Comparator Interface
		 * 
		 * in that interface we implement a method which is used to compare the data on
		 * the basis of Student Rollno in ascending/descending order.
		 */
		
		/*
		 * so here we use sort method of Collections class for sorting in different way : 
		 * 
		 * here we pass StudentList and a object of StudentComparator1 class which implements
		 * Comparator interface.
		 * 
		 * this is now able to sort the StudentList in ascending order on the basis of Rollno
		 */
		
		Collections.sort(studList, new StudentComparator1());
		
		System.out.println("\n\n-----------student list after sorting in Ascending Order using Comparator Interface---------\n");
		studList.forEach(System.out::println);
		
		
		/*
		 * here we pass StudentList and a object of StudentComparator2 class which implements
		 * Comparator interface.
		 * StudentComparator2 is able to sort the studentList data in descending order of Rollno.
		 */
		
		Collections.sort(studList, new StudentComparator2());
		
		System.out.println("\n\n-----------student list after sorting in Descending Order using Comparator Interface---------\n");
		studList.forEach(System.out::println);
	}
}
