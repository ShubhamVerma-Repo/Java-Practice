
public class ExceptionHandlingExample {

	public static void main(String[] args) {

		try {
			int a=8,b,c;
			b=5;
			c=0;
			System.out.println(a);
			System.exit(0);
			a=b/c;
			System.out.println(a);
		}
		catch(ArithmeticException ae) {
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
			System.out.println("finally block");
		}
	}

}
