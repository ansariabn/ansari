package A.skill.com;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityq {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add(100);
        p.add(50);
        p.add(125);
        p.add(175);
        p.add(45);
        p.add(225);
        p.add(500);
        p.add(25);
        p.add(75);
        p.add(15);
        p.add(150);
        p.add(5);
        System.out.println(p);

        Iterator it = p.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+ ",");
        }
        System.out.println();
        System.out.println(p.peek());   // find Priority

        p.remove(5);  // remove first PriorityQueue

        System.out.println(p); // after remove priorityqueue

        System.out.println(p.getClass());  // find the class who belong

        /*
        A PriorityQueue is used when the objects are supposed to be processed based on the priority.
        It is known that a Queue follows the First-In-First-Out algorithm,
        but sometimes the elements of the queue are needed to be processed according to the priority,
        that’s when the PriorityQueue comes into play.
        The PriorityQueue is based on the priority heap.
        The elements of the priority queue are ordered according to the natural ordering,
        or by a Comparator provided at queue construction time, depending on which constructor is used.
         */

    }
}
