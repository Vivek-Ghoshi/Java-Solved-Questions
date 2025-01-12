package Mentortasks.task1;

import java.util.Scanner;

public class UserDetails {
    // Write a program that prompts the user to input the
    // following details:
    // Name: A simple string for the user's name.:
    // Age: An integer for the user's age.
    // Favorite Color: A string for the user's favorite color.
    // City: A string for the city where the user lives.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = sc.nextLine();
        System.out.print("Enter your age ");
        int age =  sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Favorite color ");
        String color = sc.nextLine();
        System.out.print("Enter your city ");
        String city = sc.nextLine();
        System.out.println("Hello "+ name + "! You are "+ age + " years old, your favorite color is "+ color + ", and you live in " + city);
    }

}