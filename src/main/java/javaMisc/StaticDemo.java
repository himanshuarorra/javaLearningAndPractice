package javaMisc;

public class StaticDemo {

	String name;
	String place;
	static String city = "Bangalore";
	static int c = 0;


	public StaticDemo(String name, String place) {
		this.name = name;	
		this.place = place;
		c++;
		System.out.println(c);
	}

	public void getAddress()
	{
		System.out.println(name+" "+place+" "+city);
	}

	public static void getCity()
	{
		System.out.println(city);
	}
	
	public static void main(String ar[]) {
		StaticDemo s = new StaticDemo("Himanshu","Whitefiled");
		StaticDemo s1 = new StaticDemo("Verma","Whitefiled");
		s.getAddress();
		s1.getAddress();
		//StaticDemo.getCity();
		StaticDemo.city = "Delhi";
		System.out.println(city);
	}
}
