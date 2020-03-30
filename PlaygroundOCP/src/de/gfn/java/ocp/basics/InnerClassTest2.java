/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.basics;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author tlubowiecki
 */
public class InnerClassTest2 {
    
    public static void main(String[] args) {
        Arrays.asList(args);
        Locale lc = new Locale.Builder().setRegion("DE").setLanguage("de").build();
        
        ImmutableStudent is = new ImmutableStudent.Builder().setFirstname("Max").build();
    }
}

class ImmutableStudent {
    
    private final String firstname;
    private final String lastname;

    public ImmutableStudent(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    
    public static class Builder {
        
        private String firstname = "";
        private String lastname = "";

        public String getFirstname() {
            return firstname;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public String getLastname() {
            return lastname;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        
        public ImmutableStudent build() {
            return new ImmutableStudent(firstname, lastname);
        }
    }
}