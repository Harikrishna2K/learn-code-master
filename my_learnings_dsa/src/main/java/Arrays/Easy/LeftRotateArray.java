package revamp;

import java.util.Arrays;

public class LeftRotateArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		leftArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void leftArray(int[] arr) {
		int first = arr[0];
		for(int j=1; j<=arr.length-1; j++) {
			arr[j-1] = arr[j]; 
		}
		
		arr[arr.length-1] = first;
	}

}
