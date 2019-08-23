import java.util.*;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

import org.omg.Messaging.SyncScopeHelper;

interface Sayable{
	public String say();
}

interface WithOneParameter{
	public String say(String name);
}

interface WithMultipleParameters{
	public int add(int a, int b);
}

interface Sum{
	public void sum();
}


class Person{
	int age;
	String name;
	float salary;
	
	public Person(int age, String name, float salary){
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
}


//Implementing the interface without using "implements" keyword
public class LambdaExpressionExamples {

	public static void main(String[] args) {

		//With LAMBDA EXPRESSION
		
		//*****************************************************
		
			//1st way
		Sayable s1 = () -> {
			return "1st hello";
		};
		
			//2nd way	{without return keyword}
		Sayable s2 = ()-> "2nd hello";
		
		System.out.println(s1.say());
		System.out.println(s2.say());

		//*****************************************************
		
			//1st way
		WithOneParameter w1=(passAnything) -> {
			return passAnything;
		};
		
			//2nd way	{without return keyword}
		WithOneParameter w2=(passAnything) -> passAnything;
		
		System.out.println(w1.say("w1"));
		System.out.println(w2.say("w2"));
		
		
		//*****************************************************
		
			//1st way
		Sum sum1 = () -> {
			int a = 3+4;
			System.out.println(a);
		};
		
			//2nd way	{without return keyword}
		Sum sum2 = () -> System.out.println(7+9);
		
		sum1.sum();
		sum2.sum();
		
		
		//*****************************************************
		
		
			//{without return keyword}
		WithMultipleParameters mp=(x,y)-> (x+y);
		
		System.out.println(mp.add(2, 45));
		
		
		//***********************FOREACH LOOP******************************
		
		
		//Foreach Loop
		
		List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (printedList)->System.out.println(printedList)  
        );  
		
        
		//************************CREATING THREAD*****************************
        
        //Thread Example without lambda  
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  
        
        
        //Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
        
        
      //***********************COMPARATOR	&&	COLLECTION FILTRATION USING STREAM******************************
        
        List<Person> listOfPersons=new ArrayList<Person>();
        listOfPersons.add(new Person(22,"shubham",22f));
        listOfPersons.add(new Person(23,"vansh",22f));
        listOfPersons.add(new Person(24,"manik",22f));
        listOfPersons.add(new Person(25,"rahul",22f));
        
        System.out.println("\n\nlist of persons before sorting on the basis of names\n\n");
        listOfPersons.forEach((unsortedPersonlist)-> System.out.println(unsortedPersonlist.age+ " " +unsortedPersonlist.name+ " " + unsortedPersonlist.salary));
        
        System.out.println("\n\nlist of persons after sorting using Comparator on the basis of names\n\n");
        	//Collections.sort( collection, comparator  );
        Collections.sort(listOfPersons,(name1,name2) -> {return name1.name.compareTo(name2.name);});
        //without return keyword
        //Collections.sort(listOfPersons,(name1,name2) ->  name1.name.compareTo(name2.name));
        listOfPersons.forEach((sortedPersonlist)-> System.out.println(sortedPersonlist.age+ " " +sortedPersonlist.name+ " " + sortedPersonlist.salary));
        
        
        System.out.println("\n\ndata after filteration of data on the basis of age\n\n");
        Stream<Person> filteredData=listOfPersons.stream().filter(data -> data.age>23);
        filteredData.forEach((filteredList)->System.out.println(filteredList.age + " " +filteredList.name + " " +filteredList.salary ));
	}
}



/*//Implementing the interface with using "implements" keyword

public class LambdaExpressionExamples implements Sum,Sayable{

	public static void main(String[] args) {
		LambdaExpressionExamples le=new LambdaExpressionExamples();
		System.out.println(le.say());
		le.sum();
	}

	@Override
	public String say() {
		return "hello";
	}

	@Override
	public void sum() {
		int a=9+8;
		System.out.println(a);
	}
}*/





