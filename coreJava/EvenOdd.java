//Check a number is Even or Odd
package coreJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for check the number is Even or Odd : ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " : is an Even Number ");
        else
            System.out.println(num + " : is an Odd Number");

        sc.close();
    }
}
