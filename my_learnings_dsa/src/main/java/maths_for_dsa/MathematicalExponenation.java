package revision.basicmaths;

public class MathematicalExponenation {
	
	
	public static void main(String[] args) {
		findExponentation(4, 4);
	}
	
	static void findExponentation(int n, int base) {
		int answer = 1;
		for(int i = 1; i<=base; i++) {
			answer = answer*n;
		}
		
		System.out.println("The base is this: " + answer);
	}
	

}
