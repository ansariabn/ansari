package A.skill.com;

import java.time.LocalDate;
import java.util.Scanner;

public class DOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your date of birth in year only: ");
        int user_DOB = sc.nextInt();

        LocalDate date = LocalDate.now();

        System.out.println("Enter Operator ' - '  ");
        char operator = sc.next().charAt(0);



        if (operator == '-'){
            System.out.println("your Age is: "+ (date.getYear() - user_DOB));


        }
        else{
            System.out.println("you are choose wrong input");
        }
        System.out.println("-----THANKS FOR USING OUR CODE-----");


    }
}
