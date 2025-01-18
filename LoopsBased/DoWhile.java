package LoopsBased;

import java.util.Scanner;

public class DoWhile {
    // print something until user provides incorrect output//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do{
            System.out.println("hello");
            System.out.println("press 1 to repeat");
             n = sc.nextInt();
        }while(n == 1);
    }
}
