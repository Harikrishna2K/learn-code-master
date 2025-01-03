package collections.TypeErasure;

import java.util.ArrayList;

public class TypeErasure {
	
	public static void main(String[] args) {
		
		/**
		 * Using Generics
		 * 
		 * */
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Hari krishna S");
		String str = aList.get(0);
		System.out.println(str);
		
		
		/**
		 * Using Type Erasure
		 * 
		 * 1) What is Type erasure?
		 * 	- It is a key concept in java generics which explains how the generic type is
		 * removed and it is executed without it during the compile time.
		 * 
		 *  - Generics is a compile time feature and it is removed in the runtime.
		 *  
		 * 2) What is the use of Type Erasure ?
		 * 	- Allows Generic code to be comptaible with the older java versions.  	
		 *  
		 * 
		 * 
		 * 
		 * */
		
		ArrayList aList2 = new ArrayList<>();
		aList2.add("MS Dhoni");
		String str2 = (String)aList2.get(0);
		System.out.println(str2);
	}

}
