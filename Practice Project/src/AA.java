abstract class AbstactA {

	public void display() {
		System.out.println("AbstactA...............");
	}
}
abstract class AbstractAA extends AbstactA {

	@Override
	public void display() {
		System.out.println("AbstactAA.............");
	}

}

public class AA extends AbstractAA {

	public static void main(String[] args) {
		AA a = new AA();
		a.display();
	}
}