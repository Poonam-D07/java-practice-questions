package coreJava;

import java.util.Scanner;

public class LargestOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number b : ");
        int b = sc.nextInt();
        if (a > b)
            System.out.println(" a is a Largest Number " + a);

        else if (b > a)
            System.out.println(" b is a Largest Number " + b);
        else
            System.out.println(" Both are equals ");
        sc.close();
    }
}
