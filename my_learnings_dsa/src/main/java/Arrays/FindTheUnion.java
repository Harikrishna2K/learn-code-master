package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindTheUnion {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,3,3,4,4,5};
		findTheUnionOptimised(arr1, arr2);
	}
	
	static void findTheUnion(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<Integer>();
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int num : arr1) {
			set1.add(num);
		}
		
		for(int num : arr2) {
			set1.add(num);
		}
		
		for(int unit: set1) {
			arrList.add(unit);
		}
		
		System.out.println("The union elements is: " + arrList);
	}
	
	
	static void findTheUnionOptimised(int[] arr1, int[] arr2) {
		int n = arr1.length, i=0, j=0;
		int m = arr2.length;
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		while(i<n && j<m) {
			if(arr1[i] <= arr2[j]) {
				if(arrList.size() == 0 || arrList.get(arrList.size()-1)!= arr1[i]) {
					arrList.add(arr1[i]);
					
				}
				i++;
			}
			else {
				if(arrList.size() == 0 || arrList.get(arrList.size()-1)!= arr2[j]) {
					arrList.add(arr2[j]);
					
				}
				j++;
			}
		}
		
		while(i<n) {
			if(arrList.get(arrList.size()-1)!= arr1[i]) {
				arrList.add(arr1[i]);
				
			}
			i++;
		}
		
		while(j<m) {
			if(arrList.get(arrList.size()-1)!= arr2[j]) {
				arrList.add(arr2[j]);
				
			}
			j++;
			
		}
		
		System.out.println(arrList);
	}

}
