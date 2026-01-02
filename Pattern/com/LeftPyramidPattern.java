package Pattern.com;

import java.util.Scanner;

public class LeftPyramidPattern {

	public static void main(String[] args) {
		//Take user input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int n = sc.nextInt();
		
		// Upper Outer loop handle row Increment pattern
		for(int i = 1; i <= n-1; i++) 
		{
			// inner loop print space in Decrement
			for(int j = n; j>=i; j--)
			{
				System.out.print(" ");
			}
			// inner loop print stars in Increment 
			for(int k = 1; k<=i; k++) 
			{
				System.out.print("*");
			}
			System.out.println();				
	    }
		
		// Upper Outer loop handle row Decrement pattern		
		for(int i = 1; i<=n; i++)
		{
			// here print Increment space 
			for(int j = 1; j<=i; j++) 
			{
				System.out.print(" ");
			}
			// here print Increment stars
			for(int k = n; k>=i; k--) 
			{
				System.out.print("*"); 
			}
			System.out.println();
		}
		
				sc.close();
      }
	}
