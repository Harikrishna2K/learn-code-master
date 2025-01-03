package oops.accessmodifiers;

public class Main {
	public static void main(String[] args) {
		Person person = new Person(23, "Hari krishna S");
		System.out.println(person.age);
		
		SubClass sub = new SubClass(34.5);
		System.out.println(sub.salary);
		
	}

}
