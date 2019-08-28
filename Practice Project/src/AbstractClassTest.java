
public abstract class AbstractClassTest {

	
	protected AbstractClassTest() {
		// TODO Auto-generated constructor stub
	}
	
	protected AbstractClassTest(String name) {
		
	}
	
	abstract void display();
	
	public void abc() {
		int t=10;
	}

}

class ChildAbstractClassTest extends AbstractClassTest{
	
	public static void main(String[] args) {

		ChildAbstractClassTest obj=new ChildAbstractClassTest();
		obj.display();
		obj.abc();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
}
