package oops.objects;

/***
 * The difference between == and dot eqauls is given
 * 
 * -----------------------------------------------------------------------
 *    == in java                     |  dot equals method
 *-------------------------------------------------------------------------
 * *) Checks the content is in the same |  *) Checks the content is same or not.
 * object are not						|
 * 
 * 
 * 
 * */

public class DoubleEqaultoovsDot {
	
	
	
		

	public static void main(String[] args) {
		String answer = "Hari Krishna S";
		String newAnswer = "Hari Krishna S";
		if(answer == newAnswer) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
