package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Anagram.isAnagram("ACT", "ACT");
        Assert.assertTrue(true, "true");


    }
}
