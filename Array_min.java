package Top_16_Programms;

import java.util.Scanner;

public class Array_min {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		
		System.out.println("enter the numbers in array"+n);
		int a[]=new int [n];
		for(int i=0;i<n;i++) 
		{
			 a[i]=sc.nextInt();
		}
        int min=a[0];
        for(int i=1;i<a.length-1;i++) 
        {
        	if(min>=a[i])
        	{
        		min=a[i];
        	}
        	System.out.println("min no in array is :"+min);
        }
        
	}

}
