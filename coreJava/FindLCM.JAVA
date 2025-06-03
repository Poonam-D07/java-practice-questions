// Find the LCM between two numbers
package coreJava;

import java.util.Scanner;
// public class FindLCM {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the First Number for find LCM : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the Second Number for find LCM : ");
//         int b = sc.nextInt();
//          int ans = (a > b) ? a : b;
//           //infinite loop 
//         while(true){
//          if(ans%a==0 && ans%b == 0)
//             break;
//             ans++;
//         }
//             System.out.println( " LCM of "+ a +" and " + b + " : " + ans);
//         sc.close();
//  }
// }

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number for find LCM : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number for find LCM : ");
        int b = sc.nextInt();
         int ans = (a > b) ? a : b;
          //infinite loop 
        while(true){
         if(ans%a==0 && ans%b == 0)
            break;
            ans++;
        }
            System.out.println( " LCM of "+ a +" and " + b + " : " + ans);
        sc.close();
 }
}