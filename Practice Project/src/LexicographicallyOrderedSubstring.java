import java.util.Scanner;

public class LexicographicallyOrderedSubstring {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);

		for(int i=1;i<s.length()-(k-1);i++)
		{
			String currentString=s.substring(i, i+k);
			if(smallest.compareTo(currentString)>0)
				smallest=currentString;
			if(largest.compareTo(currentString)<0)
				largest=currentString;
		}
		return "smallest : " +smallest + "\nlargest : " + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.next();
		System.out.println("enter the length of substring");
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
