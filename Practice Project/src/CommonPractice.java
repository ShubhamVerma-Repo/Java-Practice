import java.util.Iterator;
import java.util.Scanner;

public class CommonPractice {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//------------------------------------------------------------------------------------------------------
		
		System.out.println("-----------------printing reverse of string -------------------");
		System.out.print("enter the string : ");
		String str=scan.nextLine();
		
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2.reverse();
		System.out.println("Using StringBuilder : "+str2);
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		//------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-------------------------- Checking number is divisible by the sum of its digits : ----------------------------------");
		System.out.print("enter the number to check for : ");
		int number=scan.nextInt();
		System.out.println("checking result : "+numberIsDivisibleByItsSum(number));
		scan.nextLine();	//since last input was of int type which have a token in last and it would processed for next input if we do not do this.
		
		
		//------------------------------------------------------------------------------------------------------
		
		
		System.out.println("\n---------------------------- enter the string to check pattern : ----------------------------------");
		System.out.print("enter the string to check for pattern : ");
		String input=scan.nextLine();
		System.out.println("-----------------------------"+checkPattern(input.toCharArray()));
		
		
		//------------------------------------------------------------------------------------------------------
		
	
		int[] arr= {-1,2,8,-8,0};
		System.out.println(maxSubArraySum(arr));
	}
	
	static String numberIsDivisibleByItsSum(int number) {
		int m=number;
		int n,sum=0;
		
		while(m>0) {
			n=m%10;
			sum+=n;
			m=m/10;
		}
		if((number%sum)==0)
			return "divisible";
		else
			return "non divisible";
	}

	static boolean checkPattern(char[] str)
	{
		int len = str.length;
		for (int i = 1; i <= len/2; i++) {
			if (len % i == 0) {
				int j = i;
				while (j < len && str[j] == str[j % i]) 
					j++;
				if (j == len) 
					return true;
			}
		}
		return false;
	}
		
	
	static int maxSubArraySum(int a[]) 
    { 
        int size = a.length; 
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
        for (int i = 0; i < size; i++) 
        { 
            max_ending_here = max_ending_here + a[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0; 
        } 
        return max_so_far; 
    } 
	
	static void maxSubArraySumWithIndex(int a[], int size) 
    { 
        int max_so_far = Integer.MIN_VALUE, 
        max_ending_here = 0,start = 0, 
        end = 0, s = 0; 
  
        for (int i = 0; i < size; i++)  
        { 
            max_ending_here += a[i]; 
  
            if (max_so_far < max_ending_here)  
            { 
                max_so_far = max_ending_here; 
                start = s; 
                end = i; 
            } 
  
            if (max_ending_here < 0)  
            { 
                max_ending_here = 0; 
                s = i + 1; 
            } 
        } 
        System.out.println("Maximum contiguous sum is " 
                           + max_so_far); 
        System.out.println("Starting index " + start); 
        System.out.println("Ending index " + end); 
    } 

}










