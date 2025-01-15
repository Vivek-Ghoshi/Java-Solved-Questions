package ConditionBased;

import java.util.Scanner;

public class ElectricityBill{
    //calculate the electricity bill
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter reading units: ");
    int units = sc.nextInt();
    int u100 = 420;
    int u200 = 1020;
    int u400 = 2620;
    double amount = 0;
    if (units <=100) {
        amount = units * 4.2;
    }else if (units <=200) {
        amount = (u100 + (units - 100)*6);
    }else if (units <=400) {
        amount = (u200 + ((units-200)*8) );
    }else{
        amount = (u400 + ((units-400)*13));
    }
    System.out.print("Total Bill amount = "+ amount);
   }
}