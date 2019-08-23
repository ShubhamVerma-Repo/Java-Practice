
public class Overload_Testing {

	public static void main(String[] args) {

		call(null);
	}
	
	static void call(Object o) {
		System.out.println("Integer");
	}
	
	/*static void call(String x) {
		System.out.println("String");
	}*/
	
	static void call(Number x) {
		System.out.println("String");
	}

}
