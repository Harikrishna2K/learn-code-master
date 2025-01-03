package collections.CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * What is the need of AutoBoxing and UnBoxing concepts.
 * 
 * 	- It was introduced in java 5.
 * 	- While we were using collections, it was a tough process to convert primtive
 * to wrappers and wrappers to primitive.
 * 	- So we used this concept.
 * 
 * 
 * */

public class BoxingMethods {
	public static void main(String[] args) {
		
		/**
		 * This is the example of Unboxing.
		 * Converting the wrapper to primitive type.
		 * 
		 * */
		Integer integer = 7;
		int newNumber = integer;
		System.out.println(newNumber);
		
		
		/**
		 * This is the example of Autoboxing.
		 * Converting the primitive to wrapper type.
		 * 
		 * */
		
		
		int anotherNewNumber = 7;
		Integer wrapperType = anotherNewNumber;
		System.out.println(wrapperType);
		
		
		/**
		 * This is the example of Manual Unboxing.
		 * Converting the wrapper to primitive type.
		 * 
		 * */
		
		
		List<Integer> list = new ArrayList();
		list.add(new Integer(10));
		
		
		/**
		 * This is the example of Manual Unboxing.
		 * Converting the wrapper to primitive type.
		 * 
		 * */
		
		
		Integer obj = list.get(0);
		int newNumberAgain = obj.intValue();
	}

}
