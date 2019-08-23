package com.practice.collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "shubham");
		hashMap.put(2, "chirag");
		hashMap.put(3, "vansh");
		hashMap.put(4, "rahul");
		
		System.out.println("----------Using forEach loop----------\n");
		for(Map.Entry<Integer, String> mapList: hashMap.entrySet())
		{
			System.out.println(mapList.getValue() + mapList.getKey());
		}
		
		System.out.println("\n\n----------Using Iterator----------\n");
		Iterator<Map.Entry<Integer,String>> iter=hashMap.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry<Integer, String> entry=iter.next();
			System.out.println(entry.getValue() + entry.getKey());
		}
		
		System.out.println("\n\n-----------Using Java 8 ForEach-------\n");
		hashMap.forEach((k,v) -> System.out.println(k  +  v));
		
		/*
		 * printing all the keys		
		 */
		System.out.println("----------Keys Using forEach loop----------\n");
		for(Integer keys : hashMap. keySet())
		{
			System.out.println(keys);			
		}
		
		/*
		 * printing all the values		
		 */
		System.out.println("----------values Using forEach loop----------\n");
		for(String values : hashMap.values())
		{
			System.out.println(values);			
		}
		
		
		
		
		//----------------------------
		
		/*
		 * Methods :
		 * 
		 * put
		 * putall { collection in collection }
		 * remove
		 * replace
		 * contains
		 * isempty
		 * clone
		 * size
		 * 
		 */
		
		
		HashMap<Character,Student> foodMap=new HashMap<Character,Student>();
		foodMap.put('a', new Student("noodles",1));
		foodMap.put('b', new Student("spring roll",5));
		foodMap.put('c', new Student("dimsums",7));
		foodMap.put('d', new Student("chilly potato",9));
		
		HashMap<Character,Student> foodMap1=new HashMap<Character,Student>();
		foodMap1.put('e', new Student("noodles",2));
		foodMap1.put('f', new Student("spring roll",6));
		foodMap1.put('g', new Student("dimsums",3));
		foodMap1.put('h', new Student("chilly potato",4));
		
		System.out.println("----------FoodMap 1-----------");
		for(Map.Entry<Character, Student> entryMap: foodMap.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		System.out.println("\n----------FoodMap 2-----------");
		for(Map.Entry<Character, Student> entryMap: foodMap1.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		foodMap.putAll(foodMap1);
		System.out.println("\n----------FoodMap 1 after putAll foodMap1-----------");
		for(Map.Entry<Character, Student> entryMap: foodMap.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		System.out.println(foodMap.isEmpty());
		
		System.out.println(foodMap.remove('a'));
		
		System.out.println("\n----------FoodMap 1-----------");
		for(Map.Entry<Character, Student> entryMap: foodMap.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		System.out.println(foodMap.containsKey('a'));
		
		System.out.println("\n---------cloned Map directly iterating ----------\n"+foodMap.clone());
		
		System.out.println("\n---------Cloned foodMap into CloneMap---------");
		HashMap<Character,Student> cloneMap=(HashMap<Character, Student>) foodMap.clone();
		for(Map.Entry<Character, Student> entryMap:cloneMap.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		System.out.println("\n"+foodMap.get('b'));
		
		foodMap.replace('b', new Student("spring roll",5), new Student("shubham",33));
		System.out.println("\n----------FoodMap 1 after replace a entry in foodMap1-----------");
		for(Map.Entry<Character, Student> entryMap: foodMap.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t"+ entryMap.getValue());
		}
		
		System.out.println("\n-----size-----\n"+foodMap.size());
	}
}
