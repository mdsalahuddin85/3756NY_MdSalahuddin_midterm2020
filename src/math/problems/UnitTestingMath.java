package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestingMath {
//    public static void main(String[] args) {
//        //Apply Unit testing into each classes and methods in this package.
//
//        try {
//            Assert.assertEquals(Factorial.factorial(5), 120);
//            System.out.println("Unit testing passed");
//        }catch (AssertionError ar){
//            System.out.println("Unit testing failed");
//        }
//
//    }

    @Test
    public void factorial1TestPositive(){
        int expacted = 120;
        int actual = Factorial.factorial1(5);
        Assert.assertEquals(120,expacted);
    }
    @Test
    public void factorialTestNegetiv(){
        int expacted = 121;
        int actual = Factorial.factorial1(5);
        Assert.assertEquals(actual,expacted);
    }
    @Test
    public void fabonnaciTestPossitive(){

    }
}
