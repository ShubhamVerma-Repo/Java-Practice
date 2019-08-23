import java.util.Scanner;

public class Manik_Synchronized_Threads {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of numbers to print even and odd alternatively : ");
		int startNumberRange = scan.nextInt();
		int endNumberRange = scan.nextInt();
		
		if(startNumberRange >= endNumberRange) {
			System.out.println("please enter the valid range :     START NUMBER MUST BE LESS THAN END NUMBER");
			System.exit(0);
		}
		
		PrintingRequiredOutput outputObject = new PrintingRequiredOutput();
		ThreadRunnerClassEven evenNumThread = new ThreadRunnerClassEven();
		ThreadRunnerClassOdd oddNumThread = new ThreadRunnerClassOdd();

		evenNumThread.getOutputNumber(outputObject, startNumberRange, endNumberRange);
		oddNumThread.getOutputNumber(outputObject, startNumberRange, endNumberRange);
		
		evenNumThread.setName("Even Thread :");
		oddNumThread.setName("Odd Thread : ");
		
		evenNumThread.start();
		oddNumThread.start();
		
		/*try {
			evenNumThread.join();
			oddNumThread.join();
		}catch(Exception e) {
			System.out.println("exception in main : " +e.getMessage());
		}*/
		
		
		/*int countEven = 0;
		int countOdd = 0;
		
		for (int i = 0 ; i< numberRange ; i++) {
			
			if(i%2==0) {
				countEven++;
				evenNumThread.getOutputNumber(outputObject, i);
				if(countEven==1)
					evenNumThread.start();
			}else {
				countOdd++;
				oddNumThread.getOutputNumber(outputObject, i);
				if(countOdd==1)
					oddNumThread.start();
			}
			
			try {
				evenNumThread.join();
				oddNumThread.join();
			}catch(Exception e) {
				System.out.println("exception in main : " +e.getMessage());
			}
		}*/
	}

}


class PrintingRequiredOutput{
	
	transient boolean flag=false;
	
	synchronized void printOddOutput(int numberToPrint){
		while(flag) {
			try {
				wait();
			}catch(Exception e){
				System.out.println("Exception in PrintingRequiredOutput class : "+e.getMessage());
			}
		}
		System.out.println(Thread.currentThread().getName() + " : "+numberToPrint);
		flag=true;
		try {
			Thread.sleep(500);
		}
		catch(Exception e){
			System.out.println("Exception in PrintingRequiredOutput class : "+e.getMessage());
		}
		notify();
	}
	
	synchronized void printEvenOutput(int numberToPrint){
		while(!flag) {
			try {
				wait();
			}catch(Exception e){
				System.out.println("Exception in PrintingRequiredOutput class : "+e.getMessage());
			}
		}
		System.out.println(Thread.currentThread().getName() + " : "+numberToPrint);
		flag=false;
		try {
			Thread.sleep(500);
		}
		catch(Exception e){
			System.out.println("Exception in PrintingRequiredOutput class : "+e.getMessage());
		}
		notify();
	}
}





class ThreadRunnerClassEven extends Thread {
	PrintingRequiredOutput outputObject = new PrintingRequiredOutput();
	int startNum;
	int endNum;
	int evenNumber;

	public void getOutputNumber(PrintingRequiredOutput outputObject, int startNum, int endNum) {
		this.outputObject = outputObject;
		this.startNum = startNum;
		this.endNum = endNum;
	}

	public void run() {
		if(startNum%2==0)
			evenNumber = startNum;
		else
			evenNumber = startNum+1;
		while (evenNumber <= endNum) {
			outputObject.printEvenOutput(evenNumber);
			evenNumber=evenNumber+2;
		}
	}
}



class ThreadRunnerClassOdd extends Thread{
	PrintingRequiredOutput outputObject = new PrintingRequiredOutput();
	int startNum;
	int endNum;
	int oddNumber;
	
	public void getOutputNumber(PrintingRequiredOutput outputObject, int startNum, int endNum) {
		this.outputObject = outputObject;
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	public void run() {
		if(startNum%2!=0)
			oddNumber = startNum;
		else
			oddNumber = startNum+1;
		while (oddNumber <= endNum) {
			outputObject.printOddOutput(oddNumber);
			oddNumber = oddNumber + 2;
		}
	}
}