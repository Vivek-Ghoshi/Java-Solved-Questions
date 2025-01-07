package UserInputBased;

import java.util.Scanner;

public class SwapVarValues {
    // take two numbers as a input from the user and swap their values
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();

        //with the help of third variable//
        int c;
        c = a ;
        a = b;
        b = c;

        //Without using third variable //
        a = a + b;
        b = a - b;
        a = a - b;

        // using Multiplication and division //
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println(" value of a is : "+ a + "\n value of b is : " + b);
    }
    
    
}
