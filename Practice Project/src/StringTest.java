import java.util.Scanner;

public class StringTest {

	 public static void main(String[] args) {
         String s1 = null;
     int x = 0;

     Scanner sc = new Scanner(System.in);

     System.out.println("================================");
   
     for(int i=0;i<3;i++)
     {
         s1 =sc.next();
         x = sc.nextInt();
         sc.nextLine();    
         
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
	 }	 
}
