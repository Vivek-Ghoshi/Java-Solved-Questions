package Elevate25;

import java.util.Scanner;

public class PrimeFactors {
    public static void prime(int n){
        if(n<=1){
            System.out.println("No prime factors");
        }
        while(n%2==0){
            System.out.print(2+" ");
            n /=2;
        }
        for(int i=3;i*i <=n ; i+=2){
            while (n%i==0) {
                System.out.print(i+" ");
                n /=i;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        prime(n);
    }
}
