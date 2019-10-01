import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumberExample {

	public static void main(String[] args) {
		int[] array= IntStream.rangeClosed(1, 100).toArray();
		System.out.println("array of length : "+array.length);
		int[] primeNumberArray=findPrimeNumbers(array);
		System.out.println("prime array size : " +primeNumberArray.length);
		Arrays.stream(primeNumberArray).forEach(item -> System.out.print(item +" "));
	}
	
	static int[] findPrimeNumbers(int[] array) {
		int[] primeNumberArray=new int[array.length];
		int i=1;
		while(i<=array.length) {
			if(i==1||i==2||i==3) {
				primeNumberArray[i-1]=i;
			}else if(i/2==0 || i/1==0) {
				primeNumberArray[i-1]=i;
			}else {
				continue;
			}
			i++;
		}
		return primeNumberArray;
	}
}
