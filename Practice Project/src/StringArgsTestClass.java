
public class StringArgsTestClass {

	static public void main(String...args) {

		
		System.out.println(args.length);
		
		callMe1(new String[] {"a", "b", "c","d"});
		callMe2("a", "b", "c","d","e","hjkhjh");
	    // You can also do this
		callMe2(new String[] {"a", "b", "c"});
	}
	
	
	public static void callMe1(String[] args) {
	    System.out.println(args.getClass() == String[].class);
	    for (String s : args) {
	        System.out.println(s);
	    }
	}
	
	
	public static void callMe2(String... args) {
	    System.out.println(args.getClass() == String[].class);
	    for (String s : args) {
	        System.out.println(s);
	    }
	}

}
