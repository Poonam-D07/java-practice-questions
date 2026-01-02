package Pattern.com;

import java.util.Scanner;

public class ZeroOneRightAngle {

	public static void main(String[] args) {
		// Take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for (int j = 1; j<=i; j++ ) {
				
				 // if the sum of (i+j) is even then print 1
				if((i+j)%2 == 0) 
				{
				System.out.print(1 + " ");
				}
				// Otherwise print 0
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
