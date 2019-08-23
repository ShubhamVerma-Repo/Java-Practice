package com.Java8.practice;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "shubham");
		map1.put(2, "rahul");
		map1.put(3, "manik");
		map1.put(4, "chirag");
		
		System.out.println("map1 : \n");
		map1.forEach((k,v)->System.out.println("keys : "+k + " values : "+v));
	}

}
