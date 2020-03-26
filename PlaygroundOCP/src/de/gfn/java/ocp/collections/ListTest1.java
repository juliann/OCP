/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author tlubowiecki
 */
public class ListTest1 {
    
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(2); //0
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);
        System.out.println(list1);
        
        list1.remove((Object)4); // int > Integer > Object
        list1.remove(new Integer(2)); // Integer > Object
        System.out.println(list1);
        
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        
        list1.addAll(set); // Fügt die Set-Zahlen zu der Liste hinzu
        System.out.println(list1);
        
        //set.add(15);
        //list1.removeAll(set); // Entfernt die Set-Zahlen aus der Liste
        list1.retainAll(set); // Behält nur die Set-Zahlen in der Liste
        System.out.println(list1);
        
        //list1.clear();
        System.out.println(list1);
        
        for(Integer it : list1) {
            System.out.println(it);
        }
        
        List<Integer> ll = new LinkedList(set);
        
        System.out.println(list1.equals(ll));
        
        Object[] objArr = list1.toArray();
        
        Integer[] intArr = list1.toArray(new Integer[]{});
        intArr = list1.toArray(new Integer[0]);
        
        int x = 10;
        System.out.println((x << 1) + 2 + "#");
        
        System.out.println("--------");
        
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(10 << 1));
        System.out.println(Integer.toBinaryString(10 >> 2));
        
        System.out.println("--------");
        
        // 5, 7
        list1 = new LinkedList<>(list1);
        list1.add(0, 15);
        list1.add(2, 22);
        list1 = new ArrayList<>(list1);
        System.out.println(list1.get(3));
        
        Queue<Integer> q = new LinkedList<>();
        Deque<Integer> q2 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        
        System.out.println("-----------");
        
        AbstractThing at = new ConcretThing();
        
    }
}