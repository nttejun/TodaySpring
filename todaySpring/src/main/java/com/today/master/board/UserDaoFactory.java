package com.today.master.board;

import java.sql.Connection;

/**
 * Created by nttej on 2017-10-29.
 */
public class UserDaoFactory {

    DBConnectionMake connectionMake = new DBMysqlConnection();

    UserDAO userDAO = new UserDAO((Connection) connectionMake);

}
