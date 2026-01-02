package Pattern.com;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// Here take input
		Scanner sc = new Scanner(System.in);
		// Here take user input for row
		System.out.print("Enter the number of rows : ");
		int row =  sc.nextInt();
		
		// Here take user input for column
		System.out.print("Enter the number of column : ");
		int clm = sc.nextInt();
		
		// outer loop always for row
		for(int i = 1; i<=row; i++) {
			
			//inner loop always for column
	        for(int j = 1; j<=clm; j++) {
	        	System.out.print("* ");
	        }
	     System.out.println();
		}		
		sc.close();

	}

}
