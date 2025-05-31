
//Check whether a character is vowel or consonant
package coreJava;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character for check Vowel or Consonant : ");
        char ch = sc.next().toLowerCase().charAt(0);
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " : is a Vowel ");
            } else {
                System.out.println(ch + " : is a Consonant ");
            }
        } else {
            System.out.println("Invalid input ! Please Enter an alphabet character...");
        }

        sc.close();

    }
}
