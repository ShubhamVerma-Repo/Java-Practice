
class Parent{
	static String name="Shubham";
}

class Child extends Parent{
	static int age=33;
}

public class AccessImmutableClass {

	static String add="gzb";
	
	public static void main(String[] args) {
		
		ImmutableClass immuteObj=new ImmutableClass("Shubham", 23);
		System.out.println(immuteObj);
		
	}
}