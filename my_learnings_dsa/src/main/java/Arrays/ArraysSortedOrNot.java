package arrays;

import java.util.Arrays;

public class ArraysSortedOrNot {
	public static void main(String[] args) {
		int[] arr = {20,24,54,67};
		arraysSortedOrNot(arr);
		
	}
	
	static void arraysSortedOrNot(int[] arr) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				System.out.println("The array is sorted");
				break;
			}else {
				System.out.println("No");
			}
		}
	}

}
