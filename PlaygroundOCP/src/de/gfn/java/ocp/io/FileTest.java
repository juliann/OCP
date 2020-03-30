package de.gfn.java.ocp.io;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author tlubowiecki
 */
public class FileTest {
    
    public static void main(String[] args) {
        
        // absolut
        File file = new File("c:\\xyz\\abc");
        file = new File("c:/xyz/abc");
        file = new File("/abc/cde"); // absolut MAC/Linux
        file = new File("./cde"); // relativ
        // ./ = aktuelle Ordner
        file = new File("./../cde"); // relativ
        file = new File("./data"); // relativ, im Projektordner
        
        if(!file.exists()) {
            file.mkdir(); // make directory
            //file.mkdirs(); // make all directories
        }
        else {
            // String s = String.format("File: %b", file.isFile());
            System.out.printf("File: %b%n", file.isFile());
            System.out.printf("Absolut: %b%n", file.isAbsolute());
            System.out.printf("Modified: %d%n", file.lastModified());
            System.out.printf("Hidden: %b%n", file.isHidden());
            System.out.printf("Read: %b%n", file.canRead());
            System.out.printf("Write: %b%n", file.canWrite());
            System.out.printf("Execute: %b%n", file.canExecute());
            
            System.out.println(file);
            File absolute = file.getAbsoluteFile();
            System.out.println(absolute);
            System.out.println(absolute.getParent());
            System.out.println(absolute.length());
            
            file = new File(file, "test.txt");
            
            if(!file.exists()) {
                try {
                    file.createNewFile();
                } 
                catch (IOException e) {
                    System.out.println("Datei konnte nicht erzeugt werden.");
                }
            }
            else {
                file.deleteOnExit();
            }
            
            System.err.println("Fehler!....");
        }
    }
}
