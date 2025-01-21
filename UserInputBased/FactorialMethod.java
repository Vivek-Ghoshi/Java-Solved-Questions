package UserInputBased;

import java.util.Scanner;

public class FactorialMethod {
    // calculation of factorial using method
    public static int factorial(int num){
         int fact = 1;
         while (num !=0) {
            fact = fact * num;
            num--;
         }
         return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);

    }
}
