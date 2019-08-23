import java.util.Scanner;

public class BinarySearchDemo {

	static int locationOf=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the length of an array");
		int arrLength=scan.nextInt();
		
		System.out.println("enter the values of array");
		int Arr[]=new int[arrLength];
		
		for(int i=0;i<arrLength;i++)
		{
			Arr[i]=scan.nextInt();
		}
		for(int i=0;i<arrLength;i++)
		{
			System.out.print(Arr[i]);
		}
		System.out.println();
		
		System.out.println("enter the value you want to search ");
		int searchValue=scan.nextInt();	
		System.out.println(searchValue);
		int location=binarySearch(searchValue, Arr);
		
		System.out.println("location of " + location + " is at " +locationOf );
	}
	
	
	public static int binarySearch(int value,int Arr[])
	{		
		int start = 0, end = Arr[Arr.length - 1], mid;

		while (start <= end) {
			mid = (start + end) / 2;

			if (Arr[mid] == value) {
				locationOf=mid;
				return Arr[mid];
			}
			else if(Arr[mid]>=value)
			{
				end=mid-1;
			}
			else
				start=mid+1;
		}
		return -1;
	}

}
