package de.gfn.java.ocp.basics;

import static de.gfn.java.ocp.basics.InnerClassesTest.StaticInnerClass;

/**
 *
 * @author tlubowiecki
 */
public class InnerClassesTest {
    
    public static void main(String[] args) {
        
        // Anonyme (Innere) Klasse
        // Erzeuge einen anonyme Klasse die IMachWas implementiert.
        // Die anonyme Klasse wird sofort instanziert
        // Basis kann einen Klasse, Interface oder ein Enum sein
        IMachWas ac = new IMachWas() {
            @Override
            public void machWas() {
                System.out.print("Hallo");
            }
        };
        
        // Basis muss immer ein FunctionalInterface sein, SAM
        ac = () -> System.out.print("Hallo");
        
        IMachWas ac2 = useLocalClass();
        
        System.out.println("-----------");
        
        InnerClassesTest ict = new InnerClassesTest();
        InnerClassesTest.InnerClass ic1 = ict.new InnerClass();
        
        // Zuerst ein Objekt der außeren Klasse dann von der inneren Klasse
        InnerClassesTest.InnerClass ic2 = new InnerClassesTest().new InnerClass();
        
        // Es wird gleich ein Objekt von StaticInnerClass gebaut.
        StaticInnerClass sic = new StaticInnerClass();
    }
    
    public static IMachWas useLocalClass() {
        
        // Lokale (Innere) Klasse
        class LocalClass implements IMachWas {
            public void machWas() {
                System.out.println("LocalClass");
            }
        }
        
        return new LocalClass();
    }
    
    // Instaz Inner Class
    private class InnerClass {
        // static ist in den InstazInnerClasses nicht erlaubt
        // kann nur auf das vollständige Inventar der Äußeren-Klasse zugreifen
        // auch auf privates
        public void doIt() {
        }
    }
    
    // Static Inner Class
    public static class StaticInnerClass {
        // kann Instanz-Mothoden und Klassenmethoden haben
        // kann nur auf statisches Inventar der Äußeren-Klasse zugreifen
    }
}

class MachWasImpl implements IMachWas {

    @Override
    public void machWas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

interface IMachWas {
    
    public void machWas();
    
}
