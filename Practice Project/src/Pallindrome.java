import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
        String A=sc.next();
        String newString = "";
        
        for(int i=A.length()-1;i>=0;i--)
        {
        	newString=newString + (A.charAt(i));
        }
        System.out.println("reverse of string : " +newString);
       
        if(newString.compareTo(A)==0)
            System.out.println("String is pallindrome : Yes");
        else
            System.out.println("String is pallindrome : No");
	}

}
