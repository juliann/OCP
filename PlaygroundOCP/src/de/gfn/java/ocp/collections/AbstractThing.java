/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

/**
 *
 * @author tlubowiecki
 */
public abstract class AbstractThing {
    
    public AbstractThing() {
        System.out.println("AbstractThing");
    }
    
    public AbstractThing(int zahl) {
        System.out.println("AbstractThing: " + zahl);
    }
    
}