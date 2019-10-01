
public class ExceptionHandlingExample {

	public static void main(String[] args) {

		try {
			int a=8,b,c;
			b=5;
			c=0;
			System.out.println(a);
		//	System.exit(0);
			a=b/c;
			System.out.println(a);
		}
		catch(ArithmeticException ae ) {
			System.out.println("AE"+ae.getMessage());
		}
		catch(NumberFormatException nfe) {
			System.out.println("NFE"+nfe.getMessage());
		}
		catch(NullPointerException npe) {
			System.out.println("NPE"+npe.getMessage());
		}
		catch(Exception e) {
			System.out.println("E"+e.getMessage());
		}
		finally {
			String s = null;
			System.out.println("finally block");
			try {
				
				System.out.println(s.length());
			}catch (NullPointerException e) {
				System.out.println("NPE");
			}finally {
				System.out.println("Inside inner finally ");
			}
			
			System.out.println("after exception");
			
		}
	}
	
	public void exceptionTesting() throws NullPointerException{
		System.out.println("throw exception in exceptionTesting of parent class");
	}

}

class ChildException extends ExceptionHandlingExample{
	
	public static void main(String[] args) {
		ChildException childException=new ChildException();
		childException.exceptionTesting();
	}
	
	@Override
	public void exceptionTesting() throws RuntimeException{
		System.out.println("throw exception in exceptionTesting of child class");
		int a=9/0;
	}
	
}
