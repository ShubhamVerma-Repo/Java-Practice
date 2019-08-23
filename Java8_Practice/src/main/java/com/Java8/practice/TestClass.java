package com.Java8.practice;


import java.util.HashSet;
import java.util.Set;

interface drawable{
	public void draw();
	public void smile();
}



public class TestClass implements drawable{

	public static void main(String[] args) {
		TestClass tc=new TestClass();
		tc.draw();
		tc.smile();
		
		drawable dw=new drawable() {
			
			@Override
			public void draw() {
				System.out.println("draw inside the main");
			}

			@Override
			public void smile() {
				System.out.println("smile inside the main.");
			}
		};
		dw.draw();
		dw.smile();
		
		
		
		
		
		
		
		
		
		
		//Tested example of Set
		
				Set<String> set = new HashSet<String>(); 
		        set.add("shub"); 
		        set.add("ver"); 
		        set.add("fsf");
		        set.add("gzb");
		        set.add("ver");
		        
		        String str="ver";
		        
		        System.out.println("\n\n\n\n  " + set.stream().filter(d->str.equals(str)).findFirst().get()  +  "  \n\n\n\n ");
		        
		        String aa= set.stream().filter(str::equals).findFirst().get();
				
		        System.out.println("\n\n\n\n  " + aa/*set.stream().filter(str::equals).findFirst().get()*/ +"\n\n");
		        
		        System.out.println("\n\n\n\n  " + set.iterator().next() +"\n\n");
	}

	@Override
	public void draw() {
		System.out.println("draw outside the main.");
	}

	@Override
	public void smile() {
		System.out.println("smile outside the main.");
	}

}

