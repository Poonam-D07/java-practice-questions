package Pattern.com;

import java.util.Scanner;

public class RightPyramid {

	public static void main(String[] args) {
		//Take user input 
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the number : ");
				
				int n = sc.nextInt();
				
				// Upper Outer loop handle row
				for(int i = 1; i <= n; i++) 
				{
					// inner loop print stars in Increment
					for(int j = 1; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				// Lower Outer loop 
				for(int i = 1; i<=n; i++) 
				{
					// inner loop print stars in Decrement 
					for(int j = n; j>=i; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
               sc.close();
	}

}
