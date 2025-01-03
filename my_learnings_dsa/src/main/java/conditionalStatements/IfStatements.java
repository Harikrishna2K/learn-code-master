package conditionalStatements;

/*
 * The conditional statements syntax is this
 * if(True or false){
 * 		//body 
 * }else{
 * 		// body of the loop
 * }
 * 
 * 
 * 
 * */

public class IfStatements {
	public static void main(String[] args) {
//		System.out.println(largestElement(45, 56, 89));
		System.out.println(largestElementMethod2(34,56,78));
		
	}
	static int largestElement(int number1, int number2, int number3) {
		int answer = 0;
		if(number1>number2) {
			answer = number1;
			System.out.println("Number 1 is greater");
		}else if(number2 > number3) {
			answer = number2;
			System.out.println("Number 2 is greater");
		}else {
			answer = number3;
			System.out.println("Number 3 is greater");
		}
		return answer;
	}
	
	static int largestElementMethod2(int number1, int number2, int number3) {
		int max = Math.max(number3, Math.max(number2,number1));
		return max;
	}
	

}
