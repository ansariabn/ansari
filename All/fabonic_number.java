package All;

import java.util.Scanner;

public class fabonic_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the No:");
        int n = sc.nextInt();

        int n1= 0, n2 = 1, n3, sum = 1;

        for (int i = 2; i < n ; i++) {
            n3 = n1 + n2;
            sum = sum +n3;
            n1 = n2;
            n2 = n3;

        }
        System.out.println(sum);
    }
}


