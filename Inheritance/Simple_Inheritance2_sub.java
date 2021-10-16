package Inheritance;

public class Simple_Inheritance2_sub extends Simple_Inheritance {

	
	void show() 
	{
		System.out.println("Concatination of string and int :"+a+b);
	}
	public static void main(String[] args) {
		
		Simple_Inheritance2_sub s =new Simple_Inheritance2_sub();
		s.show();

	}

}
