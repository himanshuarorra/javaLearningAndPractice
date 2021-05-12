package JavaPractice;

public class WriteDataIntoTextFile {
	
	public static void main(String args[]) {
		
	
	String a = "This is my string for this programme";
	

	String b = a;
	
	//Method 1
	int count1 = a.length();
	
	int count2 = a.replace("i", "").length();
	
	int count = count1 - count2;
	
	System.out.println("Nuber of occurances of i is: " + count);
	
	}
	
	

}
