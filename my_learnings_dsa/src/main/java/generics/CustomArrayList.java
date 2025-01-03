package generics;

import java.util.Arrays;

/**
 * How array list works ?
 * 	-> The size of array list is 10.
 * 	-> We add the elements in the arrayList and if the elements in the array
 * 
 * */

public class CustomArrayList {
	
	private static int DEFAULT_SIZE = 10;
	private int[] data;
	private int size = 0;
	
	
	/**
	 * If there is no size specified, then the arrayList is of size 10.
	 * 
	 * */
	
	public CustomArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	/**
	 * If we add the number to arraylist,
	 * It checks whether it is full or not.
	 * If not then it adds, or else we have a method named resize.
	 * This resize will increase the size of the array by twice.
	 * 
	 * If it is not full then we increase the size of the array with the number.
	 * 
	 * */
	void add(int num) {
		if(isFull()) {
			resize();
		}
		data[size ++] = num;
	}
	
	/**
	 * So we have a new array, that is temp(Twice the size of this array.)
	 * So we copy the values from data and then add it to the temp array.
	 * Later than after finishing, we point the data to temp array.
	 * So that it could continue adding the elements in temp array.
	 * */
	
	private void resize() {
		int[] temp = new int[data.length * 2];
		for(int i = 0; i< data.length; i++) {
			temp[i] = data[i];
		}
		
		data = temp;
		
	}

	/**
	 * If the size is full then what happens is, we must return true.
	 * So we equate that with the size == data.length;
	 * If the size is equal to data length then it is full
	 * 
	 * */
	private boolean isFull() {
		return size == data.length;
	}
	
	/**
	 * Here we remove the element and reduce the size of an array.
	 * 
	 * */
	
	public int remove(){
		int removed = data[size - 1];
		return removed;
	}
	
	public int remove(int index) {
		int removed_index_value = data[index] ;
		for(int i = index; i< size-1; index++){
			data[i] = data[i+1];
		}
		size --;
		
		return removed_index_value;
		
		
	}
	
	public int get(int index) {
		return data[index];
	}
	
	 @Override
    public String toString() {
        return "CustomArrayList{" +
	                "data=" + Arrays.toString(data) +
	                ", size=" + size +
	                '}';
	    }

	public static void main(String[] args) {
		CustomArrayList arrayList = new CustomArrayList();
		arrayList.add(2);
		
		
		System.out.println(arrayList);
//		System.out.println(arrayList.get(2));
	}

	

}
