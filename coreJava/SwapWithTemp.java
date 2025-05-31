
//Swap two numbers (using a temporary variable)
package coreJava;

import java.util.Scanner;

public class SwapWithTemp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num_1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num_2 = sc.nextInt();
        System.out.println("Before Swaping the numbers : Num_1 = " + num_1 + " Num_2 = " + num_2);
        int temp;
        temp = num_1;
        num_1 = num_2;
        num_2 = temp;
        System.out.println("After Swaping the numbers : Num_1 = " + num_1 + " Num_2 = " + num_2);
        sc.close();
    }
}