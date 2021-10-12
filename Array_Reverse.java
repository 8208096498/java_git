package Top_16_Programms;

import java.util.Scanner;

public class Array_Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter array number ");
		int n=sc.nextInt();
		
		int a[]=new int [n];     //for getting n number 
		int i,j,temp=0;
		
		System.out.println("Enter"+n+"number of array element: ");
		
		for (i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("All array elements are:");
		for (i=0;i<n;i++) {for(j=0;j<n;j++) 
		{
			if(a[i]<a[j]) 
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println("Array Elements in Ascending Order:");
		for(i=0;i<n;i++)
		{
			System.out.println(""+a[i]);
			
		}
	}

}
