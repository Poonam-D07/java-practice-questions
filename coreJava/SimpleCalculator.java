//Simple Calculator (using switch)
package coreJava;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter the Second Number ");
        double b = sc.nextDouble();

        sc.close();
        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a - b));
                break;
            case '*':
                System.out.println("Result = " + (a * b));
                break;
            case '/':
                System.out.println(b != 0 ? "Result = " + (a / b) : "Cannot divide by zero"); // using ternary operator
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
