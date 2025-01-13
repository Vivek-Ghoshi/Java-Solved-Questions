package Mentortasks.task1;

import java.util.Scanner;

public class HoursConversion {
    // take minutes as a input from user and convert them into hours//
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter no of minutes ");
        int minutes = sc.nextInt();
        int hours = minutes / 60;
        int remaining = minutes % 60;
        System.out.println("Total hours : "+hours + " Hours and " + remaining + " Minutes");

    }
}
