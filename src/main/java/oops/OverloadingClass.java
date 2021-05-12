package oops;

public class OverloadingClass {
	
	/*
	 * Real life example: payment method
	 * A payment method accepting debt card, credit card or gift voucher
	 * uses the same method names but accepts different arguments
	 */
	
	/*
	 * Either number of args should be different or 
	 * the data type should be different
	 */
	public void getData(String str)
	{
		System.out.println(str);
	}
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String str, String str2)
	{
		System.out.println(str2);
	}
	
	//Even if return type is different it won't support
	/*public String getData(String a)
	{
		
	}*/
	
	public static void main(String arg[]) {
		OverloadingClass a = new OverloadingClass();
		a.getData(1);
		a.getData("String");
		a.getData("First", "Second");
	}

}
