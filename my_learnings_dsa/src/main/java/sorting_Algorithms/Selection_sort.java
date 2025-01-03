package sorting_Algorithms;


/****
 * This is selection sort algorithm.
 * 
 * - Selection Sort means, Select the minimum and move it to front.
 * 
 * 
 * 
 * 
 * 
 * ***/

import java.util.Arrays;

public class Selection_sort {
	public static void main(String[] args) {
		int[] arr = {13,46,24,52,9,20};
		selectionSort(arr);
	}
	
	static void selectionSort(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			int min = i; 
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[min]) {
					min = j;
					
				}
			}
			swap(arr,min,i);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void swap(int[] arr,int min, int i) {
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
		
	}

}
