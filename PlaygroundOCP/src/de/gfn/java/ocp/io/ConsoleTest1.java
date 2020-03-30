package de.gfn.java.ocp.io;

import java.io.Console;

/**
 *
 * @author tlubowiecki
 */
public class ConsoleTest1 {
    
    public static void main(String[] args) {
        
        Console con = System.console();
        
        if(con != null) {
            
            String datum = con.readLine("Gib ein Datum ein (%s):", "dd.MM.yyyy");
            
            String fmt = "%1$5s %2$10s %3$10s %n";
            
            con.format(fmt, "ID", "FIRSTNAME", "LASTNAME");
            con.format(fmt, "-----", "----------", "----------");
            con.format(fmt, "1", "Peter", "Parker");
            con.format(fmt, "2", "Bruce", "Wayne");
            con.format(fmt, "3", "Tony", "Stark");
            
        }
        else {
            System.out.println("Keine Console da!");
        }
        
        
    }
    
}
