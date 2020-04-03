/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author tlubowiecki
 */
public class Student implements Comparable<Student>, Serializable {
    
    private static final long serialVersionUID = 2;
    
    private String firstName;
    private String lastName;
    // transient = wird nicht serialisiert
    private LocalDate birthDate;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    
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
    
    // Optional, kann das Schreiben anpassen
    private void writeObject(ObjectOutputStream oos) throws Exception {
       oos.defaultWriteObject();
        System.out.println("WRITE");
    }
    
    // Optional, kann das Lesen anpassen
    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        System.out.println("READ");
    }

    @Override
    public int hashCode() {
//        int hash = 5;
//        hash = 97 * hash + Objects.hashCode(this.firstName);
//        hash = 97 * hash + Objects.hashCode(this.lastName);
//        return hash;

        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
        
        /*
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
        */
    }

    @Override
    public int compareTo(Student o) {
        // return firstName.length() - o.firstName.length();
        return CompareToBuilder.reflectionCompare(this, o, Arrays.asList("firstname"));
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
