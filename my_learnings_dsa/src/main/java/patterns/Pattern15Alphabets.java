package patterns;


/*
 
 
A
AB
ABC
ABCD
ABCDE

* */

public class Pattern15Alphabets {
	public static void main(String[] args) {
		pattern15(5);
	}
	
	static void pattern15(int n) {
		for(int i = 1; i<=n;i++) {
			for(char ch = 'A'; ch < 'A'+i ; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}
	

}
