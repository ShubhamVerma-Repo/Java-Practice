
public class Overload_Testing {

	public static void main(String[] args) {

		call(null);
		
		
		Overload_Testing obj=new Overload_Testing();
		//obj.test(20,20);
	}
	
	//--------------------------------------------------
	static void call(Object o) {
		System.out.println("Integer");
	}
	
	/*static void call(String x) {
		System.out.println("String");
	}*/
	
	static void call(Number x) {
		System.out.println("String");
	}
	//--------------------------------------------------
	
	String test(String name, int i) {
		return "shubham";
	}
	
	//--------------------------------------------------
	//will produce ambiguity while calling
	
	String test(long name, int i) {
		return "shubham";
	}
	
	String test(int i, long name) {
		return null;
	}
	//--------------------------------------------------
}
