package UserInputBased;

import java.util.Scanner;

public class Message {
    // Take name and age as a input from user and print it in a informative way

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Hello "+ name + " your age is "+ age);

    }
    
}
