package MathApiBased;

import java.util.Scanner;

public class CompoundInterest {
    /*  Accept principal amount rate of interest and time period in years and calculate the compound interest.
    formula = principal * (1 + rate/100)^time;
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Principle Amount");
         double principle = sc.nextDouble();
         System.out.println("Enter rate of interest");
         double rate = sc.nextDouble();
         System.out.println("Enter time in years");
         double time = sc.nextDouble();
         double Amount = principle * (Math.pow(1 + rate/100, time));
         System.out.println("Interest amount = " + (Amount - principle));
    }
    
}
