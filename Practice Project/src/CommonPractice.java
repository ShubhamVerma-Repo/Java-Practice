import java.util.Scanner;

public class CommonPractice {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("reverse of a string");
		/*System.out.println("enter the string");
		String str=scan.nextLine();
		
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2.reverse();
		System.out.println(str2);
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}*/
		
		//----------------------------------
		
		System.out.println("Checking number is divisible by the sum of its digits ");
		System.out.println("enter the number");
		int k=scan.nextInt();
		int m=k;
		int n,sum=0;
		
		while(m>0) {
			n=m%10;
			sum+=n;
			m=m/10;
		}
		if((k%sum)==0)
				System.out.println("divisible");
		else
			System.out.println("non divisible");
		System.out.println("sum : "+sum);
	}

}
