package LoopsBased;

import java.util.Scanner;

public class Palindrome {
    // check whether the number is palindrome number or not//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int rev = 0;
        while (n>0) {
            int digit = n%10;
            rev = (rev*10 )+ digit;
            n /=10;
        }
        System.out.println(rev);
    }
}
