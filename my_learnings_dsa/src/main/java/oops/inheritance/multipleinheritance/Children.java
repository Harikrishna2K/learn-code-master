package oops.inheritance.multipleinheritance;


/**
 * 
 * Now parent class could not get 
 * 
 * 
 * */
public class Children implements ParentDadInter, ParentMomInter{

	@Override
	public void name() {
		System.out.println("My name is Hari Krishna S");
		
	}

	@Override
	public void age() {
		System.out.println("My age is 24");
		
	}
	
}
