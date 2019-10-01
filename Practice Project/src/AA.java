abstract class AbstractA {
	
	int val1;
	String val2;
	public AbstractA(int val1,String val2) {
		this.val1=val1;
		this.val2=val2;
	}
	
	abstract void display() ;
}

class AbstractAA extends AbstractA {

	////here if there is no same constructor in parent then you can call another constructor just to avoid error.
	public AbstractAA(int tempVal) {
		super(tempVal, null);
	}

	@Override
	public void display() {
		System.out.println("AbstactAA.............");
	}

}



public class AA {

	public static void main(String[] args) {
		int tempVal=1;
		
		AbstractA AA=new AbstractAA(tempVal);
		AA.display();
	}
}