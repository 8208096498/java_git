package Conditional_Statement;

import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {
		
		int a=10,b=20,ch;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice no ");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:System.out.println("Sum="+(a+b));
		break;
		case 2:System.out.println("sub="+(a-b));
		break;
		case 3:System.out.println("mul="+(a*b));
		break;
		case 4:System.out.println("dev="+(a/b));
		break;
		default:System.out.println("Invalid choice ");
		}

	}

}
