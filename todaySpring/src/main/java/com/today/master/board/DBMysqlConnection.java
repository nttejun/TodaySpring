package com.today.master.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nttej on 2017-10-29.
 */
public class DBMysqlConnection implements DBConnectionMake {
        public Connection connectionTry() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8083/todayspring", "root", "1234");
            return connection;
        }
    }

