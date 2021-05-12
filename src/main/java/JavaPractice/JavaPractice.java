package JavaPractice;

public class JavaPractice {
	
	//Literal String
	String a = "himanshu";
	
	//Creating string by declaring it's object
	String s =  new String("Hello");
	
	
	char[] b = {};
	
	public void getMethod()
	{
		System.out.println(s);
		System.out.println(a.charAt(1));
		System.out.println(a.compareTo("himanshu"));
		System.out.println(a.compareToIgnoreCase("himanshu"));
		System.out.println(a.concat(" Arora"));
		System.out.println(a.contains("shu"));
		System.out.println(a.endsWith("a"));
		System.out.println(a.indexOf("i"));
		System.out.println(a.lastIndexOf("h"));
		System.out.println(a.length());
		System.out.println(a.replace("u", "U"));
		System.out.println(a.substring(1));
		System.out.println(a.substring(0,3));
		System.out.println(a.subSequence(0, 3));
		System.out.println(a.toUpperCase());
		System.out.println(a.toCharArray());
		System.out.println("Splitting here "+a.split("h")[1]);
		b=a.toCharArray();
		b[5] = 'h';
		System.out.println(b[5]);
	}
	
	public static void main(String args[]) {
		JavaPractice jp = new JavaPractice();
		jp.getMethod();
	}
	
}
