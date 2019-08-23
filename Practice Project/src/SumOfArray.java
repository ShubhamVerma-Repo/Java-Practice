import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={4,5,6,8,1,9,3};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the integer value");
		int value=scan.nextInt();
		
		int [] returned=subSet(arr, value, arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(returned[i]);
		}
	}
	
	private static int[] subSet(int []arr,int value,int length)
	{
		int [] subset =new int[length];
		
		int start=arr[0];
		
		for(int i=1;i<length;i++)
		{
			if(start+arr[i]==value)
			{
				subset[i-1]=arr[i-1];
				subset[i]=arr[i];
				start=arr[i];
				return subset;
			}
		}
		return arr;
	}

}
