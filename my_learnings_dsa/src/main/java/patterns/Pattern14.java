package patterns;


/*
 
 
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 
 
 
 
 
 
 * */
public class Pattern14 {
	
	public static void main(String[] args) {
		pattern14TraingularPattern(5);
	}
	
	static void pattern14TraingularPattern(int n) {
		int number = 1;
		for(int i = 1; i<=n;i++) {
			for(int j = 1 ; j<=i;j++) {
				System.out.print(number ++ + " ");
			}
			System.out.println();
		}
		
	}

}
