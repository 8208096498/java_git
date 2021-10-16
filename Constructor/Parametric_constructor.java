package Constructor;

public class Parametric_constructor {
	
	String name;
	int Emp_id;
	
	public Parametric_constructor (String name,int Emp_id) 
	{
		this.name=name;
		this.Emp_id=Emp_id;
		
	}
	void display() 
	{
		System.out.println(name +" "+ Emp_id);
	}

	public static void main(String[] args) {
		Parametric_constructor a= new Parametric_constructor("Vishal",20);
		Parametric_constructor b= new Parametric_constructor("kaushal",30);
		Parametric_constructor c= new Parametric_constructor("sachin",50);
		
		a.display();
		b.display();
		c.display();
		
	}

}
