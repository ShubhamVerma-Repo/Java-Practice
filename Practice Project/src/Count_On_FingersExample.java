import java.util.HashMap;

public class Count_On_FingersExample {

	public static void main(String[] args) {

		int n=100;
		int finger=count_num_finger(n);
		System.out.println("finger number for 100 : "+finger);
		
		
		
		
		String str = "This this is is done by Saket Saket";
		String[] split = str.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0; i<split.length-1; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}
			else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	
	}
	
	static int count_num_finger(int n) 
	{ 
	    int r = n % 8; 
	    if (r == 1) 
	        return r; 
	    if (r == 5) 
	        return r; 
	    if (r == 0 || r == 2) 
	        return 2; 
	    if (r == 3 || r == 7) 
	        return 3; 
	    if (r == 4 || r == 6) 
	        return 4; 
	    return n; 
	} 

}
