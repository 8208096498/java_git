/**
 * 
 */
package String;

/**
 * @author visha
 *
 */
public class String_methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a ="selenium";
		String b ="SELENIUM";
		String c ="   SELENIUM";
		String d ="selenium";
		
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));         //.equals
		
		System.out.println(a.compareTo(d));     // .compareTo
		System.out.println(a.concat(d));       //.concat
		
		System.out.println(a.charAt(5));      //.charAt
		
		System.out.println(a.equalsIgnoreCase(b));    //Equalignorecase
		
		System.out.println(a.toUpperCase());          //touppercase
		
		System.out.println(b.toLowerCase());          //tolowercase
		
		System.out.println(c.trim());                 //trim 
		
		System.out.println(a.substring(5));           //substring
		
		System.out.println(a.endsWith("UM"));         //endswith
		
		System.out.println(a.length());               //length of string
	}

}
