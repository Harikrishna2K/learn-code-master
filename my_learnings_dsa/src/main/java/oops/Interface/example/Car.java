package oops.Interface.example;

public class Car implements Engine,Brake,Media{

	@Override
	public void start() {
		System.out.println("I have started the engine of the car");
		
	}

	@Override
	public void stop() {
		System.out.println("I have stopped the engine of the car");
		
		
	}

	@Override
	public void brake() {
		System.out.println("The car brake is on");
		
	}

	@Override
	public void playMusic() {
		
		
	}

	@Override
	public void stopMusic() {
		
		
	}
	


}
