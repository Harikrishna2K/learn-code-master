package maths_for_dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = sumofOddNumbersWithFormula(n);
		System.out.println("The answer is : " + answer);
		
	}
	
	
	private static int sumofOddNumbers(int n) {
		int sum = 0;
		for(int i = 0; i<=n;i++) {
			if(i%2 !=0) {
				sum = sum + i;
			}
		}
		return sum;
		
	}
	
	private static int sumofOddNumbersWithFormula(int n) {
		/***
		 * 
		 * Sum of odd numbers formula
		 *  -> (x)^2 is the formula.
		 *  -> So we need to find the odd numbers total in the range.
		 *  -> Square the total , so we can get the odd numbers.
		 *  
		 *  
		 *  How to find the odd number and even number range.
		 *  -> if the size of array is even, then divide it by 2 and add +1.
		 *  -> If the size of array is odd, then divide it by 2 alone.
		 *  -> So with this range, apply it to x.
		 *  
		 * 
		 * */
		int x = 0;
		if(n%2 == 0) {
			x = n/2;
		}else {
			x = (n/2) + 1;
		}
		
		return (x*x);
		
	}



	static void findoddEvenNumbers(int n) {
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		for(int i = 0; i<n;i++) {
			if(i%2 != 0) {
				oddList.add(i);
			}else {
				evenList.add(i);
			}
		}
		
		System.out.println("The odd numbers are: "+ oddList);
		System.out.println("The even numbers are: "+ evenList);
		
	}

}
