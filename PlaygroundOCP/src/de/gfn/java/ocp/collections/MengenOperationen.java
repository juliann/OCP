package de.gfn.java.ocp.collections;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tlubowiecki
 */
public class MengenOperationen {
    
    public static void main(String[] args) {
        new MengenOperationen().init();
    }
    
    private void init() {
        
        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> b = new HashSet<>(Arrays.asList(4,5,6,7,8));
        Set<Integer> erg = union(a, b);
        System.out.println(erg);
        
        erg = minus(a, b);
        System.out.println(erg);
        
        erg = intersect(a, b);
        System.out.println(erg);
        
        erg = complement(a, b);
        System.out.println(erg);
    }
    
    // Komplementärmenge
    private Set<Integer> complement(Set<Integer> mengeA, Set<Integer> mengeB) {
        return minus(union(mengeA, mengeB), intersect(mengeA, mengeB));
    }
    
    // Schnittmenge
    private Set<Integer> intersect(Set<Integer> mengeA, Set<Integer> mengeB) {
        Set<Integer> intersect = new HashSet<>(mengeA);
        intersect.retainAll(mengeB);
        return intersect;
    }
    
    // Differenzmenge
    private Set<Integer> minus(Set<Integer> mengeA, Set<Integer> mengeB) {
        Set<Integer> minus = new HashSet<>(mengeA);
        minus.removeAll(mengeB);
        return minus;
    }
    
    // Vereinigungsmenge
    private Set<Integer> union(Set<Integer> mengeA, Set<Integer> mengeB) {
        Set<Integer> union = new HashSet<>(mengeA);
        union.addAll(mengeB);
        return union;
    }
}





