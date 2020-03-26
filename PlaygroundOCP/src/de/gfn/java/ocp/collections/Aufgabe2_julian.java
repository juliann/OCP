/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Julian
 */
public class Aufgabe2_julian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Wann?");
        String input = sc.next();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ISO_LOCAL_TIME;
    
        LocalDate date = LocalDate.parse(input, dateFormat);
        System.out.println(date);
        System.out.println("Uhrzeit?");
        LocalTime time = LocalTime.parse(sc.next(), timeFormat);
        System.out.println(time);
        System.out.println("Titel?");
        String title=sc.next();
        System.out.println("Beschreibung?");
        String descr=sc.next();
        Termin t1=new Termin(LocalDate.of(2020, Month.MARCH, 26), LocalTime.MIDNIGHT, "Neu", "jaja");
        Termin t2=new Termin(date, time, title, descr);
        Termin t3=new Termin(LocalDate.of(2020, Month.MARCH, 27), LocalTime.MIDNIGHT, "neuer", "okok");
        Termin t4=new Termin(LocalDate.of(2020, Month.APRIL, 8), LocalTime.MIDNIGHT, "ganz weit weg", "huehue");
        
        
        NavigableSet <Termin>termine=new TreeSet<>();
         termine.add(t1);
         termine.add(t2);
         termine.add(t3);
         termine.add(t4);
         System.out.println(termine.first());
        
    }

   
}

class Termin implements Comparable<Termin>{

    LocalDate date;
    LocalTime time;
    String title;
    String descr;
    LocalDateTime ldt;
    
    void calcLDT(){
    this.ldt=LocalDateTime.of(date, time);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.date);
        hash = 83 * hash + Objects.hashCode(this.time);
        hash = 83 * hash + Objects.hashCode(this.title);
        hash = 83 * hash + Objects.hashCode(this.descr);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Termin other = (Termin) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.descr, other.descr)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Termin{" + "date=" + date + ", time=" + time + ", title=" + title + ", descr=" + descr + '}';
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Termin(LocalDate date, LocalTime time, String title, String descr) {
        this.date = date;
        this.time = time;
        this.title = title;
        this.descr = descr;
        calcLDT();
    }

    @Override
    public int compareTo(Termin o) {
        System.out.println(ldt.compareTo(o.getLdt()));
        return ldt.compareTo(o.getLdt());
        
    }

}
