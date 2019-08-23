package com.practice.collections;
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		/*
		 * Integer key TreeMap
		 */
		TreeMap<Integer,String> treeMap1=new TreeMap<Integer,String>();
		treeMap1.put(9, "hello 9");
		treeMap1.put(4, "hello 4");
		treeMap1.put(2, "hello 2");
		treeMap1.put(7, "hello 7");
		
		System.out.println("------TreeMap<Integer,String> sorted-------");
		for(Map.Entry<Integer, String> entryMap : treeMap1.entrySet())
		{
			System.out.println(entryMap.getKey() +" \t" + entryMap.getValue());
		}
		
		
		/*
		 * Character Key TreeMap
		 */
		TreeMap<Character,String> treeMap2=new TreeMap<Character,String>();
		treeMap2.put('g', "hello g");
		treeMap2.put('B', "hello B");
		treeMap2.put('d', "hello d");
		treeMap2.put('p', "hello p");
		
		/*
		 * sorting the character keys on the basis of their BSCII values
		 */
		System.out.println("\n\n------TreeMap<Character,String> sorted-------");
		for(Map.Entry<Character, String> entryMap : treeMap2.entrySet())
		{
			System.out.println(entryMap.getKey() +" \t" + entryMap.getValue());
		}
		
		
		/*
		 * String Key TreeMap
		 */
		TreeMap<String,String> treeMap3=new TreeMap<String,String>();
		treeMap3.put("hg", "hello hg");
		treeMap3.put("BC", "hello BC");
		treeMap3.put("def", "hello def");
		treeMap3.put("dqr", "hello dqr");
		
		/*
		 * sorting the string keys on the basis of their BSCII values
		 * internally String overrides the Comparable interface of lang package
		 * this is how string are compare than sort and arrange in ascending order
		 */
		System.out.println("\n\n------TreeMap<String,String> sorted-------");
		for(Map.Entry<String, String> entryMap : treeMap3.entrySet())
		{
			System.out.println(entryMap.getKey() +"\t" + entryMap.getValue());
		}
		
		
		/*
		 * Custom type TreeMap
		 */
		
		System.out.println("\n\n\n-----------------CUSTOM TYPE TREEMBP ( USING CLBSS B )------------------\n\n");
		
		/*
		 * 
		 * in this tree map we are sorting the map elements on the basis of
		 * NBME present in Class B where we implements the Comparable Interface
		 * in order to compare the String ( NBME ) that is why we are able to 
		 * sort the elements and Use Custom Type TreeMap with { Class B as Key }
		 * because treeMap sort the elements on Keys basis
		 * 
		 */
		TreeMap<B,Integer> treeMap4=new TreeMap<B,Integer>();
		treeMap4.put( new B(12,"hello"), 34);
		treeMap4.put( new B(3,"hi"), 67);
		treeMap4.put( new B(2,"abc"), 124);
		treeMap4.put( new B(54,"aibd"), 3);
		
		System.out.println("\n\n------TreeMap<B,Integer> sorted------");
		for(Map.Entry<B, Integer> entryMap : treeMap4.entrySet())
		{
			System.out.println(entryMap.getKey() +" \t" + entryMap.getValue());
		}
		
		
		/*
		 * in this treeMap we are using Integer as key and Class B as values
		 * and this treeMap use Integer to sort the elements 
		 */
		TreeMap<Integer,B> treeMap5=new TreeMap<Integer,B>();
		treeMap5.put(34, new B(12,"hello 12 and 34"));
		treeMap5.put(67, new B(3,"hello 3 and 67"));
		treeMap5.put(124, new B(2,"hello 2 and 124"));
		treeMap5.put(3, new B(54,"hello 54 and 3"));
		
		System.out.println("\n\n------TreeMap<Integer,B> sorted------");
		for(Map.Entry<Integer, B> entryMap : treeMap5.entrySet())
		{
			System.out.println(entryMap.getKey() +" \t" + entryMap.getValue());
		}
		
		
		//-------------------------------------------------------------------------------------------------------------------
		
		/*
		 * here we are making a Custom treeMap of Student Type but Student Class doesn't implement Comparable interface
		 * 
		 * so we made Comparator for Student Class to compare the data of StudentTreeSet
		 * 
		 * in this case we have to pass the object of StudentComparator1 in our TreeSet constructor'
		 * 
		 * StudentComparator1 sort the data and arrange in ascending order of Rollno
		 */
		
		TreeMap<Student,Integer> StudentTreeMaop=new TreeMap<Student,Integer>(new StudentComparator1());
		StudentTreeMaop.put( new Student("hello",45),34);
		StudentTreeMaop.put( new Student("hi",7),67);
		StudentTreeMaop.put( new Student("abc",4),14);
		StudentTreeMaop.put( new Student("aibd",66),3);
		
		System.out.println("\n\n------StudentTreeMap<Student,Integer> sorted on the basis of Student Rollno using Comparator Interface------");
		for(Map.Entry<Student, Integer> entryMap : StudentTreeMaop.entrySet())
		{
			System.out.println(entryMap.getKey() +" \t" + entryMap.getValue());
		}
		
		//-------------------------------------------------------------------------------------------------------------------
	}
}




/*
 * here we are making a class which is able to compare Names
 * if we want to compare name as we took name in this case
 * 
 * for doing comparison we use COMPARABLE interface
 */

class B implements Comparable<B>
{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B(int id,String  name)
	{
		this.id=id;
		this.name=name;
	}
	
	

	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + "]";
	}

	
	
	/*
	 * here we are overriding the method compareTo of Comparable interface
	 * by using this method we are comparing the names which are adding 
	 * to B class 
	 * 
	 * most of all since class B has comparable where the names are itself
	 * comparing and comes out in ascending order
	 * 
	 * only then we are able to make a TREEMAP of CUSTOM type
	 */

	/*
	 * in this case we are comparing the name
	 */
	@Override
	public int compareTo(B a) {
		return this.name.compareTo(a.name);
	}
	
	
	/*
	 * in this case we are comparing the id 
	 * 
	 * and arrange the list of items in ascending order of id
	 */
	/*@Override
	public int compareTo(B a) {
		if(this.getId() > a.id)
			return 1;
		else
			return -1;
	}*/
	
	/*
	 * in this case we are comparing the id 
	 * 
	 * and arrange the list of items in descending order of id
	 */
	
	/*@Override
	public int compareTo(B a) {
		if(this.getId() > a.id)
			return 1;
		else
			return -1;
	}*/
	
}