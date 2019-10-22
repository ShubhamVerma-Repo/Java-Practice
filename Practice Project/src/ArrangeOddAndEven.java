
public class ArrangeOddAndEven {

	public static void main(String[] args) {

		int[] array= {2,1,4,3,5,6,9,8,7};
		System.out.println("-------------------------- sorted array with odd at left and even on right -----------------------------");
		int[] sortedArray=arrangeOddandEven(array);
		for(int i : sortedArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("-------------------------- sorted array with odd at left and even on right (OPTIMISED) -----------------------------");
		int[] optimisedSortedArray=arrangeOddandEvenOptimised(array);
		for(int i : optimisedSortedArray) {
			System.out.print(i + " ");
		}
		
	}
	
	static int[] arrangeOddandEven(int[] array) {
		int size=array.length;
		
		for(int i=0;i<size;i++) {
			if(array[i]%2==0) {
				for(int j=i+1;j<size;j++) {
					if(array[j]%2!=0) {
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
						break;
					}
				}
			}
		}
		
		return array;
	}
	
	static int[] arrangeOddandEvenOptimised(int[] array) {
		int size=array.length;
		int j=-1,temp;
		for(int i=0;i<size;i++) {
			if(array[i]%2!=0) {
				j++;
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		return array;
	}

}
