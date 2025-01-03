package oops.inheritance;

public class Main {
	public static void main(String[] args) {
//		BoxExample bex = new BoxExample();
//		BoxExample bex3 = new BoxExample(4, 5, 6);
//		BoxExample bex2 = new BoxExample(bex3);
//		System.out.println(bex2.breadth + " " + bex2.length + " " + bex2.width);
//		
//		BoxWeight boxWei = new BoxWeight(4);
//		System.out.println(boxWei.weight);
		
		/**
		 * Example of trying to access the child class attributes with parent class 
		 * It cant access the children class attributes.
		 * 
		 */
		
		
		BoxExample boex = new BoxWeight(5,6,7,8);
//		System.out.println();
//		System.out.println("Example of inherting the child class from parent class properities!!");
		System.out.println(boex.breadth);
		System.out.println(boex.length);
		
		
		/***
		 * Here i could not call the weight attribute because 
		 * it is a child class attribute and i can't call it parent class attribute
		 * BoxExample boex = new BoxWeight(5,6,7,8);
		 * 
		 * *****/
//		System.out.println(boex.weight);
		
		
		
		/**
		 * We cant access the child class attributes with parents class reference.
		 * Here with the parent class reference (Box Example) we cant access the child class reference right.
		 * We only have access to the variables when the reference is given, here we have the reference of 
		 * parent so we cannot use the child class attributes.
		 * If we want to use the child class attributes, it should be initialised, then only we can acess
		 * the child class attributes, but below we did not initialise.
		 * We initialised the parent class attributes in the example below.
		 
		 * //		BoxExample box2 = new BoxWeight(2);
           //		System.out.println(box2.we);
		 * 
		 * 
		 * 
		 * 
		 */
		

		
		/**
		 * Here we can use the child class objects to call the parent class objects , using 
		 * copy constructors how ?
		 * In some point when we have a parent class which takes the own objects of the parent class as
		 * arguments, it allows the child class objects to access the parent class attributes and methods.
		 */
		
		
//		BoxWeight boxweight = new BoxWeight(boxWei);
//		System.out.println(boxweight.weight);
		
//		BoxWeight boxweight2 = new BoxWeight(boxWei);
//		System.out.println(boxweight2.breadth);
//		System.out.println(boxweight2.weight);
//		
		
//		BoxExample boxParent = new BoxExample(boxweight2);
//		System.out.println(boxParent.weight);
		
		
		// Child class objects can access parent class
		
//		BoxWeight boxChild = new BoxWeight(0, 0, 0, 0);
//		System.out.println(boxChild.weight);
		
		/**
		 * child class reference can access parent class objects ?
		 * Answer is no.
		 * 
		 * The only way to access parent class objects with child class reference 
		 * without creating child class objects is by Casting.
		 * But it also throws class cast exception.
		 * The JVM Checks whether the child class reference has a child class object with it 
		 * If it is not having objects then it will show ClassCastException         	 * 
		 * 
		 * 
		 * */
		
//		BoxWeight boxChildRef =  (BoxWeight) new BoxExample(0, 0, 0);
//		System.out.println("Accessing the parent class methods with child class attributes when casted");
//		System.out.println(boxChildRef.weight);
		
//		BoxWeight box = new BoxExample();
		
		/**
		 * Static method cannot be overriden.
		 * To override a method we need an object, but to static does not need object
		 * So we cant override object
		 * 
		 * 
		 * 
		 * 
		 * */
    	
    	
		
		
		
		
	
		
		
		
		
		
	}

}
