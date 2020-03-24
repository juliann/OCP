package de.gfn.java.ocp.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tlubowiecki
 */
public class SetTest1 {
    
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("Peter");
        set.add("Bruce");
        set.add("Clark");
        set.add("Bob");
        set.add("Bruce"); // Duplikat, da hashCode und per equal gleich
        set.add(new String("Bruce")); // Duplikat, da hashCode und per equal gleich
        System.out.println(set);
        
        for(String s : set) {
            System.out.println(s);
        }
        
        // void accept(T t);
        set.forEach(s -> System.out.println(s));
        
        System.out.println("-----------");
        
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        
        i1 = new Integer(10);
        i2 = new Integer(10);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        
        i1 = 128;
        i2 = 128;
        System.out.println(i1 == i2); // Byte-Literal-Pool -128 bis 127
        System.out.println(i1.equals(i2));
        
        // Reflection API
        // Student.class
        
        System.out.println("-----------");
        
        set = new TreeSet<>(set);
        System.out.println(set);
        
        Set<Student> set2 = new TreeSet<>();
        
        Student max = new Student();
        max.setFirstName("Max");
        max.setLastName("Mustermann");
        
        Student hans = new Student();
        hans.setFirstName("Hans");
        hans.setLastName("Wurst");
        
        set2.add(hans);
        set2.add(max);
        
        System.out.println(set2);
        
    }
}

class Student implements Comparable<Student>{
    
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Student o) {
        return firstName.length() - o.firstName.length();
    }

    @Override
    public String toString() {
        return firstName;
    }
}
