package revamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,1,0};
		int[] annswer = removeZerostoEndOptimised(arr);
		System.out.println(Arrays.toString(annswer));
	}
	
	static void moveZerosToEnd(int[] arr) {
		List<Integer> zeroList = new ArrayList<Integer>();
		List<Integer> NonZeroList = new ArrayList<Integer>();
		
		
		for(int num: arr) {
			if(num<1) {
				zeroList.add(num);
			}else {
				NonZeroList.add(num);
			}
		}
		
		System.out.println("ZeroList" + zeroList);
		System.out.println("NonZeroList" + NonZeroList);
		
		int currentIndex = 0;
		for(int i=0; i<NonZeroList.size(); i++) {
			arr[currentIndex] = NonZeroList.get(i);
			currentIndex++;
			
		}
		
		for(int i=0; i<zeroList.size(); i++) {
			arr[currentIndex] = zeroList.get(i);
			currentIndex++;
		}
		
	}
	
	static void moveToZerosOptimisedMethod(int[] arr) {
		ArrayList<Integer> nz = new ArrayList<Integer>();
		
		for(int num : arr) {
			if(num > 0) {
				nz.add(num);
			}
		}
		
		int count = nz.size();
		
		for(int i=count; i<=arr.length-1; i++) {
			
		}
	}
	
	
	static int[] removeZerostoEndOptimised(int[] arr) {
		int j = -1;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		
		for(int i = j+1; i<=arr.length-1; i++) {
			if(arr[i] != 0) {
				swap(arr,i,j);
				j++;
			}
		}
		
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
