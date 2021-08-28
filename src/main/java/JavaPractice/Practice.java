package JavaPractice;

public class Practice {

	public static int main(String[] args) {
		
//		System.out.println(1+2+"Himanshu"+1+2);//anything written after a string is returned as a string
//		String st = "Himanshu";
//		System.out.println(st.substring(2));
//		System.out.println(st.substring(0, 8));

		
//		int a = 5;
//		int b = 6;
//		int c;
//		
//		c= ++b*a/b+b;
//		
		

			try { 
			int a =5/0;
			return 1;
			}
			catch(Exception e){
			return 2;
			}
			finally{
			return 3;
			}

		
	
	}

}
