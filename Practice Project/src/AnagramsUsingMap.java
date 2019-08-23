import java.util.Scanner;

public class AnagramsUsingMap {
	
	
	//-************************		SOLUTION 1	  ***************************************************
	
	/*static boolean isAnagram(String a, String b) {

		java.util.HashMap<Character,Integer> frequencyCount1=new java.util.HashMap<Character,Integer>();
		java.util.HashMap<Character,Integer> frequencyCount2=new java.util.HashMap<Character,Integer>();
		char[] stringArray1=a.toCharArray();
		char[] stringArray2=b.toCharArray();
		boolean flag=false;
		
		for(char counter:stringArray1)
		{
			if(frequencyCount1.containsKey(counter))
				frequencyCount1.put(counter, frequencyCount1.get(counter)+1);
			else
				frequencyCount1.put(counter, 1);
		}
		for(char counter:stringArray2)
		{
			if(frequencyCount2.containsKey(counter))
				frequencyCount2.put(counter, frequencyCount2.get(counter)+1);
			else
				frequencyCount2.put(counter, 1);
		}
		
		if(a.length()==b.length())
		{
			for(java.util.Map.Entry<Character, Integer> comparingMaps:frequencyCount1.entrySet())
			{
				if(frequencyCount2.containsKey(comparingMaps.getKey()))
				{
					if(frequencyCount2.get(comparingMaps.getKey())!=(frequencyCount1.get(comparingMaps.getKey())))
					{
						flag=false;
					}
				}
				else
					flag=false;
			}
		}
		else
			flag=false;
		
		return flag;
    }*/
	
	//*************************************************************************************
	
	
	
	//*********************************	SOLUTION 2	  ************************************************
	
	/*static boolean isAnagram(String a, String b) {

		java.util.HashMap<Character,Integer> frequencyCount1=new java.util.HashMap<Character,Integer>();
	
		if( a == null || b == null || a.equals("") || b.equals("") )
		    throw new IllegalArgumentException();

		// initial quick test for non-anagrams
		if ( a.length() != b.length() )
		    return false;

		a = a.toLowerCase();
		b = b.toLowerCase();

		// populate a map with letters and frequencies of String b

		for (int k = 0; k < b.length(); k++){
		     char letter = b.charAt(k);    

		    if( ! frequencyCount1.containsKey(letter)){
		    	frequencyCount1.put( letter, 1 );
		    } else {
		        Integer frequency = frequencyCount1.get( letter );
		        frequencyCount1.put( letter, ++frequency );
		    }
		}

		// test each letter in String a against data in the map
		// return if letter is absent in the map or its  frequency is 0
		// otherwise decrease the frequency by 1

		for (int k = 0; k < a.length(); k++){
		    char letter = a.charAt(k);

		    if( ! frequencyCount1.containsKey( letter ) )
		        return false;

		    Integer frequency = frequencyCount1.get( letter );

		     if( frequency == 0 )
		        return false;
		    else    
		    	frequencyCount1.put( letter, --frequency);
		}
		// if the code got that far it is an anagram
		return true;
		
	}*/
		
	
	//*************************************************************************************
	
	
	
	//*********************************	SOLUTION 3  ****************************************                                                                             
	
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
    }
}
