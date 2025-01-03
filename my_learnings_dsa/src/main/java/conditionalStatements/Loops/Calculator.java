package conditionalStatements.Loops;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number to execute: ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter the second number to execute: ");
		int secondNumber = sc.nextInt();
		System.out.println("Enter the mode of operation you want to do");
		char operation = sc.next().charAt(0);
		int result = 0;
		
		if(operation == '+') {
			result = add(firstNumber, secondNumber);
//			System.out.println("The result is this : " +  result);
		}
		if(operation == '-') {
			result = sub(firstNumber, secondNumber);
//			System.out.println("The result is this : " +  result);
		}
		if(operation == '*') {
			result = mul(firstNumber, secondNumber);
//			System.out.println("The result is this : " +  result);
		}
		if(operation == '/') {
			result = divide(firstNumber, secondNumber);
			
		}
		
		System.out.println("The result is this : " +  result);
		sc.close();
		
	}
	
	static int add(int x, int y) {
		return x + y;
	}
	static int sub(int x, int y) {
		return x - y;
	}
	static int mul(int x, int y) {
		return x * y;
	}
	static int divide(int x, int y) {
		return x / y;
	}

}
