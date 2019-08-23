import java.util.Scanner;

public class SeriesDemo {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	    int t=in.nextInt();
	    for(int i=0;i<t;i++){
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int n = in.nextInt();
	        
	        int series=a;
	        
	        for(int j=0;j<n;j++)
	        {
	        	series=series+(int) (Math.pow(2, j)*b);
	        	System.out.print(series + " ");
	        }	        
	    }
	    in.close();
	    
	    System.out.println(Math.pow(2, 0));
	    int n = in.nextInt();
	    for(int j=0;j<n;j++)
        {
        	System.out.print((int)Math.pow(2, j)+" ");
        }	 
	}
}
