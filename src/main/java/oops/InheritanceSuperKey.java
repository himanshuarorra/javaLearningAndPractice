package oops;

public class InheritanceSuperKey extends InheritanceParent{

	String color = "Blur";

	public InheritanceSuperKey()
	{
		//Here super should always be first line
		super();

		System.out.println("Child constrcutor");
	}

	public void getColor() {
		System.out.println(color);
		System.out.println(super.color);
	}

	public void brakes() {
		super.brakes();
		System.out.println("The Brakes are in child.");
	}

	public static void main(String ar[]) {
		InheritanceSuperKey a = new InheritanceSuperKey();
		a.getColor();
		a.brakes();
	}

}
