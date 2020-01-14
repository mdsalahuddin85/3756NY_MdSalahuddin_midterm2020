package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation(" ", "ABC");
    }
    private static void permutation(String prefix, String str) {
        int a = str.length();
        if (a == 0){
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < a; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, a));
            }
        }
    }
}
