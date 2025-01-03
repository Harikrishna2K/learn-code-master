package revamp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


/*******
 * Linked hash set maintains the order the way it is inserted
 * 
 * 
 * 
 * ******/

public class RemovedDuplicates {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,3,3};
		int answer = removeDuplicatesOptimised(arr);
		
//		System.out.println();
	
		for(int i=0; i<answer; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void removeDuplicates(int[] arr) {
		LinkedHashSet<Integer> duplicates = new LinkedHashSet<Integer>();
		
		for(int num : arr) {
			duplicates.add(num);
		}
		
		System.out.println(duplicates);
	}
	
	static int removeDuplicatesOptimised(int[] arr) {
		int i = 0;
		for(int j = 1; j<=arr.length-1; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		
		return i+1;
	}

}
