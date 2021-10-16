/**
 * 
 */
package Method_overloading;

/**
 * @author visha
 *
 */
public class Overrise3 extends Override2 {
	
	public void show(int e,String f) 
	{
		
		 System.out.println(e+" "+f);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Overrise3 v =new Overrise3();
		v.show(10, 20);
		v.show(10, "Vishal");
		v.show("Excellent", "Performance");

	}

}
