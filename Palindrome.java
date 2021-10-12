package Top_16_Programms;

import java.util.Scanner;

public class Palindrome {    //If we reverse the number is remains constant e.g.12321

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any Number more than 2 digit");
				int num=sc.nextInt();
				
				int temp =num;      //num store in temp
				int rev=0;
				int Rem;
				
				while (num!=0) 
				{
					Rem=temp%10;
					int r = rev*10+Rem;
					temp=temp/10;
				}

	}

}
