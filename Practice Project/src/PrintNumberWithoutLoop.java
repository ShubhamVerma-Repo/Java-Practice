
public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		int i=1;
		printNum(i);
	}
	
	static void printNum(int num) {
		if(num<=100) {
			System.out.print(num++ +" ");
			printNum(num);
		}
	}
}
