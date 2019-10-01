import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SetClass {

	public static void main(String[] args) {
		
		Set<Employee> set1=new HashSet<>();
		set1.add(new Employee("Shubham", 23));
		set1.add(new Employee("Atul", 30));
		set1.add(new Employee("Punit", 32));
		System.out.print("Set 1 : ");
		set1.forEach(item -> System.out.print(item.toString() +" "));
		System.out.println();
		
		Set<Employee> set2=new HashSet<>();
		set2.add(new Employee("Shubham", 23));
		set2.add(new Employee("Ashutosh", 30));
		set2.add(new Employee("Nitish", 32));
		System.out.print("Set 2 : ");
		set2.forEach(item -> System.out.print(item.toString() +" "));
		System.out.println();
		
		System.out.println("Set 2 after removing : ");
		getResult(set1,set2).forEach(item ->{
			System.out.print(item.toString() +" ");
		});
		
	}
	
	public static Set<Employee> getResult(Set<Employee> set1,Set<Employee> set2) {
		Map<String,Set<Employee>> map1=new HashMap<>();
		set1.forEach(item -> {
			map1.put(item.name, set1);
		});
		
		Map<String,Set<Employee>> map2=new HashMap<>();
		set2.forEach(item -> {
			map2.put(item.name, set2);
		});
		
		map1.forEach((key,value) -> {
			if(map2.containsKey(key)) {
				map2.remove(key);
				System.out.println("---------------"+key);
			}
		});
		
		Set<Employee> resultSet=new HashSet<>();
//		resultSet.addAll(map2.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toSet()));
		
		map2.values().forEach(item -> {
		});
		
		
		return resultSet;
}
	
}



class Employee{
	String name;
	int age;
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + name + " " + age + "]";
	}
	
}