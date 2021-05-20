package oops;

public class InheritanceMultilevel extends InheritanceChild{
	
	public void getMl()
	{
		System.out.println("This is in multilevel class");
	}

	public void multiLevel(){System.out.println("Multilevel...");}  

	public static void main(String args[]){  
		
		//Able to access all the members of all classes using this
		InheritanceMultilevel o = new InheritanceMultilevel();
		o.audioSystem();
		o.brakes();
		o.engine();
		o.gear();
		o.getColor();
		o.multiLevel();
		o.getMl();

		//This won't be able to access the method defined in this class
		InheritanceChild p = new InheritanceMultilevel();
		((InheritanceMultilevel) p).getMl();   //Down casting to access it's child class
		
	}
}
