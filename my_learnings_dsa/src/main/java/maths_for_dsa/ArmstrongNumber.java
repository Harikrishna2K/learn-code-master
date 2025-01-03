package maths_for_dsa;

public class ArmstrongNumber {
	public static void main(String[] args) {
		boolean answer = armstrongNumber(153);
		if(answer) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	static boolean armstrongNumber(int n) {
		int count = 0;
		int answer = 0;
		int temp = n;
		while(temp>0) {
			temp =  temp/10;
			count ++;
		}
		temp = n;
		while(temp>0) {
			int digit = (temp%10);
			answer += (int) (Math.pow(digit, count));
			temp= temp/ 10;
			
		}
		
		return answer == n;
	}

}
