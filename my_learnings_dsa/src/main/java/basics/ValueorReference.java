package basics;

public class ValueorReference {
	
	/*
	 
	 Java is pass by value hence in this code the reference is passed to 
	 the 
	 
	 * */
	public static void main(String[] args){
	    int a = 20;
	    int b = 45;
	    System.out.println("THe output of a is: " + a);
	    System.out.println("THe output of b is: " + b);
	  }

	  static void swap(int a, int b){
	      int temp = a;
	      a = b;
	      b = temp;
	  }

}
