/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author tlubowiecki
 */
public class GenericTest3 {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Hallo");
        
        // Generic zu Raw-Taype ist OK
        List noneGeneric = list;
        
        // Generic zu Object ist NICHT! OK
        //List<Object> noneGeneric = list;
        noneGeneric.add(1);
        
//        for(String s : list) {
//            System.out.println(s);
//        }
        
        // Raw-Taype zu Generic ist OK
        List<Integer> intList = noneGeneric;
        intList.add(123);
        
        NavigableMap<Integer, String> nm = new TreeMap<>();
        nm.put(1, "Hamburg");
        nm.put(2, "Köln");
        
        for(Map.Entry<Integer, String> e : nm.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        
        System.out.println(nm.firstEntry());
        
        //Iterator<Map.Entry> itr = nm.entrySet().iterator();
        Iterator<Map.Entry<Integer, String>> itr = nm.entrySet().iterator();
    }
}
