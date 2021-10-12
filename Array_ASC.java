package Top_16_Programms;

import java.util.Scanner;

public class Array_ASC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		
		//Declare and initialize Array and other Required variables..
		
		int a[] = new int [n];
		int i,j,temp=0;
		
		//Now get all array elements from user
		
		System.out.println("Enter" + n +"number of array elements:  ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//Print all array elements
		
		System.out.println("All array elements are: ");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}
		
		//Now arrange array elements in ascending order
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//Print array in ascending order...
		System.out.println("\nArray Elements in Ascending Order: ");
		for(i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}
	}


	}


