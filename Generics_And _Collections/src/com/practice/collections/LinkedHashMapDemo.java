package com.practice.collections;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer,Student> hashMap=new HashMap<Integer,Student>();
		hashMap.put(4, new Student("shubham",33));
		hashMap.put(2, new Student("chirag",44));
		hashMap.put(1, new Student("sakshi",55));
		hashMap.put(3, new Student("priyanka",66));
		
		LinkedHashMap<Integer,Student> linkedHashMap=new LinkedHashMap<Integer,Student>();
		linkedHashMap.put(4, new Student("shubham",33));
		linkedHashMap.put(2, new Student("chirag",44));
		linkedHashMap.put(1, new Student("sakshi",55));
		linkedHashMap.put(3, new Student("priyanka",66));
		
		System.out.println("------hashMap with no insertion order--------\n");
		for(Map.Entry<Integer, Student> entryMap:hashMap.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		/*
		 * linked hashMap maintains the insertion order in which the 
		 * key-value pair are inserted in the linkedHashMap
		 */
		System.out.println("\n\n------linkedHashMap with insertion order--------\n");
		for(Map.Entry<Integer, Student> entryMap:linkedHashMap.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		/*
		 * all the methods are same in linked hash map as hash map had
		 * we can use each and every method of hashmap in linked hashmap
		 * since linked hash map extends the hashmap class
		 */
		
	}

}
