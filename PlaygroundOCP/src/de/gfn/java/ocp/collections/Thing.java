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
class Thing {
    
    private int value;

    public Thing(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}