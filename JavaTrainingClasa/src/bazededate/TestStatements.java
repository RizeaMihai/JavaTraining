/*
 * 
 */
package bazededate;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mihai Rizea
 */
public class TestStatements {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        String user = "test";
        String password = "test"; //String url = "jdbc:derby://localhost:1527/seconddb;create=true";
        String url = "jdbc:derby://localhost:1527/example2;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //System.out.println("Statement is "+statement.toString());
            //statement.execute("CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))");
            //statement.execute("INSERT INTO FIRSTTABLE VALUES (10,'TEN'),(20,'TWENTY'),(30,'THIRTY')");
            resultSet = statement.executeQuery("SELECT * FROM SECONDTABLE");
            //boolean resultSetHasRows = resultSet.next();
            if (null!=resultSet) {
                String currentID = "";
                String currentName = "";
                System.out.println("ID NAME");
                System.out.println("==========");
                while (resultSet.next()) {
                    currentID = resultSet.getString(1);
                    currentName = resultSet.getString(2);
                    System.out.println(currentID + " " + currentName);
                }
            } else {
                System.out.println("No rows found in ResultSet");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
