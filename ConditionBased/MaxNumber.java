package ConditionBased;

import java.util.Scanner;

public class MaxNumber {
    // take two numbers as a input and print which one is greater
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is grater");
        }else{
            System.out.println(b + " is grater");
        }
    }

    
}
