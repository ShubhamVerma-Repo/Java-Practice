package com.demo.javaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainApp {

	public static void main(String[] args) {

		Method[] methods=DemoClass.class.getMethods();
		
		System.out.println("here is the list of democlass methods : \n");
		int i=1;
		/*for(Method getMethod:methods)
		{
			System.out.println("method "+i+" :  "+getMethod.getName());
			i++;
		}*/
		
		
		Class myObjectClass = DemoClass.class;

		Field[] fields=myObjectClass.getFields();
		
		for(Field getField:fields)
		{
			System.out.println("fields "+i+" :  "+getField.getName());
			i++;
		}
	}

}
