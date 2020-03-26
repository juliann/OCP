package de.gfn.java.designpatterns.composite;

/**
 *
 * @author tlubowiecki
 */
public class CompositeTest {
    
    public static void main(String[] args) {
        
        Kreis k1 = new Kreis();
        Kreis k2 = new Kreis();
        Dreieck d1 = new Dreieck();
        Dreieck d2 = new Dreieck();
        Dreieck d3 = new Dreieck();
        
        // Raw-Type: Grafik
        Gruppe g = new Gruppe<>();
        g.add(k1);
        g.add(k2);
        g.add(d1);
        g.add(d2);
        g.add(d3);
        
        Gruppe g2 = new Gruppe();
        g2.add(new Dreieck());
        g2.add(new Kreis());
        
        g.add(g2);
        
        g.print();
        
        
    }
    
}
