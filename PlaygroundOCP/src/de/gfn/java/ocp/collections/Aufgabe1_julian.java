/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Julian
 */
public class Aufgabe1_julian {

    public static void main(String[] args) {
        Comparator<LocalDate> cld = (d1, d2) -> d1.compareTo(d2);

        Set<LocalDate> sld = new TreeSet<>(cld);
        Map<String, Integer> map = new HashMap();
        LocalDate a1 = LocalDate.now();
        LocalDate a2 = LocalDate.of(2015, 1, 1);
        LocalDate a3 = LocalDate.of(2016, 1, 1);
        LocalDate a4 = LocalDate.of(2017, 1, 1);
        LocalDate a5 = LocalDate.of(2018, 1, 1);
        sld.add(a1);
        sld.add(a2);
        sld.add(a3);
        sld.add(a4);
        sld.add(a5);
        sld.add(a1);
        sld.add(a2);
        sld.add(a3);
        sld.add(a4);
        sld.add(a5);
        sld.add(a1);
        sld.add(a2);
        sld.add(a3);
        sld.add(a4);
        sld.add(a5);
        System.out.println(sld);
        Set<LocalDate> sldr = new TreeSet<>(cld.reversed());
        sldr.addAll(sld);
        System.out.println(sldr);
    }

}
