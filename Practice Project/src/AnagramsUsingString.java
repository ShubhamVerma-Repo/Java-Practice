import java.util.Arrays;
import java.util.Scanner;

public class AnagramsUsingString {

	
	//*********************************	SOLUTION 1  ****************************************  
	
/*	static boolean isAnagram(String a, String b) {

		a = a.toLowerCase();
		b = b.toLowerCase();

		boolean status = true;
		if (a.length() != b.length()) {
			status = false;
		} else {
			char[] ArrayS1 = a.toLowerCase().toCharArray();
			char[] ArrayS2 = a.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			return true;
		} else {
			return false;
		}
	}*/
	
	
	
	//*************************************************************************************
	
	
	
		//*********************************	SOLUTION 2  ****************************************                                                                             
		
		static boolean isAnagram(String a, String b) {

	        if (a.length() != b.length()) return false;
	        
	        a = a.toLowerCase();
	        b = b.toLowerCase();
	        
	        int [] temp = new int [Character.MAX_VALUE]; 
	        int summ = 0;

	        for (int i = 0; i < a.length(); i++){
	            summ += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
	            summ += --temp [b.charAt(i)] >= 0 ? -1 : 1;
	        }

	        return summ == 0;
	        
		}
			
			
		//*************************************************************************************
	
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter the string");
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	        
	        System.out.println(a.length());
	        
	        
	        
	        String []shub = new String[10];
	        Arrays.fill(shub, "fas");
	        System.out.println(Arrays.toString(shub));
	    }

}
