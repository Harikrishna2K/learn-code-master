package patterns;

import java.util.Iterator;

/*
 

1        1
12      21
123    321
1234  4321
1234554321
 
 * */

public class Pattern13 {
	public static void main(String[] args) {
		pattern13(5);
	}
	static void pattern13(int n) {
		int space = 2*(n-1);
		for(int i = 1; i<=n;i++) {
			//number
			for(int j =1; j<=i ; j++ ) {
				System.out.print(j);
			}
			//space
			for(int k = 1; k<=space;k++) {
				System.out.print(" ");
			}
			
			//number
			for(int j = i; j>=1 ; j-- ) {
				System.out.print(j);
			}
			System.out.println();
			space = space - 2;
		}
	}

}
