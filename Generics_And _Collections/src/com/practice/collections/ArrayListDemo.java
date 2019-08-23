package com.practice.collections;

import java.util.*;


/*
 * Collection uses only WRAPPER CLASS for any type of operation 
 * or in any method whether it is retainAll, removeAll etc
 * we do not use PRIMITIVE DATA TYPE in collection framework 
 * only in case of GENERICS, when we use generics in collection
 */


//----------	IMPORTANT	-------------

/*
 * All this happens only in ARRAYLIST
 */

/*
 * As we all know that { .equals } methods is used to compare and exists in Object Class
 * every other class such as Integer, String etc extends the Object Class
 * and these classes overrides the { .equals } methods so that other methods
 * such as { retainAll(), removeAll() } can be used easily since all these methods use 
 * { .equals } method internally for comparison 
 * 
 *  For this purpose, These classes Integer, String class internally overrides this
 *  { .equals } method of Object class as well as now it compares the context instead of Objects/references
 */

//---------------------------------------

public class ArrayListDemo {

	public static void main(String[] args) {

		
		/*
		 * Generic ArrayList of String Type.
		 */
		
		ArrayList<String> colorList=new ArrayList<String>();
		colorList.add("red");
		colorList.add("yellow");
		colorList.add("green");
		colorList.add("blue");
		colorList.add("black");
		
		/*
		 * iterating using foreach loop
		 */
		
		System.out.println("\n-----------iterate using FOR-Each loop--------------");
		
		for(String color:colorList)
		{
			System.out.println(color);
		}
		
		
		/*
		 * iterating using iterator
		 */
		
		System.out.println("\n-----------iterate using an ITERATOR--------------");
		
		Iterator<String> itr=colorList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
		/*
		 * iterating using for loop
		 */
		
		System.out.println("\n-----------iterate using FOR loop--------------");

		for(int i=0;i<colorList.size();i++)			
		{
			System.out.println(colorList.get(i));
		}
		
		
		/*
		 * here we are using non generic arraylist 
		 * in this we can store any type of data as well as can easily iterate it
		 */
		
		System.out.println("\n-----------Non Generic arraylist using Iterator--------------");
		
		/*
		 * Non Generic ArrayList
		 */
		
		ArrayList testArrayList=new ArrayList();
		testArrayList.add("shubham");
		testArrayList.add(89);
		testArrayList.add('A');
		
		Iterator iterator=testArrayList.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
		//----------------------------------------------------------------------------------------------------------------
		
		/*
		 * here we will use some methods of arraylist
		 */
		
		System.out.println("\n-----------------some predefined methods of arraylist we are using here---------------- \n");
		
		
		ArrayList<String> list1=new ArrayList<String>();
		System.out.println(list1.add("red"));
		list1.add("yellow");
		list1.add("blue");
		list1.add("green");
		
		System.out.println("\n-----arraylist 1-----");
		for(String list11:list1)
		{
			System.out.println(list11);
		}
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("pink");
		list2.add("purple");
		list2.add("blue");
		list2.add("black");
		
		System.out.println("\n-----arraylist 2-----");
		for(String list22:list2)
		{
			System.out.println(list22);
		}

		/*
		 * addAll() method
		 */
		
		list1.addAll(list2);

		System.out.println("\n-----arraylist 1 after addAll() method  {adding arraylist 2}-----");
		for(String list11:list1)
		{
			System.out.println(list11);
		}
		
		/*
		 * removeAll() method
		 */
		
		list1.removeAll(list2);

		System.out.println("\n-----arraylist 1 after removeAll() method  {removing arraylist 2}-----");
		for(String list22:list1)
		{
			System.out.println(list22);
		}
		
		/*
		 * addAll() method
		 */
		
		list1.addAll(list2);

		System.out.println("\n-----arraylist 1 after addAll() method  {adding arraylist 2}-----");
		for(String list11:list1)
		{
			System.out.println(list11);
		}

		/*
		 * retainAll() method
		 */
		
		list1.retainAll(list2);

		System.out.println("\n-----arraylist 1 after retainAll() method  {retain arraylist 2}-----");
		for(String list22:list1)
		{
			System.out.println(list22);
		}
		
		/*
		 * contains() method
		 */ 
		
		System.out.println("\n-----arraylist 1 after contain() method -----");
		System.out.println(list1.contains("yellow"));

		/*
		 * containsAll() method
		 */ 
		
		System.out.println("\n-----arraylist 1 after containsAll() method -----");
		System.out.println(list1.containsAll(list2));
		
		
		
		/*
		 * here we use sort method of Collections class to sort the list
		 * in ascending order
		 */
		
		System.out.println("\n\n---------ColorList before sorting-------\n");
		colorList.forEach(System.out::println);
		System.out.println("\n\n---------ColorList after sorting-------\n");
		Collections.sort(colorList);
		colorList.forEach(System.out::println);
	}

}
