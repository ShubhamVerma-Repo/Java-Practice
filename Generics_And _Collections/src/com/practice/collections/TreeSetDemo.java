package com.practice.collections;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
	
		/*
		 * if we try to store the duplicate value
		 * treeset does not show any compilation error 
		 * but at the runtime it neglect the duplicate value
		 * that means it takes only one reference of a value
		 */
		
		// INTEGER TREESET
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(2);
		treeSet.add(34);
		treeSet.add(1);
		treeSet.add(34);
		treeSet.add(34);
		treeSet.add(34);
		treeSet.add(34);
		
		System.out.println("\n\n-------Integer Treeset after sorting-------");
		treeSet.forEach(System.out::println);
		
		/*Iterator<Integer> itr=treeSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		/*
		 * 
		 * in character and string treeset,
		 * treeset is try to compare the strings and character on the
		 * basis of their ASCII value
		 * 
		 */
				
		// CHARACTER
		TreeSet<Character> treeSet1=new TreeSet<Character>();
		treeSet1.add('d');
		treeSet1.add('e');
		treeSet1.add('p');		//ASCII code of P : 112
		treeSet1.add('h');
		treeSet1.add('d');
		treeSet1.add('a');
		treeSet1.add('P');		//ASCII code of P : 80
		//therefore P comes very first in the sorted TreeSet
		
		System.out.println("\n\n-------Character Treeset after sorting-------");
		treeSet1.forEach(System.out::println);
		
		
		//STRING
		TreeSet<String> treeSet2=new TreeSet<String>();
		treeSet2.add("shubham");
		treeSet2.add("verma");
		treeSet2.add("chirag");
		/*
		 * treeSet neglect the 2nd "verma" string as it exist previously in treeSet 
		 */
		treeSet2.add("verma");
		
		System.out.println("\n\n-------String TreeSet after Sorting-------");
		treeSet2.forEach(System.out::println);
		
	
		
		/*
		 * here we are making custom type TreeSet
		 * we only able to make custom type TreeSet if we have already
		 * implements the COMPARABLE interface of our Custom Class
		 * 
		 * else we can't make a Custom type TreeSet
		 */
		
		TreeSet<A> customTreeSet=new TreeSet<A>();
		customTreeSet.add(new A(1,"priyanka"));
		customTreeSet.add(new A(5,"sakshi"));
		customTreeSet.add(new A(9,"harsh"));
		customTreeSet.add(new A(2,"chirag"));
		
		System.out.println("\n\n-----------CUSTOM TYPE TREESET after sorting on the basis of Name Using Comparable Interface---------");
		for(A entryTreeSet:customTreeSet)
		{
			System.out.println(entryTreeSet.getId() +"\t"+entryTreeSet.getName());
		}
		
		
		//-------------------------------------------------------------------------------------------------------------------
		
		/*
		 * here we are making a Custom treeSet of Student Type but Student Class doesn't implement Comparable interface
		 * 
		 * so we made Comparator for Student Class to compare the data of StudentTreeSet
		 * 
		 * in this case we have to pass the object of StudentComparator1 in our TreeSet constructor'
		 * 
		 * StudentComparator1 sort the data and arrange in ascending order of Rollno
		 */
		
		TreeSet<Student> studentTreeSet=new TreeSet<Student>(new StudentComparator1());
		studentTreeSet.add(new Student("priyanka",89));
		studentTreeSet.add(new Student("sakshi",55));
		studentTreeSet.add(new Student("harsh",1));
		studentTreeSet.add(new Student("chirag",23));
		
		System.out.println("\n\n-----------Student TREESET after sorting on the basis of Rollno using Comparator Interface---------");
		for(Student entryTreeSet:studentTreeSet)
		{
			System.out.println(entryTreeSet.getRollno() +"\t"+entryTreeSet.getName());
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

class A implements Comparable<A>
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

	public A(int id,String  name)
	{
		this.id=id;
		this.name=name;
	}
	
	/*
	 * here we are overriding the method compareTo of Comparable interface
	 * by using this method we are comparing the names which are adding 
	 * to A class 
	 * 
	 * most of all since class A has comparable where the names are itself
	 * comparing and comes out in ascending order
	 * 
	 * only then we are able to make a TREESET of CUSTOM type
	 */

	/*
	 * in this case we are comparing the name
	 */
	/*@Override
	public int compareTo(A a) {
		return this.name.compareTo(a.name);
	}*/
	
	
	/*
	 * in this case we are comparing the id 
	 * 
	 * and arrange the list of items in ascending order of id
	 */
	@Override
	public int compareTo(A a) {
		if(this.getId() > a.id)
			return 1;
		else
			return -1;
	}
	
	/*
	 * in this case we are comparing the id 
	 * 
	 * and arrange the list of items in descending order of id
	 */
	/*@Override
	public int compareTo(A a) {
		if(this.getId() > a.id)
			return 1;
		else
			return -1;
	}*/
	
}