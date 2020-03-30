/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */

// COMPOSITE
// T kann ein belibiger Typ sein, der in einer IS-A-Beziehung zu Grafik steht
public class Gruppe<T extends Grafik> implements Grafik {
    
    final private List<T> leafs = new ArrayList<>();
    
    public void add(T g) {
        leafs.add(g);
    }
    
    public void remove(T g) {
        leafs.remove(g);
    }

    @Override
    public void print() {
        for(T g : leafs) {
            g.print();
        }
    }
}
