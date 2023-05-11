package mate.jdbc.services.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import mate.jdbc.lib.Dao;
import mate.jdbc.services.DataBaseConnectionService;
import mate.jdbc.exception.DataProcessingException;

@Dao
public class DataBaseConnectionServiceImpl implements DataBaseConnectionService {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/taxi_application";
    private static final String USER_NAME = "root";
    private static final String DB_PASSWORD = "15975324865Germes!S";

    @Override
    public Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL,USER_NAME,DB_PASSWORD);
            return connection;
        } catch (SQLException throwables) {
            throw new DataProcessingException("Can`t connect to data base with credentials!"
                    + System.lineSeparator() + "URL = " + DB_URL
                    + System.lineSeparator() + "Login = " + USER_NAME
                    + System.lineSeparator(),throwables);
        }
    }
}
