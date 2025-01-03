package arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {20,24,52,10,20};
		int answer = SecondLargesElement(arr);
		System.out.println(answer);
	}
	
	static int secondLargest(int[] arr) {
		int mini = arr[0];
		for(int i = 0; i<=arr.length-1; i++) {
			if(arr[i] > mini) {
				mini = arr[i];
			}
		}
		
		int second_Mini = arr[0];
		for(int i = 0; i<=arr.length-1; i++) {
			if(arr[i] < mini && arr[i] > second_Mini) {
				second_Mini = arr[i];
			}
		}
		
		return second_Mini;
	}
	
	
	/*** Optimised solution  ***/
	
	static int SecondLargesElement(int[] arr) {
		int largest= arr[0];
		int secondLargest = arr[1];
		for(int i = 0; i<=arr.length-1; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			
			if(arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

}
