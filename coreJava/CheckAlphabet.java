package coreJava;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet : ");
        char ch = sc.next().toLowerCase().charAt(0);// if enter upperCase character then it convert lowerCase...
        if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " : is an alphabet ");
        else
            System.out.println(ch + " : is not an alphabet ");

        sc.close();
    }
}
