package de.gfn.java.ocp.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */

// <E> = Generischer Typ für einen Container
public class GenericBox<E> {
    
    protected List<E> list = new ArrayList<>();
    
    public void add(E element) {
        // element ist ein Object
        list.add(element);
    }
    
    public void show() {
        list.forEach(e -> System.out.println(e));
    }
}

class SpecialGenericBox<E> extends GenericBox<E>{
    
    public E getFirst() {
        return list.get(0);
    }
    
    public E getLast() {
        return list.get(list.size() - 1);
    }
}

// Einer der generischen Typen wird an die Elternklasse weitergegeben
class VerySpecialGenericBox<A, B> extends GenericBox<B>{
    
}

// Keiner der generischen Typen wird an die Elternklasse weitergegeben,
// sondern Elternklasse wird mit String parametrisiert
class MagicGenericBox<A, B> extends GenericBox<String>{
    
}