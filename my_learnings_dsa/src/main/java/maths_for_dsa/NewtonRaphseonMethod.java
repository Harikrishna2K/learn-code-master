package maths_for_dsa;


/*****
 * This approach is straight forward (Kunal Kushwaha playlist)
 * 
 * We take the formula ((x + (n/x))/2;) as root
 * subtract the root - x;
 * Then until the code breaks, we put the x = root.
 * 
 * 
 * 
 * ******/
public class NewtonRaphseonMethod {
	public static void main(String[] args) {
		int n = 40;
//		sqrt(n);
		System.out.println(sqrt(n));
	}
	
	static double sqrt(int n) {
		double x = n;
		double root;
		
		while(true) {
			root = (x + (n/x))/2;
			
			double value = Math.abs(root-x);
			if(value < 1) {
				break;
			}
			
			 x = root;
		}
		
		return root;
		
		
	}

}
