package revamp;

import java.util.Arrays;

public class RightRotate {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rightRotate(arr);
		System.out.print(Arrays.toString(arr));
	}
	static void rightRotate(int[] arr) {
		int last = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			arr[i+1]= arr[i];
		}
		arr[0] = last;
	}

}
