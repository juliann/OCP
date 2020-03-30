/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.basics;

import java.time.Year;

/**
 *
 * @author tlubowiecki
 */
public class Fahrzeug {
    
    private String kennzeichen;
    private String marke;
    private Year baujahr;
    private Status status = Status.EINSATZBEREIT;

    public Fahrzeug() {
    }

    public Fahrzeug(String kennzeichen, String marke, Year baujahr) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.baujahr = baujahr;
    }
    
    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Year getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(Year baujahr) {
        this.baujahr = baujahr;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public static enum Status {
        
        EINSATZBEREIT, INSPEKTION, UNFALL, DEFEKT, TOTAL_SCHADEN, VERNICHTET;
        
    }
}
