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
public class BasicTest1 {
    
    public static void main(String[] args) {
        
        Integer i = 1;
        Object o = i; // Integer IS-A Object
        o = 1.2; // double > Double > Object
        //Integer j = o; // Object steht nicht in einer IS-A Beziehung zu Integer
        Integer j = (Integer) o; // RuntimeException, ClassCast: Double nach Integer
        
//        int x;
//        System.out.println(x);
        
        Character c = 'x';
        int i2 = 'x';

        
    }
    
}
