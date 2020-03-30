/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.java.ocp.io;

import de.gfn.java.ocp.collections.Student;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class StudentenVerwaltung {

    private static final String SER_FILE = "students.ser";
    private List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        new StudentenVerwaltung().init();
    }

    private void init() {

        Scanner scanner = new Scanner(System.in);

        students = readDataFromFile();

        app:
        while (true) {

            System.out.print("Auswahl: ");
            switch (scanner.nextLine().trim().toLowerCase()) {

                case "e": {
                    Student s = new Student();
                    System.out.print("Vorname: ");
                    s.setFirstName(scanner.nextLine());

                    System.out.println();

                    System.out.print("Nachname: ");
                    s.setLastName(scanner.nextLine());

                    students.add(s);
                }
                break;

                case "l":
                    System.out.println("Alle Studenten:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case "x":
                    writeDataToFile(students);
                    break app;

                default:
                    System.out.println("Falsche Eingabe!");
            }
        }
    }

    private List<Student> readDataFromFile() {

        File f = new File(SER_FILE);

        if (f.exists()) {
            
            // try-with-resources. Ab Java 1.7
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                return (List<Student>) ois.readObject();
                // close() wird automatisch aufgerufen
            } catch (Exception e) {
                System.out.println("Es konnten keine Daten gelesen werden...");
            }
            
//            try {
//                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
//                return (List<Student>) ois.readObject();
//            } catch (Exception e) {
//                System.out.println("Es konnten keine Daten gelesen werden...");
//            }
        }

        return new ArrayList<>();
    }

    private void writeDataToFile(List<Student> data) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SER_FILE));
            oos.writeObject(data);
        } catch (Exception e) {
            System.out.println("Daten konnten nicht gespeichert werden");
        }
    }

}
