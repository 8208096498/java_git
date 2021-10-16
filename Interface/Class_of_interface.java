/**
 * 
 */
package Interface;

/**
 * @author vishal
 *
 */
public class Class_of_interface implements Interface1{        //implemented class
	

	@Override
	public void show(int a, int b) 
	{
		System.out.println(a+b);
	}

	@Override
	public void show1(int r, int e) 
	{
		System.out.println(r+e);	
	}
	public void display(int c,int d)
	{
		System.out.println(c+d);
	}
    /**
	 * 
	 */
	/**
	 * @param args
	 */

	public static void main(String [] args) 
	{
		Class_of_interface q =new Class_of_interface();
		q.display(10, 5);
		q.show(5, 7);
		q.show1(2, 6);
	}
	
}
