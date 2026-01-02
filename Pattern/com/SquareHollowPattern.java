package Pattern.com;

import java.util.Scanner;
public class SquareHollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
          int n = sc.nextInt();
          
          //outer loop handle number of rows always
          for(int i = 1; i<=n; i++)
          {
        	  
        	  // inner loop to handle number of columns 
        	  for (int j = 1; j<=n; j++)
        	  {
        		  // here print stars 
        		  if(i == 1|| i == n || j == 1 || j == n)
        		  {
        			  System.out.print("*");
        		  }
        		  // here print space only
        		  else {
        			  System.out.print(" ");
        	           }
        	  }
        	  System.out.println();
          }
          
          sc.close();
          
	}

}
