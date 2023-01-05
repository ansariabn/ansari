package All;

import java.util.Scanner;

public class Calculator_ifCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int first_number = sc.nextInt();
        System.out.println("first Number: "+ first_number);

        System.out.println("Enter any operator: +, /, -, or %");
        char operator = sc.next().charAt(0);

        System.out.println("Enter Second Number:");
        int second_number = sc.nextInt();
        System.out.println("second NUmber: "+ second_number);

        if(operator == '+'){
            System.out.println("Result is:" +(first_number + second_number));
        }
        else if (operator == '-') {
            System.out.println("Result is:" + (first_number - second_number));

        }
        else if (operator == '/') {
            System.out.println("Result is:" +(first_number / second_number));

        }
        else if (operator == '%') {
            System.out.println("Result is:"+(first_number % second_number));

        }else  {
            System.out.println("sorry You can't choose any operator");

        }
    }
}
