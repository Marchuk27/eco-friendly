package org.ecofriendly.database.util;
import com.sun.istack.NotNull;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static org.ecofriendly.database.util.AuthDataReceiver.*;

public class DBConnector {
    private static final String DB_DRIVER = getAuthDataForDB()[0];
    private static final String DB_URL= getAuthDataForDB()[1];
    private static final String DB_USERNAME = getAuthDataForDB()[2];
    private static final String DB_PASSWORD = getAuthDataForDB()[3];

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            System.out.println("Connection....");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connect OK");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            System.out.println("Connect lost");
        }
        return connection;
    }



}