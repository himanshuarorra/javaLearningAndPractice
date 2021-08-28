package JavaPractice;

public class ObjectAndString {
	
	public static void call(Object o)
	{
		System.out.println("Object");
	}
	
	public static void call(String o)
	{
		System.out.println("String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ObjectAndString o = new ObjectAndString();
		ObjectAndString.call(null);
		
		String a= "abc";
		String b = new String("abc");
		String c = new String("abc");
	    System.out.println(a==b);
	    System.out.println(b==c);
	    System.out.println(a.equals(b));

	}

}
