package All;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());

        }


        // add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }


        }
        System.out.println(list);


    }
}
        // create an Array list method
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(45);
//        list.add(50);
//        list.add(41);
//        list.add(56);
//        System.out.println(list);
//        list.set(0,85);
//        list.remove(1);
//
//        System.out.println(list);




