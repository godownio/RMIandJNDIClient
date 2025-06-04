package org.example.JDBC_Client;

import java.sql.Connection;
import java.sql.DriverManager;

//用于测试的受害JDBC Client
public class MySQL_JDBC_Client {
    public static void main(String[] args) throws Exception {
        String ClassName = "com.mysql.jdbc.Driver";
        String JDBC_Url = "jdbc:mysql://127.0.0.1:3306/test?"+
                "autoDeserialize=true"+
                "&queryInterceptors=com.mysql.cj.jdbc.interceptors.ServerStatusDiffInterceptor";
        String username = "root";
        String password = "root";
        Class.forName(ClassName);
        Connection connection = DriverManager.getConnection(JDBC_Url, username, password);
    }
}
