package patterns;

/*****
 * 	4 4 4 4 4 4 4 4 4 
	4 3 3 3 3 3 3 3 4 
	4 3 2 2 2 2 2 3 4 
	4 3 2 1 1 1 2 3 4 
	4 3 2 1 0 1 2 3 4 
	4 3 2 1 1 1 2 3 4 
	4 3 2 2 2 2 2 3 4 
	4 3 3 3 3 3 3 3 4 
	4 4 4 4 4 4 4 4 4 

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ****/

public class Pattern22Toughone {
	public static void main(String[] args) {
		pattern22(4);
		
	}
	static void pattern22(int n) {
		
		/****
		 * Here we need to find the smallest distance between every elements.
		 * If we take the first index [0,0] and the element is 4.
		 * We need to find the smallest distance of that element, so we consider
		 * the left side, right side, top side and bottom side and we find the smallest among these 4
		 * and the put that at the everyindex variable.
		 * 
		 * Reference video kunal kushawaha
		 * 
		 * 
		 * 
		 * ****/
		int original = n;
		n = 2*n;
		for(int row = 0; row<=n; row++) {
			for(int col=0; col<=n; col++) {
				int atEveryIndex = original - Math.min(Math.min(row, col), Math.min(n-row, n-col));
				System.out.print(atEveryIndex + " ");
				
			}
			System.out.println();
		}
	}
	
	static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

}
