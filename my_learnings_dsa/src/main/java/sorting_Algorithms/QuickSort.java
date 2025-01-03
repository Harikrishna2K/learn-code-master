package revision.sortingalgorithms;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {4,6,2,5,7,9,1,3};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void quickSort(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		if(i<j) {
			int partition = partitionElement(arr,low,high);
			quickSort(arr, low, partition-1);
			quickSort(arr, partition+1, high);
		}
	}
	
	static int partitionElement(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i<j) {
			while(arr[i]<=pivot && i<high) {
				i++;
			}
			while(arr[j] >pivot && j>low) {
				j--;
			}
			if(i<j) {
				swap(arr,i, j);
			}
			
		}
		swap(arr,low,j);
		return j;
		
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		
	}

}
