package oops;

public abstract class AbstractClass {
	
	/*
	 * Members should either be public of protected or default, musn't be private
	 */
	
	public void startEngine()
	{
		System.out.println("Starting engine.");
	}
	
	public void safetyGuidelines()
	{
		System.out.println("Following central guidelines.");
	}
	
	public abstract void bodyColor();

}
