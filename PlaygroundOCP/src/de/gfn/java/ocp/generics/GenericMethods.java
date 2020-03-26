package de.gfn.java.ocp.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class GenericMethods {
    
    public static void main(String[] args) {
        
        // Arrays.asList produziert eine in der Größe nicht veränderbare Liste
        List<Integer> zahlen = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        // Integer[] intArr = zahlen.toArray(); //Fehler, Liefert ein Object-Array
        
        // Größe des Arrays in toArray spielt keine Rolle, nur der Typ ist wichtig
        Integer[] intArr = zahlen.toArray(new Integer[0]); 
        
        String s = machWas(new int[10]);
        System.out.println(s);
    }
    
    
    public static <T> String machWas(T wert) {
        return wert.toString();
    }
}
