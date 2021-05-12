package oops;

public class AbstractImplementation extends AbstractClass{

	/*
	 * An abstract class is one which has both concrete as well as non concrete methods.
	 * It is the duty of the child class to implement the non concrete methods.
	 * the idea here is to force some methods which are already declared in the 
	 * parent abstract class and give the child the liberty to implement 
	 * ones which are not defined to implement according to their requirement.
	 */
	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("White.");
	}
	
	public void speedMeasure() {
		// TODO Auto-generated method stub
		System.out.println("We are flying with 1000 nautical miles.");
	}
	
	public static void main(String a[]) {
		AbstractClass obj = new AbstractImplementation();
		obj.bodyColor();
		obj.safetyGuidelines();
		obj.startEngine();

		AbstractImplementation o = new AbstractImplementation();
		o.speedMeasure();
		
		
		//We can not instantiate an abstract class, child classes are forced to implement
		//Abstract methods of parent class
		//Abstract o = new Abstract(); 
		//o.speedMeasure();
	}

}
