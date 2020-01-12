package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Adding values using add methods.......");
        array.add("Robin");
        array.add("Wasfi");
        System.out.println(array);
        array.add(1, "Jay");
        array.add(3, "James");
        array.add("----");
        System.out.println(" ");
        System.out.println("Printout the values using while loop with Iterator.....");
        Iterator it = array.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        array.remove(3);
        array.remove("----");
        System.out.println(" ");
        System.out.println("Printout the values using For Each loop.....");
        for (String st : array) {
            System.out.println(st);
        }

    }

}
