package com.Java8.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors; 


public class Manik_Java8_Map {

	public static void main(String[] args) {

		
		/*Map<Integer,String> manikMap = new HashMap<Integer,String>();
		manikMap.put(1, "manik_1");
		manikMap.put(2, "manik_2");
		manikMap.put(3, "manik_3");
		manikMap.put(4, "manik_4");
		
		System.out.println("\n\n  ---------------------------------------------------Java 8 result : ------------------------------------------\n\n");
		System.out.println("Map of manik  : \n");
		manikMap.forEach((keys,values) -> System.out.println("keys : "+keys + "\t value : " +values));
		
		System.out.println("\n\n--------------------\n\n");
			
		System.out.println("Entry set \n"+manikMap.entrySet());
		
		System.out.println("\n\n--------------------\n\n");
		
		System.out.println("Using CONTAINS method with JAVA 8 other methods : \n\n" + "following values is available in MAP : ");
		System.out.println(manikMap.entrySet().stream().anyMatch(entry -> entry.getValue().contains("manik_5")));
		
		
		System.out.println("\n\n------------------ USING STRING { equalsIgnoreCase() } METHOD INSTEAD OF CONTAINS------------------\n\n");
		System.out.println(manikMap.entrySet().stream().anyMatch(entry -> entry.getValue().equalsIgnoreCase("manik_3")));
		
		System.out.println("\n\n--------------------\n\n");
		
		System.out.println("using string EQUALS METHOD : \n");
		String manikNeedToFind = "manik_4";
		System.out.println(manikNeedToFind + " is present in MAP : ");
		manikMap.forEach((keys,values) -> 
				{
					if(manikNeedToFind.equals(values))
						System.out.println(manikNeedToFind.equals(values));
				}
		);
		
		System.out.println("\n\n--------------------\n\n");
		
		
		System.out.println("\n\n  -------------------------------------Old Java result : ---------------------------------------------------\n\n");
		System.out.println("Map of manik  : \n");
		for(Map.Entry<Integer, String> manikDetails : manikMap.entrySet()) {
			System.out.println("keys : "+ manikDetails.getKey() +"\t values : " + manikDetails.getValue());
		}
		
		System.out.println("\n\n--------------------\n\n");
		
		System.out.println(manikMap.containsKey(1));
		
		System.out.println("\n\n--------------------\n\n");
		
		System.out.println(manikMap.containsValue("manik_2"));*/
	
		

		
		
		
		Map<Integer,List<String>> manikCollectionMap = new HashMap<Integer,List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("manik_11");
		list1.add("manik_12");
		list1.add("manik_13");
		List<String> list2 = new ArrayList<String>();
		list2.add("manik_21");
		list2.add("manik_22");
		list2.add("manik_23");
		List<String> list3 = new ArrayList<String>();
		list3.add("manik_31");
		list3.add("manik_32");
		list3.add("manik_23");
		
		
		
		manikCollectionMap.put(1,list1);
		manikCollectionMap.put(2,list2);
		manikCollectionMap.put(3,list3);
		
		System.out.println("iterating the map consists of List<String> as value :\n");
		manikCollectionMap.forEach((keys,values) -> System.out.println("keys : "+keys + "\t value : " +values));
		System.out.println("\n\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string you want to search : ");
		String inputValueToCheck = scan.nextLine();
		
		/*Predicate<String> elementToFind = (str) ->  ( str.equalsIgnoreCase(inputValueToCheck) );
		
		manikCollectionMap.forEach((k,v) -> 
		{
			System.out.println("iterating and checking list with key having "+ " '" +inputValueToCheck + "' " + " : " + k);
			List<String> values = v;
			values.forEach(item -> 
			{
				System.out.println(elementToFind.test(item));
			});
			System.out.println("\n\n");
		});*/
		
//		boolean result2 = manikCollectionMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList()).stream().anyMatch(list-> list.contains(inputValueToCheck));
		
		boolean result1 = manikCollectionMap.entrySet().stream().map(Map.Entry::getValue).anyMatch(list-> list.contains(inputValueToCheck));
		System.out.println("result using entrySet -----------"+result1);
		
		boolean result = manikCollectionMap.keySet().stream().map(key -> manikCollectionMap.get(key)).anyMatch(list -> list.contains(inputValueToCheck));
		System.out.println("result using keySet ----------"+ result);
		
		Set<Integer> resultKeySet = manikCollectionMap.keySet().stream().filter(key -> manikCollectionMap.get(key).contains(inputValueToCheck)).collect(Collectors.toSet());
		System.out.println("key set which contains input string : "+resultKeySet);
		
		List<String> commonList = manikCollectionMap.entrySet().stream().flatMap(list -> list.getValue().stream()).collect(Collectors.toList());
		System.out.println("List of All List --------------" + commonList);
		
	}
}
