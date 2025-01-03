package oops.Interface.example;

public class NiceCar {
	
	/**
	 * Here what we are doing is, we create a class named NiceCar
	 * and then we inherit the Classes NiceCar and Engine and Media.
	 * We create the constructor, so that when someone calls the classes
	 * we can use that via objects.
	 * 
	 * 
	 * */
	
	private NiceCar car;
	private Engine engine;
	
	private Media media;
	
	public NiceCar() {
		engine = new ElectricEngine();
	}

	public NiceCar(Engine engine) {
		super();
		this.engine = engine;
	}
	/**
	 * Here we start the car and then stop the car with the engine object.
	 * If we create the engine object as diesel it creates diesel object start method.
	 * If we create the engine object as ev it calls ev object start method.
	 * 
	 * */
	void start() {
		engine.start();
	}
	
	void stop() {
		engine.stop();
	}

	public NiceCar(Media media) {
		super();
		this.media = media;
	}
	
	void startMusicFromCD() {
		media.start();
	}
	
	void stopMusicFromCD() {
		media.stop();
	}
	
	
	
	

}
