package patterns;

public class Pattern12 {
	public static void main(String[] args) {
		pattern12(5);
	}
	static void pattern12(int n) {
		int start = 1;
		for(int i = 0 ; i < n; i++) {
			if(i%2 != 0) {
				start = 0;
			}else {
				start = 1;
			}
			
			for(int j = 0; j<=i;j++) {
				System.out.print(start);
				start = 1- start;
			}
			System.out.println();
		}
		
		
	}

}
