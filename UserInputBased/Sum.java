package UserInputBased;

import java.util.Scanner;

public class Sum {
    // Take two numbers as a input from user and calculate their sum 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Sum of " + a + " & " + b + " is = " + (a + b));
    }
    
}
