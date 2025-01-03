package patterns;

public class ZohoPattern1 {
	
	/*
	 
   1    
  2 3   
 4 5 6  
7 8 9 10 
7 8 9 10 
 4 5 6  
  2 3   
   1    
        
          
	 Numpattern is for lower triangle.
	 [space,number,space] module.
	 For lower triangle this is the pattern
	 [1,3,1]
	 [2,2,2]
	 [3,1,3]
	 
	 here for number pattern i used number pattern, so in the first
	 iteration it needs to print 3 times so number pattern is 3,
	 later on 2 times and later on 1 time that is why it is like this
	 
	 
	 
	 
	 
	 

	 
	 * */
	public static void main(String[] args) {
		pattern(5);
		lowertrinagle(5);
//		lowerTriangle(5);
	}
	
	static void pattern(int n) {
		int number = 1;
		for(int i = 1; i<n;i++) {
			//space
			for(int j = 1; j<=n-i-1;j++ ) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i;j++) {
				System.out.print(number + " ");
				number++;
			}
			
			
			//space
			for(int j = 1; j<=n-i-1;j++ ) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
	
	static void lowertrinagle(int n) {
		int number = n-1;
		int numPattern = n-2;
		for(int i = 1; i<=n;i++) {
			//space
			for(int j = 1; j<=i;j++) {
				System.out.print(" ");
			}
			int correctNumber = 0;
			
			//star
			if(numPattern == 1) {
				correctNumber = 1;
			}else {
				correctNumber = number;
			}
			
			for(int j = 1; j<=numPattern;j++) {
				System.out.print(correctNumber++ + " ");
				
			}
			
			//space
			for(int j = 1; j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
			number = number - 2;
			numPattern--;
			
		}
		
		
	}
	
}
