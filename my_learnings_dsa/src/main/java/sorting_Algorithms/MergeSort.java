package sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {3,1,2,4,1,5,6,2,4};
		int n = arr.length;
		mergesort(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static void mergesort(int[] arr, int low, int high) {
		if(low == high) {
			return;
		}
		
		int mid = (low + high)/2;
		mergesort(arr, low, mid);
		mergesort(arr, mid+1, high);
		merge(arr,low,mid,high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int left = low;
		int right = mid+1;
		
		while(left <=mid && right <= high) {
			if(arr[left]<=arr[right]) {
				arrList.add(arr[left]);
				left++;
				
			}else {
				arrList.add(arr[right]);
				right++;
			}
			
		}
		while(left<=mid) {
			arrList.add(arr[left]);
			left++;
		}
		while(right<=high) {
			arrList.add(arr[right]);
			right++;
		}
		/***
		 * Why low to high ?
		 * 	- Because in the subarray the low and high will only be 
		 * needed for merging.
		 * 	- if we have an array [3,1,2,4,1] it will be sorted to [1,1,2,3,4]
		 * 	- Since we handle in subarrays we have to do this.
		 * 	- since while merging we have the low in the left array and high in the right array
		 * 	- so we need the low and high in the same array.
		 * 
		 * ***/
		for(int i=low; i<=high;i++) {
			arr[i] = arrList.get(i - low);
		}
		
	}

}
