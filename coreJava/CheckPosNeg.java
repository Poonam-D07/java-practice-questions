//Check if a number is positive, negative, or zero
package coreJava;

import java.util.Scanner;

public class CheckPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for check Positive, Negative or Zero : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " : is a Positive Number ");
        } else if (num < 0) {
            System.err.println(num + " : is a Negative Number ");
        } else {
            System.out.println(num + " : Zero ");
        }
        sc.close();
    }
}
