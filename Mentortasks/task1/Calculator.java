package Mentortasks.task1;

import java.util.Scanner;

public class Calculator{
    // Make a calculator to make perform different actions on values//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation: ");
        char operation = sc.next().charAt(0);
        double ans = 0;
        if (operation == '+') {
            ans = a + b;
        }else if (operation == '-') {
            ans = a-b;
        }else if (operation == '*') {
            ans = a * b;
        }else if (operation == '/') {
            ans = a / b ;
        }else if (operation == '%') {
            ans = a % b;
        }else{
            System.out.println("Please provide a valid operation");
        }
        
            System.out.println("your answer is = " + ans );
        
    }
}
