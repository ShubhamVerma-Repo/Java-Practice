import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number upto which you want fibonacci : ");
		int numUptoForFibonacciSeries = scan.nextInt();
		int a=0,b=0,c=1;
		
		System.out.print("fibonacci series would be : ");
		for(int i=0;i<=numUptoForFibonacciSeries;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		
	}
	
}
