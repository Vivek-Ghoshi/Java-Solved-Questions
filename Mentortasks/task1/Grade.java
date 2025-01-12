package Mentortasks.task1;

import java.util.Scanner;

public class Grade{
    // Accept numbers as a input and print grade accordingly
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int marks = sc.nextInt();
        String grade;
        if (marks >= 90 && marks <=100) {
            grade = "A";
        }else if (marks >= 75 && marks < 90) {
            grade = "B";
        }else if (marks >= 60 && marks < 75) {
            grade = "C";
        }else if (marks >= 50 && marks < 60) {
            grade  = "D";
        }else if (marks >= 35 && marks < 50) {
            grade = "E";
        }else if (marks <= 34 ) {
            grade = "Fail";
        }else{
            grade = "Enter Valid marks";
        }
        System.out.println(grade);
    }
}