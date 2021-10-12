package Top_16_Programms;

import java.util.Scanner;

public class Prime_Number {

public static void main(String[] args) {
	
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter any number");
		int n =sc.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++) 
		{
			if(n%2==0) {temp = temp+1;}				
		}
		if(temp>0) 
		{
			System.out.println("Number is prime");
		}
		else 
		
			{
				System.out.println("Number is Notprime");
			}
		

	}

}
