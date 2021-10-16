/**
 * 
 */
package String;

/**
 * @author visha
 *
 */
public class String_Comparision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a ="selenium";
		String b ="SELENIUM";
		String c ="SELENIUM";
		String d ="selenium";
		
		System.out.println(a==b);
		System.out.println(c.compareTo(d));
		System.out.println(d.equalsIgnoreCase(a));
	}

}
