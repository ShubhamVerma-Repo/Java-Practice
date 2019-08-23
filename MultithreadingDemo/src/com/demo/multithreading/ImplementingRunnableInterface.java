package com.demo.multithreading;

public class ImplementingRunnableInterface implements Runnable {

	@Override
	public void run() {

		System.out.println("hey, you are in the run method of runnable interface.");
	}

	public static void main(String[] args) {

		ImplementingRunnableInterface classObject=new ImplementingRunnableInterface();		//internally its not the thread object 
		Thread threadObject=new Thread(classObject);		//here we are making the class object as thread object
		threadObject.start();
	}
	
}
