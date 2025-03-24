package Elevate25;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        String ans ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        if(n<10){
            System.out.println("invalid input");
            return;
        }
        int temp = n;
        int sum = 0;
        while(n !=0){
            int rem = n%10;
            sum +=rem;
            n /=10;
        }
         ans = (temp%sum ==0)?"Harshad Number":"Not a Harshad number";
        System.out.println(ans);
    }
}
