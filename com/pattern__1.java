package A.skill.com;

import java.util.Scanner;

public class pattern__1 {
    public static void main(String[] args) {
        int n = 0;
        patter1(n);


    }

     static void patter1(int n) {
         Scanner sc = new Scanner(System.in);
          n = sc.nextInt();
         for (int row = 1; row < n ; row++) {
             for (int i = 0; i < n - row; i++) {
                 System.out.print("# ");
             }

             for (int i = 0; i <= ((2 * row )- 1); i++) {
                 if (i == 0 || i == ((2 * row )- 1) || row ==n -1){
                     System.out.print("@ ");
                 }
                 else {
                     System.out.print("* ");
                 }

             }

             System.out.println();


         }


    }

}
