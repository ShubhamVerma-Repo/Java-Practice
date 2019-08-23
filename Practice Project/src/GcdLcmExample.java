
public class GcdLcmExample {

	public static void main(String[] args) {

		int n1=22, n2=47;
		int gcd=findGcd(n1, n2);
		System.out.println("gcd : "+gcd);
		
		int lcm=findLcm(n1, n2);
		System.out.println("lcm : "+lcm);
		
	}
	
	static int findGcd(int a,int b){
		if(a==0)
			return b;
		
		return findGcd(b%a,a);
	}
	
	static int findLcm(int a,int b) {
		return (a*b)/findGcd(a, b);
	}

}
