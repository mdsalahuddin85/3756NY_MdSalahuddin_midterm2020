package datastructure;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class UseArrayList {

    public static void main(String[] args) throws SQLException {
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
        String url = "jdbc:mysql://localhost/robin?serverTimezone=UTC";
        String user = "root";
        String password = "abcd1234";
        //Connection connection = DriverManager.getConnection(url,user,password);
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            String query = "insert into qatester (id, name) values (2,'Wasfi Safwan Salahuddin');";
            statement.execute(query);

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("There is something wrong with connection, Please!!! check connection");

        } finally {
            connection.close();
            statement.close();
        }


    }


}
