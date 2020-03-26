package de.gfn.java.ocp.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
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
        
        Set<Student> set3 = new TreeSet<>(new StudentComparator().reversed());
        set3.add(hans);
        set3.add(max);
        System.out.println(set3);
        
        Comparator<Student> comp = (s1, s2) -> s1.getLastName().compareTo(s2.getLastName());
        Set<Student> set4 = new TreeSet<>(comp);
        
        System.out.println("-----------");
        
        Set<String> namen = new LinkedHashSet<>();
        namen.add("Clark");
        namen.add("Peter");
        namen.add("Bruce");
        namen.add("Tony");
        
        System.out.println(namen);
        
        for(String n : namen) {
            System.out.println(n);
        }
        
        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
        
        System.out.println("-----------");
        
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(2,4,5,8,10,25,33,17,4,8));
        System.out.println(sortedSet);
        
        SortedSet<Integer> partA = sortedSet.headSet(10);
        System.out.println(partA);
        
        SortedSet<Integer> partB = sortedSet.tailSet(9);
        System.out.println(partB);
        
        SortedSet<Integer> partC = sortedSet.subSet(7, 28);
        System.out.println(partC);
        
        System.out.println("------");
        
        sortedSet.add(9);
        partC.add(7);
        // partC.add(6);
        
        System.out.println(partA);
        System.out.println(partB);
        System.out.println(partC);
        
        System.out.println("-----------");
        
        NavigableSet<LocalDateTime> cal = new TreeSet<>();
        cal.add(LocalDateTime.now());
        cal.add(LocalDateTime.of(2020, 10, 15, 16, 22));
        cal.add(LocalDateTime.of(2020, 3, 10, 16, 22));
        cal.add(LocalDateTime.now().plusDays(30));
        cal.add(LocalDateTime.now().plusDays(45));
        cal.add(LocalDateTime.now().minusDays(17));
        
        cal.forEach(ldt -> System.out.println(ldt));
        
        System.out.println("-----------");
        
        System.out.println(cal.ceiling(LocalDateTime.of(2020,3,23,10,10))); // Liefert gesuchtes objekt wenn da, sonst nächstes
        System.out.println(cal.floor(LocalDateTime.of(2020,3,10,16,22))); // Liefert gesuchtes objekt wenn da, sonst vorheriges
        System.out.println(cal.higher(LocalDateTime.of(2020,3,23,10,10))); // Liefert nächstes objekt
        System.out.println(cal.lower(LocalDateTime.of(2020,3,23,10,10))); // Liefert vorheriges objekt
    }
}