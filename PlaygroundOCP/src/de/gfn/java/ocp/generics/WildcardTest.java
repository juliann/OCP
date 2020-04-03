/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class WildcardTest {
    
    public static void main(String[] args) {
        
        //List<T extends Number> ints = new ArrayList<>(); // Geht nicht
        List<Number> ints = new ArrayList<>();
        List ints2 = new ArrayList<Number>();
        
        List<?> list = new ArrayList<Number>();
        list = new ArrayList<Integer>();
        list = new ArrayList<String>();
        
//        for(Integer i : list) {
//            System.out.println(i);
//        }

        list.forEach(i -> System.out.println(i));
        list.add(null);
        System.out.println(list);
        
        Object o = null;
        o.toString();
        
        // extends = Begren zung der Typen auf Number und davon abgeleitete Klassen
        List<? extends Number> numList = new ArrayList<Number>();
        numList = new ArrayList<Integer>();
        numList = new ArrayList<Double>();
        // numList = new ArrayList<Object>(); // Error, liegt oberhalb von Number
        // numList.add(1);
        
        numList.forEach(i -> System.out.println(i));
        
        // Lower-Bound: Beschränkt auf Number und Elternt-Typen von Number
        List<? super Number> numList2 = new ArrayList<>();
        //numList2 = new ArrayList<Object>();
        // numList2 = new ArrayList<Integer>();
        numList2.add(1); // int > Integer > Number
        numList2.add(1.2); //double > Double > Number
        
        numList2.forEach(i -> System.out.println(i));
        
//        Object o = 1;
//        Integer i = new Object();
        
        System.out.println(numList2);
        
        List<Integer> ints3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        
        List<CharSequence> str1 = new ArrayList<>(Arrays.asList("C", "G", "A", "B"));
        
        // Comparator<? super CharSequence>
        str1.sort(new MyComp());
        
        System.out.println("---------------");
        
        List<Integer> ints4 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.copy(new ArrayList<Number>(), ints4);
        
    }
}

// Hier sind Wildcards nicht erlaubt
//class GenericWildcard<?> {}

class MyComp implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}