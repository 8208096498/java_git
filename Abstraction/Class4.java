/**
 * 
 */
package Abstraction;

/**
 * @author visha
 *
 */
public class Class4 {
	public void show()
	{
		System.out.println("3rd class of abstract method");
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Class4 abc =new Class4();
		Class3 ab =new Class3();
		Class2 a =new Class2();
		
		abc.show();
		ab.show();
		a.show();

	}

}
