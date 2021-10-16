package Inheritance;

public class Multilevel_inheritance3 extends Multilevel_inheritance2{
	
	void calculate_div()
	{
		c=a/f;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Multilevel_inheritance3 w =new Multilevel_inheritance3();
		w.calculate_div();
		w.calculate_mul();
		w.calculate_sum();
	}

}
