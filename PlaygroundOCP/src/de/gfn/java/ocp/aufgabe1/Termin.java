/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.aufgabe1;

import java.time.LocalTime;

/**
 *
 * @author tlubowiecki
 */
public class Termin implements Comparable<Termin>{
    
    private LocalTime time;
    private String title;
    private String description;

    public Termin(LocalTime time, String title, String description) {
        this.time = time;
        this.title = title;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Termin{" + "time=" + time.format(IOHelper.TIME_FORMAT) + ", title=" + title + ", description=" + description + '}';
    }

    @Override
    public int compareTo(Termin o) {
        return time.compareTo(o.time);
    }
}
