package com.practice.collections;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		HashSet<Student> linkedHashSet=new HashSet<Student>();
		linkedHashSet.add(new Student("shubham",33));
		linkedHashSet.add(new Student("verma",44));
		linkedHashSet.add(new Student("chirag",34));
		linkedHashSet.add(new Student("verma",43));
		linkedHashSet.add(new Student("sakshi",53));
		linkedHashSet.add(new Student("singh",46));
		
		System.out.println("---------Hash Set----------\n");
		for(Student list : linkedHashSet)
		{
			System.out.println(list);
		}
		
		/*
		 * linked hash set maintains the insertion order 
		 */
		LinkedHashSet<Student> linkedHashSet1=new LinkedHashSet<Student>();
		linkedHashSet1.add(new Student("shubham",33));
		linkedHashSet1.add(new Student("verma",44));
		linkedHashSet1.add(new Student("chirag",34));
		linkedHashSet1.add(new Student("verma",43));
		linkedHashSet1.add(new Student("sakshi",53));
		linkedHashSet1.add(new Student("singh",46));
		
		System.out.println("\n\n---------Linked Hash set----------\n");
		for(Student list : linkedHashSet1)
		{
			System.out.println(list);
		}
	}

}
