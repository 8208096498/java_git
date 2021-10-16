/**
 * 
 */
package Method_overloading;

/**
 * @author visha
 *
 */
public class Overload_compiletime {
	public void show(int a,int b) 
	{
		 
		 System.out.println(a+b);	
	}
	public void show(String c,String d) 
	{
		
		 System.out.println(c+" "+d);	
	}
	public void show(int e,String f) 
	{
		
		 System.out.println(e+" "+f);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Overload_compiletime s =new Overload_compiletime();
		s.show(10, 20);
		s.show(20, "Vishal");
		s.show("Perfect", "Man");
	}

}
