import java.util.Scanner;

public class TableGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number for table generation : ");
		int x=scan.nextInt();
		
		for(int i=0;i<10;i++)
		{
			System.out.println(x + " x " + (i+1) + " = " + x*(i+1));
		}
	}

}
