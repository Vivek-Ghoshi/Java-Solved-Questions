package ConditionBased;

import java.util.Scanner;

public class DiscountCalculator {
    /*  calculate the discount on the bill based on certain calculations
     
        bill  = 0 to 5k ; // 0% Discount.
        bill  = 5k to 10k ; // 5%  --
        bill  = 10k to 20k ; // 10% --
        bill  = Above 20k ; // 20%  --

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount");
        int amount = sc.nextInt();
        int discount = 0;
        if(amount > 0 && amount <= 5000){
           discount = 0;
        }else if (amount > 5000 && amount <= 10000) {
           discount = 5;
        } else if (amount > 10000 && amount <= 20000) {
          discount = 10;
        }else{
           discount = 20;
        }
        int discountedAmount = amount -((amount * discount)/100);
        System.out.println("Your Bill Amount After Discount is : " + discountedAmount);
    }
    
}
