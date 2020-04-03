/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tlubowiecki
 */
public class DBConnectionFactory {
    
    private static final String DB_TYPE = "sqlite";
    private static final String DB_NAME = "mydata.db";
    private static final String DB_HOST = "";
    private static final String DB_PORT = "";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    private DBConnectionFactory() {
    }
    
    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:%s:%s", DB_TYPE, DB_NAME);
        return DriverManager.getConnection(url);
    }  
}
