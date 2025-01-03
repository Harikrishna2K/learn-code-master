package sorting1;

import java.util.Arrays;
/*
 
  Take the largest element and place it in the last place.
  Repeat this step for every iterations.
  This is the opposite to selection sorting.
  
  
  
  
  
 **/

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		bubbleSort(arr);
//		Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			//why it is arr.length - i - 1// because for every iteration we could see 
			// the last element is always sorted so we dont want to travel till last element all the time
			for(int j = 0; j<arr.length - i -1;j++) {
				if(arr[j]> arr[j+1]) {
					swap(arr, j);
				}
			}
			
		}
		return arr;
	}
	


	private static void swap(int[] arr, int j) {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
			
	}

}
