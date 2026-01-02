package Pattern.com;

import java.util.Scanner;

public class RightAngleChar {

	public static void main(String[] args) {
		// Here take input
		Scanner sc = new Scanner(System.in);
		
		// Here take user input for row
		System.out.print("Enter the number of rows : ");
		int row =  sc.nextInt();
		
		// outer loop always for row
		for(int i = 0; i<=row; i++) {
			
			//inner loop always for column
	        for(int j = 0; j<=i; j++) {
	        	System.out.print((char)(65+i));
	        }
	     System.out.println();
		}		
		sc.close();
	}
}
