package de.gfn.java.ocp.jdbc;

import java.sql.*;

/**
 *
 * @author tlubowiecki
 */
public class JDBCTest1 {
    
    private final static String URL = "jdbc:sqlite:mydata.db";
    
    public static void main(String[] args) {
        
        String sql;
        
        // Nötig bei JDBC 3 oder früher
        try {
            Class.forName("org.sqlite.JDBC"); // Klassen-Import zur Laufzeit
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Treiber für die DB nicht verfügbar.");
            System.exit(0);
        }
        
        
        // con = Verbindung zur Datenbank
        // stmt = Anfrage (beim erzeugen noch leer)
        try(Connection con = DriverManager.getConnection(URL); 
                Statement stmt = con.createStatement()) {
            
//            // Tabelle erzeugen
//                sql = "CREATE TABLE customers ("
//                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
//                    + "firstname CHAR(25) NOT NULL, "
//                    + "lastname CHAR(25) NOT NULL, "
//                    + "email CHAR(50))";

            // Datensatz einfügen
            sql = "INSERT INTO customers (id, firstname, lastname, email) "
                    + "VALUES(null, 'Peter', 'Parker', 'p.parker@shield.com')";
            
            
            // Anfrage wird mit SQL konkretisiert und an die DB übergeben
            // stmt.execute(sql); // boolean
//            if(stmt.executeUpdate(sql) > 0) // int, row count, Nur für Änderungen an Tabellen und Datensätzen inkl. Einfügen
//                System.out.println("Daten wurden gespeichert.");
            
            // Datenabfrage
            sql = "SELECT * FROM customers";
//            if(stmt.execute(sql)) { // Anfrage absetzen
//                ResultSet rs = stmt.getResultSet(); // Datensätze abholen
//            }
            
            // Nur für SELECT
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                System.out.printf("%1$5d, %2$10s, %3$10s, %4$10s \n", 
                        rs.getInt("id"), 
                        rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getString("email")
                );
            }
                    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("ENDE");
    }
}
