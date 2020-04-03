/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.kundenverwaltung;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julian
 */
public class CustomerProvider {

    private List<Customer> customers;
    
    private static final File DIR_NAME = new File(System.getProperty("user.home"),"Kundenverwaltung");
    private static final File FILE_NAME=new File(DIR_NAME,"customers.db");

    public CustomerProvider() {

        //customers = new ArrayList<>();
        loadFromFile();

    }

    public void add(Customer c) {
        customers.add(c);
        saveToFile();

    }

    public List<Customer> getAll() {
        return customers;
    }

    private void saveToFile() {
        
        if(!DIR_NAME.exists())
            DIR_NAME.mkdir();
                    
        try(ObjectOutputStream oos= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FILE_NAME))))
        {     oos.writeObject(customers);
           
        }
       catch(IOException e){
             e.printStackTrace();
        }
          }

    private void loadFromFile() {
        customers=new ArrayList<>();
    }
}
