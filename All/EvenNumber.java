package All;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int ar = sc.nextInt();
        int[] arr = new int[ar];



        for (i = 0; i < arr.length; i++) {

            if (i % 2 == 0)
                System.out.print(i + ",");
        }
    }
}
