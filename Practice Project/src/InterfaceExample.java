
interface A{
	void go();
}

interface B{
	void go();
	void one();
	
	//inner class in interface B
	class InnerClass implements B{
		
		public interface InnerInterface{
			void innerInterface();
		}
		
		void method() {
			System.out.println("hello method() of class InnerClass of Interface B");
		}

		@Override
		public void go() {
			System.out.println("implementing the interface's go() method");
		}

		@Override
		public void one() {
			System.out.println("implementing the interface's one() method");			
		}
	}
}


public class InterfaceExample extends B.InnerClass implements A, B.InnerClass.InnerInterface{

	public static void main(String[] args) {
		InterfaceExample obj=new InterfaceExample();
		obj.go();
		obj.method();
		obj.one();
		obj.go();
		obj.innerInterface();
			
		//-----------------------------------------------------------------
		//Making object of Inner class of Interface B
		InnerClass object = new InnerClass();
		object.method();
		object.go();
		object.one();
		//-----------------------------------------------------------------
	}

	@Override
	public void go() {
		System.out.println("hello go");
	}

	@Override
	public void innerInterface() {
		System.out.println("method of InnerInterface of Class InnerClass of Interface B");
	}

}
