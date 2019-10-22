
public class FirstNonRepeatedElement {

	public static void main(String[] args) {
		String str="Ashutosh";
		System.out.println("------------------------ finding first non repeated element of a string ----------------------");
		char element=checkFirstNonRepeatedElement(str);
		if(element==0)
			System.out.println("no such element is repeated");
		System.out.println("repeated element is : "+checkFirstNonRepeatedElement(str));
	}

	static char checkFirstNonRepeatedElement(String str) {
		str=str.toLowerCase();
		int length=str.length();
		char element = ' ';
		outer:
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					element=str.charAt(i);
					break outer;
				}
			}
		}
		if(element==' ')
			return 0;
		
		return element;
	}
}
