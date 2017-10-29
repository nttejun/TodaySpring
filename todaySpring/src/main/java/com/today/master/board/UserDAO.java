package com.today.master.board;

import org.springframework.jdbc.core.ConnectionCallback;

import java.sql.Connection;

/**
 * Created by nttej on 2017-10-28.
 */
public class UserDAO {

    private Connection dbConnection;

    public UserDAO(Connection dbConnection){

        this.dbConnection = dbConnection;

    }

}
