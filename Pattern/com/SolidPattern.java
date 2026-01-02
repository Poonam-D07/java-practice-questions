package Pattern.com;

import java.util.Scanner;
public class SolidPattern {

	 public static void main(String[] args) {

	        // take input
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of row : ");
	        int n = sc.nextInt();

	        // outer loop always for row
	        for (int i = 1; i <= n; i++) {

	            // inner loop always for column
	            for (int j = 1; j <= n; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        sc.close();
	    }
}

