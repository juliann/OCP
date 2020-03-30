package de.gfn.java.ocp.io;

import de.gfn.java.ocp.collections.Student;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class SerialisierungTest1 {
    
    public static void main(String[] args) {
        
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Peter", "Parker"));
//        students.add(new Student("Steve", "Rogers"));
//        students.add(new Student("Bruce", "Banner"));
//        
//        try {
//            
//            // Objekte in eine Datei schreiben
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/students.ser"));
//            oos.writeObject(students);
//            
//        } 
//        catch (IOException e) {
//            // System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/students.ser"));
            List<Student> students = (List<Student>) ois.readObject();
            
            for(Student s : students) {
                //System.out.println(s.getFirstName() + " " + s.getLastName());
                System.out.println(s);
            }
            
            ois.close();
        } 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
