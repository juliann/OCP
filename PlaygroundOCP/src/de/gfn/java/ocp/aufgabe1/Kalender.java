/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.aufgabe1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author tlubowiecki
 */
public class Kalender {
    
    private Map<LocalDate, List<Termin>> termine = new TreeMap<>();
    
    public void addTermin(LocalDate datum, Termin termin) {
        if(termine.containsKey(datum)) {
            termine.get(datum).add(termin);
        }
        else {
            termine.put(datum, new ArrayList<>(Arrays.asList(termin)));
        }
    }
    
    public void showByDate(LocalDate datum) {
        if(!termine.containsKey(datum)) {
            throw new RuntimeException();
        }
        else {
            termine.get(datum).forEach(t -> System.out.println(t));
        }
    }
    
    public void showWeekByDate() {
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(8);
        Set<LocalDate> week = new TreeSet(termine.keySet()).subSet(start, end);
        
        if(week.size() == 0)
            throw new RuntimeException();
        
        for(LocalDate d : week) {
            System.out.println(d.format(IOHelper.DATE_FORMAT) + ":");
            showByDate(d);
        }
    }
}
