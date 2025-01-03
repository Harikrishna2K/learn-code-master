package sorting_Algorithms;


/****
 * Insertion Sort Algorithms
 * -> Pick the elements and sort it, till it goes to its correct position
 * 
 * 
 * 
 * 
 * *****/

import java.util.Arrays;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] arr = {13,24,46,52,20,9};
		insertionSort(arr);
	}
	
	static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<=n-1; i++) {
			int j = i;
			while(j>0 && arr[j-1]> arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
