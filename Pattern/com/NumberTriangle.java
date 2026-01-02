package Pattern.com;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		// take user input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of (rows) n : ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++) 
        {
        	// print space
        	for(int j = i; j <= n; j++) 
        	{
        	System.out.print(" ");	
        	}
        	// print stars
        	for(int k = 1; k <= i; k++)
        	{
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
        
        
        
        sc.close();

	}

}
