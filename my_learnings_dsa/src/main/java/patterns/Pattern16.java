package patterns;
/*
 
ABCDE
ABCD
ABC
AB
A
 * */

public class Pattern16 {
	public static void main(String[] args) {
		pattern16(5);
	}
	
	static void pattern16(int n) {
		for(int i = 1;i<=n;i++) {
			for(char ch = 'A' ; ch <= 'A'+n-i; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
