package sorting_Algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		bubbleSort(arr);
	}
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=n-1; i>=0;i--) {
			for(int j= 0; j<=i-1 ; j++) {
				if(arr[j]> arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
