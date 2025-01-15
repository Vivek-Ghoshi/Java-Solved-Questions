package ConditionBased;
import java.util.Scanner;

public class DenomCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter amount");
        int amount = sc.nextInt();
        int n500 = 0, n200 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        if (amount>=500){
            n500 = amount / 500;
            amount = amount%500;
        }
        if (amount>=200){
            n200 = amount / 200;
            amount = amount%200;
        } if (amount>=100){
            n100 = amount / 100;
            amount = amount%100;
        } if (amount>=50){
            n50 = amount / 50;
            amount = amount%50;
        } if (amount>=20){
            n20 = amount / 20;
            amount = amount%20;
        } if (amount>=500){
            n10 = amount / 10;
            amount = amount%10;
        } if (amount>=5){
            n5 = amount / 5;
            amount = amount%5;
        }
        if (amount>=2){
            n2 = amount / 2;
            amount = amount%2;
        } if (amount>=1){
            n1 = amount / 1;
            amount = amount%1;
        }
        System.out.println("notes " + n500 + " times");
        System.out.println("notes " + n200 + " times");
        System.out.println("notes " + n100 + " times");
        System.out.println("notes " + n50 + " times");
        System.out.println("notes " + n20 + " times");
        System.out.println("notes " + n10 + " times");
        System.out.println("notes " + n5 + " times");
        System.out.println("notes " + n2 + " times");
        System.out.println("notes " + n1 + " times");
    }
      
    }




    

