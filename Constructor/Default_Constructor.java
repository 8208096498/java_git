package Constructor;

public class Default_Constructor {

	int a;
	String b;
	String c;
	Default_Constructor()
	{
		a=10;
		b="Lacks";
		c="package";
	}
	void show() 
	{
		System.out.println(a+" "+b+" "+" "+c);
	}
	public static void main(String[] args) {
		
		Default_Constructor a =new Default_Constructor();
		
		a.show();
	}

}
