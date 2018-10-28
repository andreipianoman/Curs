/*
 * Tries to open a file.
 */
package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Turbotwins
 */
public class OpenFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader r;
        try {
            r = new BufferedReader(new FileReader("C:\\Users\\Turbotwins\\Desktop\\Text.txt"));
            try {
                String firstLine = r.readLine();
                System.out.println("Am citit din fisier:" + firstLine);
            } catch (IOException e) {
                System.out.println("Cannot read first line from text.txt: " + e.getMessage());
            } finally {
                try { 
                    r.close();
                } catch (IOException ex) {
                    //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(OpenFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exceptia are mesajul:" + ex.getMessage());
        }
    }
}
    

