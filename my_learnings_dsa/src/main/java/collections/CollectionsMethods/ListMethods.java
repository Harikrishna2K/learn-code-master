package collections.CollectionsMethods;

import java.util.ArrayList;
import java.util.List;

public class ListMethods{
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(45);
		aList.add(56);
		aList.add(46);
		aList.add(57);
		aList.add(78);
		aList.add(59);
		aList.add(49);
		aList.add(59);
		
		System.out.println(aList);
		
		
		System.out.println("The stream of data before manipulating");
		
		for(Integer num  : aList) {
			System.out.println(num);
		}
		
		aList.set(4, 166);
		
		System.out.println("The stream of data after manipulating");
		
		for(Integer num  : aList) {
			System.out.println(num);
		}
		
		ArrayList<Integer> aList2 = new ArrayList<Integer>(aList);
		
		System.out.println("The stream of data after manipulating in aList2");
		
		for(Integer num  : aList2) {
			System.out.println(num);
		}
		
		/**
		 * The index of method is used to return the index of the element which is
		 * present in the arrayList.
		 * 
		 * */
		
		
		System.out.println("The index of aList2 is: " + aList2.indexOf(166) );
		
		/**
		 * The sublist method is used to take the elements of the list.
		 * The last index which we give in the arraylist is always exclusive.
		 * */
		System.out.println("The sublist is: " + aList2.subList(1, 4));
		
		List<Integer> aList3 = aList2.subList(0, 5);
		aList2.set(0, 100);
		System.out.println("The aList3 is of the following: " + aList3);
		/**
		 * The sublist method not only changes the arraylist in which it is called,
		 * It also changes the arraylist in which it has been inherited as well.
		 * For example, here we have changed the aList3 which has the sublist of aList2,
		 * And then it has inherited from aList2, so it has changed the elements in aList2 as well.
		 * 
		 * */
		System.out.println("The aList2 is of the following: " + aList2);
		
	}
}
