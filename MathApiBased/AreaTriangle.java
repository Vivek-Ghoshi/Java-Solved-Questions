package MathApiBased;

import java.util.Scanner;

public class AreaTriangle {
    /*Accept the three sides of the triangle from user and calculate the area by Heron's formula
    formula = root(s*(s-a)*(s-b)*(s-c))
    were s = semi perimeter which is (sum of all sides/2)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of side one");
        double s1 = sc.nextDouble();
        System.out.println("Enter value of side two");
        double s2 = sc.nextDouble();
        System.out.println("Enter value of side three");
        double s3 = sc.nextDouble();
        double sp = (s1 + s2 + s3) / 2; 
        double area = Math.sqrt(sp*(sp-s1) * (sp-s2) * (sp-s3));
        System.out.println(area);
    }
    
}
