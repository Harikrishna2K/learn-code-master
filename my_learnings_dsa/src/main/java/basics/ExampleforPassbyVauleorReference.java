package basics;

public class ExampleforPassbyVauleorReference {
	
	/**
	 * Here is the example of why java could not be pass by reference.
	 * 
	 * -> First we have created a normal car class and assigned value to it.
	 * -> Later on we have changed the modified the object in the changeobject method.
	 * -> At the next step we have created a change reference method and tried to change the reference
	 * and we could not do it. Because java is pass by value and we have passed the reference as value before
	 * so we could not change the reference.
	 * 
	 * https://chatgpt.com/c/670f541b-7ac0-800f-889f-affa9f61dbd9
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "Benz";
		c.mileage = 32.5f;
		
		System.out.println("The name of the car is: "+ c.name);
		System.out.println("The mileage of the car is: " + c.mileage);
		
		
		changeObject(c);
		
		System.out.println("The name of the car after changing is: "+ c.name);
		System.out.println("The mileage of the car after changing is: " + c.mileage);
		
		changeReference(c);
		
		System.out.println("The name of the car after changing the reference is: "+ c.name);
		System.out.println("The mileage of the car after changing the reference is: " + c.mileage);
	}

	 static void changeReference(Car car) {
		car = new Car();
		car.name = "Skoda";
		car.mileage = 34.5f;
		
	}

	static void changeObject(Car c) {
		c.name = "BMW";
		c.mileage = 50.4f;
		
	}
}

class Car{
	String name;
	float mileage;
}
