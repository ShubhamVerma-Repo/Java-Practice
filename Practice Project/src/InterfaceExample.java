interface A{
	void go();
}

interface B{
	void go();
}


public class InterfaceExample extends Object implements A,B{

	public static void main(String[] args) {
		InterfaceExample obj=new InterfaceExample();
		obj.go();
		
		String str=new String();
		
		String a="shubhambh";
		String b="a";
		String c="shubham";
		String d="shubham";
		
		String newStr=str.join(",", a,b,c,d);
		System.out.println(newStr);
		
		String regexStr="a:b:c:d";
		String[] res=regexStr.split(":",2);
		for(String r:res)
		System.out.println(r+" ");
		
		System.out.println("\n\n");
		
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(b));
	}

	@Override
	public void go() {
		System.out.println("hello go");
	}

}
