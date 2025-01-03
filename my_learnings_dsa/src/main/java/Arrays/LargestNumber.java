package arrays;

public class LargestNumber {
	public static void main(String[] args) {
		int[] arr = {1,4,5,6,7,8,12};
		int answer = largestNumber(arr);
		System.out.println("The answer is: " + answer);
	}
	
	static int largestNumber(int[] arr) {
		int mini = arr[0];
		for(int i = 0; i<=arr.length-1; i++) {
			if(arr[i]> mini) {
				mini = arr[i];
			}
		}
		return mini;
	}

}
