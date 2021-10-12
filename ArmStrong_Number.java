package Top_16_Programms;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
	  int Ram,Pawan=0,Harsha,Suman;
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any  Number ");
		Ram=sc.nextInt();
		Harsha=Ram;
		while(Harsha !=0)
		{
			Suman=Harsha%10;
			Pawan=Pawan+Suman*Suman*Suman;
			Harsha=Harsha/10;
			
		}
		if(Ram==Pawan)
		{
			System.out.println("Given No is Armstrong number ");
		}
		else 
		{
			System.out.println("Given No is Not an Armstrong number");
		}
		
		
				

	}

}
