package javaMisc;

public class ThisKeyword {
	int a=2;
	
	public void getData() {
		int a=3;
		System.out.println(a);
		
		//refers to current object-> object lies in class level not method level
		System.out.println(this.a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword a = new ThisKeyword();
		a.getData();
	}

}
