package A.skill.com;

import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number for check:");

//        int num = sc.nextInt();
        int num = 25;

        int count = 0;
        int square = num * num;
        System.out.println("square of Number: " + square);
        int atm = num;
        while (atm > 0) {
            count++;
            atm = atm / 10;
        }
        int lastdigit = (int) (square % (Math.pow(10, count)));

        if (num == lastdigit) {
            System.out.println(num + " is true & Automorphic Number");
        } else {
            System.out.println(num + " is false & Not Automorphic number");
        }
    }
}