package basics;

public class PassbyValueorReference {
	public static void main(String[] args) {
		passbyvalue();
		
		
		/*
		 
		 Here the object "a" is created in the heap right.
		 It will have a reference and the memory for attributes are also created.
		 Now, in the next step we copy the reference to a new object named "b".
		 So if we print the attributes of b, we get the value of object a , because we passed the value.
		 Now if we change the value of b, it also reflects the object a.
		 Because we pass the value of the reference, and it could affect the objects which have the same memory address.
		 
		 
		 * */
		
		Car a = new Car();
		a.mileage = 34.5f;
		a.name = "Sumo";
		
		System.out.println("The mileage is: " + a.mileage);
		System.out.println("The name is: " + a.name);
		
		Car b = new Car();
		b = a;
		System.out.println("The milage of b is: " + b.mileage);
		System.out.println("THe name of b is: " + b.name);
		
		b.name = "Benz";
		b.mileage = 12.5f;
		
		System.out.println("The milage of b is: " + b.mileage);
		System.out.println("THe name of b is: " + b.name);
		
		System.out.println("The mileage is: " + a.mileage);
		System.out.println("The name is: " + a.name);
		
	}
	/*
	 
	 Pass by Value:-
	 		The primitives are pass by value.
	 		If a variable named A is having a value 20, and variable B is also pointing to A = Output of both a and b is 20
	 		If i change the b value to 45, then it will not change the a value, the value is unchanged.
	 		
	 
	 
	 * */
	
	static void passbyvalue() {
		int a = 20;
		System.out.println("a value is this: "+ a);
		
		int b = a;
		System.out.println("B value is this: " + b);
		
		b = 45;
		System.out.println("B value now is: "+ b);
		
		
	}

}
/*
 
 Pass the value of the reference.
 
 * */

class Car{
	String name;
	float mileage;
	
}
