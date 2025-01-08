package ConditionBased;

import java.util.Scanner;

public class SalaryCalculation {
    // Calculate the salary of the user on the basis of certain conditions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Qualification");
        String qualification = sc.nextLine();
        System.out.println("Enter gender");
        String gender = sc.nextLine();
        System.out.println("Enter year of service");
        int year = sc.nextInt();
        int salary = 0;
        if(gender.equals("male")){
            if(year >=10 && qualification.equals("post graduate")){
                salary = 15000;
            }else if(year >=10 && qualification.equals("graduate")){
                salary = 10000;
            }else if( year < 10 && qualification.equals("post graduate")){
                salary = 10000;
            } else if(year < 10 && qualification.equals("graduate")){
                salary = 7000;
            }
        }else if(gender.equals("female")){
            if(year >=10 && qualification.equals("post graduate")){
                salary = 12000;
            }else if(year >=10 && qualification.equals("graduate")){
                salary = 9000;
            }else if( year < 10 && qualification.equals("post graduate")){
                salary = 10000;
            } else if(year < 10 && qualification.equals("graduate")){
                salary = 6000;
            }
        }else{
            System.out.println("We don't allow gender's other then Male & Female Thank you for using this program");
        }
        System.out.println("Your salary amount is = " + salary);

    }
    
}
