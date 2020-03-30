package de.gfn.java.ocp.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author tlubowiecki
 */
public class DataStreamTest1 {
    
    public static void main(String[] args) {
        
//        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data/zahl.txt"))) {
//            dos.writeDouble(1.17);
//        } catch (Exception e) {
//            System.out.println("Es konnten keine Daten gelesen werden...");
//        }
        
        try(DataInputStream dis = new DataInputStream(new FileInputStream("data/zahl.txt"))) {
            double d = dis.readDouble();
            System.out.println(d * 100);
        } catch (Exception e) {
            System.out.println("Es konnten keine Daten gelesen werden...");
        }
    }
    
}
