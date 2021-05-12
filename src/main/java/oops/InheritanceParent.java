package oops;

//if a class is named final it can't be inherited
public class InheritanceParent {
	String color = "Black";
	
	public InheritanceParent()
	{
		
		System.out.println("Parent constrcutor");
	}
	
	
	public void gear() {
		System.out.println("The gear of your vehicle are set up.");
	}
	
	public void brakes() {
		System.out.println("The Brakes of your vehicle are set up in parent.");
	}
	
	public void audioSystem() {
		System.out.println("The Parent audio system of your vehicle are set up.");
	}

}
