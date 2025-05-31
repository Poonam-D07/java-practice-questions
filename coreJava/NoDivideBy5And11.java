//Check whether a number is divisible by 5 and 11
package coreJava;

import java.util.Scanner;

public class NoDivideBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for check Divisible by 5 and 11 or not ! ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0)
            System.out.println(num + " : is divisible by 5 and 11 Successfully!");
        else
            System.out.println(num + " : is not Divisible by both 5 and 11 ");
        sc.close();
    }
}
