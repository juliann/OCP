package de.gfn.java.ocp.generics;

/**
 *
 * @author tlubowiecki
 */
public interface GenericInterface<T> {
    
    public void machWas(T wert);
    
    public T machWasAnderes();
    
}

// Eine generische-Klasse die ein generisches Interface implementiert
class GenericInterfaceImpl1<T> implements GenericInterface<T> {

    @Override
    public void machWas(T wert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T machWasAnderes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

// Nicht-generische-Klasse die ein generisches Interface implementiert
class GenericInterfaceImplString implements GenericInterface<String> {

    @Override
    public void machWas(String wert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String machWasAnderes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

// Nicht-generische-Klasse die ein generisches Interface implementiert
class GenericInterfaceImplLong implements GenericInterface<Long> {

    @Override
    public void machWas(Long wert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long machWasAnderes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}