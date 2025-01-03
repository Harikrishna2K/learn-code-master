package collections.CollectionsMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethods {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(34);
		list1.add(45);
		list1.add(56);
		list1.add(67);
		list1.add(87);
		
		
		list2.add(34);
		list2.add(45);
		list2.add(56);
		list2.add(67);
		list2.add(87);
		
		list1.addAll(list2);
		System.out.println("The list 1 is added as this: " + list1);
		
		
		list1.retainAll(list2);
		System.out.println("The list 1 retained all this: " + list2);
		
		list1.removeAll(list2);
		System.out.println("The list 1 remove all this: " + list1);
		
		boolean check = list1.containsAll(list2);
		System.out.println("Does boolean check contains this: " + check);
		
		
		
		
		
	}

}
