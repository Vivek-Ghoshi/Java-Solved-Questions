package LoopsBased;

import java.util.Scanner;

public class SumofDigits {
    // calculate the sum of the digits taking a number in the input from the user//
    // example input = 1234 => 1+2+3+4 = 10;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n%10;
            sum +=digit;
            n = n/10;
        }
        System.out.println(sum);

    }
    
}
