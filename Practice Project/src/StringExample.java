import java.util.*;

public class StringExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string : ");
		String str1=sc.nextLine();
		
		boolean result=findPallindromeAfterReversing(str1);
		System.out.println("Given string are Pallindrome ? "+result);
		
		System.out.println("duplicate characters in the given string are : ");
		HashMap<Character,Integer> duplicateCount=findDuplicateChar(str1);
		duplicateCount.forEach((k,v) -> {
			if(v>1) {
				System.out.println(k + " is occur " + v + " times");
			}
		});
		
		System.out.println("String after removing all whitespaces using replaceAll: "+removeWhiteSpaceUsingReplace(str1));
		
		System.out.println("String after removing all whitespaces : "+removeWhiteSpace(str1));
		
	}
	
	static boolean findPallindromeAfterReversing(String str1) {
		String reverseStr1="";
		for(int i=str1.length()-1;i>=0;i--) {
			reverseStr1+=str1.charAt(i);
		}
		if(reverseStr1.equals(str1))
			return true;
		else
			return false;
	}
	
	static HashMap<Character,Integer> findDuplicateChar(String str) {
		HashMap<Character,Integer> duplicateCharCount=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			if(duplicateCharCount.containsKey(str.charAt(i))) 
				duplicateCharCount.put(str.charAt(i), duplicateCharCount.get(str.charAt(i))+1);
			else
				duplicateCharCount.put(str.charAt(i), 1);
		}
		return duplicateCharCount;
	}
	
	static String removeWhiteSpaceUsingReplace(String str) {
		String str1=str.replaceAll("\\s", "");
		return str1;
	}
	
	static StringBuffer removeWhiteSpace(String str) {
		char[] chars = str.toCharArray();
		 
        StringBuffer sb = new StringBuffer();
 
        for (int i = 0; i < chars.length; i++)
        {
            if( (chars[i] != ' ') && (chars[i] != '\t') )
            {
                sb.append(chars[i]);
            }
        } 
		return sb;
	}

}
