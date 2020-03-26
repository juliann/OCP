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
public class GenericTest2 {
    
    public static void main(String[] args) {
        
        GenericBox<String> str = new GenericBox<>();
        str.add("Moin");
        str.add("Hi");
        str.show();
        
        GenericBox<Integer> ints = new GenericBox<>();
        ints.add(1);
        ints.add(2);
        ints.show();
        
        System.out.println("--------");
        
        // Der generische Typ der Kindklasse wird an die Elternklasse weitergegeben
        SpecialGenericBox<String> str2 = new SpecialGenericBox<>();
        str2.add("Hallo");
        
        System.out.println("--------");
        
        VerySpecialGenericBox<Integer, String> vsgb = new VerySpecialGenericBox<>();
        vsgb.add("Hallo");
        
        System.out.println("--------");
        MagicGenericBox<Byte, Integer> mgb = new MagicGenericBox<>();
        mgb.add("Hi");
        
        System.out.println("---------");
        
        // Raw-Type, Object
        GenericBox zeug = new GenericBox();
        
    }
}
