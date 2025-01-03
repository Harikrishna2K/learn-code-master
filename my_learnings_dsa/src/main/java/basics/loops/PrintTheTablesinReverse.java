package basics.loops;

public class PrintTheTablesinReverse {
	public static void main(String[] args) {
		tablesreverse(2);
	}
	
	static void tablesreverse(int n) {
		int multiplier = 10;
		while(multiplier>0) {
			System.out.println((n*multiplier + " " ));
			multiplier--;
			
		}
	}
	
	
	

}
