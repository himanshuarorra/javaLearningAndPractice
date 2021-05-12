package JavaPractice;

public class RemoveJunkOrSpecialChrasInString {
	
	public static void main(String ar[])
	{
		String a = "This %^&@#1 is a  arinf";
		
		a = a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);
	}

}
