package collections.Iterators;

import java.util.Iterator;

/**
 * Here we have generic class.
 * 		- What is a generic class, We can pass any datatype to this class, 
 * and the class could use that datatype.
 * 
 * 
 * 
 * */

public class OurGenericList<T> implements Iterable<T>{
	
	private T[] items;
	private int size;
	
	/**
	 * Here we have the generic list constructor which has the size 0,
	 * and the items variable which could hold 100 items of any object given.
	 * - If it is of integer, then it could hold 100 integer objects,
	 * - If it is of float, then it could hold 100 float objects.
	 * 
	 * */
	public OurGenericList(){
		size = 0;
		items = (T[])new Object[100];
	}
	
	/**
	 * Here we have the return type of T because we dont know what is the return type 
	 * of this method.
	 * */
	public T get(int item) {
		return items[item];
	}
	
	
	/**
	 * Here we have the parameter type of T because we dont know what is the type 
	 * of this parameter.
	 * 
	 * */
	public void add(T item) {
		items[size++] = item;
	}
	
	/**
	 * Here we extend the iterable interface, because we need to implement iteration
	 * in our custom generic list class.
	 * 
	 * */

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Why I have an inner class here ?
	 * 	- I dont want my ourgenericlist class to be exposed.
	 * 	- I want to use iterator for that class, but it should not be exposed.
	 * 	- So I have my OurGenericListIterator class.
	 * 
	 * 
	 * */
	private class OurGenericListIterator<T> implements Iterator<T>{
		
		private OurGenericList<T> genericList;
		private int index = 0;
		
		
		public OurGenericListIterator(OurGenericList<T> genericList) {
			this.genericList = genericList;
		}

		@Override
		public boolean hasNext() {
			
			return index < genericList.size ;
		}

		@Override
		public T next() {
			return genericList.items[index ++];
			
		}
		
	}
	
	
	
	
}
