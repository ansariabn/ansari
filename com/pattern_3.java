package A.skill.com;

import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = 0;
        int n;
        for (int i = 1; i <= num; i++) {
            n = i;

            for (int j = 1; j <= num; j++) {

                if (n > 9) {
                    System.out.print(n + " ");
                    n = n + num;
                } else {
                    System.out.print(m + "" + n + " ");
                    n = n + num;
                }
            }
            System.out.println();

        }



    }

}




