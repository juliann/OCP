package de.gfn.java.ocp.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author tlubowiecki
 */
public class StreamsTest1 {
    
    public static void main(String[] args) {
        
//        long start = System.currentTimeMillis();
//        
//        // optimal für Binär-Daten
//        try {
//            InputStream in = new BufferedInputStream(new FileInputStream("data/test.txt"));
//            // Appendmode true = Dateiinhalt erweitern statt überschreiben
//            OutputStream out = new BufferedOutputStream(new FileOutputStream("data/test_copy.txt"));
//            
//            int data;
//            while((data = in.read()) != -1) {
//                out.write(data);
//            }
//        } 
//        catch (IOException e) {
//        }
        
//        long end = System.currentTimeMillis();
//        System.out.println(end - start + " ms");
        
//        long start = System.currentTimeMillis();
//        
//        // Optimal für Zeichen/Strings
//        try {
//            Reader r = new FileReader("data/test.txt");
//            Writer w = new FileWriter("data/test_copy.txt", true);
//            
//            int data;
//            while((data = r.read()) != -1) {
//                w.write(data);
//            }
//        } catch (IOException e) {
//        }
//        
//        long end = System.currentTimeMillis();
//        System.out.println(end - start + " ms");
        
        
        long start = System.currentTimeMillis();
        
        // Optimal für Zeichen/Strings
        try {
            BufferedReader r = new BufferedReader(new FileReader("Generics.pdf"));
            BufferedWriter w = new BufferedWriter(new FileWriter("Generics_copy.pdf"));
            
            String line = null;
            while((line = r.readLine()) != null) {
//                Umcodierung von UTF-16 auf UTF-8
//                String utf8 = new String(line.getBytes(), "UTF-8");
//                w.write(utf8);
                w.write(line);
                w.newLine();
            }
        } catch (IOException e) {
        }
        
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}
