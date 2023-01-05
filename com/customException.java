package A.skill.com;

import java.util.Scanner;


class underAgeException extends Exception {
    public underAgeException(String msg) {
        System.out.println(msg);
    }
}
class OverAgeException extends Exception {
    public OverAgeException(String sta) {
        System.out.println(sta);
    }
}

public class customException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            Age(n);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Age(int age) throws underAgeException, OverAgeException {

        if (age > 65) {
            throw new OverAgeException("Age is more than 65 . Rejected "+ age);

        } else if (age < 18) {
            throw new underAgeException("Age is more less than 18 . Rejected " + age);
        } else if (age > 18 && age < 30) {
            System.out.println("Accepted");

        } else {
            System.out.println("print Valid Age");
        }
    }


}


