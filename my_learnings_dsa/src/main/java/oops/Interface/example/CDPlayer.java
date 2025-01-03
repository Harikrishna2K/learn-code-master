package oops.Interface.example;

public class CDPlayer implements Media{

	@Override
	public void playMusic() {
		System.out.println("Play music from your phone mode started.");
	}

	@Override
	public void stopMusic() {
		System.out.println("Stop music playing from the phone"); 
		
	}

	@Override
	public void start() {
		System.out.println("Start the music from the car");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the music from the car");
		
	}

}
