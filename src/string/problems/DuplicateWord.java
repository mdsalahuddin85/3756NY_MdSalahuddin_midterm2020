package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] seperateWords = st.split(" ");

        Map<String,Integer> Map = new HashMap<>();

        for ( String word : seperateWords ) {
            Integer count = Map.get(word);
            if (count == null) {
                count = 0;
            }
            Map.put(word, count + 1);
        }
        for(Map.Entry<String, Integer> stringEntry : Map.entrySet()){
            System.out.println("word '"+ stringEntry.getKey() + "'" + ": " + stringEntry.getValue() + " time(s)");
        }

    }

}
