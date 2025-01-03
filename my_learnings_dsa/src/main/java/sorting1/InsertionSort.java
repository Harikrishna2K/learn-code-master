package sorting1;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {6,1,2,5,8};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertionSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int j = i;
			while(j >=0 && arr[j+1] < arr[j] ) {
				swap(arr, j);
				j--;
			}
			
		}
	}

	private static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;	
	}

}
