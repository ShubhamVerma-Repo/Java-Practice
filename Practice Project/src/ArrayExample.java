import java.util.Arrays;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayExample {

	public static void main(String[] args) {

		int[] arr= {1,43,3,8,22};
		
		int max=maxElement(arr);
		System.out.println("max element in the array : "+max);
		
		int[] tempArr=ArrayUtils.removeElement(arr,max);
		int secMax=maxElement(tempArr);
		System.out.println("second max value in array : "+secMax);
		System.out.println("-----------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------
		
		int[] values=secMaxElement(arr);
		System.out.println("max element in the array : "+values[0]);
		System.out.println("second max element in the array : "+values[1]);
		System.out.println("-----------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------
		
		int[] temp= {1,2,4,1,5,2};
		int[] arrWithoutDuplicate=removeDuplicate(temp);
		System.out.println("Array after removing duplicate elements :");
		for(int i=0;i<arrWithoutDuplicate.length;i++){
			if(arrWithoutDuplicate[i]!=0)
				System.out.print(" "+arrWithoutDuplicate[i]);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------
		
		int[] findSum= {6,8,-2,48,7,3,0};
		int evenSum=sumOfAlternatePlace(findSum, "even");
		System.out.println("Sum of even index number : "+evenSum);
		int oddSum=sumOfAlternatePlace(findSum, "odd");
		System.out.println("Sum of odd index number : "+oddSum);
		int totalSum=sumOfAlternatePlace(findSum, "total");
		System.out.println("Total sum of array : "+totalSum);
		System.out.println("-----------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------
		
		System.out.println("All missing numbers in existing array : ");
		Arrays.stream(findMissingNumber()).filter(x -> x!=0).forEach(x -> System.out.print(" "+x));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------
		
		int[] unsortedArray= {1,3,2,4,5};
		System.out.println("Moves to sort the below array : ");
//		Arrays.stream(findMovesToSortArray(unsortedArray)).forEach(x->System.out.print(" "+x));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------
		
		int[] shiftArrayElement= {1,3,2,4,5};
		System.out.println("Shift the elements of an array : ");
		Arrays.stream(shiftArrayElementFromRightToLeft(shiftArrayElement)).forEach(x->System.out.print(" "+x));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		
		//-----------------------------------------------------------------------
		
		String originalString="abdul KaLam aAJaD";
		String stringAfterOperation=filterOutString(originalString);
		System.out.println(stringAfterOperation);
		System.out.println("\n-----------------------------------------------------------------------");
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
	
	//-----------------------------------------------------------------------
	
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
	
	//-----------------------------------------------------------------------
	
	static int[] removeDuplicate(int[] arr) {
		int arrLength=arr.length;
		int[] tempArr = new int[arrLength];
		boolean flag=false;
		for(int i=0;i<arrLength;i++) {
			if(flag) {
				boolean exists=binarySearch(tempArr, arr[i]);
				if(!exists)
					tempArr[i]=arr[i];
			}else {
				tempArr[i]=arr[i];
				flag=true;
			}
		}
		return tempArr;
	}
	
	static boolean binarySearch(int[] arr, int item) {
		int start = 0 ,mid ,end = arr.length-1;

		while( start <= end) {
			mid=(start+end)/2;
			if(arr[mid] == item) {
				return true;
			}else if(arr[mid] >= item) {
				end= mid - 1;
			}else {
				start= mid + 1;
			}
		}
		return false;
	}
	
	//-----------------------------------------------------------------------
	
	static int sumOfAlternatePlace(int[] arr,String sumType) {
		int evenSum=0, oddSum=0,totalSum=0;
		
		for(int i=1; i<arr.length;i++) {
			if(i%2==0)
				evenSum+=arr[i-1];
			else
				oddSum+=arr[i-1];
			
			totalSum+=arr[i-1];
		}
		if(sumType.equals("even"))
			return evenSum;
		else if(sumType.equals("odd"))
			return oddSum;
		else
			return totalSum;
	}
	
	//-----------------------------------------------------------------------
	
	static int[] findMissingNumber() {
		int[] array= new int[]{1,2,3,4,5,6,8,9,11,12,25,49,55};
		int lastElementOfArray=Arrays.stream(array).reduce((first, second) -> second).getAsInt()+1;
		
		int[] missingNumArray = new int[lastElementOfArray];
		for(int item=1;item<lastElementOfArray;item++) {
			boolean flag=binarySearch(array, item);
			if(!flag) 
				missingNumArray[item-1]=item;
		}
		return missingNumArray;
	}
	
	//-----------------------------------------------------------------------
	
	static int[] findMovesToSortArray(int[] array) {
		int arrLength=array.length;
		int[] tempArray=new int[arrLength];
		boolean flag=false;
		for(int j=0;j<arrLength;j++) {
			for(int i=0;i<arrLength;i++) {
				if(array[i]>array[i+1]) {
					if(tempArray[arrLength-1] == 0) {
						tempArray[arrLength-1]=array[i];
					}else {
						
					}
					flag=true;
				}else {
					tempArray[i]=array[i];
				}
			}
			if(flag==true)
				break;
		}
		return tempArray;
	}
	
	//-----------------------------------------------------------------------
	
	static int[] shiftArrayElementFromRightToLeft(int[] array) {
		int lastIndex = array.length - 1; 
	    int oldFirst = array[0]; 

	    for (int i = 0; i < lastIndex; i++) 
	        array[i] = array[i + 1];

	    array[lastIndex] = oldFirst;
		return array;
	}
	
	//-----------------------------------------------------------------------
	
	static String filterOutString(String inputString) {
		String[] tempString=inputString.split("\\s");
		int i=0;
		String originalString="";
		while(i<tempString.length) {
			if(i!=tempString.length-1) {
				originalString+=tempString[i].toUpperCase().charAt(0);
				originalString+=".";
			}else {
				char tempChar=tempString[i].toUpperCase().charAt(0);
				originalString+=tempChar+(tempString[i].toLowerCase().substring(1));
			}
			i++;
		}
		return originalString;
	}
}
