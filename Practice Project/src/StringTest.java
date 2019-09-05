import java.util.Scanner;
import java.util.regex.Pattern;

public class StringTest {

	 public static void main(String[] args) {
     String s1 = null;
     int x = 0;
     
     String[] stringInput = {"Shubham", "ABC", "Verma"};
     int[] intInput = {43, 4, 511};
     
     System.out.println("Adding 0 as default to make an int value to 3 digit value ");

     System.out.println("================================");
   
     for(int i=0;i<3;i++)
     {
         s1 = stringInput[i];
         x = intInput[i];
         
        // System.out.printf("%-15s%03d%n", s1, x);
         int stringLength=s1.length();
         
         for(int j=stringLength+1;j<=15;j++)
         {
             s1=s1.concat(" ");
         }
         int length = String.valueOf(x).length();
         String z = null;
         if(x<100)
        	 if(length==1)
        		 z="00"+x;
        	 else
        		 z="0"+x;
         else
             z=""+x;
         
         System.out.println(s1 + z);
     }
   
     System.out.println("================================");
     
     String testSplit = "Hi, My name is Shubham Verma";
     String words[] = testSplit.split(" ");
     System.out.println("count of words in the above string : "+ words.length);
     System.out.println(words.toString());
     
     System.out.println("================================");
     
     System.out.println(Pattern.matches("s....", "sjjdj"));	//(s....) implies it checks the first character is 's' or not and further the no of dots are matches with characters after s
     
     
	 }	 
}
