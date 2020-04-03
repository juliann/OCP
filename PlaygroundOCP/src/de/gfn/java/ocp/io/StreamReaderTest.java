package de.gfn.java.ocp.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author tlubowiecki
 */
public class StreamReaderTest {
    
    public static void main(String[] args) {
        
        try(InputStream is = new FileInputStream("data/test.txt"); Reader r = new InputStreamReader(is, "UTF-8")) {
            char[] b = new char[10];
            //int i;
            //while((i = r.read(b)) != -1)
            r.read(b);
            System.out.println(b[0] + " " + b[9]);
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
