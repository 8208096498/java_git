package Top_16_Programms;

public class String_reverse {

	public static void main(String[] args) {
		
		String a= "sachin";
		String Str1 ="";
		
		for(int i=a.length()-1;i>=0;i--) 
		{
			
			System.out.print(a.charAt(i));
			  Str1 =Str1+ a.charAt(i);
		}
	
		if(Str1.equals(a)) 
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not pallindrome");
		}

	}

}
