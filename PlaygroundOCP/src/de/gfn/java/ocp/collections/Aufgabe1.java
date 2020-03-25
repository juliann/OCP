/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tlubowiecki
 */
public class Aufgabe1 {
    
    /*
    Erzeuge ein Set von LocalDate welches 5 Datumsangaben aufnimmt und diese aufsteigend sortiert ausgibt.
    Als nächstes sollen die Datumsangaben in umgekehrter Reihenfolge ausgegeben werden.
    */
    
    public static void main(String[] args) {
        
        Set<LocalDate> dates = new TreeSet<>();
        dates.add(LocalDate.of(2015, 10, 15));
        dates.add(LocalDate.of(2016, 3, 15));
        dates.add(LocalDate.of(2017, 7, 15));
        dates.add(LocalDate.of(2018, 10, 15));
        dates.add(LocalDate.of(2019, 9, 15));
        
        //dates.forEach(System.out::println);
        dates.forEach(d -> System.out.println(d));
        
        System.out.println("---------");
        
        Comparator<LocalDate> comp = (d1, d2) -> d1.compareTo(d2);
        Set<LocalDate> dates2 = new TreeSet<>(comp.reversed());
        dates2.addAll(dates);
        dates = null;
        
        dates2.forEach(System.out::println);
    }
}
