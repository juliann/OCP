/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

/**
 *
 * @author Julian
 */
public class CollectionsTest1_julian {
    private int value;
    public static void main(String[] args) {
        System.out.println("hi");
        StringBuilder sb=new StringBuilder("1234567890123456");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("1111111111111111111");
        System.out.println(sb.capacity());
        new CollectionsTest1_julian(0);
  
    }

    public CollectionsTest1_julian(int value) {
        this.value = value; 
        System.out.println(getClass());
    }
    
}
