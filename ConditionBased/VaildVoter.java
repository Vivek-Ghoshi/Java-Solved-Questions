package ConditionBased;

import java.util.Scanner;

public class VaildVoter {
    // Accept name and age from the user if age is grater then 18 then the user is valid voter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println(name + " you are a valid voter");
        }else{
            System.out.println(name + " you will be able to vote after " + (18-age)+ " years");
        }
    } 
}
