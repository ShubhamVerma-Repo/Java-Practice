package com.practice.collections;
import java.util.*;

/*
 * here we are making a class which is implementing the COMPARATOR Interface
 * and implements its method
 * 
 * basically when we implement the comparator interface we make it Generic With 
 *			Student class   
 *					{ whose data need to be compare and we don't want to change source code
 * 					of that class thats why we are using Comparator interface and implement that interface 
 * 					in some other class where we compare data of STUDENT class }
 * 
 *   here we are comparing the data of two objects of Student Class
 */


/*
 * in this method we are sorting the data of StudentList in ascending order of Rollno
 */


public class StudentComparator2 implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		if(student1.getRollno()<student2.getRollno())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
