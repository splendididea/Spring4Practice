package org.java.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations = { "file:web/WEB-INF/application*.xml" })
public class DataSourceTest {

    @Inject
    DataSource ds;

    @Test
    public void testConnction() {
        try(Connection conn = ds.getConnection()){
            System.out.println(conn);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
