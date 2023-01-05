package A.skill.com;

import java.util.Scanner;

public class Pattern_2 {

    /*
     1 0 1 0 1 0
     1 0 1 0 1 0
     1 0 1 0 1 0
     1 0 1 0 1 0
     1 0 1 0 1 0
     1 0 1 0 1 0
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number for Pattern");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 ==0){
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
