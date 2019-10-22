
public class MergeTwoSortedArrayExample {

	public static void main(String[] args) {
		/*System.out.println("Ascii value from 0 to 139");
		for(int i=0;i<140;i++) {
			System.out.println(" value of "+i +"  "+getIntegerValue(i) +" ");
		}*/
//		System.out.println(" value of A  "+Character.toString((char) 65) +" ");
		
		int[] array1= {1,2,3,4,5,6,20};
		int[] array2= {7,8,9,10,11,12,13,14};
		
		System.out.println("Array after merge :");
		int[] arraysAfterMerge=mergeTwoSortedArray(array1, array2);

		for(int i=0;i<arraysAfterMerge.length;i++) {
			System.out.print(arraysAfterMerge[i] +" ");
		}
	}
	
	static int getIntegerValue(int ascii) {
		return Character.getNumericValue(ascii);
	}
	
	static int[] mergeTwoSortedArray(int[] array1, int[] array2) {
		int lengthOfArray1=array1.length;
		int lengthOfArray2=array2.length;
		int[] resultArray=new int[lengthOfArray1+lengthOfArray2];
		
		int i=0,j=0,k=0;
		while(i<lengthOfArray1 && j<lengthOfArray2) {
			if(array1[i]<array2[j]) {
				resultArray[k]=array1[i];
				i++;
				k++;
			}else {
				resultArray[k]=array2[j];
				k++;
				j++;
			}
		}
		
		while(i<lengthOfArray1) {
			resultArray[k]=array1[i];
			i++;
			k++;
		}
		
		while(j<lengthOfArray2) {
			resultArray[k]=array2[j];
			j++;
			k++;
		}
		
		return resultArray;
	}

}
