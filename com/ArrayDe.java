package A.skill.com;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDe {
    public static void main(String[] args) {
        ArrayDeque de = new ArrayDeque();
        de.add("Rajkumar");
        de.add("Amitab");
        de.add("Rajnikanth");
        de.add(" Sharukh");
        de.add("Puneeth");
        de.add("Vijay");
        de.add("Surya");
        de.add("Chiranjeevi");
        de.add("Salman");
        System.out.println(de);

        // first position
        de.addFirst("Shivaji");
        de.addFirst("Ambreesh");
        de.addFirst("Vishnu");
        System.out.println(de);

        Iterator it = de.iterator();

        while (it.hasNext()){
            System.out.print(it.next() + " ,");
        }

        System.out.println();
        ArrayDeque copy = new ArrayDeque(de); // copy one element to another element
        System.out.println(copy);
        System.out.println(de.getClass());

        /*
        Array deques have no capacity restrictions and they grow as necessary to support usage.
        They are not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads.
        Null elements are prohibited in the ArrayDeque.
        ArrayDeque class is likely to be faster than Stack when used as a stack.
        ArrayDeque class is likely to be faster than LinkedList when used as a queue.
         */


    }
}
