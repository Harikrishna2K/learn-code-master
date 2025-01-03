package singleton;

/*
   Singleton class is used in java.
   It means that The class can have only one object.
   We cant have more than one objects and if we have, the objects will not be created.
   
   https://chatgpt.com/c/3366385b-a59e-4a28-9490-7bd1e269cd0a // how logger works 
 * */

public class Singleton {
	
	
	private Singleton(){
		
	}
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	

}
