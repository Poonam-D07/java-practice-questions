package Pattern.com;

import java.util.Scanner;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		// Take user input
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the number : ");
				
				int n = sc.nextInt();
				
				//Outer loop handle row
				for(int i =1; i <= n; i++)
				{
					// here print space in decrement way
					for(int j = i; j<=n; j++)
					{
						System.out.print(" ");
					}
					
					//here print stars 
					for(int k = 1; k <= (2*i-1); k++) 
					{
						if(k == 1 || i == n || k == 2*i-1) 
						{
							System.out.print("*");
						}
						else
							// printing spaces.
							System.out.print(" ");
					}
					System.out.println();
				}
				
				sc.close();
			

	}

}
