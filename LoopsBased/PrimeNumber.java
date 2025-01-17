package LoopsBased;

import java.util.Scanner;

public class PrimeNumber {
    // check the number is prime number or not
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=n;i++){
             if(n % i == 0){
                count++;
             }
        }
        System.out.println(count);
        if (count == 2) {
            System.out.println("the number is prime number");
        }else{
            System.out.println("its not a prime number");
        }
    }
}
