package com.practice.collections;

import java.util.*;


/*
 * hashset use both the { .equals } method and { hashcode }
 * which we have generated in Student Class
 * 
 * 
 * if we do not generate .equals method and hashcode 
 * our custom class hashset doesn't able to compares between the values
 * whether the new value is already present or not
 */

public class HashSetDemo {

	public static void main(String[] args) {

		/*
		 * here hashSet<Student> doesn't take the different Names with same rollno
		 * this is because we have generated { .equals } method and { hashCode } of RollNo only
		 * this is why hashSet compares the values on the basis of Rollno itself.  
		 */
		
		HashSet<Student> studentSet=new HashSet<Student>();
		studentSet.add(new Student("shubham",33));
		studentSet.add(new Student("verma",44));
		studentSet.add(new Student("chirag",34));
		studentSet.add(new Student("verma",43));
		studentSet.add(new Student("sakshi",53));
		studentSet.add(new Student("singh",46));
		
		System.out.println("---------Using ForEach loop----------");
		for(Student list : studentSet)
		{
			System.out.println(list);
		}
		
		System.out.println("\n\n---------Using Iterator----------");
		Iterator<Student> iterator=studentSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		/*
		 * here we are using the ForEach loop of JAVA 8
		 */
		
		/*
		 * First way to use Java 8 ForEach Loop
		 */
		System.out.println("\n\n--------- (1) Using ForEach loop of JAVA 8----------");
		studentSet.forEach(System.out::println);
		
		/*
		 * Second way to use Java 8 ForEach Loop
		 */
		System.out.println("\n\n--------- (2) Using ForEach loop of JAVA 8----------");
		studentSet.forEach(Student->System.out.println(Student));
		
		
		
		/*
		 * now we will use some methods of hashSet
		 */
		
		
		
		HashSet<Student> studentSet11=new HashSet<Student>();
		studentSet11.add(new Student("shubham",1));
		studentSet11.add(new Student("vansh",2));
		studentSet11.add(new Student("chirag",3));
		
		HashSet<Student> studentSet22=new HashSet<Student>();
		studentSet22.add(new Student("pinka",4));
		studentSet22.add(new Student("sakshi",5));
		studentSet22.add(new Student("parul",6));
		
		
		System.out.println("\n\n--------- studentSet11 Using ForEach loop of JAVA 8----------");
		studentSet11.forEach(System.out::println);
		
		System.out.println("\n\n--------- studentSet22 Using ForEach loop of JAVA 8----------");
		studentSet22.forEach(System.out::println);
		
		/*
		 * addAll() method
		 */		
		studentSet11.addAll(studentSet22);
		System.out.println("\n\n--------- studentSet11 after addAll() student22----------");
		studentSet11.forEach(System.out::println);
		
		/*
		 * removeAll() method
		 */		
		studentSet11.removeAll(studentSet22);
		System.out.println("\n\n--------- studentSet11 after removeAll() student22----------");
		studentSet11.forEach(System.out::println);
		
		/*
		 * addAll() method
		 */		
		studentSet11.addAll(studentSet22);
		System.out.println("\n\n--------- studentSet11 after addAll() student22----------");
		studentSet11.forEach(System.out::println);
		
		/*
		 * retainAll() method
		 */		
		studentSet11.retainAll(studentSet22);
		System.out.println("\n\n--------- studentSet11 after retianAll() student22----------");
		studentSet11.forEach(System.out::println);
		
		/*
		 * contains() method
		 */		
		System.out.println("\n\n---------\n"+studentSet11.contains(new Student("shubham",1)));		
		
		/*
		 * containsAll() method
		 */		
		System.out.println("\n\n---------\n"+studentSet11.containsAll(studentSet22));
		
	}

}
