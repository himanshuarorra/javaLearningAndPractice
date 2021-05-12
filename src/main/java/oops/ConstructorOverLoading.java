package oops;

class ConstructorOverLoading{  
	int id;  
	String name;  
	int age;  
	//creating two arg constructor  
	ConstructorOverLoading(int i,String n){  
		id = i;  
		name = n;  
	}  
	//creating three arg constructor  
	ConstructorOverLoading(int i,String n,int a){  
		id = i;  
		name = n;  
		age=a;  
	}  
	void display(){System.out.println(id+" "+name+" "+age);}  

	public static void main(String args[]){  
		ConstructorOverLoading s1 = new ConstructorOverLoading(111,"Karan");  
		ConstructorOverLoading s2 = new ConstructorOverLoading(222,"Aryan",25);  
		s1.display();  
		s2.display();  
	}  
}   
