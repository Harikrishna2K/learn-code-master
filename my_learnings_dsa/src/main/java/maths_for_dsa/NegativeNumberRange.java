package maths_for_dsa;

/***
 * Question?
 * 	1) If there is a range between [-10 to 10] and if i type number between this range
 * it should show me the count of the numbers in this range.
 * 
 * 
 * Answer explanation?
 * 
 * Here we have the range 
 * arr[verifying_number + 10]++; because the range is [-10 to 10], 
 * 
 *
 * 
 * 
 * **/

import java.util.Scanner;

public class NegativeNumberRange {
	
	static void getRange(String number, int[] arr) {
		String num[] = number.split(" ");
		
		for(String numbers : num) {
			int verifying_number = Integer.parseInt(numbers);
			
			if(verifying_number >=-10 && verifying_number <=10) {
				arr[verifying_number + 10]++;
			}
		}
		
		/**
		 * Display the numbers from the range.
		 * 
		 * **/
		
		for(int i = 0; i<21;i++) {
			int numbers = i-10;
			System.out.println(numbers + "->" + arr[i]);
		}
		
		
		
	}
		
		
	
	
	public static void main(String[] args) {
		int[] arr = new int[21];
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		getRange(number, arr);
		
	}

}
