package Top_16_Programms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num");
		int num =sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=num;i++) 
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
