package de.gfn.java.ocp.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author tlubowiecki
 */
public class MapTest1 {
    
    public static void main(String[] args) {
        
        Map<String, Integer> locations = new HashMap<>();
        
        locations.put("Hamburg", 1_900_000);
        locations.put("Berlin", 4_100_000);
        locations.put("Köln", 1_200_000);
        locations.put("Ülzen", 25_000);
        
        System.out.println(locations.get("Köln"));
        
        locations.put("Berlin", 100_000);
        
        System.out.println(locations.getOrDefault("Bremen", 0));
        
        System.out.println(locations);
        
        machWas(locations);
        
        System.out.println("--------");
        
        Map<Person, Integer> persons = new HashMap<>();
        persons.put(new Person("Max", "Mustermann", LocalDate.of(1950, 10, 10), "..."), 10);
        System.out.println(persons.get(new Person("Max", "Mustermann", LocalDate.of(1955, 11, 9), "hdfdfkh")));
        
        System.out.println("--------");
        
        Map<Person, List<String>> klassenbuch = new HashMap<>();
        
        klassenbuch.put(new Person("Peter", "Parker"), new ArrayList<>());
        klassenbuch.put(new Person("Clark", "Kent"), new ArrayList<>());
        klassenbuch.put(new Person("Bruce", "Wayne"), new ArrayList<>());
        
        klassenbuch.get(new Person("Peter", "Parker")).add("Hat den Unterreicht gestört!");
        klassenbuch.get(new Person("Bruce", "Wayne")).add("Hat den Unterreicht gestört!");
        
        for(Map.Entry<Person, List<String>> e : klassenbuch.entrySet()) {
            Person p = e.getKey();
            System.out.println(p.getFirstName() + " " + p.getLastName());
            System.out.println(e.getValue());
        }
        
        System.out.println("--------");
        
        locations = new LinkedHashMap<>();
        
        locations.put("Hamburg", 1_900_000);
        locations.put("Berlin", 4_100_000);
        locations.put("Köln", 1_200_000);
        locations.put("Ülzen", 25_000);
        
        System.out.println(locations);
        
        System.out.println("--------");
        
        locations = new TreeMap<>();
        
        locations.put("Hamburg", 1_900_000);
        locations.put("berlin", 4_100_000);
        locations.put("Köln", 1_200_000);
        locations.put("Ülzen", 25_000);
        
        System.out.println(locations);
        
        
        
    }
    
    public static void machWas(Map<String, Integer> map) {
        map.put("Bielefeld", 500_000);
    }
}
