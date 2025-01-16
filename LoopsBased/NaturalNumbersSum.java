package LoopsBased;

import java.util.Scanner;

public class NaturalNumbersSum {
    //calculate the sum of n natural numbers/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=n ; i++){
            sum +=i;
        }
        System.out.println("Sum of "+ n+ " Natural Numbers is: "+sum);

    }
}
