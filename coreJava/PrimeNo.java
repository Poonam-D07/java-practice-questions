// Check if a Number is Prime
package coreJava;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for check Prime Number or NOt !");
        int num = sc.nextInt();
        primeNum(num); // function call
        sc.close(); // here close the Scanner object
    }

    public static void primeNum(int num) {
        if (num <= 1) {
            System.out.println(num + " : is not a prime number (Prime Numbers are always greater then 1!)");
            return;
        }

        int count = 2; // count variable start from 2, Because any number can be divided by 1 and
                       // itself.
        int sqroot = (int) Math.sqrt(num);
        while (count <= sqroot) {
            if (num % count == 0) {
                System.out.println(num + " : is not a prime number ");
                return;
            }
            count++;
        }
        System.out.println(num + " : is a Prime Number");
    }

}