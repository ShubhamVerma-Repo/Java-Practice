package com.Java8.practice;

import java.util.*;


//***************************************************************************
interface ReferringMethod{
	public void methodOFClass();
}
//***************************************************************************

class ClassWithStaticMethod{
	public static void staticMethod(){
		System.out.println("you are in static method of Class");
	}
}
//***************************************************************************
interface Messageable{  
    Message getMessage(String msg);  
} 
//***************************************************************************
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}
//***************************************************************************


public class Method_Reference {

	public static void main(String[] args) {
		

//###################################################		REFERENCE TO STATIC MEHTOD		#########################################################
		
		//***************************************************************************
		
		//Java 8
		/*
		 * Referring Static Method
		 */
		ReferringMethod referenceObject=ClassWithStaticMethod::staticMethod;
		/*
		 * Calling interface method
		 */
		referenceObject.methodOFClass();
		
		//Before Java 8
		ClassWithStaticMethod.staticMethod();
		
		
		//*************************************************************************
		
		List<Integer> listOfNumbers=Arrays.asList(2,3,4,5,6);
		
		/*
		 * here we dont require to pass the parameter to the printStaticMethod as it requires
		 * Static method reference internally do all the functioning by itself
		 */
		System.out.println("\n\nprinting using Static method reference\n");
		listOfNumbers.forEach(Method_Reference::printStaticMethod);
		
		/*
		 * in lambda expression we need to pass the parameter to the printStaticMethod
		 */
		System.out.println("\n\nprinting using lambda expression\n");
		listOfNumbers.forEach(number->Method_Reference.printStaticMethod(number));
		
		/*
		 * here this is the traditional way to do 
		 */
		System.out.println("\n\nprinting using traditional way\n");
		for(int num:listOfNumbers){
			Method_Reference.printStaticMethod(num);
		}
		
		
		
//###################################################		REFERENCE TO AN INSTANCE MEHTOD		#########################################################		
		
		//**********************************************************************
		
		/*
		 * creating object of the class
		 */
		Method_Reference instanceMethodReferenceObject=new Method_Reference();
		/*
		 * referring to the non-static instance method using interface (ReferringMehtod) 
		 */
		ReferringMethod referenceMethod=instanceMethodReferenceObject::instanceMethod;
		/*
		 * calling interface method
		 */
		referenceMethod.methodOFClass();
		/*
		 * Referring non-static method using anonymous object
		 */
		ReferringMethod referringMethod=new Method_Reference()::instanceMethod;
		/*
		 * calling interface method
		 */
		referringMethod.methodOFClass();
		
		//***********************************************************************
		
		/*
		 * In the following example, we are referring instance (non-static) method. 
		 * Runnable interface contains only one abstract method. So, we can use it as functional interface.
		 */
		 Thread t2=new Thread(new Method_Reference()::printnMsg);  
		 t2.start();       
		
		//***************************************************************************
		 
		 
//###################################################		REFERENCE TO A CONSTRUCTOR		#########################################################		 
		 
		//***************************************************************************
		 /*
		  * Constructor reference is happen here where Messageable is an interface 
		  * and have Message class type method in it.
		  */
		 Messageable hello = Message::new;  
	        hello.getMessage("Hello");  
	        
		//***************************************************************************
		 
		 
		 
	}//main-ends
	
	
	
	
	//***************************************************************************
	public static void printStaticMethod(final int num){
		System.out.println("num = "+num);
	}
	//***************************************************************************
	
		public void instanceMethod(){
			System.out.println("instance method refernce is here");
		}
	//***************************************************************************
	
		public void printnMsg(){  
	        System.out.println("Hello, this is thread instance method");  
	    }  
	//***************************************************************************	
	

}//class-ends

//***************************************************************************