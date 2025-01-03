package oops.Interface.example;

public class Main {
	public static void main(String[] args) {
//		Engine car = new Car();
//		car.start();
//		
//		Media m = new Car();
//		m.start();
		
		ElectricEngine ev = new ElectricEngine();
		DieselEngine diesel = new DieselEngine();
		CDPlayer carDash = new CDPlayer();
		
		NiceCar newcar = new NiceCar();
		newcar.start();
		
		NiceCar naiyacar = new NiceCar(carDash);
		naiyacar.startMusicFromCD();
		
	}

}
