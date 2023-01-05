package A.skill.com;

import java.util.Scanner;

public class Converter_hourToSecond {
    public static void main(String[] args) {
        System.out.println("Enter hours");

        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();

        System.out.println("Press '* '");
        char operator = sc.next().charAt(0);

        int second = 3600;

        if(operator == '*'){
            System.out.println(hours * second);
        }
    }
}
