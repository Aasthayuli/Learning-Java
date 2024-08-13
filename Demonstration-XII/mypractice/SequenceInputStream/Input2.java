/*
 * If we need to read the data from more than two files, we need to use
 * Enumeration.
 * Enumeration object can be obtained by calling elements() method of the Vector
 * class.
 */

import java.io.*;
import java.util.*;

class Input2 {
    public static void main(String args[]) throws IOException {
        // creating the FileInputStream objects for all the files
        FileInputStream fin1 = new FileInputStream("a.txt");
        FileInputStream fin2 = new FileInputStream("b.txt");
        FileInputStream fin3 = new FileInputStream("c.txt");
        FileInputStream fin4 = new FileInputStream("d.txt");
        // creating Vector object to all the stream
        Vector<FileInputStream> v = new Vector<FileInputStream>();
        v.add(fin1);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        // creating enumeration object by calling the elements method
        Enumeration e = v.elements();
        // passing the enumeration object in the constructor
        SequenceInputStream bin = new SequenceInputStream(e);
        int i = 0;
        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }
        bin.close();
        fin1.close();
        fin2.close();
        fin3.close();
        fin4.close();
    }
}