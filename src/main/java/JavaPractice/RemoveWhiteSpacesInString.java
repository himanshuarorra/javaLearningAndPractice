package JavaPractice;

public class RemoveWhiteSpacesInString {
	public static void main(String ar[])
	{
		String a = "This   @#1  is a   arinf";
		
		a = a.replaceAll("\\s", "");
		System.out.println(a);
	}

}
