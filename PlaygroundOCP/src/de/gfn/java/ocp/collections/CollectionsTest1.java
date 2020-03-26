package de.gfn.java.ocp.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tlubowiecki
 */
public class CollectionsTest1 {
    
    public static void main(String[] args) {
        
        // primitive Datentypen sind nicht erlaubt
        List<Integer> l = new ArrayList<>();
        
        // autoboxing
        l.add(100); // int > Integer
        
        // auto-un-boxing
        int i = l.get(0);
        
        // Promotion
        double d = 100; // Promotion von int auf double
        
        Double d2 = (double)100; // int > double > Double
        
        List<Double> ld = new ArrayList<>();
        ld = new LinkedList<>();
        // ld.add(100); // int > Integer > Double, Compilererror
        
        List lrt = new ArrayList(); // Raw-Type
        lrt.add(100); // int > Integer > Object
        // int i2 = lrt.get(0); // Object > int, Compilererror
        
        String s1 = new String("Moin");
        String s2 = new String("Moin");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        // Duplikat gem. Java hat den gleichen HashCode und ist gem. equals gleich.
        
        Set<Thing> set = new HashSet<>(); 
        set.add(new Thing(10));
        set.add(new Thing(10));
        System.out.println(set);
        
        Object o = new Object();
        o.hashCode(); // int
        
    }
}