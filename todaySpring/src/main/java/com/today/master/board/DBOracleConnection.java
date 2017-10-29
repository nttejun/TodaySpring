package com.today.master.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nttej on 2017-10-29.
 */
public class DBOracleConnection implements DBConnectionMake {
    public Connection connectionTry() throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
        return connection;
    }
}
