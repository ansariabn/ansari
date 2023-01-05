package A.skill.com;


import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
    /*    Q : print this ..

             # # # # # $ $ $ $ $ $ 1 # # # # #
             # # # # $ $ $ $ $ $ 2 2 2 # # # #
             # # # $ $ $ $ $ $ 3 3 3 3 3 # # #
             # # $ $ $ $ $ $ 4 4 4 4 4 4 4 # #
             # $ $ $ $ $ $ 5 5 5 5 5 5 5 5 5 #
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size for print the pattern: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int i = 0; i <= n - row; i++) {
                System.out.print("# ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("$ ");

            }
            for (int i = 0; i < ((2 * row) - 1); i++) {
                if (i == 1 || i == ((2 * row) - 1) || row == n - 1) {
                    System.out.print(row + " ");
                } else {
                    System.out.print(row + " ");
                }
            }
            for (int i = 0; i < n - row; i++) {
                System.out.print("# ");
            }
            System.out.println();

        }


    }

}





