package A.skill.com;


import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add("Messi");
        li.add("Ronaldo");
        li.add("Neymar");
        li.add("Mbappe");
        li.add("Giggs");
        li.add("Rooney");
        li.add("Chetri");
        li.add("Persie");
        li.add("Zlatan");
        System.out.println(li);

        iterateUsingIterate(li);

    }

     static void iterateUsingIterate(LinkedList li) {
         System.out.println("_______________");
         System.out.println("iterating the linkedlist using iterator : ");

         Iterator it = li.iterator();

         while (it.hasNext()){
             System.out.print(it.next() + ", ");
         }

         System.out.println();
         System.out.println("count the element in the linkedlist");

         int count = 0;
         for (int i = 0; i <li.size(); i++) {
             count++;

         }
         System.out.println("The size of Linkedlist is : " +count);


         System.out.println("remove index 3 :" );
         li.remove(3);
         System.out.println(li);
         System.out.println("Remove Data Rooney in the list");
         li.remove("Rooney");
         System.out.println(li);

         System.out.println("take class in the list");
         System.out.println( li.getClass());

         /*
          Properties of Linked List.
          The linked list starts with a HEAD which denotes
          the starting point or the memory location of first node.
          Linked list ends with the last node pointing to NULL value.
          Unlike array the elements are not stored in contiguous memory locations,
          but are stored in random location

          */
    }
}
