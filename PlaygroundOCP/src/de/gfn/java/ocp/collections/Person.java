/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.collections;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author tlubowiecki
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String eMail;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Person(String firstName, String lastName, LocalDate birthDate, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.eMail = eMail;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return (this.firstName + this.lastName).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("EQUALS");
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }
    
    
}
