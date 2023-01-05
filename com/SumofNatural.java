package A.skill.com;

import java.util.Scanner;

public class SumofNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(sumof(n));
//    }
//     static int sumof(int n) {
//         return n*(n+1)/2;
//     }

        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
