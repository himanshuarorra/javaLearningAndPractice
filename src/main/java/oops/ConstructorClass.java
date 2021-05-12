package oops;

class ConstructorClass{  
	int id;  
	String name;  
	//method to display the value of id and name  
	void display(){System.out.println(id+" "+name);}  

	public static void main(String args[]){  
		//creating objects  
		ConstructorClass s1=new ConstructorClass();  
		ConstructorClass s2=new ConstructorClass();  
		//displaying values of the object  
		s1.display();  
		s2.display();  
	}  
} 
