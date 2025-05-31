//Find the largest among three numbers

package coreJava;

import java.util.Scanner;

class LargestAmongThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number c : ");
        int c = sc.nextInt();
        if (a >= b && a >= c)
            System.out.println(" a is a Largest Number " + a);

        else if (b >= a && b >= c)
            System.out.println(" b is a Largest Number " + b);
        else
            System.out.println(" c is a Largest Number " + c);
        sc.close();
    }
}
