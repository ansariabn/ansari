package A.skill.com;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        li.add("Sachin");
        li.add("Dravid");
        li.add("Laxman");
        li.add(" Ganguly");
        li.add(" Dhoni");
        li.add("Rohith");
        li.add("Virat");
        li.add(" Yuvraj");
        li.add("Bumrah");
        System.out.println(li);
        iterat(li);

    }

    private static void iterat(ArrayList li) {
        System.out.println("_______________");
        System.out.println("iterating the ArrayList using iterator : ");

        Iterator it = li.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        boolean a = li.isEmpty();
        System.out.println(a);
        System.out.println(li.getClass());
        ArrayList copyOfList = new ArrayList();
        System.out.println(copyOfList.addAll(li));

       /*
       Java ArrayList class can contain duplicate elements.
       Java ArrayList class maintains insertion order.
       Java ArrayList class is non synchronized.
       Java ArrayList allows random access because the array works on an index basis.

        */


    }


}


