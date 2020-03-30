/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tlubowiecki
 */
public class HashCodeTest {
    
    public static void main(String[] args) {
        
        Set<HashThing> things = new HashSet<>();
        things.add(new HashThing(1));
        things.add(new HashThing(1));
        HashThing ht = new HashThing(1);
        things.add(ht);
        things.add(ht);
        things.add(new HashThing(2));
        
        
        System.out.println(ht.hashCode());
        System.out.println(ht.equals(ht));
        
        System.out.println(things);
        
    }
}

class HashThing {
    
    private int i;

    public HashThing(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

//    @Override
//    public boolean equals(Object obj) {
//        
//        if(this == obj)
//            return true;
//        
//        if(obj instanceof HashThing) {
//            return this.i == ((HashThing) obj).i;
//        }
//        return false;
//    }
}
