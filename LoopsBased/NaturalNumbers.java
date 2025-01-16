package LoopsBased;

import java.util.Scanner;

public class NaturalNumbers {
    // print n natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        // for printing 1 to n numbers//
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        // for printing n to 0 number//
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

}
