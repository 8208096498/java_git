package Top_16_Programms;

import java.util.Scanner;

public class Array_max {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int n=sc.nextInt();
		
		System.out.println("enter the no of array element :"+n);
		
		int a[]=new int [n];
		
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		int max = a[0];
       for(int i=0;i>a.length-1;i++) 
       {
    	   if(max<a[i]) 
    	   {
    		   max=a[i];
    	   }
       }
       System.out.println("max no in array is:"+max);
	}

}
