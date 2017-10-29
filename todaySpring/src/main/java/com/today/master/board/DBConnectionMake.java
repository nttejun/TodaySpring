package com.today.master.board;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by nttej on 2017-10-29.
 */
public interface DBConnectionMake {
    public Connection connectionTry() throws ClassNotFoundException, SQLException;
}
