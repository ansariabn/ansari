package A.skill.com;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int num = sc.nextInt();
//
//       int m = 0;
//       int n ;
//        for (int row = 1; row <=num ; row++) {
//            n = row;
//
//            for (int col = 1; col <=num ; col++) {
//                if (n > 9){
//                    System.out.print(n + " ");
//                    n = n + num;
//                }
//                else {
//                    System.out.print(m + "" + n + " " );
//                    n = n + num;
//
//                }
//
//            }
//            System.out.println();
//        }

        for (int i = 0; i <=5; i++) {
            for (int j = 5 - i; j > 0 ; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
