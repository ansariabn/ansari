package A.skill.com;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class dob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter This Formate Only (YYYY-MM-DD)");
        String DOB = sc.nextLine();

        // for convert the String into interger
        LocalDate DOB2 = LocalDate.parse(DOB);

        // this thi for today date
        LocalDate Today = LocalDate.now();
        System.out.println(Today);
        int age = (Period.between(DOB2,Today)).getYears();
        System.out.println(age);

    }
}
