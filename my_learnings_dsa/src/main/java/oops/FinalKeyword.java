package oops;
/*
 
 We use the final keyword to make sure the property is unchanged.
 If we use the final keyword for primitive data types the value is unchanged.
 If we use it in non primitives like objects the reference is not changed.
 But the value it is pointing too is changed.
 
 
 
 
 * */

public class FinalKeyword {
	public static void main(String[] args) {
		/*
		 Here the final keyword is used in a non primitive.
		 So the value of reference is changed but not the reference variable it is pointing too.
		 THe reference is pointing to the object with the values.
		 If the value is changed the reference is not going to point to the new object. 
		 * */
		final ACAR obj = new ACAR(35.6f);
		obj.mileage = 45.9f; //This is fine, you are not changing the object, you are just updating the value.
		System.out.println("The mileage is this: "+ obj.mileage);
		
		/**
		 * Here we cant reassign the object because it is has final attribute.
		 * 
		 * */
		
//		obj = new ACAR(56.5);
	}
	
	
}

class ACAR {
	
	float mileage;

	public ACAR(float mileage) {
		this.mileage = mileage;
	}
	
}
