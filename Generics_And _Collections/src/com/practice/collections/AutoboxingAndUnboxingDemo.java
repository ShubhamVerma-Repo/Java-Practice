package com.practice.collections;

import java.util.*;

public class AutoboxingAndUnboxingDemo {

	public static void main(String[] args) {
		
		
		System.out.println("------------------AUTOBOXING in COLLECTION------------------------\n");
		
		char ch = 'a'; 
		  
        // Autoboxing- primitive to Character object conversion 
        Character x = ch; 
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
  
        // Autoboxing because ArrayList stores only objects 
        arrayList.add(25); 
  
        // printing the values from object 
        System.out.println(arrayList.get(0)); 
        
        
        System.out.println("\n\n--------------------UNBOXING in COLLECTION----------------------\n");
        
        
        Character ch1 = 'a'; 
        
        // unboxing - Character object to primitive conversion 
        char a1 = ch; 
  
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); 
        arrayList1.add(24); 
  
        // unboxing because get method returns an Integer object 
        int num = arrayList1.get(0); 
  
        // printing the values from primitive data types 
        System.out.println(num); 
              
        System.out.println("\n\n---------NORMAL AUTOBOXING AND UNBOXING-----------\n\n");
                
    //  byte data type 
        byte a = 1; 
  
        // wrapping around Byte object 			
        //AUTOBOXING
        Byte byteobj = new Byte(a); 
  
        // int data type 
        int b = 10; 
  
        //wrapping around Integer object
        //AUTOBOXING
        Integer intobj = new Integer(b); 
  
        // float data type 
        float c = 18.6f; 
  
        // wrapping around Float object 
        //AUTOBOXING
        Float floatobj = new Float(c); 
  
        // double data type 
        double d = 250.5; 
  
        // Wrapping around Double object
        //AUTOBOXING
        Double doubleobj = new Double(d); 
  
        // char data type 
        char e='a'; 
  
        // wrapping around Character object
        //AUTOBOXING
        Character charobj=e; 
  
        //  printing the values from objects 
        System.out.println("Values of Wrapper objects (printing as objects)\n"); 
        System.out.println("Byte object byteobj:  " + byteobj); 
        System.out.println("Integer object intobj:  " + intobj); 
        System.out.println("Float object floatobj:  " + floatobj); 
        System.out.println("Double object doubleobj:  " + doubleobj); 
        System.out.println("Character object charobj:  " + charobj); 
  
        // objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types
      //UNBOXING
        byte bv = byteobj; 
        int iv = intobj; 
        float fv = floatobj; 
        double dv = doubleobj; 
        char cv = charobj; 
  
        // printing the values from data types 
        System.out.println("\n\nUnwrapped values (printing as data types)\n"); 
        System.out.println("byte value, bv: " + bv); 
        System.out.println("int value, iv: " + iv); 
        System.out.println("float value, fv: " + fv); 
        System.out.println("double value, dv: " + dv); 
        System.out.println("char value, cv: " + cv); 
                
	}

}
