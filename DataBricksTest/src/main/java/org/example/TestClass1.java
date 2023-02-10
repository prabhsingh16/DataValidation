package org.example;

import java.sql.*;
import java.util.Properties;

public class TestClass1 {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World");

        //String url = "jdbc:databricks://<Server Hostname>:443;HttpPath=<Http Path>";
        String url = "jdbc:databricks://dbc-730ac618-237e.cloud.databricks.com:443;HttpPath=sql/protocolv1/o/8391616323182699/0207-110440-flg8koe8";
        Properties p = new java.util.Properties();
        p.put("PWD", "dapi2336420e3fb0a54692ecbef8c782ae64");
        Connection conn;
        conn = DriverManager.getConnection(url, p);
        System.out.println(" connected: " + conn.isClosed());
         System.out.println("hey");

//        String query = "select color, PRICE from diamonds";
//        try (Statement stmt = conn.createStatement()) {
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String colorName = rs.getString("color");
//                float price = rs.getFloat("price");
//                System.out.println(colorName + ", " + price);
//            }
//        } catch (SQLException e) {
//            e.getErrorCode();
//        }


    }
}
