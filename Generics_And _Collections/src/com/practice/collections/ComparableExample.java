package com.practice.collections;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(456);
		list.add(4);
		list.add(65);
		
		Collections.sort(list);
		list.forEach(l-> System.out.println(l));
	}

}
