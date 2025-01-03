package basics.loops;

public class FibonacciSeries {
	public static void main(String[] args) {
		fibonacci(10);
		
	}
	
	
	static void fibonacci(int n) {
	     int n1 = 0; int n2 = 1;int n3 = 0;
	     System.out.println("The fibonacci series is this: " + n1);
    	 System.out.println("The fibonacci series is this: " + n2);
	     for(int i = 0; i<n; i++) {
	    	 n3= n1+ n2;
	    	 n1=n2;
	    	 n2= n3;
	    	
	    	 System.out.println("The fibonacci series is this: " + n3);
	     }
		
	}

}
