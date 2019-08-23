package com.demo.multithreading;

public class DemoClass implements Runnable{

	
	/* public static void main(String args[]) {
		 DemoClass R1 = new DemoClass( "Thread-1");
	      R1.start();
	      
	      DemoClass R2 = new DemoClass( "Thread-2");
	      R2.start();
	   }   
	
	private Thread t;
	private String threadName;

	DemoClass(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}*/
	
	
	
	
	
	
	
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		 }  
		 public static void main(String args[]){  
			 DemoClass t1=new DemoClass();  
			 DemoClass t2=new DemoClass();  
			 
			 Thread thread1=new Thread(t1);
			 Thread thread2=new Thread(t2);
		   
			 thread1.start();  
			 thread2.start();  
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
