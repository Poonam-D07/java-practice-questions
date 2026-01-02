package Pattern.com;

import java.util.Scanner;

public class HourglassPattern {

	public static void main(String[] args) {
		//Take user input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int n = sc.nextInt();
		
		//-------------------UPPER--------------------------------------------   

		//  Reverse pyramid, Outer loop always handle row 
	   for(int i = 1; i<=n-1; i++)
	   {
		   // here print space in Increment order
		   for(int k = 1; k<=i; k++)   
			{
				System.out.print(" ");
			} 		   
		   // here print stars in Decrement order
		for(int j = i; j<=(2*n)-i; j++)   
		{
			System.out.print("*");
		}
		System.out.println();		
	   }
		
	//-------------------LOWER--------------------------------------------   
	   
	//Lower  pyramid, Outer loop always handle row 
	   for(int i = 1; i<=n; i++)
	    {
		   // here print space in Decrement order
		   for(int j = i; j<=n; j++)   
			{
				System.out.print(" ");
			} 
		   
		// here print stars in Increment order
		   for(int k = 1; k<=(2*i)-1; k++) 
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		   
	}
	   sc.close();
}
}
