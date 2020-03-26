/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

/**
 *
 * @author tlubowiecki
 */
// ConcretThing IS-A AbstractThing
public class ConcretThing extends AbstractThing {

    public ConcretThing() {
        super(100);
        System.out.println("ConcretThing");
    }
}
