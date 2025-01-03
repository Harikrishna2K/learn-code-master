package recursion_basics;

public class NtoOne {
	public static void main(String[] args) {
		NtoOne(5);
	}
	
	static void NtoOne(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		NtoOne(n-1);
		
	}

}
