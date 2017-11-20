package org.java.web;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {

    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";

    private static final String USER = "mufasa";

    private static final String PASSWORD = "kr3557kr";

    @Test
    public void getConnectionTest() throws Exception {
        Class.forName(DRIVER);
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD)){
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
