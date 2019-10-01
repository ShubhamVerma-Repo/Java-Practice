
public class Overload_Testing {

	public static void main(String[] args) {

		call("dsa");
		
		
		Overload_Testing obj=new Overload_Testing();
		//obj.test(20,20);
	}
	
	//--------------------------------------------------
	static void call(Object o) {
		System.out.println("Object");
	}
	
	/*static void call(String x) {
		System.out.println("String");
	}*/
	
	static void call(Number x) {
		System.out.println("String");
	}
	//--------------------------------------------------
	
	String test(String name, int i) {
		return "parent";
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

class Child extends Overload_Testing{
	
	String test() {
		return "shubham";
	}
	
	String test(String name, int i) {
		return "child";
	}
}

class TestIt{
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.test("da",23));
		Overload_Testing obj = new Overload_Testing();
		System.out.println(obj.test("da",23));
	}
}
