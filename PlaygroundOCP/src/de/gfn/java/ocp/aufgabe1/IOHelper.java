/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.aufgabe1;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author tlubowiecki
 */
public final class IOHelper {
    
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");
    
    private IOHelper() {
    }
}
