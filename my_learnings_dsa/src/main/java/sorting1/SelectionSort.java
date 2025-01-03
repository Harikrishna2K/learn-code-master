package sorting1;

import java.util.Arrays;
/*
 
 
 Select the minimum's that is Selection sort.
 
 Take two pointers i and j.
 Use j to find the least element in the array.
 Swap it with j.
 Increment i and start the next loop.
 
 
 
 * */

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] selectionSort(int[] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[i] ) {
					min = j;
					swap(arr, min,i);
				}
			}
			
		}
		return arr;
	}

	private static void swap(int[] arr,int min, int i) {
		// TODO Auto-generated method stub
		int temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
		
	}

}
