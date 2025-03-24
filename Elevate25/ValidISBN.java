package Elevate25;

import java.util.Scanner;

public class ValidISBN {
    // ISBN Number Validation

    // Description: An ISBN-10 (International Standard Book Number) consists of 10
    // digits. Your task is to write
    // a function to determine whether a given ISBN-10 number is valid or not.

    // Rules:
    // • Multiply each digit of the ISBN-10 by its position value (1 for the first
    // digit, 2 for the second
    // digit, and so on, up to 10 for the last digit). Sum these products.
    // • If the total sum is divisible by 11, the ISBN-10 is considered valid.
    // Otherwise, it is invalid.
    
    public static boolean isValid(long n){
        long sum = 0;
        int i =1;
        while(n !=0){
           long rem = n%10;
           if(i>=1 && i<=10){
               sum += rem*i;
           }else{
            return false;
           }
           i++;
           n /=10;
        }
        return (sum%11 ==0)? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 10 digit number");
        long n = sc.nextLong();
        System.out.println(isValid(n));;
    }
}
