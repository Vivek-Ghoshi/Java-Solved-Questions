package LoopsBased;

import java.util.Scanner;

public class Factorial {
    //Calculate the factorial of n natural numbers //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i<=n;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
    
}
