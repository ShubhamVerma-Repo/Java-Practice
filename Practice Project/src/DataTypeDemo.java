import java.util.Scanner;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter teh value :");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
            	System.out.println("enter the value :");
                long num=sc.nextLong();
                System.out.println(num+" can be fitted in:");
                if (num >= -Math.pow(2, 7) && num <= (Math.pow(2, 7) - 1))
                    System.out.println("* byte");
                if (num >= -Math.pow(2, 15) && num <= (Math.pow(2, 15) - 1))
                    System.out.println("* short");
                if (num >= -Math.pow(2, 31) && num <= (Math.pow(2, 31) - 1))
                    System.out.println("* int");
                if (num >= -Math.pow(2, 63) && num <= (Math.pow(2, 63) - 1))
                    System.out.println("* long");                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }

	}

}
