import java.util.Scanner;

public class EndOfIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		int i=1;
		while(scan.hasNext())
		{
			System.out.println(i + " " + scan.nextLine());
			i++;
		}
	}

}
