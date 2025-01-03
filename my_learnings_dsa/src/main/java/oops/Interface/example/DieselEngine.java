package oops.Interface.example;

public class DieselEngine implements Engine{

	@Override
	public void start() {
		System.out.println("THe diesel Engine is started");
		
	}

	@Override
	public void stop() {
		
		System.out.println("The diesel engine is stopped");
	}

}
