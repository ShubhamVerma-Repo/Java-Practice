
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer one=new Integer(2);
		Integer second=new Integer(2);
		
		if(one.equals(second))
			System.out.println("one equals to second");
		else
			System.out.println("one is not equals to second");
		
		String third=new String("aa");
		String forth=new String("aa");
		
		if(third.equals(forth))
			System.out.println("third equals to forth");
		else
			System.out.println("third is not equals to forth");
		
		if(third==forth)
			System.out.println("third is equals to forth");
		else
			System.out.println("third is not equal to forth");
		
		
		System.out.println(third.getClass());
		System.out.println(one.getClass());
		
		
		System.out.println(second.floatValue());
		System.out.println(forth.contains("a"));
	}

}
