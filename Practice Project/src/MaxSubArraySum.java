
public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] arr= {-1,2,-8,-8,0,4,-3,-2,8};
		int[] result=maxSubArraySum(arr);
		int maxSum=result[0];
		int startIndex=result[1];
		int endIndex=result[2];
		System.out.println("---------------------------Max sub array sum-----------------------------");
		System.out.println("maximum sum := "+maxSum);
		System.out.println("start index : " +startIndex +"  end index : "+endIndex);
	}
	
	static int[] maxSubArraySum(int[] arr) {
		int[] result = new int[3];
		int size=arr.length;
		int tempSum=0;
		int maxSum=0;
		int x = 0, start = 0, end = 0;
		for(int i=0;i<size;i++) {
				tempSum+=arr[i];
			if(tempSum<0) {
				tempSum=0;
				x=i+1;
			}
			if(maxSum<tempSum) {
				maxSum=tempSum;
				start=x;
				end=i;
			}
		}
		result[0]=maxSum;
		result[1]=start;
		result[2]=end;

		return result;
	}

}
