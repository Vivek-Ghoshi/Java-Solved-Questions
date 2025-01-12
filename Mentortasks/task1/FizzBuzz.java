package Mentortasks.task1;

import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = sc.nextInt();
        String answer;
        if (n % 3 == 0  && n % 5 == 0) {
            answer = "FizzBuzz";
        }else if (n % 3 == 0) {
            answer = "Fizz";
        }else if (n % 5 ==0) {
            answer = "Buzz";
        }else{
           answer =  String.valueOf(n);
        }
        System.out.println(answer);
    }
}


