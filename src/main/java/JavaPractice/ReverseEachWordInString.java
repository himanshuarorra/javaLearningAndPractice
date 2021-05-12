package JavaPractice;

public class ReverseEachWordInString {
	public static void main(String ar[])
	{
		String str = "This is reverse i am testing";
		
		//Splitting string into multiple words
		String[] s = str.split(" ");
		
		String reverseString = "";
		
		for(String a:s)
		{
			String rvWord = "";
			for(int i=a.length()-1;i>=0;i--)
			{
				rvWord = rvWord + a.charAt(i);
			}
			reverseString = reverseString+rvWord+" ";
		}
		System.out.print(reverseString);

	}

}
