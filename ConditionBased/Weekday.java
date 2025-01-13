package ConditionBased;

import java.util.Scanner;

public class Weekday {
    // Accept a number from user and print a weekday respected to number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int day = sc.nextInt();
        String result =  switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> "Enter a valid number";

        };
        System.out.println(result);
               
        }
 }

