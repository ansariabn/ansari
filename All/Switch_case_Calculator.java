package All;

import java.util.Scanner;

public class Switch_case_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double first_number = sc.nextDouble();
        System.out.println("first Number: "+ first_number);

        System.out.println("Enter any operator: +, /, -, or %");
        char operator = sc.next().charAt(0);

        System.out.println("Enter Second Number:");
        double second_number = sc.nextDouble();
        System.out.println("second NUmber: "+ second_number);

        switch (operator){
            case '+' :
                System.out.println("Result is:"+(first_number + second_number));
                break;
            case '*' :
                System.out.println("Result is:"+(first_number * second_number));
                break;
            case '-' :
                System.out.println("Result is:"+(first_number - second_number));
                break;
            case '/' :
                System.out.println("Result is:"+(first_number / second_number));
                break;
            case '%' :
                System.out.println("Result is:"+(first_number % second_number));
                break;
            default:
                System.out.println("You enter wrong");
                break;

        }

    }
}
