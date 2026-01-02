package Pattern.com;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// Take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int n = sc.nextInt();
		//upper pyramid
		for(int i = 1; i <= n; i++) 
		{
			//Space
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			// stars
			for (int k = 1; k<=(2*i-1); k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//--------------------LOWER---------------------
		
		//lower pyramid outer loop handle row
		for(int i = n-1; i>=1; i--) 
		 {
			// here print space
			for(int j = 1; j<=(n-i);j++)
		    {
				System.out.print(" ");
			}
			
			// here print stars
			for(int k = 1; k<=(2*i)-1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		    }		
		sc.close();
	
	}

}
