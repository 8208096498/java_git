package Top_16_Programms;

import java.util.Scanner;

public class Odd_Even_Number {

	public static void main(String[] args) {
		int a,b;
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		 a =sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Given number is Even");
		}
		else 
		{
			System.out.println("Given number is Odd");
		}
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any number");
		 b =s.nextInt();
		 if(b%2==0)
			{
				System.out.println("Given number is Even");
			}
			else 
			{
				System.out.println("Given number is Odd");
			}
	}

}
