package A.skill.com;


import java.time.*;
import java.util.Scanner;


public class BirthDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
        String st = sc.nextLine();

        LocalDate Dob = LocalDate.parse(st);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob,currentDate).getYears();
        System.out.println("Age is :- "+ age);
    }

//    static int calcAge(LocalDate Dob)
//    {
//        LocalDate currentDate = LocalDate.now();
//        int age = Period.between(Dob,currentDate).getYears();
//        return age;
//    }
}