package Pattern.com;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// Take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int n = sc.nextInt();
		int num = 1; 
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(num + " ");
			            num++;
			}
			System.out.println();
		}
		sc.close();
		
	}

}
