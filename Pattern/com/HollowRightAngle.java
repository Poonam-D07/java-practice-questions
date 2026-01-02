package Pattern.com;

import java.util.Scanner;

public class HollowRightAngle {

	public static void main(String[] args) {
		// Take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) 
		{
			for(int j = 1; j <= i; j++) 
			{
				if(j == 1 || i == n || j == i) 				
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
        sc.close();

	}

}
