package de.gfn.java.ocp.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class GenericTest1 {
    
    public static void main(String[] args) {
        
        // Raw-Typ, Legacy-Code
        List list = new ArrayList();
        // Alle Elemente werden als Object eingefügt
        list.add(1); // Object
        list.add("Moin"); // Object
        
        for(Object o : list) {
            System.out.println(((String) o).toUpperCase());
        }
        
        System.out.println("-----------");
        
        // Typsicher
        List<String> list2 = new ArrayList<>();
        // Alle Elemente werden als String eingefügt
        // list2.add(1); // Error, da nicht String
        list2.add("Moin"); // Object
        
        for(String s : list2) {
            System.out.println(s.toUpperCase());
        }
    }
}
