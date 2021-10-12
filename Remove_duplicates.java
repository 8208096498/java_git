package Top_16_Programms;

import java.util.Scanner;

public class Remove_duplicates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the new string ");
		String str=sc.next();
		
		String newstr=new String();
		int length=str.length();
		
		for(int i=0;i<length;i++) 
		{
			char charAtPosition=str.charAt(i);
		}
        if(newstr.indexOf(newstr)<0)
        {
        	newstr= newstr + newstr;
        }
        System.out.println("old String"+str);
        System.out.println("new string"+newstr);
	}

}
