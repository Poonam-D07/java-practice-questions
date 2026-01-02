package Pattern.com;

import java.util.Scanner;

public class KPattern {

	public static void main(String[] args) {
		//Take user input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int n = sc.nextInt();
		
		// Upper Outer loop handle row
		for(int i = n; i > 1; i--) 
		{
			//  loop print stars in descending order
			for(int j = i; j >= 1; j-- ) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Lower Outer loop 
			for(int i = 1; i<=n; i++) 
			{
				for(int j = 1; j<=i; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		sc.close();
	}

}
