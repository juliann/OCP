/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.basics;

import static de.gfn.java.ocp.basics.Fahrzeug.Status;

import java.time.Year;

/**
 *
 * @author tlubowiecki
 */
public class FahrzeugTest {
    
    public static void main(String[] args) {
        
        Fahrzeug f = new Fahrzeug("HH-ABC123", "VW", Year.now());
        f.setStatus(Status.INSPEKTION);
        
    }
    
}
