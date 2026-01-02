package Pattern.com;

import java.util.Scanner;

public class MirroredPattern {

	public static void main(String[] args) {
		// Take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			// inner loop for space
			for(int j = 1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			// here print stars
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
		

	}

}
