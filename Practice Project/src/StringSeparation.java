import java.util.*;
import java.util.Scanner;

public class StringSeparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the comma separated string");
		String inputString=scan.nextLine();
		String delims = "[ .,?!]+";
		String[] inputArray= inputString.split(delims);

		List<String> listOfValues=Arrays.asList(inputString.split(","));
		
		for(String list:listOfValues)
		{
			System.out.println(list);
		}
		
		
		System.out.println();
		for(String array:inputArray)
		{
			System.out.println(array);
		}
		System.out.println();
	}

}
