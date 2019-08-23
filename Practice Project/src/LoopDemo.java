import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		first :
			for(int j=0;j<3;j++)
			{
				second :
					for(int i=0;i<=5;i++)
					{
						if(i==a)
						{
							break second;
							//break first;					
						}
						System.out.println(i);
					}
		System.out.println("-------------");
			}
	}

}
