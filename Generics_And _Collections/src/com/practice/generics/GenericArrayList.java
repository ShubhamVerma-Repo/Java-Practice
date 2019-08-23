package com.practice.generics;

import java.util.*;

public class GenericArrayList {

	public static void main(String[] args) {

		Student studentArray[]=new Student[10];
		studentArray[0]=new Student("shub",99);
		studentArray[1]=new Student("verma",22);
		
		System.out.println("Normal Array of Student type : ");
						
		System.out.println("student normal Array (ToString Method data) : " + studentArray[0]);
		
		System.out.println("--------------------------------------------------------------");
		
		//--------------------------	NON GENERIC ARRAYLIST	--------------------------------
		
		ArrayList listOfStudentAndTeacher=new ArrayList();
		listOfStudentAndTeacher.add(new Student("chirag",45));
		listOfStudentAndTeacher.add(new Student("shivam",35));
		listOfStudentAndTeacher.add(new Teacher("rahul",25));
		listOfStudentAndTeacher.add(new Teacher("vansh",15));
		
		int i=0;
		
		System.out.println("\n Non-Generic ArrayList : ");
		
		System.out.println("data from non-generic arraylist \n ");
		System.out.println("SNo."+"\t" +"CLASS" + "\t\t"+"NAME"+ "\t"+"ROLL NO");
		
		for(Object data:listOfStudentAndTeacher)
		{	
			
			/*
			 * the below calculation gives the exact name of the Class that which type of class data is coming
			 */
			
			String className=data.getClass().getName().substring(data.getClass().getName().lastIndexOf(".")).substring(1);
			
			/*
			 *checking the class name so that accordingly we can do the calculation/apply logic 
			 */
			if(className.equalsIgnoreCase("Student"))
			{	
				++i;
				
				/*
				 * downcast the {data} which is of object type to Student and Teacher Type specifically/respectively.
				 */
				
				Student studentData=(Student) data;
				System.out.println(i + "\t"+className +"\t\t"+ studentData.name + "\t"  + studentData.rollno);		
			}
			else
			{
				++i;
				Teacher teacherData=(Teacher) data;
				System.out.println(i + "\t"+className +"\t\t" + teacherData.name + "\t" + teacherData.rollno);
			}
		}
		
		/*
		 * getting the data from Student array by using the ToString Method of specific index
		 */
		Student student=(Student)listOfStudentAndTeacher.get(1);
		System.out.println("student Non Generic (ToString Method data) : " +student);
		
		
		//------------------------		GENERIC ARRAYLIST WITH STUDENT CLASS	----------------------------------
				
				//TYPE SAFETY PROVIDED BY GENERICS BY ENABLING THE SPECITFIC TYPE OF ARRAYLIST 
		
		ArrayList<Student> studentArrayList=new ArrayList<Student>();
		studentArrayList.add(new Student("hi",1));
		studentArrayList.add(new Student("hey",2));
		studentArrayList.add(new Student("hello",3));
		

		for(Student abc : studentArrayList)
		{
			System.out.println(abc);
		}
		
		int j=0;
		
		System.out.println("\n--------------------------------------\n");
		System.out.println("Student Type ArrayList : ");
		System.out.println("data from generic arraylist \n");
		
		for(Student currentStudentArray:studentArrayList)
		{
			++j;
			System.out.println(j + "\t" +currentStudentArray.name + "\t"  + currentStudentArray.rollno);
		}
		
		System.out.println("studentArrayList (ToString Method data) : " + studentArrayList.get(1));
		
	}

}

class Student
{
	String name;
	int rollno;
	
	public Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}

	
	/*The toString() method returns the string representation of the object.
	 *  If you print any object, java compiler internally invokes the toString() method on the object. 
	 *  So overriding the toString() method, returns the desired output,
	 *   it can be the state of an object etc. depends on your implementation.
	 */
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
}

class Teacher
{
	String name;
	int rollno;
	
	public Teacher(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}

	
	/*The toString() method returns the string representation of the object.
	 *  If you print any object, java compiler internally invokes the toString() method on the object. 
	 *  So overriding the toString() method, returns the desired output,
	 *   it can be the state of an object etc. depends on your implementation.
	 */
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
}