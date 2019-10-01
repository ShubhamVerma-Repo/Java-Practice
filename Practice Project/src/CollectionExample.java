import java.util.HashSet;
import java.util.Set;

public class CollectionExample {
	
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		
		set.add(23);
		set.add(4);
		set.add(3);
		/*set.add(23);
		set.add(4);
		set.add(3);*/
		
		set.forEach(item -> System.out.print(item+" "));
	}
}
