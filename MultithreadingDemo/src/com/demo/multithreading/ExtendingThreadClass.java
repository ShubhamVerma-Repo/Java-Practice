package com.demo.multithreading;

public class ExtendingThreadClass extends Thread {

	static String threadName;
	static String threadName1;
	static int threadPriority;
	static int threadPriority1;
	
	public void run()
	{
		/*for(int i=0;i<4;i++)
		{
			System.out.println("hey everyone i am a new thread. "+threadName);
		}*/
		
		System.out.println("name of the 1st thread : "+threadName);
		System.out.println("priority of the 1st thread : "+threadPriority);
		System.out.println("name of the 2nd thread : "+threadName1);		
		System.out.println("priority of the 2nd thread : "+threadPriority1);
	}
	
	public static void main(String[] args) 
	{		
		ExtendingThreadClass threadObject=new ExtendingThreadClass();		//its the thread object since we are extending the thread class
		threadName=threadObject.getName();
		threadObject.start();
		
		ExtendingThreadClass threadObject1=new ExtendingThreadClass();		//its the thread object since we are extending the thread class
		threadName1=threadObject1.getName();
		threadObject1.start();
				
		/*threadObject.setPriority(MAX_PRIORITY);
		threadObject1.setPriority(MIN_PRIORITY);*/
		
		threadPriority=threadObject.getPriority();
		threadPriority=threadObject1.getPriority();
		
	}
}
