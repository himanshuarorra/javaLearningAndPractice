package javaMisc;


//java.lang comes as a default package you need not import it
public class FinalKeyWord {
	
	public final int b=5;
	
	/*
	 * a final method can not be ovrridden
	 */
	public final void getData()
	{
		System.out.println(b);
	}
	
	
	public static void main(String args[] )
	{
		FinalKeyWord fn = new FinalKeyWord();
		final String a = "Bangalore";
		
		System.out.println(a);
		System.out.println(fn.b);
		
		
	}

}
