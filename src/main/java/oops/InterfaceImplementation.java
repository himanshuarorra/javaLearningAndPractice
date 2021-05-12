package oops;

//A class can implement more than one interfaces
//A class uses implements keyword for interface but extend for abstract class
public class InterfaceImplementation implements Interface, InterfaceTwo{

	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Start.");

	}

	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop.");

	}

	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Wait.");
	}
	
	public void walkSubway() {
		// TODO Auto-generated method stub
		System.out.println("Walking.");
	}
	
	public void checkPollution() {
		// TODO Auto-generated method stub
		System.out.println("I'm not causing pollution.");
		
	}

	public static void main(String args[]) {
		Interface a = new InterfaceImplementation();
		a.greenGo();
		a.redStop();
		a.yellowWait();
		
		/*
		 * We can use the object of central interface to access the members of
		 *  of implementation class, for that we need to create a new object 
		 *  of that particulr class
		 */
		InterfaceImplementation b = new InterfaceImplementation();
		b.walkSubway();
		b.checkPollution();
		
		InterfaceTwo c = new InterfaceImplementation();
		c.checkPollution();
		
		/*
		 * One class implement more than one interface
		 */
		

	}

	




}
