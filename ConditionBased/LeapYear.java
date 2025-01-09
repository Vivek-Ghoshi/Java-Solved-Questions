package ConditionBased;

import java.util.Scanner;

public class LeapYear {
    // accept a year from user and show that its a leap year or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " its a leap year");
            }
            else{
                System.out.println(year + " its not a leap year");
            }
        }else if (year % 4 == 0) {
            System.out.println(year + " its a leap year");
        }
        else{
            System.out.println(year + " its not a leap year");
        }
    }
}
