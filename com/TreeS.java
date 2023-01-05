package A.skill.com;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeS {
    public static void main(String[] args) {
        // always Tree set print the value in the asscending order
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(125);
        ts.add( 175);
        ts.add(45);
        ts.add(225);
        ts.add(500);
        ts.add(25);
        ts.add( 75);
        ts.add(15);
        ts.add(150);
        ts.add( 5 );
        System.out.println(ts);

        // iterating the treeset
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + ", ");
        }

        //  write a descending order program
        NavigableSet Treverse = ts.descendingSet();
        System.out.println(Treverse);

        // find the Greatest and Lowest Value of 200
        System.out.println("Greater than 200: "+ ts.higher(200));
        System.out.println("Less than 200: "+ts.lower(200));


        // find the class
        System.out.println(ts.getClass());

        // find subset means range from 200 to 700 is 225 and 500
        System.out.println(ts.subSet(200,700));

        /*
        Java TreeSet class contains unique elements only like HashSet.
        Java TreeSet class access and retrieval times are quiet fast.
        Java TreeSet class doesn't allow null element.
        Java TreeSet class is non synchronized.
        Java TreeSet class maintains ascending order.
         */

    }
}
