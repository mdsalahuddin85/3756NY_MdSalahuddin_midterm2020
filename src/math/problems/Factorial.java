package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    static int fact = 1;
    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println( factorial1(5) );
        System.out.println(factorial2(5));

    }

        public static int factorial1(int num) {
        int result=1;

        for(int i=1; i<=num; i++) {
             result = result * i;
        }
        return result;
    }

    public static int factorial2(int num) {
        if (num>=1)
    {
        fact = fact*num;
        factorial2(num-1);
    }
        return fact;
    }
}
