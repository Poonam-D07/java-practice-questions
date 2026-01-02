package Pattern.com;

import java.util.Scanner;

public class PalindromeTriangular {

	public static void main(String[] args) {
		// Take user input
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the number : ");
				
				int n = sc.nextInt();
			
				//Outer loop always handle row
				for(int i = 1; i<=n; i++) 
				{
					
					// Print space
					for(int j = n-i; j>=1;j--) 
					{
						System.out.print(" ");
					}
					//print stars
					for(int k = 1; k<=(2*i)-1; k++) 
					{
						System.out.print("*");
					}
					System.out.println();
				}
				sc.close();

	}

}
