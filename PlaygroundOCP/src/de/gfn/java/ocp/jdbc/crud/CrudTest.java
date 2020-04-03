/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.jdbc.crud;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class CrudTest {
    
    public static void main(String[] args) {
        
        CustomerCRUD crud = new CustomerCRUD();
        
        try {
            // find one
            Customer c = crud.find(1);
            System.out.println(c);
            
            System.out.println("----------");
            
            // find all
            List<Customer> lc = crud.find();
            for(Customer cur : lc) {
                System.out.println(cur);
            }
            
            System.out.println("----------");
           
            crud.delete(1);
            System.out.println("----------");
         
        } 
        catch (SQLException ex) {
            System.out.println("Problem");
        }
        
    }
    
}
