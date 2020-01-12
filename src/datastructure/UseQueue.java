package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> queue = new LinkedList<>();
        System.out.println("Adding values using adding methods.......");
        queue.add("Dhaka");
        queue.add("Sylhet");
        queue.add("Barishal");
        queue.add("Rajshahi");
        System.out.println(queue);
        System.out.println(" ");
        if (queue.peek().equals("Dhaka")) { //peek method find the top value
            System.out.println(queue.poll()); // poll method find the top value and remove
        }
        System.out.println(" ");
        System.out.println("Printout the values using iterator.....");
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(" ");
        System.out.println("Removing the values Using remove methods.....");
        System.out.println(queue.remove("Rajshahi"));
        System.out.println(queue);
        System.out.println(" ");
        System.out.println("Printout the values using for each loop.....");
        for (String st : queue) {
            System.out.println(st);
        }
    }


}
