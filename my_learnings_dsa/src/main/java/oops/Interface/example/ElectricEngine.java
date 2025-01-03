package oops.Interface.example;

public class ElectricEngine implements Engine{

	@Override
	public void start() {
		System.out.println("The Electric Engine has been started");
		
		
	}

	@Override
	public void stop() {
		System.out.println("The Electric Engine has been stopped");
		
	}

}
