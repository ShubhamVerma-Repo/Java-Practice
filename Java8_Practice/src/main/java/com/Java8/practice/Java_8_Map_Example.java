package com.Java8.practice;


import java.util.HashMap;
import java.util.Map;

public class Java_8_Map_Example {

	public static void main(String[] args) {

		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(3, "c");
		map1.put(4, "d");
		map1.put(5, "e");
		map1.put(6, "f");
		map1.put(7, "g");
		map1.put(8, "h");
		
		System.out.println("map1 : \n");
		map1.forEach((k,v)->System.out.println("keys : "+k + " values : "+v));
		
		
		Map<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(5, "a");
		map2.put(8, "h");
		map2.put(3, "o");
		map2.put(4, "t");

		System.out.println("\n\nmap2 : \n");
		map2.forEach((k,v)->System.out.println("keys : "+k + " values : "+v));
		
		
		map2.forEach((k,v)->
				{
			if(map1.containsKey(k))
			{
				if(map1.get(k)!=map2.get(k))
					map1.put(k, v);
			}
				});
		
		System.out.println("\n\nmap1 after replacing values of corresponding keys present in map2\n");
		map1.forEach((k,v)->System.out.println("keys : "+k+" values : "+v));
	}

}

