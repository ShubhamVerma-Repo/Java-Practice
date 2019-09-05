
public abstract class AbstractClassTest {

	
	protected AbstractClassTest() {
	}
	
	protected AbstractClassTest(String name) {
		
	}
	
	abstract void display();
	
	public void abc() {
		int t=10;
	}
	
	int i=10;

}

class ChildAbstractClassTest extends AbstractClassTest{
	
	int i=20;
	
	public static void main(String[] args) {

		ChildAbstractClassTest obj=new ChildAbstractClassTest();
		obj.display();
		obj.abc();
		
		AbstractClassTest obj1=new ChildAbstractClassTest();
		int temp=obj1.i; 	//data member of parent class
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
}
