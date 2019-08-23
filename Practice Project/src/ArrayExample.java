import org.apache.commons.lang3.ArrayUtils;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arr= {1,43,3,8,22};
		
		int max=maxElement(arr);
		System.out.println("max element in the array : "+max);
		
		int[] tempArr=ArrayUtils.removeElement(arr,max);
		int secMax=maxElement(tempArr);
		System.out.println("second max value in array : "+secMax);
		
		int[] values=secMaxElement(arr);
		System.out.println("max element in the array : "+values[0]);
		System.out.println("second max element in the array : "+values[1]);
	}
	
	static int maxElement(int[] arr) {
		int length=arr.length;
		int i = 0,max=0;
		while(i<length) {
			if(max<arr[i]) {
				max=arr[i];
			}
			i++;
		}
		return max;
	}
	
	static int[] secMaxElement(int[] arr) {
		int length=arr.length;
		int i=0;
		int[] value=new int[2];
		while(i<length) {
			if(arr[i]>value[0]) {
				value[1]=value[0];
				value[0]=arr[i];
			}else if(arr[i]>value[1] && arr[i] != value[0]){
				value[1]=arr[i];
			}
			i++;
		}
		return value;
	}
}
