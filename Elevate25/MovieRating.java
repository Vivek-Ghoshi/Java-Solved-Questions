package Elevate25;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie rating upto 5.0");
        double rating = sc.nextDouble();
        if(rating >=0.0 && rating <=2.0){
            System.out.println("Flop movie");
        }else if(rating >=2.1 && rating <=3.0){
            System.out.println("Hit movie");
        }else if(rating >=3.1 && rating <=4.0){
            System.out.println("Semi-Hit movie");
        }else if(rating >=4.1 && rating <=5.0){
            System.out.println("Super Hit");
        }else{
            System.out.println("Wrong input");
        }
    }
}
