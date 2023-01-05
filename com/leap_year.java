package A.skill.com;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Any year:");
//        int number = sc.nextInt();
//        System.out.println( "your year is: "+ number);
//        if (number % 4 == 0) {
//            System.out.println("This Year is Leap Year "+ number );
//        }
//        else {
//            System.out.println("This year is Not leap Year:" + number);
//        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isleapyear(number)){
            System.out.println("this is leap year");
        }
        else {
            System.out.println("this is not leap year");
        }
    }
    static boolean isleapyear(int year){
        if (year % 4 ==0){
            return true;
        }
        else {
            return false;
        }

    }
}
