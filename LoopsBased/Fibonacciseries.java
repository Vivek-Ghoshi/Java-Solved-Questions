package LoopsBased;

import java.util.Scanner;

public class Fibonacciseries {
    // take number in the input from user and print the fibonacci series upto that number//
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int first = 0, second = 1;
        for(int i = 1;i<=n;i++){
            System.out.print(first+ " ");
            int next = first + second;
            first = second;
            second = next;
        }
     }
}
