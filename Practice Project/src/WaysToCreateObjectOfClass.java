import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToCreateObjectOfClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, SecurityException {

		//1st way
			WaysToCreateObjectOfClass obj1=new WaysToCreateObjectOfClass();
			obj1.display();
		
		//2nd way
			WaysToCreateObjectOfClass obj2=(WaysToCreateObjectOfClass) Class.forName("WaysToCreateObjectOfClass").newInstance();
			obj2.display();
		
		//3rd way
			Constructor<WaysToCreateObjectOfClass> constructor = WaysToCreateObjectOfClass.class.getConstructor();
			WaysToCreateObjectOfClass obj3=constructor.newInstance();
			obj3.display();
		
	}
	
	
	public void display() {
		System.out.println("display");
	}

}
