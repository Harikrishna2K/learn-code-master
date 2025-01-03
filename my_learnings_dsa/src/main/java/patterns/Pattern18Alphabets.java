package patterns;

public class Pattern18Alphabets {
	/*

    A    
   ABA   
  ABCBA  
 ABCDCBA 



	 * */
	public static void main(String[] args) {
		pattern18(5);
		pattern18Method2(5);
	}
	
	static void pattern18(int n) {
		for(int i = 1; i<n;i++) {
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			//Characters
			char ch = 'A';
			int breakpoint = (2*i-1) /2;
			for(int j = 1; j<=2*i-1;j++) {
				System.out.print(ch);
				if(j <= breakpoint) {
					ch++;
				}else {
					ch --;
				}
			}
			
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void pattern18Method2(int n) {
		for(int i = 1; i<n;i++) {
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			//Characters
			char ch = 'A';
			int breakpoint = (2*i-1) /2;
			for(int j = 1; j<=2*i-1;j++) {
				System.out.print(ch);
				if(j <= breakpoint) {
					ch++;
				}else {
					ch --;
				}
			}
			
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}


}
