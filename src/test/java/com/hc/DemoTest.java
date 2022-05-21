package com.hc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoTest {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/db_wego?useSSL=false&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF8&autoReconnect=true&failOverReadOnly=false&allowPublicKeyRetrieval=true&failOverReadOnly=false";
        String username123 = "root";
        String password123 = "root";
        Connection conn = DriverManager.getConnection(url, username123, password123);
        System.out.println(conn);
    }

}
