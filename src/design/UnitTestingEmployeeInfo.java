package design;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingEmployeeInfo {

    //Write Unit Test for all the methods has been implemented in this package.
    private EmployeeInfo employeeInfo;

    @BeforeTest
    public void initTest() {

        employeeInfo = new EmployeeInfo();

        employeeInfo.setEmployeeName("John Doe");
        employeeInfo.setEmployeeId(001);
        EmployeeInfo.setCompanyName("Apparel Inc");
    }
    @Test
    public void testPositiveIsEmployeeOfTheMonth() {

        System.out.println("Testing employeeName()");
        assertEquals("John Doe", employeeInfo.isEmployeeOfTheMonth(100));
    }

    @Test
    public void testNegativeIsEmployeeOfTheMonth() {

        System.out.println("Testing employeeName()");
        assertEquals("John Doe", employeeInfo.isEmployeeOfTheMonth(80));
    }

    @Test
    public void testEmployeeName() {

        System.out.println("Testing EmployeeOfTheMonth()");
        assertEquals("John Doe", employeeInfo.employeeName());
    }

    @Test
    public void testEmployeeId() {

        System.out.println("Testing employeeId()");
        assertEquals(001, employeeInfo.employeeId());
    }


    @Test
    public void testCompanyName() {

        System.out.println("Testing setCompanyName()");
        assertEquals("Apparel Inc", employeeInfo.getCompanyName());
    }

    @Test
    public void testCalculateSalary() {

        System.out.println("Testing calculateSalary()");
        assertEquals(120000, employeeInfo.calculateSalary());
    }
}