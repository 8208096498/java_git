package java_basics;

public class Object_initialization_using_method {

	String color;
	int age;
	void initobj(String a,int b) 
	{
		color=a;
		age=b;
		
	}
	void display() 
	{
		System.out.print(color+""+age);
	}
	public static void main(String[] args) {
		
		Object_initialization_using_method d= new Object_initialization_using_method();
		d.initobj("red", 5);
		d.display();
	}  

}
