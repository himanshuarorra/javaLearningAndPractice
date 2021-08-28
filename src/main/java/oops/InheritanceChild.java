package oops;

public class InheritanceChild extends InheritanceParent{
	
	boolean b;
	int a;
	String s;
	char c;
	public void engine() {
		System.out.println("This is one good engine eh!");
		gear();
		brakes();
		audioSystem();
	}
	
	public void audioSystem() {
		//super.audioSystem();
		System.out.println("The Child audio system of your vehicle are set up.");
	}
	
	public void getColor() {
		System.out.println(color);
	}
	
	public static void main(String a[]) {
		//Down casting
		InheritanceChild obj = new InheritanceChild();
		obj.engine();
		obj.getColor();
		System.out.println("In main: "+obj.color);
		obj.gear();
		obj.brakes();
		obj.audioSystem();	//This method is overridden by the method in child class
		System.out.println("Boolean default "+obj.b);
		System.out.println("int default "+obj.a);
		System.out.println("char default "+obj.c);
		System.out.println("string default "+obj.s);

		/*
		 * In overriding both the methods have same signature i.e. same name and 
		 * argumnets and their types
		 */
		
		//Parent can't use the properties of child class
		System.out.println("On parent refernce now");
		InheritanceParent o = new InheritanceChild();
		o.audioSystem();
		o.brakes();
		o.gear();
		
		
		//Up casting
		//gives class cast exception
//		InheritanceChild m =  (InheritanceChild) new InheritanceParent();
//		m.engine();
//		m.getColor();
		/*
		 * Using the return type as parent class we can't call the methods and members
		 * defined in the child class, for that we have give the child class
		 * as return type
		 */
		//o.engine();		//gives error
		//o.getColor();		//gives error
		
		/*
		 * Another way to call these using parent ret type is to cast them
		 * Like this
		 */
		//((InheritanceChild) o).engine();
		System.out.println("Checking down casting");
		((InheritanceChild) o).getColor();
		
		//USing instance of parent 
		InheritanceParent p = new InheritanceParent();
		p.brakes();
		p.gear();
		p.audioSystem();

	}

}
