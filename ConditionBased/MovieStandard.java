package ConditionBased;

import java.util.Scanner;

public class MovieStandard {
    // Tell the user which kind of movie it is in the basis of movie rating's eg(Hit , flop ,etc..)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name");
        String name = sc.nextLine();
        System.out.println("Enter Movie ratings please ensure it should be between ( 0 to 5.0)");
        double ratings = sc.nextDouble();
        if(ratings >= 0.0 && ratings <= 2.0){
            System.out.println(name + " is a flop Movie");
        }else if ( ratings > 2.0 && ratings <= 3.5){
            System.out.println(name + " is a Semi-Hit Movie");
        }else if(ratings > 3.5 && ratings <= 4.5){
            System.out.println(name + " is a Hit Movie");
        }else if(ratings > 4.5 && ratings <= 5.0){
            System.out.println(name + " is a SuperHit BlockBuster Movie");
        }else{
            System.out.println("Please enter valid ratings as listed in last steps");
        }
    }
    
}
