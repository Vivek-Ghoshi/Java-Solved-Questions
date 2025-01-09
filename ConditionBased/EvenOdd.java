package ConditionBased;

import java.util.Scanner;

public class EvenOdd {
    // accept the number and determine the number is even or odd

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println(a+" is a even number");
        }else{
            System.out.println(a + " is a odd number");
        }
    }
}
