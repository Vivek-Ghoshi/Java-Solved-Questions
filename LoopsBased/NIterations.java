package LoopsBased;

import java.util.Scanner;

public class NIterations {
    // print n times hello world//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            System.out.println("Hello world");
        }
    }
}
