/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.generics;

/**
 *
 * @author tlubowiecki
 */

// Raw-Type ist Number
public class Rechner<T extends Number> {
    
    public static void main(String[] args) {
        
        Rechner<Integer> rechner = new Rechner<>();
        System.out.println(rechner.add(1, 5));
        
        Rechner<Long> rechner2 = new Rechner<>();
        System.out.println(rechner2.add(10L, 15L));
        
        Rechner rechner3 = new Rechner();
        System.out.println(rechner3.add(10L, 15));
    }
    
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
