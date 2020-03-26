package de.gfn.java.designpatterns.composite;

/**
 *
 * @author tlubowiecki
 */

// LEAF
public class Kreis implements Grafik {

    @Override
    public void print() {
        System.out.println("Kreis...");
    }
}
