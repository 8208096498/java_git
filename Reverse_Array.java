package Top_16_Programms;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of Elements::");
		int n =sc.nextInt();
		System.out.println("Enter the "+ n +" number of array elements");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The reverse of array Elements are as follow");
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}


	}


